/*
当数据类型不一样时，将会发生数据类型转换

自动类型转换（隐式）
	1.特点：代码不需要进行特殊处理。自动完成
	2.规则：数据范围从小到大
强制类型转换（显式）
	1.特点：代码需要进行特殊处理，不能自动完成
    2.格式：范围小的类型 范围小的类型名=（范围小的类型） 原本范围大的数据；
	
注意事项：
	1.强制类型转换一般不推荐使用，因为有可能发生精度损失、数据溢出
	2.byte/short/char 这三种类型都可以发生数学运算，例如加法“+”
	3.byte/short/char 这三种类型在运算的时候，都会被首先提升成为int类型，然后再计算
	4.boolean类型不能发生数据类型转换
*/
public class Demo01DataType{
	public static void main(String[] args){
		System.out.println(1024);	//整数默认是int类型
		System.out.println(3.14);	//浮点型默认是double类型
		
		//左边是long类型，右边是默认的int类型，左右不一样  int-->long 发生了自动类型转换
		long num1=100;
		System.out.println(num1);
		
		//左边是double类型，右边是float类型，左右不一样	float-->double 发生了自动类型转换
		double num2=2.5F;
		System.out.println(num2);
		
		//左边是float类型，右边是long类型，左右不一样	long-->float float范围更大  发生了自动类型转换
		float num3=30L;
		System.out.println(num3);
		
		//long-->int 不能发生自动类型转换 ，可加（int）强制类型转换
		int num4=(int) 100L;
		System.out.println(num4);
		
		//long强制转换为int类型 发生数据溢出
		int num5=(int) 600000000L;
		System.out.println(num5);
		
		//double-->int 强制类型转换 小数位会被舍弃掉
		int num6=(int) 3.99;
		System.out.println(num6);
		
		//一旦char类型进行数据运算，那么字符就会按照一定的规则翻译成一个数字
		char zifu1='A';
		System.out.println(zifu1 + 1);
		
		byte num7 =40;
		byte num8 =50;
		//byte + byte ------>int +int------->int       在运算时自动提升为int类型
		int result1=num7+num8;
		System.out.println(result1);
		
		short num9=60;
		//byte +short ----->int + int ------->int		可强制将数据留存为short
		short result2=(short)(num7+num9);
		System.out.println(result2);
	}
}











