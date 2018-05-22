package cn.yer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author 作者 :陈曦
 * @date 创建时间:2017年4月19日 下午5:31:11
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Entity
public class Pc_xsq {
	@Id
	@GeneratedValue
	private int xxzjbh; // 信息主键编号
	private String title; // 标题
	private String price; // 价格
	private String pic; // 图片地址
	private String xh; // 型号
	private String cc; // 尺寸
	private String pmbl; // 屏幕比例
	private String jklx; // 接口类型
	private String xncs; // 性能参数
	private String mblx; // 面板类型
	private String dj; // 点距
	private String ld; // 亮度
	private String dxdbd; // 典型对比度
	private String dtdbd; // 动态对比度
	private String fbl; // 分辨率
	private String xysj; // 响应时间
	private String sxl; // 刷新率
	private String spksjd; // 水平可视角度
	private String czksjd; // 垂直可视角度
	private String sy; // 色域
	private String sh; // 色数
	private String bglx; // 背光类型
	private String ql; // 曲率
	private String mkjyx; // 麦克及音箱
	private String pjld; // 平均亮度
	private String dbd; // 对比度
	private String hdgl; // 耗电功率
	private String bzgl; // 标准功率
	private String qtxn; // 其他性能
	private String tsgn; // 特色功能
	private String wgcc; // 外观尺寸
	private String zl; // 重量
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

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getPmbl() {
		return pmbl;
	}

	public void setPmbl(String pmbl) {
		this.pmbl = pmbl;
	}

	public String getJklx() {
		return jklx;
	}

	public void setJklx(String jklx) {
		this.jklx = jklx;
	}

	public String getXncs() {
		return xncs;
	}

	public void setXncs(String xncs) {
		this.xncs = xncs;
	}

	public String getMblx() {
		return mblx;
	}

	public void setMblx(String mblx) {
		this.mblx = mblx;
	}

	public String getDj() {
		return dj;
	}

	public void setDj(String dj) {
		this.dj = dj;
	}

	public String getLd() {
		return ld;
	}

	public void setLd(String ld) {
		this.ld = ld;
	}

	public String getDxdbd() {
		return dxdbd;
	}

	public void setDxdbd(String dxdbd) {
		this.dxdbd = dxdbd;
	}

	public String getDtdbd() {
		return dtdbd;
	}

	public void setDtdbd(String dtdbd) {
		this.dtdbd = dtdbd;
	}

	public String getFbl() {
		return fbl;
	}

	public void setFbl(String fbl) {
		this.fbl = fbl;
	}

	public String getXysj() {
		return xysj;
	}

	public void setXysj(String xysj) {
		this.xysj = xysj;
	}

	public String getSxl() {
		return sxl;
	}

	public void setSxl(String sxl) {
		this.sxl = sxl;
	}

	public String getSpksjd() {
		return spksjd;
	}

	public void setSpksjd(String spksjd) {
		this.spksjd = spksjd;
	}

	public String getCzksjd() {
		return czksjd;
	}

	public void setCzksjd(String czksjd) {
		this.czksjd = czksjd;
	}

	public String getSy() {
		return sy;
	}

	public void setSy(String sy) {
		this.sy = sy;
	}

	public String getSh() {
		return sh;
	}

	public void setSh(String sh) {
		this.sh = sh;
	}

	public String getBglx() {
		return bglx;
	}

	public void setBglx(String bglx) {
		this.bglx = bglx;
	}

	public String getQl() {
		return ql;
	}

	public void setQl(String ql) {
		this.ql = ql;
	}

	public String getMkjyx() {
		return mkjyx;
	}

	public void setMkjyx(String mkjyx) {
		this.mkjyx = mkjyx;
	}

	public String getPjld() {
		return pjld;
	}

	public void setPjld(String pjld) {
		this.pjld = pjld;
	}

	public String getDbd() {
		return dbd;
	}

	public void setDbd(String dbd) {
		this.dbd = dbd;
	}

	public String getHdgl() {
		return hdgl;
	}

	public void setHdgl(String hdgl) {
		this.hdgl = hdgl;
	}

	public String getBzgl() {
		return bzgl;
	}

	public void setBzgl(String bzgl) {
		this.bzgl = bzgl;
	}

	public String getQtxn() {
		return qtxn;
	}

	public void setQtxn(String qtxn) {
		this.qtxn = qtxn;
	}

	public String getTsgn() {
		return tsgn;
	}

	public void setTsgn(String tsgn) {
		this.tsgn = tsgn;
	}

	public String getWgcc() {
		return wgcc;
	}

	public void setWgcc(String wgcc) {
		this.wgcc = wgcc;
	}

	public String getZl() {
		return zl;
	}

	public void setZl(String zl) {
		this.zl = zl;
	}

	public String getLocalPic() {
		return localPic;
	}

	public void setLocalPic(String localPic) {
		this.localPic = localPic;
	}

}
