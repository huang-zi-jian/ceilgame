package 地图;

import 逻辑.logic;

/*
 ** 模拟整张地图：每次根据细胞的状态来更新地图状态重新画图
 */

public class map {
	private int widthNum=20;                     //横向画多少细胞
	private int heightNum=20;                    //纵向画多少细胞
    private ceil map_array[][];                        //地图数组
    
    public map() {
		map_array=new ceil[widthNum][heightNum];
    	for(int i=0;i<widthNum;i++) {
    		for(int j=0;j<heightNum;j++) {
    			map_array[i][j]=new ceil(i+1,j+1,false);
    		}
    	}
    }
    
	public map(ceil[] initCeils) {                //输入自定义初始细胞数组构造地图
		map_array=new ceil[widthNum][heightNum];
	    for(int i=0;i<initCeils.length;i++) {     //填充
	    	int cx=initCeils[i].getCx();                  
	    	int cy=initCeils[i].getCy();
	    	boolean islive =initCeils[i].isFlag();
	    	map_array[cx-1][cy-1]=new ceil(cx, cy, islive);
	    }
	    for(int i=0;i<widthNum;i++) {             //查漏
	    	for(int j=0;j<heightNum;j++) {
	    		if(map_array[i][j]==null) {
	    		    map_array[i][j]=new ceil(i+1,j+1,false);
	    		}
	    	}
	    }
	}
	
	public void viewAll() {                              //按照逻辑更新当前地图
		for(int i=0;i<widthNum;i++) {
			for(int j=0;j<heightNum;j++) {               //先计算所有细胞周围细胞数
				map_array[i][j].setAroundNum(this);            
			}
		}
		for(int i=0;i<widthNum;i++) {
			for(int j=0;j<heightNum;j++) {
				int status=logic.getCeilStatus(map_array[i][j]);     //再逐一获取其状态
				if(status==1)map_array[i][j].setFlag(true);
				else if(status==-1)map_array[i][j].setFlag(false);
			}
		}
	}
	
	public int getWidthNum() {
		return widthNum;
	}
	public void setWidthNum(int widthNum) {
		this.widthNum = widthNum;
	}
	public int getHeightNum() {
		return heightNum;
	}
	public void setHeightNum(int heightNum) {
		this.heightNum = heightNum;
	}
	
	public ceil[][] getMap() {
		return map_array;
	}
	public void setMap(ceil[][] map_array) {
		this.map_array = map_array;
	}

}
