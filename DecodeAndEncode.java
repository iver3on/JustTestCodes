/**
 * 
 */
package zhangwenbo.com;

import java.io.UnsupportedEncodingException;

/**
 * @author Iver3oN Zhang
 * @date 2016年3月31日
 * @email grepzwb@qq.com DecodeAndEncode.java Impossible is nothing
 */
public class DecodeAndEncode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "I am 张文博";
		toHex(name.toCharArray());
		try {
			byte[] iso8859 = name.getBytes("ISO-8859-1");
			toHex(iso8859,"ISO-8859-1");
			//GB2312和GBK编码规则一样。。但是GBK编码汉字范围更大。
			byte[] gb2312 = name.getBytes("GB2312");
			toHex(gb2312,"GB2312");
			byte[] gbk = name.getBytes("GBK");
			toHex(gbk,"GBK");
			//UTF-16 占用空间大  编码效率高
			byte[] utf16 = name.getBytes("UTF-16");
			toHex(utf16,"UTF-16");
			//UTF-8三个字节 一个中文字符  不用查码表  编码效率高  汉字一般采用UTF-8
			byte[] utf8 = name.getBytes("UTF-8");
			toHex(utf8,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @param iso8859 将byte[]数组按照16进制输出
	 */
	private static void toHex(byte[] buffer,String code) {
		System.out.println(code+"  16进制的byte[]：");
		String h = "";
		for (int i = 0; i < buffer.length; i++) {
			String temp = Integer.toHexString(buffer[i] & 0xFF);
			if (temp.length() == 1) {
				temp = "0" + temp;
			}
			h = h + " " + temp;
		}
		System.out.println(h);

	}

	/**
	 * @param charArray
	 */
	private static void toHex(char[] charArray) {
		System.out.println("16进制的char[]：");
		for (char c : charArray) {
			System.out.print(Integer.toHexString((int)c)+" ");
		}
		System.out.println();
	}

}
