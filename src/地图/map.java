package ��ͼ;

import �߼�.logic;

/*
 ** ģ�����ŵ�ͼ��ÿ�θ���ϸ����״̬�����µ�ͼ״̬���»�ͼ
 */

public class map {
	private int widthNum=20;                     //���򻭶���ϸ��
	private int heightNum=20;                    //���򻭶���ϸ��
    private ceil map_array[][];                        //��ͼ����
    
    public map() {
		map_array=new ceil[widthNum][heightNum];
    	for(int i=0;i<widthNum;i++) {
    		for(int j=0;j<heightNum;j++) {
    			map_array[i][j]=new ceil(i+1,j+1,false);
    		}
    	}
    }
    
	public map(ceil[] initCeils) {                //�����Զ����ʼϸ�����鹹���ͼ
		map_array=new ceil[widthNum][heightNum];
	    for(int i=0;i<initCeils.length;i++) {     //���
	    	int cx=initCeils[i].getCx();                  
	    	int cy=initCeils[i].getCy();
	    	boolean islive =initCeils[i].isFlag();
	    	map_array[cx-1][cy-1]=new ceil(cx, cy, islive);
	    }
	    for(int i=0;i<widthNum;i++) {             //��©
	    	for(int j=0;j<heightNum;j++) {
	    		if(map_array[i][j]==null) {
	    		    map_array[i][j]=new ceil(i+1,j+1,false);
	    		}
	    	}
	    }
	}
	
	public void viewAll() {                              //�����߼����µ�ǰ��ͼ
		for(int i=0;i<widthNum;i++) {
			for(int j=0;j<heightNum;j++) {               //�ȼ�������ϸ����Χϸ����
				map_array[i][j].setAroundNum(this);            
			}
		}
		for(int i=0;i<widthNum;i++) {
			for(int j=0;j<heightNum;j++) {
				int status=logic.getCeilStatus(map_array[i][j]);     //����һ��ȡ��״̬
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
