package chapter10.s2;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class ThreadSleep {

	public static void main(String args[]) {
		JFrame frame = new JFrame();
		frame.setSize(400, 300);
		frame.setVisible(true);
		MovingBall ball = new MovingBall(60, frame);
		ball.start();
	}

}

class MovingBall extends Thread{
	int radius;
	Graphics g;
	int xPos, yPos;
	JFrame frame;
	MovingBall(int radius, JFrame frame) {
		this.radius = radius;
		this.g = frame.getGraphics();
		this.frame = frame;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			xPos = xPos + 2; yPos = yPos + 2;
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, frame.getWidth(), frame.getHeight());
			++xPos; ++yPos;
			g.setColor(Color.BLACK);
			g.fillOval(xPos, yPos, radius, radius);
		}
	}
}