package com.jslhrd.sawon;

public class Sawon_calculator {
	int count=0,num=0,number=0,time=0,tot=0,sum=0;
	String name="",gen="";

	Sawon_calculator(){}
	Sawon_calculator(Sawon_calculator[] a){
		for (int i = 1; i < a.length; i++) {
			switch(a[i].num) {
			case 1:
				if(a[i].time>50){
					a[i].time=50;
					if(a[i].time>36) {
						a[i].tot=(int)((a[i].time-36)*1.5)+36*10000;
					}else {
						a[i].tot=a[i].time*10000;
					}
				}
				a[i].count=10000;
				this.sum=sum+a[i].tot;
				break;
			case 2:
				if(a[i].time>50){
					a[i].time=50;
					if(a[i].time>36) {
						a[i].tot=(int)((a[i].time-36)*1.5)+36*5000;
					}else {
						a[i].tot=a[i].time*5000;
					}
				}
				this.sum=sum+a[i].tot;
				a[i].count=5000;
				break;
			case 3:
				if(a[i].time>50){
					a[i].time=50;
					if(a[i].time>36) {
						a[i].tot=(int)((a[i].time-36)*1.5)+36*2000;
					}else {
						a[i].tot=a[i].time*2000;
					}
				}
				a[i].count=2000;
				this.sum=sum+a[i].tot;
				break;
			default:
				System.out.print("시스템오류");
				break;
			}
		}
	}	
}
