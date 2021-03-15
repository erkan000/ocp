package chapter10.s4;

public class ThreadCommunication {

	public static void main(String[] args) {
		Friend paul = new Friend();
		GoRafting rafting = new GoRafting(paul);
		rafting.start();
		paul.start();

	}

}

class GoRafting extends Thread {
	Friend friend;
	GoRafting(Friend friend) {
		this.friend = friend;
	}
	public void run() {
		System.out.println("Friend reached:" + friend.reached);
		synchronized(friend) {
			try {
				friend.wait();
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.println("Reached:" + friend.reached + ",going rafting");
	}
}
class Friend extends Thread {
	boolean reached = false;
	public void run() {
		while (!reached) {
			try {
				Thread.sleep(2000);
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
			confirmReached();
		}
	}
	public synchronized void confirmReached() {
		reached = true;
		notify();
	}
}