package chapter9.s1;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Db {

	public static void main(String[] args) {		 

		var sql = "SELECT * from test where a=?";
		try (var conn  = DriverManager.getConnection("jdbc:h2:test");
				var ps = conn.prepareStatement(sql)) {

			ps.setNull(1, Types.INTEGER);
//			İlk parametreyi SQL NULL set eder.
			
			var result = ps.executeQuery();
			
			result.next();
			
			var o = result.getObject(1);
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getSQLState());
			System.out.println(e.getErrorCode());
		}


	}
}
