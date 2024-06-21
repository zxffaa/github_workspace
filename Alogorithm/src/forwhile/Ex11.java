package forwhile;

public class Ex11 {
	public static void main(String[] args) {
		int i=0,s=0,sw=0;
		do {
			i++;
			if(sw==0) {
				s += i;
				sw=1;
			}else {
				s -= i;
				sw=0;
			}
		}while(i!=10);
		System.out.print(s);
	}

}
