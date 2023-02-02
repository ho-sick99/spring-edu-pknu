package di_01;

public class MyLogFile implements ILog { // 굳이 무겁게 부모 클래스 상속하지 않고 인터페이스만 상속 (부모클래스 상속시 불필요한 정보들도 메모리에 올라가기 때문)
	private String filename;

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Override // 부모를 상속한 자식이 올바르게 오버라이딩하는지 감시하는 역할
	public void log(String msg) { // 원래 어노테이션은 접근 지정자 앞에 붙이는것이 정석 허나 가독성을 위해 위에 붙임
		System.out.println("파일 출력(" + filename + "): " + msg);
	}

}
