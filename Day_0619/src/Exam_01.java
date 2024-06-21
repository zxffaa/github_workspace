
public class Exam_01 {
class AA{
	
}
	public static void main(String[] args) {
		String str="A";
		String s=new String("A");
		//문자열을 같을시 다른공간에 만들지 않고 만들어져있던곳을 지정
		//단 new를 이용하여 생성시 만들고 공유한다.
		//문자는 수정이 안되며 추가시 새로생성된다. 
		//자동해체는 가비지 콜랙션
		//System.gc();-빠른시간내에 메모리 정리 코드 
		str+="B";//"AB"
		str+="C"; //"ABC"
		

	}

}
