package cn.yer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author 作者 :陈曦
 * @date 创建时间:2017年4月19日 下午5:32:22
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Entity
public class Pc_yp {
	@Id
	@GeneratedValue
	private int xxzjbh; // 信息主键编号
	private String xh; // 型号
	private String rl; // 容量
	private String zs; // 转速
	private String hcrl; // 缓存容量
	private String ptcc; // 盘体尺寸
	private String jkbz; // 接口标准
	private String iopsz; // IOPS值(测试数据)
	private String csbz; // 传输标准
	private String ddrl; // 单碟容量
	@Column(length=1000)
	private String qtxn; // 其它性能
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

	public String getRl() {
		return rl;
	}

	public void setRl(String rl) {
		this.rl = rl;
	}

	public String getZs() {
		return zs;
	}

	public void setZs(String zs) {
		this.zs = zs;
	}

	public String getHcrl() {
		return hcrl;
	}

	public void setHcrl(String hcrl) {
		this.hcrl = hcrl;
	}

	public String getPtcc() {
		return ptcc;
	}

	public void setPtcc(String ptcc) {
		this.ptcc = ptcc;
	}

	public String getJkbz() {
		return jkbz;
	}

	public void setJkbz(String jkbz) {
		this.jkbz = jkbz;
	}

	public String getIopsz() {
		return iopsz;
	}

	public void setIopsz(String iopsz) {
		this.iopsz = iopsz;
	}

	public String getCsbz() {
		return csbz;
	}

	public void setCsbz(String csbz) {
		this.csbz = csbz;
	}

	public String getDdrl() {
		return ddrl;
	}

	public void setDdrl(String ddrl) {
		this.ddrl = ddrl;
	}

	public String getQtxn() {
		return qtxn;
	}

	public void setQtxn(String qtxn) {
		this.qtxn = qtxn;
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
