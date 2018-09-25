package course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
//	public static void main(String[] args) throws ParseException {
//		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");	
//		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
//		
//		Date dataAtual = new Date();
//		
//		Date y1= sdf1.parse("11/07/2018");
//		Date y2 = sdf2.parse("11/07/2018 21:47:10");
//		
//		System.out.println(y1);
//		System.out.println(y2);
//		
//		System.out.println(sdf1.format(y1));
//		System.out.println(sdf2.format(y2));
//		
//		System.out.println(dataAtual);
//		System.out.println(sdf1.format(dataAtual)
//				);
//	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String texto = s.next();
		System.out.println(texto);
		
		String a, b, c;
		 a = s.next();
		 b = s.next();
		 c = s.next();
		 
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
				
	}
}
