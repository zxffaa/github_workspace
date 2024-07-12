import java.sql.*;
public class Exam_02 {

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
		try {
			conn =DriverManager.getConnection(myURL,myID,myPASS);
			String sql="select eno,ename,job,hiredate,salary from emp where dno=10";
			stmt=conn.createStatement();
			re=stmt.executeQuery(sql);
			System.out.print("번호\t이름\t고용일자\t월급\n");
			while(re.next()) {
			System.out.print(re.getInt("eno")+"\t");
			System.out.print(re.getString("ename")+"\t");
			System.out.print(re.getString("job")+"\t");
			System.out.print(re.getString("hiredate")+"\t");
			System.out.println(re.getString("salary"));
			}
			conn.close();
			re.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
} 