package ��ͼ;

/*
 *  * ģ��ÿһ��ϸ����
 *      
 */

public class ceil{         
	private final static int size=25;
    private int cx;              //λ�ں���ڼ���
    private int cy;              //λ������ڼ���
	private int aroundNum=0;     //��ǰϸ����Χ��ϸ���� 
    private boolean flag;        //ϸ��״̬
	public static final int w=size;          //ÿ��ϸ���Ŀ�
	public static final int h=size;          //ÿ��ϸ���ĸ�
    
    public ceil(int cx,int cy,boolean islive) {   //�û�����ָ��λ�õ�ϸ��
    	this.cx=cx;
    	this.cy=cy;
    	this.flag=islive;
    }
	public int getCx() {
		return cx;
	}
	public void setCx(int cx) {
		this.cx = cx;
	}
	public int getCy() {
		return cy;
	}
	public void setCy(int cy) {
		this.cy = cy;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag=flag;
	}
	public int getAroundNum() { 
		return aroundNum;
	}
	public void setAroundNum(map temp) {    //���ݵ�ǰ��ͼ������Χϸ����(�����Ͻ�˳ʱ��)
		ceil [][] ceils=temp.getMap();
		int width=temp.getWidthNum();
		int height=temp.getHeightNum();
		aroundNum=0;
		if(cx>1&&cx<width&&cy>1&&cy<height) {
			for (int i = cx-1; i <= cx+1; i++) {
				for (int j = cy-1; j <= cy+1; j++) {
					if(i!=cx||j!=cy) {
						if (ceils[i-1][j-1].isFlag()) {
							aroundNum++;
						}
					}
				}
			}
		}
		else if (cx==1&&cy==1) {
			if (ceils[0][1].isFlag()) {
				aroundNum++;
			}
			if (ceils[1][0].isFlag()) {
				aroundNum++;
			}
			if (ceils[1][1].isFlag()) {
				aroundNum++;
			}
		}
		else if (cx==1&&cy==height) {
			if (ceils[0][height-2].isFlag()) {
				aroundNum++;
			}
			if (ceils[1][height-2].isFlag()) {
				aroundNum++;
			}
			if (ceils[1][height-1].isFlag()) {
				aroundNum++;
			}
		}
		else if (cx==width&&cy==1) {
			if (ceils[width-2][0].isFlag()) {
				aroundNum++;
			}
			if (ceils[width-2][1].isFlag()) {
				aroundNum++;
			}
			if (ceils[width-1][1].isFlag()) {
				aroundNum++;
			}
		}
		else if (cx==width&&cy==height) {
			if (ceils[width-2][height-1].isFlag()) {
				aroundNum++;
			}
			if (ceils[width-2][height-2].isFlag()) {
				aroundNum++;
			}
			if (ceils[width-1][height-2].isFlag()) {
				aroundNum++;
			}
		}
		else {
			if (cx==1) {
				for (int i = cx; i <= cx+1; i++) {
					for (int j = cy-1; j <= cy+1; j++) {
						if(i!=cx||j!=cy) {
							if (ceils[i-1][j-1].isFlag()) {
								aroundNum++;
							}
						}
					}
				}
			}
			if (cx==width) {
				for (int i = cx; i >= cx-1; i--) {
					for (int j = cy-1; j <= cy+1; j++) {
						if(i!=cx||j!=cy) {
							if (ceils[i-1][j-1].isFlag()) {
								aroundNum++;
							}
						}
					}
				}
			}
			if (cy==1) {
				for (int i = cx-1; i <= cx+1; i++) {
					for (int j = cy; j <= cy+1; j++) {
						if(i!=cx||j!=cy) {
							if (ceils[i-1][j-1].isFlag()) {
								aroundNum++;
							}
						}
					}
				}
			}
			if (cy==height) {
				for (int i = cx-1; i <= cx+1; i++) {
					for (int j = cy; j >= cy-1; j--) {
						if(i!=cx||j!=cy) {
							if (ceils[i-1][j-1].isFlag()) {
								aroundNum++;
							}
						}
					}
				}
			}
		}
	}
}
