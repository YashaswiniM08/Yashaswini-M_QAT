import java.sql.*;
public class Conclass {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	
		 {
				
				String url = "jdbc:oracle:thin:@localhost:1521/xe";
				String username = "SYSTEM";
				String password = "admin";
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection(url,username,password);
				System.out.println("Connection created");
				Statement stmt = con.createStatement();
				
				/*String createQuery="CREATE TABLE test(ID NUMBER(2),NAME VARCHAR(10), SUBJECT VARCHAR(10),MARKS NUMBER(20))";
				stmt.executeUpdate(createQuery);
				
				String insertQuery="insert into test(id, name , subject, marks) values (1, 'yashu','java',78)";
				stmt.executeUpdate(insertQuery);
				insertQuery="insert into test(id, name , subject, marks) values (2, 'karry','computer science',85)";
				stmt.executeUpdate(insertQuery);
				insertQuery="insert into test(id, name , subject, marks) values (3, 'tom','biology',80)";
				stmt.executeUpdate(insertQuery);
				insertQuery="insert into test(id, name , subject, marks) values (4, 'rita','maths',98)";
				stmt.executeUpdate(insertQuery);*/
				
				String updateQuery="update name set name='jai'	where id='3'";
			 stmt.execute(updateQuery);
				ResultSet rs = stmt.executeQuery("SELECT * FROM test ");
			 
				
				System.out.println("Query execution" + rs);
			
				
				while(rs.next()) {
					System.out.println(rs.getString("id") + " : " +  rs.getString("name")+ " : " +  rs.getString("subject")+ " : " +  rs.getString("marks"));
				}
				con.close();

			}

		}

	}


