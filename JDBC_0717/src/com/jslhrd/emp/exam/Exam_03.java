package com.jslhrd.emp.exam;

import java.util.Iterator;
import java.util.List;

import com.jslhrd.emp.model.*;

public class Exam_03 {

	public static void main(String[] args) {
		EmpDAO third=new EmpDAO();
		System.out.print("급여최대\t급여최소\t급여총합\t  급여평균\n");
		System.out.print("최대:"+third.ThirdPrint().getMax()+"\t");
		System.out.print("최소:"+third.ThirdPrint().getMin()+"\t");
		System.out.print("총합:"+third.ThirdPrint().getTot()+" ");
		System.out.print("평균:"+third.ThirdPrint().getAvg());
	}

}
