//10진수 -> 16진수
public class Exam_02 {
	public static void main(String[] args) {
		int dec = 10;//키보드로 10진수 25입력 예
		String str="";
		while(dec != 0) {
			int mok = dec / 16;
			int na = dec % 16;
			dec = mok;
			switch(na) {
				case 10:
					str = "A" + str; 
					break;
				case 11:
					str = "B" + str; 
					break;
				case 12:
					str = "C" + str; 
					break;
				case 13:
					str = "D" + str; 
					break;
				case 14:
					str = "E" + str; 
					break;
				case 15:
					str = "F" + str; 
					break;
				default:	
					str = na + str;
			}
			//dec = mok;
		}
		System.out.println("16진수 : " + str);
	}

}
