package PQR;

import java.util.concurrent.SynchronousQueue;

public class Test {
	public static void main(String arg[]){
		int[] Tp= {6,8,10,32,45,328,500};
		int[] Tq= {32,40,45,70,210,300,301};
		int[] Tr= {45,50,60,70,88,90,500};
		int n=7;
		SynchronousQueue<Integer> c1 = new  SynchronousQueue<Integer>();
	    SynchronousQueue<Integer> c2 = new  SynchronousQueue<Integer>();
	    
	    P p=new P(Tp, n, c1);
	    Q q=new Q(Tq, n, c1, c2);
	    R r=new R(Tr, n, c2);
	    
	    p.start();q.start();r.start();
	}
}
