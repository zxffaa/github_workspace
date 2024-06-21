package com.jslhrd.eee;
class AA{
	void div(int a, int b) {
		try {
			int res = a/b;
			System.out.println(res);
		}catch(Exception e) {
			//System.out.println(e.getMessage());
			//System.out.println("0으로 나눌수 없습니다.");
			e.printStackTrace();
		}
	}
}
public class ExaM_02 {
	public static void main(String[] args) {
		AA a = new AA();
		a.div(10, 0);
	}

}

