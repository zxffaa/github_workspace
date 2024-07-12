import java.sql.*;
public class Exam_01 {

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
			//System.out.println("커넥션:"+conn);
			String sql="select * from dept";
			stmt=conn.createStatement();
			re=stmt.executeQuery(sql);
			//출력
			System.out.print("부서번호\t부서명\t지역명\n");
			while(re.next()) {//존재하면
				//int dno=rs.getInt("dno);
				//System.out.
				System.out.print(re.getInt("dno")+"\t");
				System.out.print(re.getString("dname")+"\t");
				System.out.println(re.getString("loc"));
			}
			conn.close();
			re.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
