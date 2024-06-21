package com.jslhrd.ccc;

public class MathProData implements MathPro {

	@Override
	public int sum(int n, int m) {
		int sum = 0;
		for (int i = n; n <= m; i++) {
			i += sum;
		}
		return sum;
	}

	@Override
	public String binaryStr(int num) {
		String bin="";
		while(num != 0) {
			int na = num % 2;
			num = na + bin;
			num = num / 2;
		}
		return bin;
	}

	@Override
	public int[] binaryArr(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void priNumber(int num) {
		// TODO Auto-generated method stub

	}

	@Override
	public void numberScore(int... values) {
		int max=values[0],min=0,sum=0;
		for(int i=0;i<10;i++) {
			if(max<values[i]) {
				max=values[i];
			}else {
				min=values[i];
			}
		}
		sum=max+min;
		System.out.printf("최대값:%d\t최소값:%d\t합계:%d\n",max,min,sum);
	}

}
