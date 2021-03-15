package chapter2.s44;

public class AnotherClass {
	
	void tmp(Pen pen) {
		pen.write();
	}
	
	void test11() {
		this.tmp(new Pen() {
			
		});
	}
	
	Pen test2() {
		return new Pen() {
			
		};
	}
	
	Pen test3() {
		return new Pen() {
			@Override
			void write() {
				System.out.println("write");
			}
		};
	}

}
