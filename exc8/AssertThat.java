package ex7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class AssertThat {
	//����һ
	public String[] getString(String a,String b,String c) {  
		String[] s = {a,b,c};
		return s;  
	} 
	//������
	public List<String> getList(String al,String bl,String cl,String d1) {  
		List<String> l = new ArrayList<String>();
		l.add(al);
		l.add(bl);
		l.add(cl);
		l.add(d1);
		return l;  
	}  
	//������  
	public Map<String, String> getMap(String keyo, String valueo,String keyt, String valuet) {
		Map<String, String> m = new HashMap<String, String>();
		m.put(keyo, valueo);  
		m.put(keyt, valuet);  
		return m;  
	}
} 	
