package 地图;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class ui1 extends JFrame{
	private map m;                 //当前地图
	private int width;             //横向细胞个数
	private int height;            //纵向细胞个数
	private ceil[][] ceils;        //总的细胞集合
	private int w;                 //细胞宽
	private int h;                 //细胞高
	private Graphics2D g;            //画笔
	private Container con;         //全局容器
	private Color rectColor = new Color(0xf5f5f5); //背景颜色
	private Color liveColor = new Color(138,54,15); //背景颜色
	private Color deathColor=Color.white;          //死亡颜色
	
	public Graphics2D getPaint() {           //获取画笔
		return this.g;
	}
	
   /*
    * ui1构造方法
    */
   public ui1(map tempMap){        
	   this.m=tempMap;
	   con=getContentPane();             //初始化容器      
	   width=m.getWidthNum();          //横向总细胞数
	   height=m.getHeightNum();        //纵向总细胞数
	   ceils=m.getMap();                 //结点数组
	   w=ceil.w;         //单个细胞宽
	   h=ceil.h;         //单个细胞长  
	   setBounds(100, 100, 600, 600);   
	   setVisible(true);
	   g=(Graphics2D)getGraphics();
	   con.setBackground(rectColor);
       setLayout(null);
	   setResizable(false);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
       tpaint(g);                //初始化构造棋盘
       update(g);                //填色
   }
   /*
    * 构造基本地图
    */
     public void tpaint(Graphics2D g) {
    	 g.setStroke(new BasicStroke(2.0f));   //设置画笔粗细
    	 g.setColor(Color.BLACK);
         g.drawRect(50, 50, 500, 500);
    	 for(int i=1;i<=width-1;i++) {      //画纵线
  		   g.drawLine(50+i*w,50,50+i*w,50+height*h);
  	   }
    	 for(int j=1;j<=height-1;j++){      //画横线
  		   g.drawLine(50,50+j*h,50+w*width,50+j*h);
  	   }
     }
   /*
    * 为地图填色
    */
   public void update(Graphics2D g) {                        //遍历所有细胞状态
	   g.setStroke(new BasicStroke(1.0f));
	    for(int i=0;i<width;i++) {
	    	for(int j=0;j<height;j++) {
	    		if(ceils[i][j].isFlag()) {     //如果当前细胞状态为活，染棕色
	    			g.setColor(liveColor);
	    			g.fillRect(50+i*w+1, 50+j*h+1, w-2, h-2);
	    		}
	    		else {
	    			g.setColor(deathColor);
	    			g.fillRect(50+i*w+1, 50+j*h+1, w-2, h-2);
	    		}
	    	}
	    }
   }
   

}
