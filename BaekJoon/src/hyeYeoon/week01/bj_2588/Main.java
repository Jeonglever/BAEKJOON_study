package hyeYeoon.week01.bj_2588;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.parseInt(bf.readLine());
		String B = bf.readLine();
		
		
		bw.write(String.valueOf(A * (B.charAt(2) - '0'))+"\n");
		bw.write(String.valueOf(A * (B.charAt(1) - '0'))+"\n");
		bw.write(String.valueOf(A * (B.charAt(0) - '0'))+"\n");
		bw.write(String.valueOf(A * Integer.parseInt(B)));
		
		bw.flush();
		bf.close();
		bw.close();
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		int A = sc.nextInt();
//		String B = sc.next();
//		
//		System.out.println(A * (B.charAt(2) - '0'));
//		System.out.println(A * (B.charAt(1) - '0'));
//		System.out.println(A * (B.charAt(0) - '0'));
//		System.out.println(A * Integer.parseInt(B));
		
	}

}
