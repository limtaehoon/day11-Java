package thread;

public class SaramThread extends Thread {//하나의 cpu에서 빠르게 여러번들어와서 랜덤으로 적힘 
										 //러너블이라는 인터페이스 쓰면 여러면 상속가능
	private String name;
	public SaramThread (String name) {
		this.name=name;
	}
	public void run () {
		for(int i=0;i<5;i++) {
			System.out.println(name+"말한다");
	}
	
	}






public static void main(String[] args) {
		// TODO Auto-generated method stub
	SaramThread s1 =new SaramThread("홍길동");
	SaramThread s2 =new SaramThread("이순신");
	SaramThread s3 =new SaramThread("강감찬");
		s1.start();
		s2.start();
		s3.start();
	}

}
