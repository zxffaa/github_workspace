import java.sql.*;
public class Exam_03 {

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
			String sql="select ename,salary,salary+3000 as money from emp";
			stmt=conn.createStatement();
			re=stmt.executeQuery(sql);
			System.out.print("이름\t월급\t인상된 월급\n");
			while(re.next()){
			System.out.print(re.getString("ename")+"\t");
			System.out.print(re.getInt("salary")+"\t");
			System.out.println(re.getInt("money"));
			}
			conn.close();
			re.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
