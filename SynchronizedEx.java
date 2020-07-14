		package thread;
		
		class ShareBoard{
		
			private int sum=0;
			synchronized public void add() {//synchronized 내가 들어갔을때 나올때까지  다른 것들은 기다림
			int n=sum;
			n+=10;
			sum=n;
			System.out.println(Thread.currentThread().getName()+":"+sum);
		}
		public int getsum() {
			return sum;
		}	
			
		}
		
			
		class StudentThread extends Thread{
			private ShareBoard board; 
			public StudentThread(String name, ShareBoard board) {
					super(name);
					this.board=board;
				}
		public void run() {
			for(int i=0;i<10;i++) {
				board.add();
			}
		}
		
		}
		
		public class SynchronizedEx {
			public static void main(String[] args) {
				ShareBoard board =new ShareBoard();
				Thread th1=new StudentThread("이순신",board);
				Thread th2=new StudentThread("홍길동",board);
				th1.start();
				th2.start();	
			}
		}

