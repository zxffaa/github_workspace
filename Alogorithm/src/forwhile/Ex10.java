package forwhile;

public class Ex10 {

	public static void main(String[] args) {
		int i=0,s=0,y=1;
		while(true) {
			i++;
			int m=i*y;
			s += m;
			if(i==10) {
				break;
			}
			y=y*(-1);
		}
		System.out.print(s);
	}

}
