package study.theory;

public class JavaOracle implements DBConnect{

	@Override
	public void getConnection(String url, String user, String pwd) {

		System.out.println("오라클 db가 접속됩니다.");
	}

}
