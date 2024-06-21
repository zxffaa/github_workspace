package com.jslhrd.aaa;

public class DataProcess implements Process {

	@Override
	public int max1(int a, int b) {
		int max=a;
		if(max<b) {
			max=b;
		}
		return max;
	}

	@Override
	public int min1(int a, int b) {
		int min=a;
		if(min>b) {
			min=b;
		}
		return min;
	}

	@Override
	public int max2(int... a) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		return max;
	}

	@Override
	public int min2(int... a) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		return min;
	}

}
