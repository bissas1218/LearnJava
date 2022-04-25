package firstJavaApp.singleFilePrrm;

public class HelloJava {

	/*
	 * 인수 전달
	 * 일반적으로 컴파일된 클래스와 마찬가지로 인수를 전달할 수도 있습니다.
	 * 
	 * 인수를 전달하는 방법은 다음과 같습니다.
	 * 
	 * $ java HelloJava.java World!
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Hello " + args[0]);
	}

}
