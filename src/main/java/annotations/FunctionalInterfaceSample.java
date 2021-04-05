package annotations;

public class FunctionalInterfaceSample {

}

@FunctionalInterface interface Scaley {
	boolean isSnake();
}



@FunctionalInterface interface Smooth extends Scaley {
	boolean equals(Object unused);
}