package exc3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {
//  1���û�����Ϣ
	Person person=new Person("Fred", 18, "��", "13612251254", null, 170,65);
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
//	2��ʹ��assertSame�ж��û�����Ϊ��Fred����
	@Test
	public void test1() {
		String name=person.getName();
		assertSame("Fred", name);
	}
//	3��ʹ��assertNotSame�ж��û����Ʋ�Ϊ��Hero����
	@Test
	public void test3() {
		String name=person.getName();
		assertNotSame("Hero", name);
	}
//	4��ʹ��assertEquals�ж�����Ϊ18�ꣻ
	@Test
	public void test4() {
		int age=person.getAge();
		assertEquals(18, age);
	}
//	5��ʹ��assertTrue��֤�Ա�Ϊ�У�
	@Test
	public void test5() {
		int sex=person.getSex();
		assertEquals(1, sex);
	}
//	6��ʹ��assertFalse��֤�Ա�ΪŮ��
	@Test
	public void test6() {
		int sex=person.getSex();
		assertFalse(sex==0);
	}
//	7��ʹ��assertNull��֤��������Ϊnull��
	@Test
	public void test7() {
		assertNull(person.getCode());
	}
//	8��ʹ��assertNotNull��֤�绰���벻Ϊ�գ�
	@Test
	public void test8() {
		assertNotNull(person.getNo());
	}
//	9��ʹ��assertArrayEquals��֤��ߺ�����Ϊ170��65��
	@Test
	public void test9() {
		int[] actuals=person.getHeigwei();
		int[] expected={170,65};
		assertArrayEquals(expected, actuals);
	}
}
