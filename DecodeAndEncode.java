/**
 * 
 */
package zhangwenbo.com;

import java.io.UnsupportedEncodingException;

/**
 * @author Iver3oN Zhang
 * @date 2016��3��31��
 * @email grepzwb@qq.com DecodeAndEncode.java Impossible is nothing
 */
public class DecodeAndEncode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "I am ���Ĳ�";
		toHex(name.toCharArray());
		try {
			byte[] iso8859 = name.getBytes("ISO-8859-1");
			toHex(iso8859,"ISO-8859-1");
			//GB2312��GBK�������һ����������GBK���뺺�ַ�Χ����
			byte[] gb2312 = name.getBytes("GB2312");
			toHex(gb2312,"GB2312");
			byte[] gbk = name.getBytes("GBK");
			toHex(gbk,"GBK");
			//UTF-16 ռ�ÿռ��  ����Ч�ʸ�
			byte[] utf16 = name.getBytes("UTF-16");
			toHex(utf16,"UTF-16");
			//UTF-8�����ֽ� һ�������ַ�  ���ò����  ����Ч�ʸ�  ����һ�����UTF-8
			byte[] utf8 = name.getBytes("UTF-8");
			toHex(utf8,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @param iso8859 ��byte[]���鰴��16�������
	 */
	private static void toHex(byte[] buffer,String code) {
		System.out.println(code+"  16���Ƶ�byte[]��");
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
		System.out.println("16���Ƶ�char[]��");
		for (char c : charArray) {
			System.out.print(Integer.toHexString((int)c)+" ");
		}
		System.out.println();
	}

}
