package ex7;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ex7.AssertThat;

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
		String[] actual;
//		1������һ��������("ABC", "DEF", "GHI")���ж��������Ƿ�����ԡ�DE����ͷ��Ԫ�أ�
		actual=ass.getString("ABC","DEF", "GHI");
		assertThat(actual, hasItemInArray(startsWith("DE")));
//		2����������������("Magci", "Fred", "Hero","Alice")���жϼ������Ƿ��С�e����β��Ԫ�أ�
		List<String> actual1=ass.getList("Magci", "Fred", "Hero","Alice");
		assertThat(actual1,hasItem(endsWith("e")));
//		3����������������("Magci", "Fred", "Hero","Alice")���ж�"Magci", "Fred"�ڼ����в���"Tom", "Cat"���ڼ����У�
		List<String> actual2=ass.getList("Magci", "Fred", "Hero","Alice");
		assertThat(actual2,hasItems("Magci", "Fred"));
		assertThat(actual2,not(hasItems("Tom", "Cat")));
//		4����������������("Magci", "Fred", "Hero","Alice")���жϼ������Ƿ�ֻ����"Magci", "Fred", "Hero","Alice"�ĸ�Ԫ�ػ���ֻ����"Fred", "Hero"����Ԫ�أ�
		assertThat(actual2,anyOf(containsInAnyOrder("Magci", "Fred", "Hero","Alice"),containsInAnyOrder("Fred", "Hero")));
//		5����������������("name", "Fred","age","18")���жϼ����м�ֵ��"name", "Fred"���߼�ֵ��"age","18"��
		Map<String, String> actual3=ass.getMap("name", "Fred","age","18");
		assertThat(actual3, anyOf(hasEntry("name", "Fred"),hasEntry("age","18")));
//		6����������������("name", "Fred","age","18")���жϼ����в�������ֵ"weight"��
		assertThat(actual3, not(hasKey("weight")));
//		7����������������("name", "Fred","age","18")���жϼ����а������Դ�Сд��Ԫ��ֵ"fred"��
		assertThat(actual3, hasValue(equalToIgnoringCase("fred")));

	}

}
