package day05;

/* 
 * 기본자료형 (primitive type)
 * 	- 숫자형 (정수형-byte, short, int, long, 실수형-float, double)
 *  - 문자형 (char) 
 *  - 논리형 (boolean) true, false
 * 
 * 참조형(reference type)- 클래스형, 인터페이스형, 배열
 *  - String(문자열)
 *  String s=new String("java");
 *  String s2="hello"
 *  - Date
 *  Date d=new Date()
 *  - Scanner
 *  Scanner sc=new Scanner(System.in);
 * 
 *  if, if~else,  if else if....else
 *  switch~case
 *  for, while, do~while
 * 
 */

public class ArrayTest {

	public static void main(String[] args) {
		System.out.println("1.-------------");
		int a = 1; //기본자료형-정수형
		int[] b; //참조형-1차원 배열
		
		/*
		 * [1]선언
		 * [2]메모리 할당
		 * [3]초기화
		 */
		//[1] int[] c; //선언		int c[3] [x]
		int c[];
		
		//[2] 메모리 할당=> new 연산자 이용
		c = new int[3]; //배열의 크기를 정한다
		
		//[3] 초기화 : index를 이용해서 데이터를 저장한다
		//이때 index는 0부터 시작한다
		c[0] = 10;
		c[1] = 20;
		c[2] = 30;
		System.out.println(c);//배열의 추소값을 출력
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		
		System.out.println("2.------------------");
		//[1][2] : 선언과 동시에 메모리 할당
		//[3] : 초기화
		double arr[] = new double[4];//[1][2]
		//배열은 초기화를 하지 않으면 티폴트값들이 저장되어 있다.
		System.out.println("arr[0]="+arr[0]); //0.0
		System.out.println("arr[3]="+arr[3]);
		arr[0]=.897;	//[3]
		arr[1]=450e-2;
		arr[2]=0x12;
		arr[3]='A';
		for(int i=0; i<=3; i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
		//char타입의 1차원 배열을 선언하고
		//아래와 같은 문자들을 저장하세요
		//'J','a','v','a'
		//for루프 이용해서 출력해보기
		
		char arr2[] = new char[5];
		arr2[0] = 'J';
		arr2[1] = 'a';
		arr2[2] = 'v';
		arr2[3] = 'a';
		//배열의 크기를 알 수 있는 속성 : length
		System.out.println("arr2.length="+arr2.length);
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		System.out.println("3.------------");
		//[1][2][3] 단계를 한꺼번에
		//선언과 동시에 메모리 할당하고 초기값 저장
		char arr3[] = {'B','y','e'};
		System.out.println("arr3.length="+arr3.length);
		for(int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i]);
		}
	}

}
