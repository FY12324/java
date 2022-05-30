package ex9;

import static org.junit.Assert.*;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class FunctionTest {
	private Function func=new Function();
	private int x,y,z,expected;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Parameters
	public static Collection userData() {
	// ������,�����˴������������������������˳���빹�캯������˳��һ�¼���  
		   return Arrays.asList(new Object[][]{
			{2,2,0,1},
			{1,2,1,2},
			{2,1,0,3},
			{1,1,1,2}});		
		}

	public FunctionTest(int x,int y,int z,int expected) {
		this.x=x;
		this.y=y;
		this.z=z;
		this.expected=expected;
		
	}

	@Test
	public void testFunction() {
		assertEquals(expected, func.function(x, y, z),0.0);
	}

	
}
