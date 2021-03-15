package chapter4.s1;

// Buradaki T harfinin hiçbir önemi yok. 
// Sınıf adı bile olabilir. Sadece placeHolder
public class Parcel <T> {	
	private T t;	
	public void set (T t){
		this.t=t;
	}	
	public T get(){
		return t;
	}
}

class Parcel2 <Te> {	
	private Te t;
	public Te getT() {
		return t;
	}
	public void setT(Te t) {
		this.t = t;
	}	
}

class Parcel3 <T,X> {}
class Parcel4 <T,String> {} //Burda String pass etmek zorunda değiliz!!!