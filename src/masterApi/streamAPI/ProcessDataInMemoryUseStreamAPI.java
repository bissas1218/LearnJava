package masterApi.streamAPI;

import java.util.List;
import java.util.stream.Collector;

/**
 * Stream API를 사용하여 메모리의 데이터 처리
 *
 */
public class ProcessDataInMemoryUseStreamAPI {

	/*
	 * Stream API는 아마도 람다 표현식 다음으로 Java SE 8에 추가된 두 번째로 중요한 기능일 것입니다. 
	 * 간단히 말해서 Stream API는 잘 알려진 맵 필터 축소 알고리즘의 구현을 JDK에 제공하는 것입니다.
	 * Collections Framework는 JVM의 메모리에 데이터를 저장하고 구성하는 것입니다. 
	 * 이 데이터를 매우 효율적인 방식으로 처리하기 위해 Stream API를 Collections Framework의 동반 프레임워크로 볼 수 있습니다. 
	 * 실제로 컬렉션에서 스트림을 열어 포함된 데이터를 처리할 수 있습니다.
	 * 여기서 그치지 않습니다. Stream API는 컬렉션의 데이터를 처리하는 것보다 훨씬 더 많은 일을 할 수 있습니다. 
	 * JDK는 I/O 소스를 포함하여 다른 소스에서 스트림을 생성하기 위한 몇 가지 패턴을 제공합니다. 
	 * 또한 약간의 노력으로 요구 사항에 완벽하게 맞는 고유한 데이터 소스를 생성할 수 있습니다.
	 * Stream API를 마스터하면 매우 표현적인 코드를 작성할 수 있습니다. 다음은 올바른 정적 가져오기로 컴파일할 수 있는 작은 스니펫입니다.
	 */
	
	public static void main(String args[]) {
		List<String> strings = List.of("one","two","three","four");
		//var map = strings.stream()
		//                 .collect(groupingBy(String::length, counting()));
		//map.forEach((key, value) -> System.out.println(key + " :: " + value));
	}

	
}
