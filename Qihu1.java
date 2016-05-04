/**春天是鲜花的季节，水仙花就是其中最迷人的代表，数学上有个水仙花数，他是这样定义的：
“水仙花数”是指一个三位数，它的各位数字的立方和等于其本身，比如：153=1^3+5^3+3^3。
现在要求输出所有在m和n范围内的水仙花数。
输入
输入数据有多组，每组占一行，包括两个整数m和n（100<=m<=n<=999）。
输出
对于每个测试实例，要求输出所有在给定范围内的水仙花数，就是说，输出的水仙花数必须大于等于m,并且小于等于n，如果有多个，则要求从小到大排列在一行内输出，之间用一个空格隔开;
如果给定的范围内不存在水仙花数，则输出no;
每个测试实例的输出占一行。
 * 
 */
package zhangwenbo.net;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Iver3oN Zhang
 * @date 2016年3月27日
 * @email grepzwb@qq.com
 * Qihu1.java
 * Impossible is nothing
 */
public class Qihu1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int m =153;
		int a = m%10;
		int b = m/10%10;
		int c = m/100;
		System.out.println(a+" "+b+" "+c);*/
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		for(int i=0;i<2;i++){
			String s = sc.nextLine();
			String[] para = s.split(" ");
			int m = Integer.parseInt(para[0]);
			int n = Integer.parseInt(para[1]);
			list1.add(m);
			list2.add(n);
		}
		for(int i=0;i<list1.size();i++){
			getNumber(list1.get(i), list2.get(i));
		}
	}
	public static void getNumber(int m,int n){
		int count = 0;
		for(int i=m;i<=n;i++){
			int a = i%10;
			int b = i/10%10;
			int c = i/100;
			if(a==0&&b==0){
				continue;
			}
			if((a*a*a+b*b*b+c*c*c)==i){
				count++;
				System.out.print(i+" ");
			}
		}
		if(count==0) System.out.println("no");
	}

}
