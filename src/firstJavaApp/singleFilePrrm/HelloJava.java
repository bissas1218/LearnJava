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

	/*
	 * Shebang 파일로 실행
     * Unix와 같은 운영 체제에서 단일 파일 소스 코드 응용 프로그램은 스크립트와 같은 shebang 파일로 시작할 수도 있습니다. 
     * 자바 소스 파일 내에서 파일의 첫 번째 줄로 path/to/java/home --source <version>아래 예제와 같이 추가합니다.
     * 
     * 파일은 .java파일 확장자로 사용할 수 없으며 실행 가능해야 합니다 chmod +x. 이를 통해 다음과 같이 시작할 수 있습니다.
     * 
     * ./HelloJava
     * 
	 */
}
