/*
����byte/short/char����������˵������Ҳำֵ����ֵû�г�����Χ��
��ôjavac�����������Զ�������Ϊ���ǲ���һ��(byte)(short)(char)��

1. ���û�г������ķ�Χ������������ǿת��
2. ����Ҳ೬������෶Χ����ôֱ�ӱ���������
*/
public class Demo12Notice{
	public static void main(String[] args){
		
		//�Ҳ���һ��int���֣���û�г�����෶Χ������ȷ��
		//int --> byte�������Զ�����ת��,�Ǳ������Զ����ϣ�byte��
		byte num1= /*(byte)*/ 30;
		System.out.println(num1);
		
		//int -->char��û�г�����Χ
		//���������Զ�����һ�������ģ�char��
		char zifu=65;
		System.out.println(zifu);
	}
}