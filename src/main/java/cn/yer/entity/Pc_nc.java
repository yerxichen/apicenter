package cn.yer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author 作者 :陈曦
 * @date 创建时间:2017年4月19日 下午5:26:47
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Entity
public class Pc_nc {
	@Id
	@GeneratedValue
	private int xxzjbh; // 信息主键编号
	private String xh; // 型号
	private String sylx; // 适用类型
	private String nclx; // 内存类型
	private String nctd; // 内存特点
	private String nczp; // 内存主频
	private String nczrl; // 内存总容量
	private String ncrlms; // 内存容量描述
	private String cjsm; // 插脚数目
	private String ycms; // 延迟描述
	private String ncdy; // 内存电压
	@Column(length=1000)
	private String qtxn; // 其他性能
	private String bz; // 包装
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

	public String getNclx() {
		return nclx;
	}

	public void setNclx(String nclx) {
		this.nclx = nclx;
	}

	public String getNctd() {
		return nctd;
	}

	public void setNctd(String nctd) {
		this.nctd = nctd;
	}

	public String getNczp() {
		return nczp;
	}

	public void setNczp(String nczp) {
		this.nczp = nczp;
	}

	public String getNczrl() {
		return nczrl;
	}

	public void setNczrl(String nczrl) {
		this.nczrl = nczrl;
	}

	public String getNcrlms() {
		return ncrlms;
	}

	public void setNcrlms(String ncrlms) {
		this.ncrlms = ncrlms;
	}

	public String getCjsm() {
		return cjsm;
	}

	public void setCjsm(String cjsm) {
		this.cjsm = cjsm;
	}

	public String getYcms() {
		return ycms;
	}

	public void setYcms(String ycms) {
		this.ycms = ycms;
	}

	public String getNcdy() {
		return ncdy;
	}

	public void setNcdy(String ncdy) {
		this.ncdy = ncdy;
	}

	public String getQtxn() {
		return qtxn;
	}

	public void setQtxn(String qtxn) {
		this.qtxn = qtxn;
	}

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
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
