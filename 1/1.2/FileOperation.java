import java.io.FileWriter;
import java.io.IOException;

@Save
public class FileOperation {
	private String path = "a.txt";
	@Savedo
	public void savetext(String text) {
		try {
			FileWriter fw = new FileWriter(path);
			fw.write(text);
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
