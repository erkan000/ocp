package chapter2.s3.o3;

public enum Yon {

	KUZEY {
		@Override
		Yon siradaki() {
			return DOGU;
		}
	}, DOGU {
		@Override
		Yon siradaki() {
			return Yon.GUNEY;
		}
	}, GUNEY {
		@Override
		Yon siradaki() {
			return BATI;
		}
	}, BATI {
		@Override
		Yon siradaki() {
			return KUZEY;
		}
	};
	
	abstract Yon siradaki();
	
}
