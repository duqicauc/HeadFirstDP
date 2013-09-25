package myJavaIODecorator;

import java.io.*;

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
			
			/* 依次将文件内容读入并处理，然后打印到控制台 */
			while ((c = inputStream.read()) >= 0) {
				System.out.print((char)c);
			}
			
			inputStream.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
