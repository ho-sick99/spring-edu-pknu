package di_01;

public class DBMSLog implements ILog {

	private String ip, user, pass;

	public DBMSLog(String ip, String user, String pass) {
		System.out.println("DBMSLog 생성");
		this.ip = ip;
		this.user = user;
		this.pass = pass;
	}

//	public void setIp(String ip) {
//		this.ip = ip;
//	}
//
//	public void setUser(String user) {
//		this.user = user;
//	}
//
//	public void setPass(String pass) {
//		this.pass = pass;
//	}

	public void log(String msg) {
		System.out.println("DBMS 출력: " + msg);
	}

}
