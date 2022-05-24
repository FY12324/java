package ex4;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AssertThat2Test {
	AssertThat2 ass=new AssertThat2();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

//	1��������������10-7���жϼ����ֵ��2��4֮�䣻
	@Test
	public void test1() {
		ass.substract(10, 7);
		int actual=ass.getResult();
		assertThat(actual, allOf(greaterThan(2),lessThan(4)));
	}
//	2��������������10-7���жϼ����ֵ����2����С��1��
	@Test
	public void test2() {
		ass.substract(10, 7);
		int actual=ass.getResult();
		assertThat(actual, anyOf(greaterThan(2),lessThan(1)));
	}
//	3��������������10-7���жϼ����ֵ����4����С��7��
	@Test
	public void test3() {
		ass.substract(10, 7);
		int actual=ass.getResult();
		assertThat(actual, anyOf(greaterThan(4),lessThan(7)));
	}
//	4��������������10-7���ж�����ʲô����������ͨ����
	@Test
	public void test4() {
		ass.substract(10, 7);
		int actual=ass.getResult();
		assertThat(actual, anything());
	}
//	5��������������10-7���ж��Ƿ����3��
	@Test
	public void test5() {
		ass.substract(10, 7);
		int actual=ass.getResult();
		assertThat(actual, is(3));
	}
//	6��������������10-7���жϲ�����2��
	@Test
	public void test6() {
		ass.substract(10, 7);
		int actual=ass.getResult();
		assertThat(actual, not(2));
	}
//	7��������������8/4���жϼ����ֵ��1��3֮�䣻
	@Test
	public void test7() {
		ass.divide(8, 4);
		int actual=ass.getResult();
		assertThat(actual,allOf(greaterThan(1),lessThan(3)) );
	}
//	8��������������8/4���жϼ����ֵ����1����С��1��
	@Test
	public void test8() {
		ass.divide(8, 4);
		int actual=ass.getResult();
		assertThat(actual,anyOf(greaterThan(1),lessThan(1)) );
	}
//	9��������������8/4���жϼ����ֵ����8����С��3��
	@Test
	public void test9() {
		ass.divide(8, 4);
		int actual=ass.getResult();
		assertThat(actual,anyOf(greaterThan(8),lessThan(3)) );
	}
//	10��������������8/4���ж�����ʲô����������ͨ����
	@Test
	public void test10() {
		ass.divide(8, 4);
		int actual=ass.getResult();
		assertThat(actual,anything() );
	}
//	11��������������8/4���ж��Ƿ����2��
	@Test
	public void test11() {
		ass.divide(8, 4);
		int actual=ass.getResult();
		assertThat(actual,is(2));
	}
//	12��������������8/4���жϲ�����1��
	@Test
	public void test12() {
		ass.divide(8, 4);
		int actual=ass.getResult();
		assertThat(actual,not(1));
	}
	

}
