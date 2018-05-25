package cn.yer.pconline;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @author 作者 :陈曦
 * @date 创建时间:2017年4月11日 下午12:34:48
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class MyHttpClient {

	public String getURLContext(String url) {
		String html = "";
		CloseableHttpClient httpClient = HttpClients.createDefault();
		try {
			HttpGet httpGet = new HttpGet(url);
			CloseableHttpResponse response = httpClient.execute(httpGet);
			try {
				// 获取响应实体
				HttpEntity entity = response.getEntity();
				// 打印响应状态
				if (entity != null) {
					// 输出流读取可以防止抓去网页过长 抓取不全
					InputStream in = entity.getContent();
					entity.getContentType();
					// 设置抓去网页的字符集，防止乱码
					Scanner sc = new Scanner(in, "GB2312");
					StringBuffer str = new StringBuffer();
					while (sc.hasNextLine()) {
						str.append(sc.nextLine());
					}

					sc.close();
					html = str.toString();
				}
			} finally {
				response.close();
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			// 关闭连接,释放资源
			try {
				httpClient.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// System.out.println("html:==" + html);
		return html;

	}
}
