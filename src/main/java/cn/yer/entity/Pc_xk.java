package cn.yer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author 作者 :陈曦
 * @date 创建时间:2017年4月19日 下午5:29:21
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Entity
public class Pc_xk {
	@Id
	@GeneratedValue
	private int xxzjbh; // 信息主键编号
	private String title; // 标题
	private String price; // 价格
	private String pic; // 图片地址
	private String xh; // 型号
	private String xklx; // 显卡类型
	private String xpxh; // 芯片型号
	private String xpdh; // 芯片代号
	private String xpcf; // 芯片厂方
	private String zzgy; // 制作工艺
	private String hxwk; // 核心位宽
	private String xkjkbz; // 显卡接口标准
	private String scjk; // 输出接口
	private String xcrl; // 显存容量
	private String xclx; // 显存类型
	private String xcwk; // 显存位宽
	private String xcfz; // 显存封装
	private String xcdk; // 显存带宽
	private String hxpl; // 核心频率
	private String lcldy; // 流处理器单元(SP)
	private String sdapi; // 3D API
	private String sdtx; // 3D特性
	private String zdfbl; // 最大分辨率
	private String srms; // 散热描述
	private String dyjk; // 电源接口
	private String bkcc; // 板卡尺寸
	private String tdpgh; // TDP功耗
	private String tsgn; // 特色功能
	private String pj; // 配件
	private String localPic; // 本地图片地址

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

	public String getXklx() {
		return xklx;
	}

	public void setXklx(String xklx) {
		this.xklx = xklx;
	}

	public String getXpxh() {
		return xpxh;
	}

	public void setXpxh(String xpxh) {
		this.xpxh = xpxh;
	}

	public String getXpdh() {
		return xpdh;
	}

	public void setXpdh(String xpdh) {
		this.xpdh = xpdh;
	}

	public String getXpcf() {
		return xpcf;
	}

	public void setXpcf(String xpcf) {
		this.xpcf = xpcf;
	}

	public String getZzgy() {
		return zzgy;
	}

	public void setZzgy(String zzgy) {
		this.zzgy = zzgy;
	}

	public String getHxwk() {
		return hxwk;
	}

	public void setHxwk(String hxwk) {
		this.hxwk = hxwk;
	}

	public String getXkjkbz() {
		return xkjkbz;
	}

	public void setXkjkbz(String xkjkbz) {
		this.xkjkbz = xkjkbz;
	}

	public String getScjk() {
		return scjk;
	}

	public void setScjk(String scjk) {
		this.scjk = scjk;
	}

	public String getXcrl() {
		return xcrl;
	}

	public void setXcrl(String xcrl) {
		this.xcrl = xcrl;
	}

	public String getXclx() {
		return xclx;
	}

	public void setXclx(String xclx) {
		this.xclx = xclx;
	}

	public String getXcwk() {
		return xcwk;
	}

	public void setXcwk(String xcwk) {
		this.xcwk = xcwk;
	}

	public String getXcfz() {
		return xcfz;
	}

	public void setXcfz(String xcfz) {
		this.xcfz = xcfz;
	}

	public String getXcdk() {
		return xcdk;
	}

	public void setXcdk(String xcdk) {
		this.xcdk = xcdk;
	}

	public String getHxpl() {
		return hxpl;
	}

	public void setHxpl(String hxpl) {
		this.hxpl = hxpl;
	}

	public String getLcldy() {
		return lcldy;
	}

	public void setLcldy(String lcldy) {
		this.lcldy = lcldy;
	}

	public String getSdapi() {
		return sdapi;
	}

	public void setSdapi(String sdapi) {
		this.sdapi = sdapi;
	}

	public String getSdtx() {
		return sdtx;
	}

	public void setSdtx(String sdtx) {
		this.sdtx = sdtx;
	}

	public String getZdfbl() {
		return zdfbl;
	}

	public void setZdfbl(String zdfbl) {
		this.zdfbl = zdfbl;
	}

	public String getSrms() {
		return srms;
	}

	public void setSrms(String srms) {
		this.srms = srms;
	}

	public String getDyjk() {
		return dyjk;
	}

	public void setDyjk(String dyjk) {
		this.dyjk = dyjk;
	}

	public String getBkcc() {
		return bkcc;
	}

	public void setBkcc(String bkcc) {
		this.bkcc = bkcc;
	}

	public String getTdpgh() {
		return tdpgh;
	}

	public void setTdpgh(String tdpgh) {
		this.tdpgh = tdpgh;
	}

	public String getTsgn() {
		return tsgn;
	}

	public void setTsgn(String tsgn) {
		this.tsgn = tsgn;
	}

	public String getPj() {
		return pj;
	}

	public void setPj(String pj) {
		this.pj = pj;
	}

	public String getLocalPic() {
		return localPic;
	}

	public void setLocalPic(String localPic) {
		this.localPic = localPic;
	}

}
