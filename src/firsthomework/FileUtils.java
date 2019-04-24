
package firsthomework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FileUtils {
    //  القراءة
	public static String readFileAsString(String name) throws IOException {
		return new String(Files.readAllBytes(Paths.get(name)));
	}

	// الكتابة 
	public static void appendStringToFile(String name, String line) throws IOException {
		File file = new File(name);
		FileWriter fw = new FileWriter(file, true);
		fw.write(line + "\r\n");
		fw.close();
	}
    
}
