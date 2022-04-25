package firstJavaApp.singleFilePrrm;

/*
 * javaJDK 11에서 Java는 먼저 소스 코드를 명시적으로 컴파일할 필요 없이 실행기 로 단일 파일 소스 코드 프로그램을 시작하는 기능을 도입했습니다 . 
 * 이것은 java런처가 자동으로 컴파일러를 호출하고 컴파일된 코드를 메모리에 저장함으로써 작동합니다. 
 * 이것은 코드를 컴파일하고 실행하는 과정을 거치지 않고도 Java 사용 방법을 배우거나 Java API 내에서 새로운 기능을 탐색하는 좋은 방법이 될 수 있습니다. 
 * 이 기능을 사용하는 방법에는 여러 가지가 있으며 몇 가지 제한 사항과 염두에 두어야 할 사항이 있습니다.
 */
public class HelloWorld {
	
	/**
	 * 단일 파일 소스 코드 프로그램을 실행하려면 소스 파일에 정의된 첫 번째 클래스 가 아래와 
	 * public static void main(String[])같이 포함되어야 합니다.HelloWorld
	 * 
	 * 명령줄에서 다음 HelloWorld을 사용하여 시작할 수 있습니다(파일 이름을 수락하는 것도 HelloWorld.java):
	 * 
	 * $ java HelloWorld.java
	 */
	public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
