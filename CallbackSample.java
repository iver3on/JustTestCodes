/**
 * �ص�������ʵ���ǽ�ĳ���ض��ӿڵ�ʵ����Ϊ��������Ŀ�������Ŀ��������ʵ���ʱ�������е��á�
Response�ӿڰ���������������success��fail���ֱ���Ҫ������ɹ���ʧ��ʱ���ã����Ǿ���������������Ҫ��дʲô���飬
���ڽӿڵĶ��������޴�֪���ģ���Ϊ���Ǹ���ÿ���������������ľ��������ȷ���ġ�
Request�Ƿ��������࣬��ִ����������壬����send(Response response)�����У������һ��Response�ӿڵ�ʵ�֣�
����������ɺ󣬸�������Ľ������Response����Ӧ�ķ�����
CallbackSample�ǲ��Ե����壬��main�����У�����һ��Request����Ȼ�������send������
ͬʱ����һ��������ʵ����Response�ӿڡ�
 */
package zhangwenbo.net;

/**
 * @author Iver3oN Zhang
 * @date 2016��3��25��
 * @email grepzwb@qq.com
 * CallbackSample.java
 * Impossible is nothing
 */
public class CallbackSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Request request = new Request();
        request.send(new Response() {
            @Override
            public void success() {
                System.out.println("Request Success");
            }

            @Override
            public void fail() {
                System.out.println("Request Fail");
            }
        });
	}

}
