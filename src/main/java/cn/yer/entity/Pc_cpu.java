package cn.yer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author 作者 :陈曦
 * @date 创建时间:2017年4月14日 上午11:57:10
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Entity
public class Pc_cpu {
	@Id
	@GeneratedValue
	private int xxzjbh; // 信息主键编号
	private String title; // 标题
	private String price; // 价格
	private String pic; // 图片
	private String xh; // 型号
	private String cpdw; // 产品定位
	private String xpcf; // 芯片厂方
	private String hxsl; // 核心数量
	private String hxlx; // 核心类型
	private String scgy; // 生产工艺
	private String jklx; // 接口类型
	private String xcs; // 线程数
	private String hxdy; // 核心电压
	private String zp; // 主频
	private String dtjs; // 动态加速
	private String ejhc; // 二级缓存
	private String xshxxh; // 显示核心型号
	private String xshxpl; // 显示核心频率
	private String zctdms; // 支持通道模式
	private String zcncpl; // 支持内存频率
	private String lsswclq; // 64位处理器
	private String tdpjs; // TDP技术
	private String xnh; // Virtualization(虚拟化)
	private String gzgl; // 工作功率
	private String sxgjz; // 属性关键字
	private String localPic; // 本地图片地址

	public String getLocalPic() {
		return localPic;
	}

	public void setLocalPic(String localPic) {
		this.localPic = localPic;
	}

	public int getXxzjbh() {
		return xxzjbh;
	}

	public void setXxzjbh(int xxzjbh) {
		this.xxzjbh = xxzjbh;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getXh() {
		return xh;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}

	public String getCpdw() {
		return cpdw;
	}

	public void setCpdw(String cpdw) {
		this.cpdw = cpdw;
	}

	public String getXpcf() {
		return xpcf;
	}

	public void setXpcf(String xpcf) {
		this.xpcf = xpcf;
	}

	public String getHxsl() {
		return hxsl;
	}

	public void setHxsl(String hxsl) {
		this.hxsl = hxsl;
	}

	public String getHxlx() {
		return hxlx;
	}

	public void setHxlx(String hxlx) {
		this.hxlx = hxlx;
	}

	public String getScgy() {
		return scgy;
	}

	public void setScgy(String scgy) {
		this.scgy = scgy;
	}

	public String getJklx() {
		return jklx;
	}

	public void setJklx(String jklx) {
		this.jklx = jklx;
	}

	public String getXcs() {
		return xcs;
	}

	public void setXcs(String xcs) {
		this.xcs = xcs;
	}

	public String getHxdy() {
		return hxdy;
	}

	public void setHxdy(String hxdy) {
		this.hxdy = hxdy;
	}

	public String getZp() {
		return zp;
	}

	public void setZp(String zp) {
		this.zp = zp;
	}

	public String getDtjs() {
		return dtjs;
	}

	public void setDtjs(String dtjs) {
		this.dtjs = dtjs;
	}

	public String getEjhc() {
		return ejhc;
	}

	public void setEjhc(String ejhc) {
		this.ejhc = ejhc;
	}

	public String getXshxxh() {
		return xshxxh;
	}

	public void setXshxxh(String xshxxh) {
		this.xshxxh = xshxxh;
	}

	public String getXshxpl() {
		return xshxpl;
	}

	public void setXshxpl(String xshxpl) {
		this.xshxpl = xshxpl;
	}

	public String getZctdms() {
		return zctdms;
	}

	public void setZctdms(String zctdms) {
		this.zctdms = zctdms;
	}

	public String getZcncpl() {
		return zcncpl;
	}

	public void setZcncpl(String zcncpl) {
		this.zcncpl = zcncpl;
	}

	public String getLsswclq() {
		return lsswclq;
	}

	public void setLsswclq(String lsswclq) {
		this.lsswclq = lsswclq;
	}

	public String getTdpjs() {
		return tdpjs;
	}

	public void setTdpjs(String tdpjs) {
		this.tdpjs = tdpjs;
	}

	public String getXnh() {
		return xnh;
	}

	public void setXnh(String xnh) {
		this.xnh = xnh;
	}

	public String getGzgl() {
		return gzgl;
	}

	public void setGzgl(String gzgl) {
		this.gzgl = gzgl;
	}

	public String getSxgjz() {
		return sxgjz;
	}

	public void setSxgjz(String sxgjz) {
		this.sxgjz = sxgjz;
	}

}
