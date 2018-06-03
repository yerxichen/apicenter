package cn.yer.pconline;


/**
 * @author 作者 :陈曦
 * @date 创建时间:2017年4月12日 上午10:17:03
 * @version 1.0
 * @parameter
 * @return
 * @since
 */

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author hasee
 *
 */
public class Crawler {
    private String url;
    private int nowPage;
    private int endPage;

    protected static Logger logger = LoggerFactory.getLogger(Crawler.class);

    /**
     * @param url
     *            需要抓取的url
     * @param nowPage
     *            分页当前页页码
     * @param endPage
     *            分页显示最后一页页码
     */
    public Crawler(String url, int nowPage, int endPage) {
        super();
        this.url = url;
        this.nowPage = nowPage;
        this.endPage = endPage;
    }

    public Crawler() {
    }

    /**
     * 获取爬取的数据
     *
     * @return suKEY:result sonKEY:detail
     * @throws Exception
     */
    public JSONObject getData() {
        JSONObject rtObj = new JSONObject();
        JSONArray rsArr = new JSONArray();
        //开启线程池
        //创建固定大小的线程池
//		ExecutorService executor=Executors.newFixedThreadPool(20);
//		ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executor;
//
        for (int i = nowPage - 1; i < endPage; i++) {
//			threadPoolExecutor.execute(new Runnable() {
//
//				@Override
//				public void run() {
            if (i != 0) {
                int index = url.lastIndexOf("/");
                url = url.substring(0, index + 1) + i * 25 + "s1.shtml";
            }
            // System.err.println("start==" + url);
            MyHttpClient myHttpClient = new MyHttpClient();
            String html = myHttpClient.getURLContext(url);
            MyJsoup myJsoup = new MyJsoup();
            JSONObject rsObject = myJsoup.pconlineJsoup(html);
            logger.info(rsObject.toString());
//					new InsetInfo().insert_cpu(rsObject.getJSONArray("detail"));
            rsArr.add(rsObject);
            logger.info(url + "第" + (i + 1) + "页完成");
        }
//			});

//		}
        rtObj.put("result", rsArr);
        return rtObj;
    }


    public JSONObject getTotalPage() {
        JSONObject rtObj = new JSONObject();
        String[] urls = {"http://product.pconline.com.cn/cpu/", "http://product.pconline.com.cn/power/", "http://product.pconline.com.cn/dianziyingpan/", "http://product.pconline.com.cn/case/", "http://product.pconline.com.cn/memory/", "http://product.pconline.com.cn/sanre/", "http://product.pconline.com.cn/vga/", "http://product.pconline.com.cn/lcd/", "http://product.pconline.com.cn/harddisk/", "http://product.pconline.com.cn/mb/"};
        for (int i = 0; i < urls.length; i++) {
            MyHttpClient myHttpClient = new MyHttpClient();
            String html = myHttpClient.getURLContext(urls[i]);

            // 得到url转String的结果，并转换成Document类型
            Document document = Jsoup.parse(html);
            // 根据id获取列表的context
            Element listItem = document.getElementsByClass("page-total").first();

            String total = listItem.text();

            rtObj.put("" + i, total);


        }

        return rtObj;
    }
}
