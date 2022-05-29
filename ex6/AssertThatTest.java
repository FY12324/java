package ex6;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AssertThatTest {
	AssertThat ass=new AssertThat();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		double actual;
//		1��������������8.8-7.5���жϼ����ֵ����1����С��2��
		ass.substract(8.8,7.5);
		actual=ass.getResultOne();
		assertThat(actual, closeTo(1.5,0.5));
//		2��������������8.8-7.5���жϼ����ֵ���ڵ���1����С�ڵ���1.5��
		ass.clear();
		ass.substract(8.8, 7.5);
		actual=ass.getResultOne();
		assertThat(actual,greaterThanOrEqualTo(1.0));
		assertThat(actual,lessThanOrEqualTo(1.5));
//		3��������������8.8-7.5���жϼ����ֵ��1��0.5��Χ�ڲ���Ҳ��2��0.8��Χ�ڣ�
		ass.clear();
		ass.substract(8.8, 7.5);
		actual=ass.getResultOne();
		assertThat(actual,anyOf(closeTo(1, 0.5),closeTo(2, 0.8)));
	}
}
