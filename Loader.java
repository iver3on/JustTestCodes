/**
 * 
 */
package zhangwenbo.com;

import java.net.URLClassLoader;

/**
 * @author Iver3oN Zhang
 * @date 2016年4月5日
 * @email grepzwb@qq.com
 * Loader.java
 * Impossible is nothing
 */
class Person{
	int age;
	String name;
	static { 
        System.out.println("静态初始化块执行了！"); 
} 
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}	
}
public class Loader {
	ClassLoader classLoader = this.getClass().getClassLoader();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Person p = new Person(12,"ww"); 
        Class c = p.getClass(); 
        ClassLoader loader = c.getClassLoader(); 
        //sun.misc.Launcher$AppClassLoader@500c05c2
        System.out.println(loader); 
        //sun.misc.Launcher$ExtClassLoader@454e2c9c
        System.out.println(loader.getParent()); 
        //null找不到bootstrap 因为它不是extClassLoader的父加载器
        System.out.println(loader.getParent().getParent()); 
        try {
			Class cl = Class.forName("zhangwenbo.com.Person");
			//zhangwenbo.com.Person
			System.out.println(cl.getName());
			ClassLoader loader1 = Person.class.getClassLoader(); 
			System.out.println(loader1); 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println(p instanceof Person);
        //URLClassLoader uld
	}

}
