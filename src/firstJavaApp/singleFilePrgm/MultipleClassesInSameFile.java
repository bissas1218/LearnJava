package firstJavaApp.singleFilePrgm;

/*
 * 동일한 파일의 여러 클래스
 * 다음 예제와 같이 캡슐화 목적으로 필요한 경우 동일한 소스 파일 내에서 여러 클래스를 정의할 수 있습니다.
 */
public class MultipleClassesInSameFile {
	public static void main(String[] args) {
		 
        System.out.println(GenerateMessage.generateMessage());
        System.out.println(AnotherMessage.generateAnotherMessage());
    }
}

class GenerateMessage {
    static String generateMessage() {
        return "Here is one message";
    }
}
 
class AnotherMessage {
    static String generateAnotherMessage() {
        return "Here is another message";
    }
}