package cn.yer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author 作者 :陈曦
 * @date 创建时间:2017年4月19日 下午5:28:07
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Entity
public class Pc_sr {
	@Id
	@GeneratedValue
	private int xxzjbh; // 信息主键编号
	private String xh; // 型号
	private String sypj; // 适用配件
	private String srqzl; // 散热器种类
	@Column(length=1000)
	private String sypjfw; // 适用配件范围
	private String fscc; // 风扇尺寸
	private String fszc; // 风扇轴承
	private String fszs; // 风扇转速
	private String fl; // 风量
	private String zy; // 噪音
	private String srqzcc; // 散热器总尺寸
	private String zl; // 重量
	private String srpcz; // 散热片材质
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

	public String getSypj() {
		return sypj;
	}

	public void setSypj(String sypj) {
		this.sypj = sypj;
	}

	public String getSrqzl() {
		return srqzl;
	}

	public void setSrqzl(String srqzl) {
		this.srqzl = srqzl;
	}

	public String getSypjfw() {
		return sypjfw;
	}

	public void setSypjfw(String sypjfw) {
		this.sypjfw = sypjfw;
	}

	public String getFscc() {
		return fscc;
	}

	public void setFscc(String fscc) {
		this.fscc = fscc;
	}

	public String getFszc() {
		return fszc;
	}

	public void setFszc(String fszc) {
		this.fszc = fszc;
	}

	public String getFszs() {
		return fszs;
	}

	public void setFszs(String fszs) {
		this.fszs = fszs;
	}

	public String getFl() {
		return fl;
	}

	public void setFl(String fl) {
		this.fl = fl;
	}

	public String getZy() {
		return zy;
	}

	public void setZy(String zy) {
		this.zy = zy;
	}

	public String getSrqzcc() {
		return srqzcc;
	}

	public void setSrqzcc(String srqzcc) {
		this.srqzcc = srqzcc;
	}

	public String getZl() {
		return zl;
	}

	public void setZl(String zl) {
		this.zl = zl;
	}

	public String getSrpcz() {
		return srpcz;
	}

	public void setSrpcz(String srpcz) {
		this.srpcz = srpcz;
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
