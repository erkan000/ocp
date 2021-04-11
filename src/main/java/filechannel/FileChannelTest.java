package filechannel;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class FileChannelTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String GBFile = "C:\\Users\\dev\\Downloads\\turchia.csv";
		try (RandomAccessFile reader = new RandomAccessFile(GBFile, "r");
				FileChannel channel = reader.getChannel();
				ByteArrayOutputStream out = new ByteArrayOutputStream()) {

			int bufferSize = 1024;
			if (bufferSize > channel.size()) {
				bufferSize = (int) channel.size();
			}

			ByteBuffer buff = ByteBuffer.allocate(bufferSize);


			channel.read(buff,12_300_000); // 12 milyonununcu byte tan itibaren buffer kadar oku!
			//		        while (channel.read(buff) > 0) {
			out.write(buff.array(), 0, buff.position());
			buff.clear();
			//		        }

			String fileContent = new String(out.toByteArray(), StandardCharsets.UTF_8);
			System.out.println(fileContent);
		}

	}

}
