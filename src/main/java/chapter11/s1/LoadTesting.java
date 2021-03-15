package chapter11.s1;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Request {}
class Client implements Runnable {
	private BlockingQueue<Request> queue;
	Client(BlockingQueue<Request> queue) {
		this.queue = queue;
	}
	public void run() {
		try {
			Request req = null;
			while(true) {
				req = new Request();
				queue.put(req);
				System.out.println("added request - " + req);
			}
		}
		catch (InterruptedException ex) {
			System.out.println(ex);
		}
	}
}
class Server implements Runnable {
	private BlockingQueue<Request> queue;

	Server(BlockingQueue<Request> queue) {
		this.queue = queue;
	}
	public void run() {
		try {
			while (true) {
				System.out.println("processing .. " + queue.take());
			}
		}
		catch (InterruptedException ex) {
			System.out.println(ex);
		}
	}
}
class LoadTesting{
	public static void main(String args[]) {
		BlockingQueue<Request> queue = new ArrayBlockingQueue<Request>(3);
		Client client = new Client(queue);
		Server server = new Server(queue);
		new Thread(client).start();
		new Thread(server).start();
	}
}