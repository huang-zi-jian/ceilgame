package ��ͼ;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ceilTest {
	private static ceil testCeil=new ceil(5,5,true);         //���ɲ���ϸ��
	private static map m=null;                                      //���Ե�ͼ
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ceil Ceils[]=new ceil[4];
		ceil temp1=new ceil(4,6,true);     //���ɲ���ϸ����Χ��3��ϸ��
		ceil temp2=new ceil(5,4,true);
		ceil temp3=new ceil(6,6,true);
		Ceils[0]=temp1;
		Ceils[1]=temp2;
		Ceils[2]=temp3;
		Ceils[3]=testCeil;
		m=new map(Ceils);              //���ɲ��Է�������Ҫ�Ĳ���-----map����
		System.out.println("Set up before class");
	}

	@Test
	public void testSetAroundNum() {
		testCeil.setAroundNum(m);
		assertEquals(3, testCeil.getAroundNum());   //���Ըò���ϸ����Χ�Ļ�ϸ����Ϊ3
		System.out.println(testCeil.getAroundNum());
	}

}
