package cn.yer.pconline;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 作者 :陈曦
 * @date 创建时间:2017年4月11日 下午2:21:38
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
public class MyJsoup {
	protected static Logger logger=LoggerFactory.getLogger(MyJsoup.class);

	public JSONObject pconlineJsoup(String html) {
		JSONArray rsArray = new JSONArray();
		JSONObject rtObj = new JSONObject(), rsObj = null;
		// 得到url转String的结果，并转换成Document类型
		Document document = Jsoup.parse(html);
		// 根据id获取列表的context
		Element listItem = document.getElementById("JlistItems");
		// 获取每个item
		Elements item = listItem.getElementsByClass("item");

		// System.out.println(item.size());
		// 遍历每一个数据，获取标题和链接并查询出规律，重新拼接出详细列表的链接，进行子抓取
		for (Element ele : item) {

			// 筛选出所有商品的标题和链接
			Elements title_a = ele.getElementsByClass("item-title-name");
			String title = title_a.html();
			if ("".equals(title)) {
				continue;
			}
			String url = title_a.attr("href");
			// 获取详细列表的URL
			String url_detail = url.replaceAll(".html", "_detail.html");
			// System.out.println("title:" + title + "====" + "url:" + url);
			// System.out.println("url_detail:" + url_detail);
			MyHttpClient myHttpClient = new MyHttpClient();
			String html_detail = "";
			try {
				html_detail = myHttpClient.getURLContext(url_detail);

				Document document_detail = Jsoup.parse(html_detail);
				// Element listItem_detail =
				// document_detail.getElementById("JlistItems");
				// 获取详细列表所在的context
				Element div = document_detail.getElementById("area-detailparams");
				// 查询出所有的table，去掉最后一个无用table
				Elements tables = div.select("table");
				int size = tables.size() - 1;
				// System.out.println("size==" + size);
				Element zycs_table = document_detail.getElementById("Jbasicparams");
				// 筛选出价格和图片地址
				Element price_a = ele.select(".item-sales a").first();
				String price = price_a.text();
				Elements pic_a = ele.select(".pic");
				String pic = pic_a.attr("#src");
				// System.out.println("价格：" + price + "图片" + pic);
				// 把数据存入rsObj
				rsObj = new JSONObject();
				rsObj.put("title", title);
				rsObj.put("price", price);
				rsObj.put("pic", pic);
				for (int i = 0; i < size; i++) {

					if (i != 0) {
						zycs_table = document_detail.getElementById("Jbasicparams" + i);
						// table名字无规则时（出现丢失id的情况）
						if (zycs_table == null) {
							continue;
						}
					}
					Elements zycs_tr = zycs_table.select("tr");
					for (Element tr : zycs_tr) {
						Elements th = tr.select("th");
						Elements td = tr.select("td");
						String xh = th.text();
						String body = td.text();
						String temp[] = body.split(" • ");
						body = temp[0];
						rsObj.put(xh, body);
						// System.out.println("xh:" + xh + "====" + "body:" +
						// body);
					}
				}
				// System.out.println("title:" + title);
				// System.out.println(rsObj);
				rsArray.add(rsObj);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				logger.info("获取节点异常！节点不存在！进行跳过处理！");
//				System.err.println();
				continue;
			}
		}
		rtObj.put("detail", rsArray);
		// System.out.println(rsArray);
		// System.out.println(rsArray.size());
		// System.out.println(rtArray);
		return rtObj;
	}
}
