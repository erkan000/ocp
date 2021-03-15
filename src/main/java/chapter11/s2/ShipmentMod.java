package chapter11.s2;

import java.util.concurrent.locks.*;
class Inventory2 {
	int inStock; String name;
	Lock lock = new ReentrantLock();
	Inventory2(String name) { this.name = name; }
	public void stockIn(long qty) { inStock += qty; }
	public void stockOut(long qty) { inStock -= qty; }
}
class ShipmentMod extends Thread {
	Inventory2 loc1, loc2; int qty;
	ShipmentMod(Inventory2 loc1, Inventory2 loc2, int qty) {
		this.loc1 = loc1;
		this.loc2 = loc2;
		this.qty = qty;
	}
	public void run() {
		if (loc1.lock.tryLock()) {
			if (loc2.lock.tryLock()) {
				loc2.stockOut(qty);
				loc1.stockIn(qty);
				System.out.println(loc1.inStock + ":" + loc2.inStock);
				loc2.lock.unlock();
				loc1.lock.unlock();
			}
			else
				System.out.println("Locking false:" + loc2.name);
		}
		else
			System.out.println("Locking false:" + loc1.name);
	}
	public static void main(String args[]) {
		Inventory2 loc1 = new Inventory2("Seattle"); loc1.inStock = 100;
		Inventory2 loc2 = new Inventory2("LA"); loc2.inStock = 200;
		ShipmentMod s1 = new ShipmentMod(loc1, loc2, 1);
		ShipmentMod s2 = new ShipmentMod(loc2, loc1, 10);
		s1.start();
		s2.start();
	}
}