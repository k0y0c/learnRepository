public class Demo02Variable{
	public static void main(String[] args){
		int num1;
		num1=10;
		System.out.println(num1);
		num1=20;
		System.out.println(num1);
		int num2=35;
		System.out.println(num2);
		
		byte num3=30;
		System.out.println(num3);
		//byte num3=400;		//����byte���ݷ�Χ
		
		short num5=50;
		System.out.println(num5);
		
		long num6=3000000000L;
		System.out.println(num6);  
		
		float num7 = 2.5F;
		System.out.println(num7); // 2.5
		
		double num8 = 1.2;
		System.out.println(num8); // 1.2
		
		char zifu1 = 'A';
		System.out.println(zifu1); // A
		
		zifu1 = '��';
		System.out.println(zifu1); // ��
		
		boolean var1 = true;
		System.out.println(var1); // true
		
		var1 = false;
		System.out.println(var1); // false
		// ��һ���������������ݣ���ֵ������һ������
		// �Ҳ�ı�������var1�Ѿ����ڣ�����װ����false����ֵ
		// ���Ҳ���������falseֵ�����󽻸�var2�������д洢
		boolean var2 = var1;
		System.out.println(var2); // false
	}
}