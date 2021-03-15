package chapter7.s2;

import java.io.File;

public class FileClass {

	public static void main(String... args) {
		String path = "c:\\JavaFileTest";
		
		// Olmayan dosya ile aşağıdaki gibi File nesnesi oluşturulabilir!
		// isFile fonksiyonu da hata vermez. Sadece false döner.
		File item = new File(path, "aaa.txt");
		System.out.println(item.isFile());
		
		item = new File("sdf");
		countDirFiles(new File(path));
	}
	
	public static void countDirFiles(File dir) {
		if (dir.isDirectory()) {
			int fileCount = 0;
			int dirCount = 0;
			String[] list = dir.list();
			File item = null;
			for (String listItem : list) {
				item = new File(dir, listItem);
				if (item.isFile())
					++fileCount;
				else if (item.isDirectory())
					++dirCount;
			}

			System.out.println ("File(s):"+ fileCount);
			System.out.println ("Dir(s):"+ dirCount);
		}
		else {
			throw new IllegalArgumentException("Not a directory");
		}

	}
}
