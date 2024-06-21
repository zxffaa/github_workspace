
public class Exam_10 {
	public static void main(String[] args) {
		int val[] = {87, 90,  67,  59,  88,  76,  95,  78 };
		//출력 및 총점, 평균
		int sum=0;
		System.out.print("Data : ");
		for(int x : val) {
			System.out.printf("%3d", x);
			sum += x;// 총점
		}
		System.out.println();//줄바꿈
		
		int ave = (int)((double)sum/val.length+0.5);
		System.out.println("평균 : " + ave);
		
		//평균에 가장 가까운 값 찾기
		//평균과의 차이값(절대값)
		int min = (val[0] > ave) ? val[0]-ave : ave-val[0];
		int minValue = val[0];// 실제값
		
		for(int i=1; i<val.length;i++) {
			int temp;
			//절대값 계산
			if(val[i] > ave) {
				temp = val[i] - ave;
			}else {
				temp = ave - val[i];
			}
			//절대값을 이용한 최소값 찾기
			if(min > temp) {
				min = temp;
				minValue=val[i];
			}
		}
		System.out.println("평균에 가장 가까운 값 : " + minValue);
	}

}
