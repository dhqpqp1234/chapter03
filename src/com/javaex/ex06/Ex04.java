package com.javaex.ex06;

public class Ex04 {

	public static void main(String[] args) {
		Integer i01 =new Integer(10);
		Integer i02 =new Integer(20);
		
		Short s01 = new Short((short)3); //short 타입으로 형변환
		Byte b01 = new Byte((byte)3);	//byte 타입으로 형변환
		
		Integer iresult = new Integer(3) + new Integer(5);
		System.out.println(iresult);
		
		Integer no =3; //Integer을쓰기위해 선언
		int r01 = no.parseInt("1234"); // 문자열 ==> 정수로 변환
		System.out.println(r01 + 1);
		
		int r02 = Integer.parseInt("12345");//static 으로 올라가잇음
		System.out.println(r02);
		
		Integer n02 = 100; //Integet ==> int
		int n03 = n02; //언박싱 
		
		String str = "안녕하세요";
		String str01 = str.valueOf(555);
		System.out.println(str01+1);
		
		String str02 = ""+1234;
		System.out.println(str02+3);
		
	}

}
