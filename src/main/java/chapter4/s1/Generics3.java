package chapter4.s1;

public class Generics3 implements ParcelInterface<Integer, String>{}

class Generics4<Y> extends Parcel<Y>{}
class Generics5 extends Parcel<String>{}
class Generics6<T,Y> extends Parcel<T>{}

class Generics7 implements ParcelInterface<Integer, String>{}
class Generics71<Integer> implements ParcelInterface<Integer, String>{}

interface Generics8<K,V> extends ParcelInterface<K, V>{}
interface Generics9<K,V> extends ParcelInterface<String, V>{}
interface Generics10<V> extends ParcelInterface<String, V>{}
interface Generics11 extends ParcelInterface<String, Integer>{}
interface Generics12 extends ParcelInterface2{}