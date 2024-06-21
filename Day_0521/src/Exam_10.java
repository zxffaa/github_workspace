
public class Exam_10 {
	static void scoreSum(int a[]) {
		int s=0;
		for(int i=0;i<a.length;i++) {
			s+=a[i];
		}
		System.out.printf("10,90,88,75,46,79,55합:%d\n",s);
	}
	static void scoreMaxMin(int a[]) {
		int max=a[0],min=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.printf("max:%d,min:%d\n",max,min);
	}
	static void MaxMedMin(int a,int b,int c) {
		int max=(a>b)?a:(b>c)?b:c;
		int min=(a<b)?a:(b<c)?b:c;
		int mid=0;
		if(max>a&&min<a) {
			mid=a;
		}
		if(max>b&&min<b) {
			mid=b;
		}
		if(max>c&&min<c) {
			mid=c;
		}
		System.out.printf("max:%d,men:%d,min:%d\n",max,mid,min);
	}
	

	public static void main(String[] args) {
		int score[]= {10,90,88,75,46,79,55};
		int a=80,b=90,c=85;
		scoreSum(score);
		scoreMaxMin(score);
		MaxMedMin(a,b,c);
		//Score의 내용을 출력 후 합을 구하여 출력
		//10,90,88,75,46,79,55 합=xx

	}

}
