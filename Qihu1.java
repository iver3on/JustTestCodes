/**�������ʻ��ļ��ڣ�ˮ�ɻ��������������˵Ĵ�����ѧ���и�ˮ�ɻ�����������������ģ�
��ˮ�ɻ�������ָһ����λ�������ĸ�λ���ֵ������͵����䱾�����磺153=1^3+5^3+3^3��
����Ҫ�����������m��n��Χ�ڵ�ˮ�ɻ�����
����
���������ж��飬ÿ��ռһ�У�������������m��n��100<=m<=n<=999����
���
����ÿ������ʵ����Ҫ����������ڸ�����Χ�ڵ�ˮ�ɻ���������˵�������ˮ�ɻ���������ڵ���m,����С�ڵ���n������ж������Ҫ���С����������һ���������֮����һ���ո����;
��������ķ�Χ�ڲ�����ˮ�ɻ����������no;
ÿ������ʵ�������ռһ�С�
 * 
 */
package zhangwenbo.net;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Iver3oN Zhang
 * @date 2016��3��27��
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
