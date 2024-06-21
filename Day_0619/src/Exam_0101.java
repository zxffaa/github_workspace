
public class Exam_0101 {

	public static void main(String[] args) {
		//배열처럼 만들어지되 16개의 공간을 가진다 16byte크기
		//기본배열은 크기를 넘으면 끊키지만 StringBuffer는 자동으로 크기를 조정한다
		StringBuffer sb1=new StringBuffer(); 
		//StringBuffer(30) 선언시 공간을 지정한 숫자만큼 만든다
		StringBuffer sb2=new StringBuffer(30);
		//입력한 문자를 넣고 그만큼 크기가 뒤로 추가된다
		StringBuffer sb3=new StringBuffer("korea");
		//물리적공간을 확인하는 코드
		int size=sb1.capacity();
		System.out.println("sb1 size="+size);
		System.out.println("sb2 size="+sb2.capacity());
		System.out.println("sb3 size="+sb3.capacity());
		System.out.println("-------------------------------------");
		//문자열갯수
		System.out.println("sb1 length="+sb1.length());
		System.out.println("sb2 length="+sb2.length());
		System.out.println("sb3 length="+sb3.length());
	}

}
