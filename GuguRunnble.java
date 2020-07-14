	package thread;
	
	public class GuguRunnble implements Runnable{
	int dan;
		public GuguRunnble (int dan) {
		this.dan=dan;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuguThread g1=new GuguThread(5);
		
		GuguThread g2=new GuguThread(7);
		
		GuguThread g3=new GuguThread(3);
		
		
		Thread gr1=new Thread(g1);
		Thread gr2=new Thread(g2);
		Thread gr3=new Thread(g3);
			gr1.start();
			gr2.start();
			gr3.start();
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		
		}	
	}
	}