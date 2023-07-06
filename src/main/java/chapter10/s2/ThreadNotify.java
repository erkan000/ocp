package chapter10.s2;

public class ThreadNotify {

	public static void main(String[] args) {
		Message msg = new Message("My message");

		WaitingClass waiter = new WaitingClass(msg);
		new Thread(waiter, "Waiting Class 1").start();

		WaitingClass waiter1 = new WaitingClass(msg);
		new Thread(waiter1, "Waiting Class 2").start();

		NotifierClass notifier = new NotifierClass(msg);
		new Thread(notifier, "NotifierClass").start();

		System.out.println("*** main finished ***");
	}
}

class NotifierClass implements Runnable {

	private Message msg;

	public NotifierClass(Message msg) {
		this.msg = msg;
    }

    @Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " started");
        try {
			Thread.sleep(1000);
			synchronized (msg) {
				msg.setMsg(name + " new message");
				msg.notifyAll();
			}
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}


class WaitingClass implements Runnable {

	private Message msg;

	public WaitingClass(Message m) {
		this.msg = m;
	}

    @Override
	public void run() {
		String name = Thread.currentThread().getName();
		synchronized (msg) {
			try {
				System.out.println(name + " started to wait");
				msg.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " resumed the wait");
			System.out.println(name + " processed: " + msg.getMsg());
        }
    }

}

class Message {
	private String msg;

	public Message(String str) {
		this.msg = str;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String str) {
		this.msg = str;
	}

}