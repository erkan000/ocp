package chapter11.s3;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Reminder implements Runnable {
	public void run() {
		// send reminder emails to all employees
		System.out.println("All Mails sent");
	}
}
public class ReminderMgr {
	ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
	Reminder reminder = new Reminder();
	public void sendReminders() {
		service.scheduleAtFixedRate(reminder, 0, 24, TimeUnit.HOURS);
	}
	public static void main(String args[]) {
		ReminderMgr mgr = new ReminderMgr();
		mgr.sendReminders();
	}
}
