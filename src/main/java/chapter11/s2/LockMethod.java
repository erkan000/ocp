package chapter11.s2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Rainbow {
	Lock myLock = new ReentrantLock();
	static List<String> colors = new ArrayList<>();
	public void addColor(String newColor) {
		myLock.lock();
		try {
			colors.add(newColor);
		}
		finally {
			myLock.unlock();
		}
	}
}
