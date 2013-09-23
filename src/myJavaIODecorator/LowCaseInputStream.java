/**
 * 
 */
package myJavaIODecorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Administrator
 *
 */
public class LowCaseInputStream extends FilterInputStream {

	protected LowCaseInputStream(InputStream in) {
		super(in);
	}
	
	public int read() throws IOException{
		int c = in.read();
		return (c == -1 ? c : Character.toLowerCase(c));
	}
	   
    public int read(byte b[], int off, int len) throws IOException {
    	int result = super.read(b, off, len);
    	for (int i = off; i < off + result; i++) {
			b[i] = (byte) Character.toLowerCase(b[i]);
		}
        return result;
    }
}
