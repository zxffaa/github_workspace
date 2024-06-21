import java.util.Arrays;

public class Exam_01 {
	static void sumAll(int a[]) {
		//합계
		System.out.print("\n");
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=a[i]+sum;
		}
		System.out.print("Data:"+Arrays.toString(a)+":"+sum+"\n");
	}
	static void sumAve(int a[]) {
		//평균이상
		System.out.print("\n");
		int sum=0;
		double ave=0;
		for(int i=0;i<a.length;i++) {
			sum=a[i]+sum;
		}
		ave=sum/12.;
		System.out.printf("평균(%.1f)이상:",ave);
		for(int j=0;j<a.length;j++) {
			if(ave<a[j]) {
				System.out.print(a[j]+" ");
			}
		}
		System.out.print("\n");
	}
	
	static void dataSelectionSort(int[] Up) {
     //선택정렬
		System.out.print("\n");
		System.out.print("Data:"+Arrays.toString(Up)+"\n");
		int i,j,temp;
		for(i=0;i<Up.length-1;i++) {
			for(j=i+1;j<Up.length;j++) {
				
				if(Up[i]>Up[j]) {
					temp=Up[i];
					Up[i]=Up[j];
					Up[j]=temp;
				}
			}
		}
		System.out.print("Sort:"+Arrays.toString(Up)+"\n");
	}
	
	static void dataBubbleSort(int[] Down) {
	//버블정렬
		System.out.print("\n");
		System.out.print("Data:"+Arrays.toString(Down)+"\n");
		int i,j,temp;
		for(i=0;i<Down.length;i++) {
			for(j=0;j<Down.length-i-1;j++) {
				if(Down[j+1]>Down[j]) {
					temp=Down[j];
					Down[j]=Down[j+1];
					Down[j+1]=temp;
				}
			}
		}
		System.out.print("Sort:"+Arrays.toString(Down)+"\n");
	}
	static int dataBig(int[] Big) {
		System.out.print("\n");
		int a = 0;
		System.out.print("Data:"+Arrays.toString(Big)+"\n");
		for(int i=1;i<Big.length;i++) {
			if(Big[i-1]<Big[i]) {
				a=Big[i];
			}
		}
		return a;
	}
	static int dataSmall(int[] Small) {
		System.out.print("\n");
		int a = 0;
		System.out.print("Data:"+Arrays.toString(Small)+"\n");
		for(int i=1;i<Small.length;i++) {
			if(Small[i-1]>Small[i]) {
				a=Small[i];
			}
		}
		return a;
	}
	public static void main(String[] args) {
	int score[]= {30,67,55,79,97,65,33,78,96,58,94,32};
	int ame[]=score.clone();
	sumAll(score);
	sumAve(score);
	dataSelectionSort(score);
	dataBubbleSort(ame);
	System.out.println("최대값:"+dataBig(score));
	System.out.println("최소값:"+dataSmall(ame));
	
	}

}
