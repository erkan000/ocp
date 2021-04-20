package filechannel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelTest2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String GBFile = "C:\\Users\\dev\\Downloads\\turchia.csv";
		try (FileChannel fcIn = new FileInputStream(GBFile).getChannel();
				FileChannel fcOut = new FileOutputStream(args[0]).getChannel()) {
			ByteBuffer buff = ByteBuffer.allocate((int) fcIn.size());
			System.out.println("Output: " + buff.remaining());
		} catch (Exception e) {
			System.out.println(e);
		} 

	}

}
