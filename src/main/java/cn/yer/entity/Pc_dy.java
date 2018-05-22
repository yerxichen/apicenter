package cn.yer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author 作者 :陈曦
 * @date 创建时间:2017年4月19日 下午5:21:52
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Entity
public class Pc_dy {
	@Id
	@GeneratedValue
	private int xxzjbh; // 信息主键编号
	private String xh; // 型号
	private String sylx; // 适用类型
	private String dybz; // 电源标准
	private String ydgl; // 额定功率
	private String zdgl; // 最大功率
	private String sycpufw; // 适用CPU范围
	private String rzgf; // 认证规范
	private String zbdyjk; // 主板电源接口
	private String cpugdjk; // CPU供电接口
	private String gdjk; // 供电接口(大4pin)
	private String satajk; // SATA接口
	private String xkdyjk; // 8Pin显卡电源接口
	private String pfclx; // PFC类型
	private String zhxl; // 转换效率
	private String plusrz; // 80PLUS认证
	private String fsms; // 风扇描述
	private String cc; // 尺寸
	private String title; // 标题
	private String price; // 价格
	private String pic; // 图片
	private String localPic; // 本地图片地址

	public int getXxzjbh() {
		return xxzjbh;
	}

	public void setXxzjbh(int xxzjbh) {
		this.xxzjbh = xxzjbh;
	}

	public String getXh() {
		return xh;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}

	public String getSylx() {
		return sylx;
	}

	public void setSylx(String sylx) {
		this.sylx = sylx;
	}

	public String getDybz() {
		return dybz;
	}

	public void setDybz(String dybz) {
		this.dybz = dybz;
	}

	public String getYdgl() {
		return ydgl;
	}

	public void setYdgl(String ydgl) {
		this.ydgl = ydgl;
	}

	public String getZdgl() {
		return zdgl;
	}

	public void setZdgl(String zdgl) {
		this.zdgl = zdgl;
	}

	public String getSycpufw() {
		return sycpufw;
	}

	public void setSycpufw(String sycpufw) {
		this.sycpufw = sycpufw;
	}

	public String getRzgf() {
		return rzgf;
	}

	public void setRzgf(String rzgf) {
		this.rzgf = rzgf;
	}

	public String getZbdyjk() {
		return zbdyjk;
	}

	public void setZbdyjk(String zbdyjk) {
		this.zbdyjk = zbdyjk;
	}

	public String getCpugdjk() {
		return cpugdjk;
	}

	public void setCpugdjk(String cpugdjk) {
		this.cpugdjk = cpugdjk;
	}

	public String getGdjk() {
		return gdjk;
	}

	public void setGdjk(String gdjk) {
		this.gdjk = gdjk;
	}

	public String getSatajk() {
		return satajk;
	}

	public void setSatajk(String satajk) {
		this.satajk = satajk;
	}

	public String getXkdyjk() {
		return xkdyjk;
	}

	public void setXkdyjk(String xkdyjk) {
		this.xkdyjk = xkdyjk;
	}

	public String getPfclx() {
		return pfclx;
	}

	public void setPfclx(String pfclx) {
		this.pfclx = pfclx;
	}

	public String getZhxl() {
		return zhxl;
	}

	public void setZhxl(String zhxl) {
		this.zhxl = zhxl;
	}

	public String getPlusrz() {
		return plusrz;
	}

	public void setPlusrz(String plusrz) {
		this.plusrz = plusrz;
	}

	public String getFsms() {
		return fsms;
	}

	public void setFsms(String fsms) {
		this.fsms = fsms;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
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

	public String getLocalPic() {
		return localPic;
	}

	public void setLocalPic(String localPic) {
		this.localPic = localPic;
	}

}
