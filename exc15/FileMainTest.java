package exc15;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.DEFAULT)
public class FileMainTest {
	FileMain f=new FileMain();
	String s="C:\\Users\\FY\\Desktop\\new.txt";
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
//	1�����3�����Է��������Է���һ���ļ���д�롰Fred�����ڲ��Է������ж��ļ��������Ƿ�Ϊ��Fred����
	@Test
	public void testFile() {
		f.writeFile(s,"Fred" );
		Assume.assumeTrue(f.File(s).equals("Fred"));
	}
//	2�����Է��������ļ���д�롰Hero�����ڲ��Է������ж��ļ��������Ƿ�Ϊ��Fred�����������Է�ʽʹ��˳��ִ�С�
	@Test
	public void testReadAsString() {
		f.writeFile(s,"Hero" );
		Assume.assumeTrue(f.File(s).equals("Hero"));
	}
//	3�����Է��������ļ���д�롰Fred������д�롰Hero�����ж��ļ���ֻ������Ϊ��Fred����ִ�У�����������
	@Test
	public void testWriteFile() {
		f.writeFile(s,"Fred");
		f.writeFile(s,"Hero");
		Assume.assumeTrue(f.File(s).contentEquals("Fred"));
	}

}
