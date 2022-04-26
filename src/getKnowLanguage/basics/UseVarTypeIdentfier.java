package getKnowLanguage.basics;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Var 유형 식별자 사용
 *
 */
public class UseVarTypeIdentfier {

	public static void main(String args[]) throws IOException {
		
		/*
		 * Var 키워드
		 * Java SE 10부터 var유형 식별자를 사용하여 지역 변수를 선언할 수 있습니다. 
		 * 이렇게 하면 컴파일러에서 생성한 변수의 실제 유형이 무엇인지 결정하게 됩니다. 이 유형은 일단 생성되면 변경할 수 없습니다.
		 * 다음 예를 고려하십시오.
		 */
		
		String message = "Hello world!";
		Path path = Path.of("C:/egov/workspace/LearnJava/src/getKnowLanguage/basics/debug.log");
		InputStream stream = Files.newInputStream(path);
		
		/*
		 * 이 경우 세 변수의 명시적 유형을 선언해야 하고 message, path 와 stream 중복 됩니다.
		 * var유형 식별자를 사용 하여 이전 코드를 다음과 같이 작성할 수 있습니다.
		 */
		
		var message2 = "Hello world!";
		var path2 = Path.of("C:/egov/workspace/LearnJava/src/getKnowLanguage/basics/debug.log");
		var stream2 = Files.newInputStream(path2);
		
		/*
		 * Var를 사용한 예
		 * 다음 예제에서는 var유형 식별자를 사용하여 코드를 더 읽기 쉽게 만드는 방법을 보여줍니다. 
		 * 여기서 strings변수에는 List<String>유형이 지정 되고 element변수에는 String유형 이 지정 됩니다.
		 */
		
		var list = List.of("one", "two", "three", "four");
		for (var element: list) {
		    System.out.println(element);
		}
		
		/*
		 * 이 예에서 path변수는 Path유형 이고 stream변수는 InputStream유형 입니다.
		 */
		
		var path3 = Path.of("C:/egov/workspace/LearnJava/src/getKnowLanguage/basics/debug.log");
		try (var stream3 = Files.newInputStream(path3)) {
		    // process the file
			System.out.println(stream3);
		}

		/*
		 * 앞의 두 가지 예에서는 for 문과 try-with-resources 문에서 var변수를 선언하는 데 사용했습니다. 
		 * 이 두 문은 이 자습서의 뒷부분에서 다룹니다.
		 * 
		 * Var 사용에 대한 제한 사항
		 * var유형 식별자 사용에 제한이 있습니다.
		 * -메서드, 생성자 및 이니셜라이저 블록에 선언된 지역 변수 에만 사용할 수 있습니다.
		 * -var는 메서드 또는 생성자 매개변수가 아닌 필드에 사용할 수 없습니다.
		 * -컴파일러는 변수가 선언될 때 유형을 선택할 수 있어야 합니다. 에 유형이 없으므로 null변수에는 이니셜라이저가 있어야 합니다.
		 * 
		 * 이러한 제한 사항에 따라 다음 클래스는 컴파일되지 않습니다. 
		 * var는 필드 또는 메서드 매개 변수에 대해 형식 식별자로 사용할 수 없기 때문입니다.
		 * 
		 * public class User  {
			    private var name = "Sue";
			
			    public void setName(var name) {
			        this.name = name;
			    }
			}
		 */
		
	}
}


