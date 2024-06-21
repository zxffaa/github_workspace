//계산기 클래스
public class Exam_08 {

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add(7,4);
		cal.sub(7,4);
		cal.mul(7,4);
		cal.div(7,0);
		cal.div(7,4);
		cal.mulAdd(1,2,3,4,5);
		cal.mulAdd(4,7,5);
	}

}
