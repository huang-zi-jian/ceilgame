package 地图;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ceilTest {
	private static ceil testCeil=new ceil(5,5,true);         //生成测试细胞
	private static map m=null;                                      //测试地图
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ceil Ceils[]=new ceil[4];
		ceil temp1=new ceil(4,6,true);     //生成测试细胞周围的3个细胞
		ceil temp2=new ceil(5,4,true);
		ceil temp3=new ceil(6,6,true);
		Ceils[0]=temp1;
		Ceils[1]=temp2;
		Ceils[2]=temp3;
		Ceils[3]=testCeil;
		m=new map(Ceils);              //生成测试方法所需要的参数-----map对象
		System.out.println("Set up before class");
	}

	@Test
	public void testSetAroundNum() {
		testCeil.setAroundNum(m);
		assertEquals(3, testCeil.getAroundNum());   //断言该测试细胞周围的活细胞数为3
		System.out.println(testCeil.getAroundNum());
	}

}
