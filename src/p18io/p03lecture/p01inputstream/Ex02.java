package p18io.p03lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class Ex02 {
	public static void main(String[] args) {
		String file = "C:\\Users\\강성빈\\Desktop\\iotest\\test1";
		InputStream is = new FileInputStream(file);
		
		int input = 0;
		
		while ((input = is.read()) != -1) {
			
		}
		
		System.out.println("프로그램 종료");
		is.close();
		
	}
}
