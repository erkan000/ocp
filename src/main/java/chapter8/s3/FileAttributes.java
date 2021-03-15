package chapter8.s3;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserDefinedFileAttributeView;

public class FileAttributes {
	
	private static final String klasor = "src/main/resources/files/";

	public static void main(String args[]) throws IOException {
		Path file = Paths.get(klasor + "copiedFile.txt");
		UserDefinedFileAttributeView view= Files.getFileAttributeView(file, UserDefinedFileAttributeView.class);
		writeAttr(view,"delete",true);
		if (readAttr(view, "delete"))
			System.out.println("Kullanıcı tanımlı silme özelliği dosyaya set edildi.");
	}
	static void writeAttr( UserDefinedFileAttributeView view, String attr, boolean value) throws IOException {
		if (value)
			view.write(attr,Charset.defaultCharset().encode("true"));
		else
			view.write(attr,Charset.defaultCharset().encode("false"));
	}
	static boolean readAttr( UserDefinedFileAttributeView view,	String attr) throws IOException {
		ByteBuffer buf = ByteBuffer.allocate(view.size(attr));
		view.read(attr, buf);
		buf.flip();
		String value = Charset.defaultCharset().decode(buf).toString();
		return (value.equalsIgnoreCase("true"));
	}

}
