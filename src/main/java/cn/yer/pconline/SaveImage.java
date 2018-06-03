package cn.yer.pconline;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author 作者 :陈曦
 * @date 创建时间:2017年4月17日 下午2:18:41
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class SaveImage {

	/**
	 * 把从服务器获得图片的输入流InputStream写到本地磁盘
	 * 
	 * @param xxzjbh
	 *            数据库的信息主键编号
	 * @param title
	 *            标题
	 * @param pic
	 *            图片url地址
	 */
	public void saveImageToDisk(int xxzjbh, String title, String pic, String path) {

		// 把从服务器获得图片的输入流InputStream写到本地磁盘
		InputStream inputStream = getInputStream(pic);
		byte[] data = new byte[1024];
		int len = 0;

		String strPath = "D:\\servermedia\\pc_image\\" + path + "\\";
		File file = new File(strPath);
		if (!file.exists()) {
			file.mkdirs();
		}

		FileOutputStream fileOutputStream = null;
		try {
			fileOutputStream = new FileOutputStream(strPath + title + "_" + xxzjbh + ".jpg");
			while ((len = inputStream.read(data)) != -1) {
				fileOutputStream.write(data, 0, len);

			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fileOutputStream != null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}

	/**
	 * 从服务器获得一个输入流
	 * 
	 * @param pic
	 * @return
	 */
	public static InputStream getInputStream(String pic) {
		InputStream inputStream = null;
		HttpURLConnection httpURLConnection = null;

		try {
			URL url = new URL(pic);
			httpURLConnection = (HttpURLConnection) url.openConnection();
			// 设置网络连接超时时间
			httpURLConnection.setConnectTimeout(3000);
			// 设置应用程序要从网络连接读取数据
			httpURLConnection.setDoInput(true);

			httpURLConnection.setRequestMethod("GET");
			int responseCode = httpURLConnection.getResponseCode();
			if (responseCode == 200) {
				// 从服务器返回一个输入流
				inputStream = httpURLConnection.getInputStream();

			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return inputStream;

	}
}
