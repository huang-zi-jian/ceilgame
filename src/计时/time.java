package 计时;
/*
 ** 线程类，模拟游戏开始
 */

import 地图.ceil;
import 地图.map;
import 地图.ui1;


public class time extends Thread{	
	private static map m;
	static {
		   ceil []c=new ceil[9];
		   ceil temp0=new ceil(9,9,true);
		   ceil temp1=new ceil(9,10,true);
		   ceil temp2=new ceil(9,11,true);
		   ceil temp3=new ceil(10,9,true);
		   ceil temp4=new ceil(10,10,true);
		   ceil temp5=new ceil(10,11,true);
		   ceil temp6=new ceil(11,9,true);
		   ceil temp7=new ceil(11,10,true);
		   ceil temp8=new ceil(11,11,true);
		  c[0]=temp0;
		  c[1]=temp1;
		  c[2]=temp2;
		  c[3]=temp3;
		  c[4]=temp4;
		  c[5]=temp5;
		  c[6]=temp6;
		  c[7]=temp7;
		  c[8]=temp8;
		  m=new map(c);
	}
	private ui1 u=new ui1(m);

    //重定义run 方法
      public  void run() {
	    while(true) {
	    	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	m.viewAll();
	    	u.update(u.getPaint());
	    }
}
      }

