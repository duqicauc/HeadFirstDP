package myJavaIODecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) {
		int c;
		try {
			InputStream inputStream = new LowCaseInputStream(
					new BufferedInputStream(new FileInputStream("test.txt")));
			/* 使用这种方法，会多读一次 */			
//			do {
//				c = inputStream.read();
//				System.out.print((char)c);
//				
//			} while (c >= 0);
			
			while ((c = inputStream.read()) >= 0) {
				System.out.print((char)c);
			}
			
			inputStream.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
