/**
 * 
 */
package zhangwenbo.com;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author Iver3oN Zhang
 * @date 2016Äê4ÔÂ5ÈÕ
 * @email grepzwb@qq.com
 * URLPathClassLoader.java
 * Impossible is nothing
 */


public class URLPathClassLoader extends URLClassLoader {

	private String packageName = "zhangwenbo.com";
	/**
	 * @param urls
	 * @param parent
	 */
	public URLPathClassLoader(URL[] urls, ClassLoader parent) {
		super(urls, parent);
		// TODO Auto-generated constructor stub
	}
	
	protected Class<?> findClass(String name) throws ClassNotFoundException{
		Class<?> aclass = findLoadedClass(name);
		if(aclass != null){
			return aclass;
		}
		if(!packageName.startsWith(name)){
			return super.loadClass(name);
		}else{
			return findClass(name);
		}
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
