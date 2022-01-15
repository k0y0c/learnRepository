/*
算数运算符包括：“+”、“-”、“*”、“/”、“%”（取余）
注意：
    1.对于一个整数表达式来说，除法用的是整除，整数除以整数，结果仍然是整数。只看商，不看余数
    2.只有对于整数的除法来说，取模运算符才有余数的意义。
    3.一旦运算当中有不同类型的数据，那么结果将会是数据类型范围大的那种
*/
public class Demo04Operator{
	public static void main(String[] args){
		int x=10;
		int y=3;
		
		int result1=x/y;
		System.out.println(result1);
		
		int result2=x%y;
		System.out.println(result2);
		
		//int + double -->double +double -->double
		double result3=x+2.5;
		System.out.println(result3);
	}
}