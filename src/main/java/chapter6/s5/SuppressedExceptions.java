package chapter6.s5;

public class SuppressedExceptions {
	public static void main(String[] args) throws Exception {
		try ( RiverRaft raft = new RiverRaft(); ) {
			raft.crossRapid();
		}
		catch (Exception e) {
			System.out.println("Exception caught: " + e);
			Throwable[] suppressed = e.getSuppressed();
			for (Throwable throwable : suppressed) {
				System.out.println("Suppress edilenler: " + throwable);
			}
		}
	}
}

class RiverRaft implements AutoCloseable {
	public RiverRaft() throws Exception {
		System.out.println("Constructor");
		// throw new Exception("ddddd");
		// Burada suppress çalışmaz. Daha bağlantı açılmadı çünkü
	}
	public void crossRapid() throws Exception {
		System.out.println("Normal method");
		throw new Exception("Cross Rapid exception");
	}
	public void close() throws Exception {
		System.out.println("Close method");
		throw new Exception("Close exception");
	}
}