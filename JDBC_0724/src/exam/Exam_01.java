package exam;

import model.*;
import java.util.*;

public class Exam_01 {

	public static void main(String[] args) {
		MemberDAO COUNT=new MemberDAO();
		int cnt=COUNT.MemberCon();
		if(cnt==0) {
			System.out.print("등록된 자료가 없음");
		}else {
			System.out.print("등록된자료:"+cnt);
		}

	}

}
