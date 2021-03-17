import java.io.IOException;

public class ReadFromConsole {
	public static void main(String[] args) {
		byte[] input = new byte[100];
		try {
			System.in.read(input);
			System.out.println(input);
		}catch(IOException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

}
