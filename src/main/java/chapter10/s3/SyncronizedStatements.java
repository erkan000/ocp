package chapter10.s3;

public class SyncronizedStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Book2{
	double rank = 0;
	int copiesSold = 0;
	Object objSale = new Object();
	Object objPos = new Object();
	
	public void newSale() {
		synchronized(objSale) {
			++copiesSold;
		}
	}
	
	public void rankImprove() {
		synchronized(objPos) {
			--rank;
		}
	}
}
