package ex8;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TimeExceptionTest {
	TimeException te=new TimeException();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(timeout = 500)
	public void test() {
//		1��sum���Է������ó�ʱʱ��Ϊ500���룻
		te.sum();
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void test1() {
//		2��array���Է������������±�Խ�磬�ж������±�Խ���쳣��
		te.array(4);
	}

}
