import study.theory.DBConnect;
import study.theory.JavaOracle;

public class JDBCInterface {

	public static void main(String[] args) {

		DBConnect conn = new JavaOracle();
		conn.getConnection("oracle", "kim", "pwd");
	}

}
