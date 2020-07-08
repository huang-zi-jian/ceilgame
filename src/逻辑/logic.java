package 逻辑;

import 地图.ceil;
/*
 **    制定规则
 */

public class logic {
	private final static int minEdge=2;      //  周围细胞数>3    或者   周围细胞数<2   死
	private final static int maxEdge=3;      //  周围细胞数=3   细胞变活     
	                                         //  周围细胞数=2 状态不变
	
	public static int getCeilStatus(ceil c) {         //根据周围细胞数返回当前细胞的状态 
		int aroundNum=c.getAroundNum();  
		if(aroundNum>maxEdge || aroundNum<minEdge) return -1;
		else if(aroundNum==maxEdge) return 1;
		else return 0;
	}
}
