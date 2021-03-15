package chapter4.s4;

public class RawTypes {

	public static void main(String[] args) {
		Parcel p1 = new Parcel<Phone>();
		// Aşağıdaki satır derlenir ama warning verir
		// Bu şekilde p1 içindeki tip bilgisini kaybederiz.
		// p1 generic sınıfın tip bilgisine sahip değil, bilmiyor.
		// o yüzden aşağıda set metodunda warning alırız.
		// Çünkü bu generic sınıf içinde tanıma göre Phone nesneleri olması lazım.
		// Ama bu örnekte string set edebildik, ki bu bir hata.		
		p1.set("harry");

		// Aynı mantıkla p1 generic'in tip bilgisini bilmediği için p1.get-
		// Object sınıfından bir nesne döndürür. Bu sebepten 
		// aşağıdaki satır WONT compile!
		/** Phone phone = p1.get(); **/
		
		Parcel<Phone> p2 = new Parcel();
		// Burada ise yukardakinin tam tersidir. Referance variable içinde ne olduğunu biliyor.
		// Bu sebepten aşağıdaki kod derlenir ve compiler warning vermez.
		p2.set(new Phone());
		// Ref. variable içinde ne olduğunu bildiği için String tipine izin vermez.
		// Bu sebepten aşağıdaki satır WONT compile
		/** parcel.set(new String()); **/
		// Aynı şekilde içinde ne olduğunu bildiği için get metodu generic type'in
		// sınıfından bir nesne döndürür.
		// Aşağıdaki satır da compiler warningi vermez.
		Phone phone = p2.get();
		
	}
}

class Parcel<T> {
	private T t;
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
}
class Phone{}
