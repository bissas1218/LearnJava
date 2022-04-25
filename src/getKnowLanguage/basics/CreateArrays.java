package getKnowLanguage.basics;

/**
 * 프로그램에서 배열 생성
 *
 */
public class CreateArrays {

	/*
	 * ● 배열
	 * 배열 은 단일 유형의 고정된 수의 값을 보유하는 컨테이너 객체입니다. 
	 * 배열의 길이는 배열이 생성될 때 설정됩니다. 생성 후에는 길이가 고정됩니다. 
	 * "Hello World!"의 기본 메서드에서 이미 배열의 예를 보았습니다. 애플리케이션. 이 섹션에서는 array에 대해 더 자세히 설명합니다.
	 * 
	 * 0(First index)	1	2	3	4	5						6	7 ->Indices
	 * 1				4	2	0	8	7(Element at index5)	5	1
	 * 				(8개 요소의 배열)
	 * 
	 * 배열의 각 항목은 요소(element) 라고 하며 각 요소는 숫자 인덱스 로 액세스됩니다. 
	 * 앞의 그림에서 볼 수 있듯이 번호 매기기는 0으로 시작합니다. 예를 들어 6번째 요소는 인덱스 5에서 액세스됩니다.
	 * 다음 프로그램 ArrayDemo은 정수 배열을 만들고 배열에 일부 값을 넣고 각 값을 표준 출력으로 인쇄합니다.
	 */

	//public static void main(String args[]) {
	//	ArrayDemo.arrayDemo();
	//}
	
	/*
	 * 이 프로그램의 출력은 다음과 같습니다.
	 * 
	 * Element at index 0: 100
	 * Element at index 1: 200
	 * Element at index 2: 300
	 * Element at index 3: 400
	 * Element at index 4: 500
	 * Element at index 5: 600
	 * Element at index 6: 700
	 * Element at index 7: 800
	 * Element at index 8: 900
	 * Element at index 9: 1000
	 * 
	 * 실제 프로그래밍 상황에서는 앞의 예와 같이 각 줄을 개별적으로 작성하는 대신 지원되는 반복 구성 중 하나를 사용하여 
	 * 배열의 각 요소를 반복할 수 있습니다. 그러나 예제는 배열 구문을 명확하게 보여줍니다. 
	 * 제어 흐름 섹션 에서 다양한 반복 구문(for, while, do-while)에 대해 배울 것입니다.
	 * 
	 * ● 배열을 참조하는 변수 선언
	 * anArray앞의 프로그램은 다음 코드 행을 사용하여 배열(이름이 지정된 )을 선언합니다.
	 */
	
	// declares an array of integers
	int[] anArray;
	
	/*
	 * 다른 유형의 변수에 대한 선언과 마찬가지로 배열 선언에는 배열 유형과 배열 이름이라는 두 가지 구성 요소가 있습니다. 
	 * 배열의 유형은 type[]로 작성됩니다 . 여기서 type는 포함된 요소의 데이터 유형입니다. 
	 * 대괄호는 이 변수가 배열을 보유하고 있음을 나타내는 특수 기호입니다. 
	 * 배열의 크기는 해당 유형의 일부가 아닙니다(이 때문에 대괄호가 비어 있음). 
	 * 배열의 이름은 클래스 섹션 에서 논의된 규칙과 규칙을 따른다면 원하는 무엇이든 될 수 있습니다. 
	 * 다른 유형의 변수와 마찬가지로 선언은 실제로 배열을 생성하지 않습니다. 단순히 이 변수가 지정된 유형의 배열을 보유할 것임을 컴파일러에 알립니다.
	 * 마찬가지로 다른 유형의 배열을 선언할 수 있습니다.
	 */
	
	byte[] anArrayOfBytes;
	short[] anArrayOfShorts;
	long[] anArrayOfLongs;
	float[] anArrayOfFloats;
	double[] anArrayOfDoubles;
	boolean[] anArrayOfBooleans;
	char[] anArrayOfChars;
	String[] anArrayOfStrings;
	
	/*
	 * 배열 이름 뒤에 대괄호를 넣을 수도 있습니다.
	 */
	
	// this form is discouraged
	float anArrayOfFloats2[];
	
	/*
	 * 그러나 관습은 이 형식을 권장하지 않습니다. 대괄호는 배열 유형을 식별하며 유형 지정과 함께 표시되어야 합니다.
	 * 
	 * ● 어레이 생성, 초기화 및 액세스
	 * 배열을 만드는 한 가지 방법은 new연산자를 사용하는 것입니다. 
	 * 다음 명령문은 ArrayDemo프로그램 의 10개의 정수 요소를 위한 충분한 메모리가 있는 배열을 할당하고 해당 배열을 anArray변수에 할당합니다.
	 */
	
	// create an array of integers
	//anArray = new int[10];
	
	/*
	 * 이 문이 없으면 컴파일러는 다음과 같은 오류를 인쇄하고 컴파일은 실패합니다.
	 */
	
	//ArrayDemo.java:4: Variable anArray may not have been initialized.
	
	/*
	 * 다음 몇 줄은 배열의 각 요소에 값을 할당합니다.
	 */
	
	//anArray[0] = 100; // initialize first element
	//anArray[1] = 200; // initialize second element
	//anArray[2] = 300; // and so forth
	
	/*
	 * 각 배열 요소는 숫자 인덱스로 액세스합니다.
	 */
	
	//System.out.println("Element 1 at index 0: " + anArray[0]);
	//System.out.println("Element 2 at index 1: " + anArray[1]);
	//System.out.println("Element 3 at index 2: " + anArray[2]);
	
	/*
	 * 또는 바로 가기 구문을 사용하여 배열을 만들고 초기화할 수 있습니다.
	 */
	
	int[] anArray2 = { 
		    100, 200, 300,
		    400, 500, 600, 
		    700, 800, 900, 1000
		};
	
	/*
	 * 여기서 배열의 길이는 중괄호 사이에 제공되고 쉼표로 구분된 값의 수로 결정됩니다.
	 * String[][] 이름 과 같은 두 개 이상의 대괄호 세트를 사용하여 배열의 배열(다차원 배열이라고도 함)을 선언할 수도 있습니다. 
	 * 따라서 각 요소는 해당 수의 인덱스 값으로 액세스해야 합니다.
	 * Java 프로그래밍 언어에서 다차원 배열은 구성 요소 자체가 배열인 배열입니다. 
	 * 이것은 C 또는 Fortran의 배열과 다릅니다. MultiDimArrayDemo그 결과 다음 프로그램 과 같이 행의 길이가 달라질 수 있습니다.
	 */
	
	//public static void main(String args[]) {
	//	MultiDimArrayDemo.multiDimArrayDemo();
	//}
	
	/*
	 * 이 프로그램의 출력은 다음과 같습니다.
	 */
	
	//Mr. Smith
	//Ms. Jones
	
	/*
	 * 마지막으로 내장 length속성을 사용하여 배열의 크기를 결정할 수 있습니다. 다음 코드는 배열의 크기를 표준 출력으로 인쇄합니다.
	 */
	
	//System.out.println(anArray.length);
	
	/*
	 * ● 배열 복사
	 * 이 System클래스에는 arraycopy()한 배열에서 다른 배열로 데이터를 효율적으로 복사하는 데 사용할 수 있는 메서드가 있습니다.
	 * 
	 * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
	 * 
	 * 두 Object인수는 복사할 원본 배열과 복사할 배열을 지정합니다. 
	 * 세 개의 int인수는 원본 배열의 시작 위치, 대상 배열의 시작 위치 및 복사할 배열 요소의 수를 지정합니다.
	 * 다음 프로그램 은 요소 ArrayCopyDemo배열을 선언합니다. 
	 * String이 메서드를 사용하여 System.arraycopy()배열 구성 요소의 하위 시퀀스를 두 번째 배열로 복사합니다.
	 */
	
	//public static void main(String args[]) {
	//	ArrayCopyDemo.arrayCopyDemo();
	//}
	
	/*
	 * 이 프로그램의 출력은 다음과 같습니다.
	 */
	
	// Cappuccino Corretto Cortado Doppio Espresso Frappucino Freddo
	
	/*
	 * ● 배열 조작
	 * 배열은 프로그래밍에 사용되는 강력하고 유용한 개념입니다. Java SE는 배열과 관련된 가장 일반적인 조작을 수행하는 방법을 제공합니다. 
	 * 예를 들어 이 ArrayCopyDemo예제에서는 소스 배열의 요소를 수동으로 반복하고 각 요소를 대상 배열에 배치하는 대신 
	 * System클래스 의 arraycopy()메서드를 사용합니다. 이것은 배후에서 수행되므로 개발자는 한 줄의 코드만 사용하여 메서드를 호출할 수 있습니다.
	 * 사용자의 편의를 위해 Java SE는 java.util.Arrays 클래스에서 배열 조작(배열 복사, 정렬 및 검색과 같은 일반적인 작업)을 수행하기 
	 * 위한 여러 메서드를 제공합니다	. 예를 들어, 이전 예제는 ArrayCopyOfDemo 예제 에서 볼 수 있듯이 java.util.Arrays클래스 의 
	 * java.util.Arrays메서드 를 사용하도록 수정할 수 있습니다. 차이점은 java.util.Arrays 메서드를 사용하면 메서드를 호출하기 전에 
	 * 대상 배열을 만들 필요가 없다는 것입니다. 대상 배열은 메서드에서 반환되기 때문입니다.
	 */
	
	//public static void main(String args[]) {
	//	ArrayCopyDemo.arrayCopyDemo1();
	//}
	
	/*
	 * 보시다시피 이 프로그램의 출력은 더 적은 수의 코드 줄을 필요로 하지만 동일합니다. 
	 * java.util.Arrays메서드 의 두 번째 매개 변수는 복사할 범위의 초기 인덱스를 포함하고 
	 * 세 번째 매개 변수는 복사할 범위의 마지막 인덱스를 배타적으로 나타냅니다. 
	 * 이 예에서 복사할 범위는 인덱스 9(문자열 Lungo 포함)의 배열 요소를 포함하지 않습니다.
	 * java.util.Arrays클래스 의 메서드에서 제공하는 다른 유용한 작업 은 다음과 같습니다.
	 * -배열이 배치된 인덱스를 얻기 위해 특정 값에 대한 배열 검색( binarySearch() 메소드).
	 * -두 배열을 비교하여 동일한지 여부를 결정합니다( equals() 메소드).
	 * -각 인덱스( fill()메소드)에 특정 값을 배치하기 위해 배열을 채웁니다.
	 * -배열을 오름차순으로 정렬합니다. 이것은 sort()메소드를 사용하여 순차적으로 수행하거나 Java SE 8에 도입된 
	 *  parallelSort()방법을 사용하여 동시에 수행할 수 있습니다. 
	 * -다중 프로세서 시스템에서 큰 배열의 병렬 정렬은 순차 배열 정렬보다 빠릅니다.배열을 소스로 사용하는 스트림 생성( stream()메소드). 
	 *  예를 들어 다음 명령문 copyTo은 이전 예와 동일한 방식으로 배열의 내용을 인쇄합니다.
	 */
	
	//public static void main(String args[]) {
	//	ArrayCopyDemo.arrayCopyDemo2();
	//}
	
	/*
	 * 스트림에 대한 자세한 내용은 집계 작업을 참조하세요.
	 * -배열을 문자열로 변환. 이 toString()메서드는 배열의 각 요소를 문자열로 변환하고 쉼표로 구분한 다음 대괄호로 묶습니다. 
	 * 예를 들어 다음 문은 copyTo배열을 문자열로 변환하고 인쇄합니다.
	 */
	
	public static void main(String args[]) {
		ArrayCopyDemo.arrayCopyDemo3();
	}
		
	/*
	 * 이 문은 다음을 인쇄합니다.
	 */
	
	// [Cappuccino, Corretto, Cortado, Doppio, Espresso, Frappucino, Freddo] 
	
	/*
	 * ● 변수 및 배열 정리
	 * Java 프로그래밍 언어는 용어의 일부로 "필드"와 "변수"를 모두 사용합니다. 
	 * 인스턴스 변수(비정적 필드)는 클래스의 각 인스턴스에 고유합니다. 
	 * 클래스 변수(정적 필드)는 static 한정자로 선언된 필드입니다. 
	 * 클래스가 인스턴스화된 횟수에 관계없이 클래스 변수의 복사본은 정확히 하나만 있습니다. 
	 * 지역 변수는 메서드 내부에 임시 상태를 저장합니다. 
	 * 매개변수는 메소드에 추가 정보를 제공하는 변수입니다. 
	 * 지역 변수와 매개변수는 항상 "변수"("필드"가 아님)로 분류됩니다. 
	 * 필드나 변수의 이름을 지정할 때 따라야 하는(또는 반드시 따라야 하는) 규칙과 규칙이 있습니다.
	 * 
	 * 8가지 기본 데이터 유형은 byte, short, int, long, float, double, boolean, 및 char. 
	 * java.lang.String클래스 는 문자열을 나타냅니다. 
	 * 컴파일러는 위 유형의 필드에 적절한 기본값을 할당합니다. 지역 변수의 경우 기본값이 할당되지 않습니다.
	 * 
	 * 리터럴은 고정 값의 소스 코드 표현입니다. 배열은 단일 유형의 고정된 수의 값을 보유하는 컨테이너 객체입니다. 
	 * 배열의 길이는 배열이 생성될 때 설정됩니다. 생성 후에는 길이가 고정됩니다.
	 */
}

class ArrayDemo {
	
    static void arrayDemo() {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];
           
        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: "
                           + anArray[0]);
        System.out.println("Element at index 1: "
                           + anArray[1]);
        System.out.println("Element at index 2: "
                           + anArray[2]);
        System.out.println("Element at index 3: "
                           + anArray[3]);
        System.out.println("Element at index 4: "
                           + anArray[4]);
        System.out.println("Element at index 5: "
                           + anArray[5]);
        System.out.println("Element at index 6: "
                           + anArray[6]);
        System.out.println("Element at index 7: "
                           + anArray[7]);
        System.out.println("Element at index 8: "
                           + anArray[8]);
        System.out.println("Element at index 9: "
                           + anArray[9]);
    }
} 

class MultiDimArrayDemo {
    static void multiDimArrayDemo() {
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
    }
}

class ArrayCopyDemo {
    static void arrayCopyDemo() {
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto" };
        
        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");           
        }
    }
    
    static void arrayCopyDemo1() {
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto" };
        
        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);        
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");           
        }            
    }
    
    static void arrayCopyDemo2() {
    	String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
                "Marocchino", "Ristretto" };
            
        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9); 
    	java.util.Arrays.stream(copyTo).map(coffee -> coffee + ", ").forEach(System.out::print);
    }
    
    static void arrayCopyDemo3() {
    	String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
                "Marocchino", "Ristretto" };
            
        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9); 
    	System.out.println(java.util.Arrays.toString(copyTo));
    }
}