package thread;

public class GuguThread extends Thread {//thread �� ��ӹ޾Ƽ� run�Լ��� �����ϰ�  start�� ���� �ȴ�
	int dan;
	public GuguThread(int dan) {
		this.dan=dan;
	}
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
	}
		
	
   public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuguThread g1=new GuguThread(5);
		g1.start();
		GuguThread g2=new GuguThread(7);
		g2.start();
		GuguThread g3=new GuguThread(3);
		g3.start();
		
		
   }

}
