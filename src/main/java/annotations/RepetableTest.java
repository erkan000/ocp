package annotations;

import java.lang.annotation.Repeatable;

@interface FerociousPack {
	RepetableTest[] value();
}     

@Repeatable(FerociousPack.class)
public @interface RepetableTest {}

@RepetableTest
@RepetableTest
class Boat {}