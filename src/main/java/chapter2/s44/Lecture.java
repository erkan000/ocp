package chapter2.s44;

public class Lecture {
	
	// Anonymous inner class tanımı
	static Pen pen = new Pen() 
	{
		void write() {
			System.out.println("Inner pen wire");
		}
	}
	;	

	public static void main(String[] args) {
		pen.write();		// Anonymous inner class daki write
		new Pen().write();  // Pen sınıfındaki write
	}
	
	
//	Bu şekilde içindeki metodları override etmemize gerek yoktur
	Pen pen2 = new Pen(){
		
	};
}
