/*
���������Ͳ�һ��ʱ�����ᷢ����������ת��

�Զ�����ת������ʽ��
	1.�ص㣺���벻��Ҫ�������⴦���Զ����
	2.�������ݷ�Χ��С����
ǿ������ת������ʽ��
	1.�ص㣺������Ҫ�������⴦�������Զ����
    2.��ʽ����ΧС������ ��ΧС��������=����ΧС�����ͣ� ԭ����Χ������ݣ�
	
ע�����
	1.ǿ������ת��һ�㲻�Ƽ�ʹ�ã���Ϊ�п��ܷ���������ʧ���������
	2.byte/short/char ���������Ͷ����Է�����ѧ���㣬����ӷ���+��
	3.byte/short/char �����������������ʱ�򣬶��ᱻ����������Ϊint���ͣ�Ȼ���ټ���
	4.boolean���Ͳ��ܷ�����������ת��
*/
public class Demo01DataType{
	public static void main(String[] args){
		System.out.println(1024);	//����Ĭ����int����
		System.out.println(3.14);	//������Ĭ����double����
		
		//�����long���ͣ��ұ���Ĭ�ϵ�int���ͣ����Ҳ�һ��  int-->long �������Զ�����ת��
		long num1=100;
		System.out.println(num1);
		
		//�����double���ͣ��ұ���float���ͣ����Ҳ�һ��	float-->double �������Զ�����ת��
		double num2=2.5F;
		System.out.println(num2);
		
		//�����float���ͣ��ұ���long���ͣ����Ҳ�һ��	long-->float float��Χ����  �������Զ�����ת��
		float num3=30L;
		System.out.println(num3);
		
		//long-->int ���ܷ����Զ�����ת�� ���ɼӣ�int��ǿ������ת��
		int num4=(int) 100L;
		System.out.println(num4);
		
		//longǿ��ת��Ϊint���� �����������
		int num5=(int) 600000000L;
		System.out.println(num5);
		
		//double-->int ǿ������ת�� С��λ�ᱻ������
		int num6=(int) 3.99;
		System.out.println(num6);
		
		//һ��char���ͽ����������㣬��ô�ַ��ͻᰴ��һ���Ĺ������һ������
		char zifu1='A';
		System.out.println(zifu1 + 1);
		
		byte num7 =40;
		byte num8 =50;
		//byte + byte ------>int +int------->int       ������ʱ�Զ�����Ϊint����
		int result1=num7+num8;
		System.out.println(result1);
		
		short num9=60;
		//byte +short ----->int + int ------->int		��ǿ�ƽ���������Ϊshort
		short result2=(short)(num7+num9);
		System.out.println(result2);
	}
}











