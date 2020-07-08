package 地图;

/*
 *  * 模拟每一个细胞：
 *      
 */

public class ceil{         
	private final static int size=25;
    private int cx;              //位于横向第几个
    private int cy;              //位于纵向第几个
	private int aroundNum=0;     //当前细胞周围的细胞数 
    private boolean flag;        //细胞状态
	public static final int w=size;          //每个细胞的宽
	public static final int h=size;          //每个细胞的高
    
    public ceil(int cx,int cy,boolean islive) {   //用户输入指定位置的细胞
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
	public void setAroundNum(map temp) {    //根据当前地图计算周围细胞数(从左上角顺时针)
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
