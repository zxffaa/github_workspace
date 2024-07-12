import java.sql.*;
import java.util.*;
public class Exam_05 {

	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		PreparedStatement pstmt=null;
		ResultSet re=null;//select문 사용시 반드시 써야됨
		
		String myURL="jdbc:oracle:thin:@localhost:1521:xe";
		String myID="TRACK2_17";
		String myPASS="1234";
		//드라이브 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패");
		}
		Scanner input=new Scanner(System.in);
		int dno=input.nextInt();
		try {
			conn =DriverManager.getConnection(myURL,myID,myPASS);
			//변수가 들어갈 데이터베이스 명령어는 ?를 사용한다
			String sql="select eno,ename,job,manager,salary from emp where dno=?";
			pstmt.setInt(1, dno);
			re = pstmt.executeQuery();
		
			while(re.next()) {
				System.out.print(re.getInt("eno") + "\t");
				System.out.print(re.getString("ename") + "\t");
				System.out.print(re.getString("job") + "\t");
				System.out.print(re.getInt("manager") + "\t");
				System.out.print(re.getInt("salary") + "\n");
			}

			conn.close();
			re.close();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
