package exc3;

public class Person {		
	String name;
	int age;	
	String sex;//�Ա�
	String no;//�绰����	
	int[] heigwei;//�������	
	String code;//��������
	public Person(String namec, int agec, String sexc, String noc, String codec, int... heigweic) {
	    name = namec;
	    age= agec;
	    sex = sexc;
	    no = noc;
	    code = codec;
	    heigwei = heigweic;		
	}
	//��ȡ����
	public String getName() {
	    return name;		
	}
	//��ȡ����
	public int getAge() {
	    return age;
	}
	//��ȡ�Ա�
	public int getSex() {
	    if(sex=="��") {
	    	return 1;
	    }else {
	    	return 0;
	    }
	}
	//��ȡ��������
	public String getCode(){
	    return code;
	}
	//��ȡ�绰����
	public String getNo(){
	    return no;
	}
	//��ȡ�������
	public int[] getHeigwei() {
	    return heigwei;
	}	
}

