/**
 * 网易在线笔试题  
 */
package zhangwenbo.net;

import java.util.Stack;

/**
 * @author Iver3oN Zhang
 * @date 2016年3月27日
 * @email grepzwb@qq.com
 * Bihe.java
 * Impossible is nothing
 */
public class Bihe {

	/**
	 * @param args
	 * (){}[]
	 * (] {]无效
	 * [{}]有效的
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "[([]])";
		System.out.println(isValid(s));
	}

	/**
	 * @return
	 */
	private static boolean isValid(String s) {
		int length = s.length();
		if(length==0){
			return false;
		}
		if(length%2!=0){
			return false;
		}
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++){
			Character c = s.charAt(i);
			if(isLeft(c)){
				stack.push(c);
			}else{
				if(stack.empty()){
					return false;
				}
				if(!isCouple(stack.pop(),c)){
					return false;
				}
			}
		}
		if(stack.empty()){
			return true;
		}
		return false;
	}

	/**
	 * @param c
	 * @param pop
	 * @return
	 */
	private static boolean isCouple(Character pop,Character c) {
		// TODO Auto-generated method stub
		if((c==')'&&pop=='(')||(c==']'&&pop=='[')||(c=='}'&&pop=='{')){
			return true;
		}
		return false;
	}

	public static boolean isLeft(Character c){
		if(c=='('||c=='{'||c=='['){
			return true;
		}
		return false;
	}
}
