package filechannel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileChannelTest2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String GBFile = "C:\\Users\\dev\\Downloads\\turchia.csv";
		GBFile = "C:\\Users\\dev\\Downloads\\TR 20M FB DATA.txt";
		try (FileChannel fcIn = new FileInputStream(GBFile).getChannel();
				FileChannel fcOut = new FileOutputStream(args[0]).getChannel()) {
			ByteBuffer buff = ByteBuffer.allocate((int) fcIn.size());
			System.out.println("Output: " + buff.remaining());
		} catch (Exception e) {
			System.out.println(e);
		} 

		System.out.println("---");

		List<String> satirlar = Files.readAllLines(Path.of(GBFile));
		System.out.format("Satır sayısı: %d", satirlar.size());
	}

	void listIcindeListAra(String path) throws IOException {
		// List içinde list arayan stream!!!!
		List<String> ara = List.of(
				"5301093020",
				"5300419016",
				"5300982651",
				"5300982651",
				"5301734588",
				"5301734588"
				);	

		Files.lines(Path.of(path)).filter(x -> {
			return ara.stream().anyMatch(s -> x.contains(s));
		}).forEach(System.out::println);
	}

}
