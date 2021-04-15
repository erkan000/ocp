package innerclass;


// Hatali 
class CevreliyiciSinif1 {

	class DahiliSinif1 {// Dahili uye siniflar
//		static int x = 10 ; //  ! Hata!
	}

}

// Dogru
class CevreliyiciSinif2 {
	
	class DahiliSinif2 {
		int x; // Dogru
	}

}


// Dogru
class CevreliyiciSinif3 { 
	
	class DahiliSinif3 {
		static final int x = 0;  // Dogru
	}

}

