package ex9;

public class Function {
	public int function(int x, int y, int z) {
		{
			if ((y > 1) && (z == 0)) {
				x = x / y;
				return x;
			}
			if ((y == 2) || (x > 1)) {
				x = x + 1;
				return x;
			}
			y = x + z;
			return y;
		}
	}
public static void main(String[] args) {
	Function function=new Function();
	System.out.println(function.function(1,1,1));
}
}

/*
 y=2,z=0,x=2 ��������
 y=2,z=1,x=1 ������
 y=1,z=0,x=2 �������
 y=1,z=1,x=1 �ټټټ�
  
*/
