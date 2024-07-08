import java.sql.*;

public class JDBC_Test {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.print("JDBC 드라이브 로딩 성공");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.print("JDBC 드라이브 로딩 실패");
		}
		try {
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","track2_17","1234");
			System.out.println("커넥션 연결 성공");
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("Select*from dept");
			while(rs.next()) {
				System.out.print(rs.getInt("dno")+"\t");
				System.out.print(rs.getString("dname")+"\t");
				System.out.print(rs.getString("loc")+"\t");
			}
			conn.close();
			
		} catch (Exception e) {
			System.out.print("커넥션 연결 실패");
			e.printStackTrace();
		}
	}
}
