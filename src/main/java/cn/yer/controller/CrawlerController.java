package cn.yer.controller;

import cn.yer.service.CrawlerService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/crawler")
public class CrawlerController {

    @Autowired
    public CrawlerService crawlerService;

    @ApiOperation(value = "根据条件插入爬虫数据", notes = "爬取pconline数据")
    @RequestMapping(value = "/one", method = RequestMethod.POST)
    @ResponseBody
    public String queryAny(@RequestParam Integer bs, @RequestParam Integer page) {
        switch (bs) {
            case 1:
                crawlerService.insertCpu(page);
                break;
            case 2:
                crawlerService.insertDy(page);
                break;
            case 3:
                crawlerService.insertGtyp(page);
                break;
            case 4:
                crawlerService.insertJx(page);
                break;
            case 5:
                crawlerService.insertNc(page);
                break;
            case 6:
                crawlerService.insertSr(page);
                break;
            case 7:
                crawlerService.insertXk(page);
                break;
            case 8:
                crawlerService.insertXsq(page);
                break;
            case 9:
                crawlerService.insertYp(page);
                break;
            case 10:
                crawlerService.insertZb(page);
                break;
            default:
                return "error";

        }

        return "success";
    }

    @ApiOperation(value = "所有爬虫数据", notes = "爬取pconline数据")
    @RequestMapping(value = "/all", method = RequestMethod.POST)
    @ResponseBody
    public String queryAll(@RequestParam Integer page1, @RequestParam Integer page2, @RequestParam Integer page3, @RequestParam Integer page4, @RequestParam Integer page5, @RequestParam Integer page6, @RequestParam Integer page7, @RequestParam Integer page8, @RequestParam Integer page9, @RequestParam Integer page10) {
        crawlerService.insertCpu(page1);

        crawlerService.insertDy(page2);

        crawlerService.insertGtyp(page3);

        crawlerService.insertJx(page4);

        crawlerService.insertNc(page5);

        crawlerService.insertSr(page6);

        crawlerService.insertXk(page7);

        crawlerService.insertXsq(page8);

        crawlerService.insertYp(page9);

        crawlerService.insertZb(page10);

        return "success";
    }

    @ApiOperation(value = "清除数据库数据", notes = "爬取pconline数据")
    @RequestMapping(value = "/deleteAll", method = RequestMethod.DELETE)
    @ResponseBody
    public String queryAll() {
        crawlerService.deleteAll();
        return "success";
    }

    @ApiOperation(value = "保存网络图片到本地", notes = "保存网络图片到本地")
    @RequestMapping(value = "/saveLocalImageAll", method = RequestMethod.PUT)
    @ResponseBody
    public String saveLocalImageAll() {
        String[] str = { "pc_cpu", "pc_dy", "pc_gtyp", "pc_jx", "pc_nc", "pc_sr", "pc_xk", "pc_xsp", "pc_yp", "pc_zb" };
        for (int i = 0; i < str.length; i++) {
            crawlerService.getImage(str[i]);
        }
        return "success";
    }
}
