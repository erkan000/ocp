package chapter10.sample;


class Robot extends Thread {
	private NotifySample controller;
	private int robotID;

	public Robot(NotifySample cntrl, int id)
	{
		controller = cntrl;
		robotID = id;
	}

	public void run()
	{
		synchronized(controller)
		{
			byte[] data;
			while ((data = controller.getData()) == null) {
				try {
					System.out.println("data is null...waiting " + robotID);
					controller.wait();										//1
				} catch (InterruptedException ie) {
				}
			}
			//Now we have data to move the robot
			System.out.println("Robot " + robotID + " Working");
		}
	}
}

class NotifySample {
	private byte[] robotData;
	private Robot rbot1;
	private Robot rbot2;
	private Robot rbot3;
	private Robot rbot4;
	private Robot rbot5;

	public static void main(String args[])
	{
		NotifySample controller = new NotifySample();
		controller.setup();
	}

	public void setup()
	{
		rbot1 = new Robot(this, 1);
		rbot2 = new Robot(this, 2);
		rbot3 = new Robot(this, 3);
		rbot4 = new Robot(this, 4);
		rbot5 = new Robot(this, 5);
		rbot3.setPriority(Thread.MAX_PRIORITY);						  //2
		rbot1.start();
		rbot2.start();
		rbot3.start();
		rbot4.start();
		rbot5.start();
		begin();
	}

	public void begin()
	{
		for (int i=0;i<5;i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException ie) {
			}
			putData(new byte[10]);
			synchronized(this){
				System.out.println("Calling notify");
				notify();												  //3
			}
		}
	}

	public byte[] getData()
	{
		if (robotData != null) {
			byte[] d = new byte[robotData.length];
			System.arraycopy(robotData, 0, d, 0, robotData.length);
			robotData = null;                                           
			return d;
		}
		return null;
	}

	public void putData(byte[] d)
	{
		robotData = d;
	}
}

