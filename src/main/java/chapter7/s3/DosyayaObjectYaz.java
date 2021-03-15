package chapter7.s3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import chapter7.s1.FileHelloWorld;

public class DosyayaObjectYaz {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		try (
				FileOutputStream out = new FileOutputStream(FileHelloWorld.yol + "object.data");
				ObjectOutputStream oos = new ObjectOutputStream(out);
				FileInputStream in = new FileInputStream(FileHelloWorld.yol + "object.data");
				ObjectInputStream ois = new ObjectInputStream(in);
				) {
			Car c = new Car();
			oos.writeObject(c);
			oos.flush();
			
			Car c2 = (Car)ois.readObject();
			System.out.println(c2);
		}

	}

}

class Car implements Serializable {}
