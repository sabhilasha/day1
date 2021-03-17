import java.io.FileWriter;
import java.io.Writer;
import java.io.IOException;
import java.io.BufferedWriter;

public class WriteFileDemo {
	public static void main(String[] args) {
		demo1();
	}
	private static void demo1() {
		Writer out;
		try {
			out = new FileWriter("output.txt");
			BufferedWriter bufferedWriter = new BufferedWriter(out);
			bufferedWriter.write("writing into a file");
			bufferedWriter.close();
		}catch(IOException e) {
			
		}
		
	}

}
