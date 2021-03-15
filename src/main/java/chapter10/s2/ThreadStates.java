package chapter10.s2;

import java.util.Set;

public class ThreadStates {

	public static void main(String[] args) {
		Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
		
		for(Thread t : threadSet)
			System.out.println(t + " --- " + t.getState());

	}

}
