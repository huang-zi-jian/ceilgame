package �߼�;

import ��ͼ.ceil;
/*
 **    �ƶ�����
 */

public class logic {
	private final static int minEdge=2;      //  ��Χϸ����>3    ����   ��Χϸ����<2   ��
	private final static int maxEdge=3;      //  ��Χϸ����=3   ϸ�����     
	                                         //  ��Χϸ����=2 ״̬����
	
	public static int getCeilStatus(ceil c) {         //������Χϸ�������ص�ǰϸ����״̬ 
		int aroundNum=c.getAroundNum();  
		if(aroundNum>maxEdge || aroundNum<minEdge) return -1;
		else if(aroundNum==maxEdge) return 1;
		else return 0;
	}
}
