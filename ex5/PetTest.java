package exc5;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PetTest {
	Pet pet=new Pet("Tomcat", 5);
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
//		1����ϢΪ�����ơ�Tomcat�������䡰5����
//		2���ж��������Ƿ������om����
		assertThat(pet.getName(), containsString("om"));
//		3���ж������Ƿ��ԡ�To����ͷ��
		assertThat(pet.getName(), startsWith("To"));
//		4���ж������Ƿ��ԡ�at��������
		assertThat(pet.getName(),endsWith("at"));
//		5���ж������Ƿ��ǡ�Tomcat����
		assertThat(pet.getName(), equalTo("Tomcat"));
//		6���ж����ƺ��Դ�Сд�Ƿ�ͬ��tomCat��һ�£�
		assertThat(pet.getName(), equalToIgnoringCase("tomCat"));
//		7���ж����ƺ���ͷβ�ո��Ƿ�ͬ��  Tomcat  ��һ�£�
		assertThat(pet.getName(), equalToIgnoringWhiteSpace("  Tomcat  "));
//		8���ж������Ƿ��ǡ�5����
		assertThat(pet.getAge(),is(5) );
	}

}
