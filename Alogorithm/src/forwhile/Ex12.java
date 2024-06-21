package forwhile;

public class Ex12 {
	public static void main(String[] args) {
		int i=0,j=1,k=1;
		do {
			i++;
			j+=i;//j=j+i
			k+=j;//k=k+j
		}while(j!=22);
		System.out.print(k);
	}

}
