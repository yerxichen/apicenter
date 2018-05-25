package cn.yer.pconline;

import cn.yer.entity.*;
import cn.yer.service.*;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author 作者 :陈曦
 * @version 1.0
 * @date 创建时间:2017年4月12日 下午5:56:47
 * @parameter
 * @return
 * @since
 */


@Service
public class InsetInfo {
    @Autowired
    public CpuService cpuService;
    @Autowired
    public DyService dyService;
    @Autowired
    public GtypService gtypService;
    @Autowired
    public JxService jxService;
    @Autowired
    public NcService ncService;
    @Autowired
    public SrService srService;
    @Autowired
    public XkService xkService;
    @Autowired
    public XsqService xsqService;
    @Autowired
    public YpService ypService;
    @Autowired
    public ZbService zbService;

    protected static Logger logger = LoggerFactory.getLogger(InsetInfo.class);

    /**
     * cpu数据入库
     *
     * @param jsonObject
     * @return
     */
    public void insert_cpu(JSONObject jsonObject) {
        JSONArray arr = (JSONArray) jsonObject.get("result");
        Pc_cpu cpu = null;

        for (int i = 0; i < arr.size(); i++) {
            JSONObject resultObj = arr.getJSONObject(i);
            JSONArray detailArr = (JSONArray) resultObj.get("detail");
//				logger.info("detailArrsize==" + detailArr.size());
            logger.info("detailArrsize==" + detailArr.size());
            for (int j = 0; j < detailArr.size(); j++) {
                JSONObject detailObj = detailArr.getJSONObject(j);
                // System.out.println("detailObj===" + detailObj);
                cpu = new Pc_cpu();
                cpu.setXh(detailObj.getString("型号"));
                cpu.setCpdw(detailObj.getString("产品定位"));
                cpu.setXpcf(detailObj.getString("芯片厂方"));
                cpu.setHxsl(detailObj.getString("核心数量"));
                cpu.setHxlx(detailObj.getString("核心类型"));
                cpu.setScgy(detailObj.getString("生产工艺"));
                cpu.setJklx(detailObj.getString("接口类型"));
                cpu.setXcs(detailObj.getString("线程数"));
                cpu.setHxdy(detailObj.getString("核心电压"));
                cpu.setZp(detailObj.getString("主频"));
                cpu.setDtjs(detailObj.getString("动态加速"));
                cpu.setEjhc(detailObj.getString("二级缓存"));
                cpu.setXshxxh(detailObj.getString("显示核心型号"));
                cpu.setXshxpl(detailObj.getString("显示核心频率"));
                cpu.setZctdms(detailObj.getString("支持通道模式"));
                cpu.setZcncpl(detailObj.getString("支持内存频率"));
                cpu.setLsswclq(detailObj.getString("64位处理器"));
                cpu.setTdpjs(detailObj.getString("TDP技术"));
                cpu.setXnh(detailObj.getString("Virtualization(虚拟化)"));
                cpu.setGzgl(detailObj.getString("工作功率"));
                cpu.setSxgjz(detailObj.getString("属性关键字"));
                cpu.setTitle(detailObj.getString("title"));
                cpu.setPrice(detailObj.getString("price"));
                cpu.setPic(detailObj.getString("pic"));
                cpuService.insetCpu(cpu);
            }
        }

    }

    /**
     * 主板数据入库
     *
     * @param jsonObject
     * @return
     */
    public void insert_zb(JSONObject jsonObject) {
        boolean boo = false;

        JSONArray arr = (JSONArray) jsonObject.get("result");
        Pc_zb zb = null;

        for (int i = 0; i < arr.size(); i++) {
            JSONObject resultObj = arr.getJSONObject(i);
            JSONArray detailArr = (JSONArray) resultObj.get("detail");
            logger.info("detailArrsize==" + detailArr.size());
            for (int j = 0; j < detailArr.size(); j++) {
                JSONObject detailObj = detailArr.getJSONObject(j);
                // System.out.println("detailObj===" + detailObj);
                zb = new Pc_zb();

                zb.setXh(detailObj.getString("型号"));
                zb.setXh(detailObj.getString("适用类型"));
                zb.setXh(detailObj.getString("芯片厂商"));
                zb.setXh(detailObj.getString("芯片组或北桥芯片"));
                zb.setXh(detailObj.getString("CPU插槽"));
                zb.setXh(detailObj.getString("支持CPU类型"));
                zb.setXh(detailObj.getString("主板架构"));
                zb.setXh(detailObj.getString("支持内存类型"));
                zb.setXh(detailObj.getString("支持通道模式"));
                zb.setXh(detailObj.getString("内存插槽"));
                zb.setXh(detailObj.getString("内存频率"));
                zb.setXh(detailObj.getString("最大支持内存容量"));
                zb.setXh(detailObj.getString("集成显卡核心"));
                zb.setXh(detailObj.getString("板载声卡"));
                zb.setXh(detailObj.getString("板载网卡"));
                zb.setXh(detailObj.getString("硬盘接口"));
                zb.setXh(detailObj.getString("SATA III接口数量"));
                zb.setXh(detailObj.getString("SATA-Express数量"));
                zb.setXh(detailObj.getString("磁盘阵列类型"));
                zb.setXh(detailObj.getString("磁盘阵列模式"));
                zb.setXh(detailObj.getString("支持显卡标准"));
                zb.setXh(detailObj.getString("扩展插槽"));
                zb.setXh(detailObj.getString("PCI插槽"));
                zb.setXh(detailObj.getString("扩展接口"));
                zb.setXh(detailObj.getString("USB接口数量"));
                zb.setXh(detailObj.getString("电源回路"));
                zb.setXh(detailObj.getString("电源接口"));
                zb.setXh(detailObj.getString("游戏等级"));
                zb.setXh(detailObj.getString("特色功能"));
                zb.setXh(detailObj.getString("外形尺寸"));
                zb.setXh(detailObj.getString("附件"));
                zb.setXh(detailObj.getString("title"));
                zb.setXh(detailObj.getString("price"));
                zb.setXh(detailObj.getString("pic"));
                zbService.insetZb(zb);
            }
        }

    }

    /**
     * 显卡数据入库
     *
     * @param jsonObject
     * @return
     */
    public void insert_xk(JSONObject jsonObject) {

        JSONArray arr = (JSONArray) jsonObject.get("result");
        Pc_xk xk = null;

        for (int i = 0; i < arr.size(); i++) {
            JSONObject resultObj = arr.getJSONObject(i);
            JSONArray detailArr = (JSONArray) resultObj.get("detail");
            logger.info("detailArrsize==" + detailArr.size());
            for (int j = 0; j < detailArr.size(); j++) {
                JSONObject detailObj = detailArr.getJSONObject(j);
                // System.out.println("detailObj===" + detailObj);

                xk = new Pc_xk();
                xk.setXh(detailObj.getString("型号"));
                xk.setXklx(detailObj.getString("显卡类型"));
                xk.setXpxh(detailObj.getString("芯片型号"));
                xk.setXpdh(detailObj.getString("芯片代号"));
                xk.setXpcf(detailObj.getString("芯片厂方"));
                xk.setZzgy(detailObj.getString("制作工艺"));
                xk.setHxwk(detailObj.getString("核心位宽"));
                xk.setXkjkbz(detailObj.getString("显卡接口标准"));
                xk.setScjk(detailObj.getString("输出接口"));
                xk.setXcrl(detailObj.getString("显存容量"));
                xk.setXclx(detailObj.getString("显存类型"));
                xk.setXcwk(detailObj.getString("显存位宽"));
                xk.setXcfz(detailObj.getString("显存封装"));
                xk.setXcdk(detailObj.getString("显存带宽"));
                xk.setHxpl(detailObj.getString("核心频率"));
                xk.setLcldy(detailObj.getString("流处理器单元(SP)"));
                xk.setSdapi(detailObj.getString("3D API"));
                xk.setSdtx(detailObj.getString("3D特性"));
                xk.setZdfbl(detailObj.getString("最大分辨率"));
                xk.setSrms(detailObj.getString("散热描述"));
                xk.setDyjk(detailObj.getString("电源接口"));
                xk.setBkcc(detailObj.getString("板卡尺寸"));
                xk.setTdpgh(detailObj.getString("TDP功耗"));
                xk.setTsgn(detailObj.getString("特色功能"));
                xk.setPj(detailObj.getString("配件"));
                xk.setTitle(detailObj.getString("title"));
                xk.setPrice(detailObj.getString("price"));
                xk.setPic(detailObj.getString("pic"));
                xkService.insetXk(xk);
            }

        }
    }

    /**
     * 显卡数据入库
     *
     * @param jsonObject
     * @return
     */
    public void insert_xsq(JSONObject jsonObject) {

        JSONArray arr = (JSONArray) jsonObject.get("result");

        Pc_xsq xsq = null;
        for (int i = 0; i < arr.size(); i++) {
            JSONObject resultObj = arr.getJSONObject(i);
            JSONArray detailArr = (JSONArray) resultObj.get("detail");
            logger.info("detailArrsize==" + detailArr.size());
            for (int j = 0; j < detailArr.size(); j++) {
                JSONObject detailObj = detailArr.getJSONObject(j);
                // System.out.println("detailObj===" + detailObj);

                xsq = new Pc_xsq();
                xsq.setTitle(detailObj.getString("title"));
                xsq.setPrice(detailObj.getString("price"));
                xsq.setPic(detailObj.getString("pic"));
                xsq.setXh(detailObj.getString("型号"));
                xsq.setCc(detailObj.getString("尺寸"));
                xsq.setPmbl(detailObj.getString("屏幕比例"));
                xsq.setJklx(detailObj.getString("接口类型"));
                xsq.setXncs(detailObj.getString("性能参数"));
                xsq.setMblx(detailObj.getString("面板类型"));
                xsq.setDj(detailObj.getString("点距"));
                xsq.setLd(detailObj.getString("亮度"));
                xsq.setDxdbd(detailObj.getString("典型对比度"));
                xsq.setDtdbd(detailObj.getString("动态对比度"));
                xsq.setFbl(detailObj.getString("分辨率"));
                xsq.setXysj(detailObj.getString("响应时间"));
                xsq.setSxl(detailObj.getString("刷新率"));
                xsq.setSpksjd(detailObj.getString("水平可视角度"));
                xsq.setCzksjd(detailObj.getString("垂直可视角度"));
                xsq.setSy(detailObj.getString("色域"));
                xsq.setSh(detailObj.getString("色数"));
                xsq.setBglx(detailObj.getString("背光类型"));
                xsq.setQl(detailObj.getString("曲率"));
                xsq.setMkjyx(detailObj.getString("麦克及音箱"));
                xsq.setPjld(detailObj.getString("平均亮度"));
                xsq.setDbd(detailObj.getString("对比度"));
                xsq.setHdgl(detailObj.getString("耗电功率"));
                xsq.setBzgl(detailObj.getString("标准功率"));
                xsq.setQtxn(detailObj.getString("其他性能"));
                xsq.setTsgn(detailObj.getString("特色功能"));
                xsq.setWgcc(detailObj.getString("外观尺寸"));
                xsq.setZl(detailObj.getString("重量"));
                xsqService.insetXsq(xsq);
            }
        }

    }

    /**
     * 内存数据入库
     *
     * @param jsonObject
     * @return
     */
    public void insert_nc(JSONObject jsonObject) {

        JSONArray arr = (JSONArray) jsonObject.get("result");

        Pc_nc nc = null;

        for (int i = 0; i < arr.size(); i++) {
            JSONObject resultObj = arr.getJSONObject(i);
            JSONArray detailArr = (JSONArray) resultObj.get("detail");
            logger.info("detailArrsize==" + detailArr.size());
            for (int j = 0; j < detailArr.size(); j++) {
                JSONObject detailObj = detailArr.getJSONObject(j);
                // System.out.println("detailObj===" + detailObj);
                String sql = "INSERT INTO pc_nc(xh,sylx,nclx,nctd,nczp,nczrl,ncrlms,cjsm,ycms,ncdy,qtxn,bz,title,price,pic) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                nc = new Pc_nc();
                nc.setXh(detailObj.getString("型号"));
                nc.setSylx(detailObj.getString("适用类型"));
                nc.setNclx(detailObj.getString("内存类型"));
                nc.setNctd(detailObj.getString("内存特点"));
                nc.setNczp(detailObj.getString("内存主频"));
                nc.setNczrl(detailObj.getString("内存总容量"));
                nc.setNcrlms(detailObj.getString("内存容量描述"));
                nc.setCjsm(detailObj.getString("插脚数目"));
                nc.setYcms(detailObj.getString("延迟描述"));
                nc.setNcdy(detailObj.getString("内存电压"));
                nc.setQtxn(detailObj.getString("其他性能"));
                nc.setBz(detailObj.getString("包装"));
                nc.setTitle(detailObj.getString("title"));
                nc.setPrice(detailObj.getString("price"));
                nc.setPic(detailObj.getString("pic"));
                ncService.insetNc(nc);
            }
        }

    }

    /**
     * 硬盘数据入库
     *
     * @param jsonObject
     * @return
     */
    public void insert_yp(JSONObject jsonObject) {

        JSONArray arr = (JSONArray) jsonObject.get("result");
        Pc_yp yp = null;

        for (int i = 0; i < arr.size(); i++) {
            JSONObject resultObj = arr.getJSONObject(i);
            JSONArray detailArr = (JSONArray) resultObj.get("detail");
            logger.info("detailArrsize==" + detailArr.size());
            for (int j = 0; j < detailArr.size(); j++) {
                JSONObject detailObj = detailArr.getJSONObject(j);
                // System.out.println("detailObj===" + detailObj);
                String sql = "INSERT INTO pc_yp(xh,rl,zs,hcrl,ptcc,jkbz,iopsz,csbz,ddrl,qtxn,title,price,pic) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";

                yp = new Pc_yp();
                yp.setXh(detailObj.getString("型号"));
                yp.setRl(detailObj.getString("容量"));
                yp.setZs(detailObj.getString("转速"));
                yp.setHcrl(detailObj.getString("缓存容量"));
                yp.setPtcc(detailObj.getString("盘体尺寸"));
                yp.setJkbz(detailObj.getString("接口标准"));
                yp.setIopsz(detailObj.getString("IOPS值(测试数据)"));
                yp.setCsbz(detailObj.getString("传输标准"));
                yp.setDdrl(detailObj.getString("单碟容量"));
                yp.setQtxn(detailObj.getString("其它性能"));
                yp.setTitle(detailObj.getString("title"));
                yp.setPrice(detailObj.getString("price"));
                yp.setPic(detailObj.getString("pic"));
                ypService.insetYp(yp);
            }
        }

    }

    /**
     * 固态硬盘数据入库
     *
     * @param jsonObject
     * @return
     */
    public void insert_gtyp(JSONObject jsonObject) {

        JSONArray arr = (JSONArray) jsonObject.get("result");
        Pc_gtyp gtyp = null;

        for (int i = 0; i < arr.size(); i++) {
            JSONObject resultObj = arr.getJSONObject(i);
            JSONArray detailArr = (JSONArray) resultObj.get("detail");
            logger.info("detailArrsize==" + detailArr.size());
            for (int j = 0; j < detailArr.size(); j++) {
                JSONObject detailObj = detailArr.getJSONObject(j);
                // System.out.println("detailObj===" + detailObj);

                gtyp = new Pc_gtyp();
                gtyp.setXh(detailObj.getString("型号"));
                gtyp.setRl(detailObj.getString("容量"));
                gtyp.setHclx(detailObj.getString("缓存类型"));
                gtyp.setHcrl(detailObj.getString("缓存容量"));
                gtyp.setSclx(detailObj.getString("闪存类型"));
                gtyp.setZkxp(detailObj.getString("主控芯片"));
                gtyp.setKl(detailObj.getString("颗粒"));
                gtyp.setLxdqzdsd(detailObj.getString("连续读取最大速度"));
                gtyp.setLxxrzdsd(detailObj.getString("连续写入最大速度"));
                gtyp.setYpcc(detailObj.getString("硬盘尺寸"));
                gtyp.setJklx(detailObj.getString("接口类型"));
                gtyp.setPjwgzsj(detailObj.getString("平均无故障时间"));
                gtyp.setSksjdq(detailObj.getString("4K随机读取"));
                gtyp.setSksjxr(detailObj.getString("4K随机写入"));
                gtyp.setIopsdq(detailObj.getString("IOPS读取"));
                gtyp.setIopsxr(detailObj.getString("IOPS写入"));
                gtyp.setNvme(detailObj.getString("NVMe"));
                gtyp.setTrimgn(detailObj.getString("TRIM功能"));
                gtyp.setWgcc(detailObj.getString("外观尺寸"));
                gtyp.setZl(detailObj.getString("重量"));
                gtyp.setGzwd(detailObj.getString("工作温度"));
                gtyp.setBx(detailObj.getString("保修"));
                gtyp.setQtxn(detailObj.getString("其它性能"));
                gtyp.setTitle(detailObj.getString("title"));
                gtyp.setPrice(detailObj.getString("price"));
                gtyp.setPic(detailObj.getString("pic"));
                gtypService.insetGtyp(gtyp);
            }
        }

    }

    /**
     * 电源数据入库
     *
     * @param jsonObject
     * @return
     */
    public void insert_dy(JSONObject jsonObject) {

        JSONArray arr = (JSONArray) jsonObject.get("result");
        Pc_dy dy = null;

        for (int i = 0; i < arr.size(); i++) {
            JSONObject resultObj = arr.getJSONObject(i);
            JSONArray detailArr = (JSONArray) resultObj.get("detail");
            logger.info("detailArrsize==" + detailArr.size());
            for (int j = 0; j < detailArr.size(); j++) {
                JSONObject detailObj = detailArr.getJSONObject(j);
                // System.out.println("detailObj===" + detailObj);

                dy = new Pc_dy();
                dy.setXh(detailObj.getString("型号"));
                dy.setSylx(detailObj.getString("适用类型"));
                dy.setDybz(detailObj.getString("电源标准"));
                dy.setYdgl(detailObj.getString("额定功率"));
                dy.setZdgl(detailObj.getString("最大功率"));
                dy.setSycpufw(detailObj.getString("适用CPU范围"));
                dy.setRzgf(detailObj.getString("认证规范"));
                dy.setZbdyjk(detailObj.getString("主板电源接口"));
                dy.setCpugdjk(detailObj.getString("CPU供电接口"));
                dy.setGdjk(detailObj.getString("供电接口(大4pin)"));
                dy.setSatajk(detailObj.getString("SATA接口"));
                dy.setXkdyjk(detailObj.getString("8Pin显卡电源接口"));
                dy.setPfclx(detailObj.getString("PFC类型"));
                dy.setZhxl(detailObj.getString("转换效率"));
                dy.setPlusrz(detailObj.getString("80PLUS认证"));
                dy.setFsms(detailObj.getString("风扇描述"));
                dy.setCc(detailObj.getString("尺寸"));
                dy.setTitle(detailObj.getString("title"));
                dy.setPrice(detailObj.getString("price"));
                dy.setPic(detailObj.getString("pic"));
                dyService.insetDy(dy);
            }
        }

    }

    /**
     * 机箱数据入库
     *
     * @param jsonObject
     * @return
     */
    public void insert_jx(JSONObject jsonObject) {

        JSONArray arr = (JSONArray) jsonObject.get("result");

        Pc_jx jx = null;
        for (int i = 0; i < arr.size(); i++) {
            JSONObject resultObj = arr.getJSONObject(i);
            JSONArray detailArr = (JSONArray) resultObj.get("detail");
            logger.info("detailArrsize==" + detailArr.size());
            for (int j = 0; j < detailArr.size(); j++) {
                JSONObject detailObj = detailArr.getJSONObject(j);
                // System.out.println("detailObj===" + detailObj);

                jx = new Pc_jx();
                jx.setXh(detailObj.getString("型号"));
                jx.setSylx(detailObj.getString("适用类型"));
                jx.setJxys(detailObj.getString("机箱样式"));
                jx.setJxlx(detailObj.getString("机箱类型"));
                jx.setJrzb(detailObj.getString("兼容主板"));
                jx.setJxcw(detailObj.getString("机箱仓位"));
                jx.setKzcc(detailObj.getString("扩展插槽"));
                jx.setJxcz(detailObj.getString("机箱材质"));
                jx.setBchd(detailObj.getString("板材厚度"));
                jx.setJxys(detailObj.getString("机箱颜色"));
                jx.setBpdy(detailObj.getString("标配电源"));
                jx.setQzjkms(detailObj.getString("前置接口描述"));
                jx.setJxfs(detailObj.getString("机箱风扇"));
                jx.setNbsrms(detailObj.getString("内部散热描述"));
                jx.setZcsl(detailObj.getString("支持水冷"));
                jx.setXkxc(detailObj.getString("显卡限长"));
                jx.setSrqxg(detailObj.getString("散热器限高"));
                jx.setDywz(detailObj.getString("电源位置"));
                jx.setJxcc(detailObj.getString("机箱尺寸"));
                jx.setZl(detailObj.getString("重量"));
                jx.setFj(detailObj.getString("附件"));
                jx.setQtxn(detailObj.getString("其它性能"));
                jx.setTitle(detailObj.getString("title"));
                jx.setPrice(detailObj.getString("price"));
                jx.setPic(detailObj.getString("pic"));
                jxService.insetJx(jx);

            }
        }

    }

    /**
     * 散热数据入库
     *
     * @param jsonObject
     * @return
     */
    public void insert_sr(JSONObject jsonObject) {

        JSONArray arr = (JSONArray) jsonObject.get("result");
        Pc_sr sr = null;

        for (int i = 0; i < arr.size(); i++) {
            JSONObject resultObj = arr.getJSONObject(i);
            JSONArray detailArr = (JSONArray) resultObj.get("detail");
            logger.info("detailArrsize==" + detailArr.size());
            for (int j = 0; j < detailArr.size(); j++) {
                JSONObject detailObj = detailArr.getJSONObject(j);
                // System.out.println("detailObj===" + detailObj);

                sr = new Pc_sr();
                sr.setXh(detailObj.getString("型号"));
                sr.setXh(detailObj.getString("适用配件"));
                sr.setXh(detailObj.getString("散热器种类"));
                sr.setXh(detailObj.getString("适用配件范围"));
                sr.setXh(detailObj.getString("风扇尺寸"));
                sr.setXh(detailObj.getString("风扇轴承"));
                sr.setXh(detailObj.getString("风扇转速"));
                sr.setXh(detailObj.getString("风量"));
                sr.setXh(detailObj.getString("噪音"));
                sr.setXh(detailObj.getString("散热器总尺寸"));
                sr.setXh(detailObj.getString("重量"));
                sr.setXh(detailObj.getString("散热片材质"));
                sr.setXh(detailObj.getString("其它性能"));
                sr.setXh(detailObj.getString("title"));
                sr.setXh(detailObj.getString("price"));
                sr.setXh(detailObj.getString("pic"));
               srService.insetSr(sr);
            }
        }

    }
}
