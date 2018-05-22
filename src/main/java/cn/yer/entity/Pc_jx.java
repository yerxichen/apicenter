package cn.yer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author 作者 :陈曦
 * @date 创建时间:2017年4月19日 下午5:25:41
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Entity
public class Pc_jx {
	@Id
	@GeneratedValue
	private int xxzjbh; // 信息主键编号
	private String xh; // 型号
	private String sylx; // 适用类型
	private String jxstyle; // 机箱样式
	private String jxlx; // 机箱类型
	private String jrzb; // 兼容主板
	private String jxcw; // 机箱仓位
	private String kzcc; // 扩展插槽
	private String jxcz; // 机箱材质
	private String bchd; // 板材厚度
	private String jxys; // 机箱颜色
	private String bpdy; // 标配电源
	private String qzjkms; // 前置接口描述
	private String jxfs; // 机箱风扇
	private String nbsrms; // 内部散热描述
	private String zcsl; // 支持水冷
	private String xkxc; // 显卡限长
	private String srqxg; // 散热器限高
	private String dywz; // 电源位置
	private String jxcc; // 机箱尺寸
	private String zl; // 重量
	private String fj; // 附件
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

	public String getSylx() {
		return sylx;
	}

	public void setSylx(String sylx) {
		this.sylx = sylx;
	}

	public String getJxstyle() {
		return jxstyle;
	}

	public void setJxstyle(String jxstyle) {
		this.jxstyle = jxstyle;
	}

	public String getJxlx() {
		return jxlx;
	}

	public void setJxlx(String jxlx) {
		this.jxlx = jxlx;
	}

	public String getJrzb() {
		return jrzb;
	}

	public void setJrzb(String jrzb) {
		this.jrzb = jrzb;
	}

	public String getJxcw() {
		return jxcw;
	}

	public void setJxcw(String jxcw) {
		this.jxcw = jxcw;
	}

	public String getKzcc() {
		return kzcc;
	}

	public void setKzcc(String kzcc) {
		this.kzcc = kzcc;
	}

	public String getJxcz() {
		return jxcz;
	}

	public void setJxcz(String jxcz) {
		this.jxcz = jxcz;
	}

	public String getBchd() {
		return bchd;
	}

	public void setBchd(String bchd) {
		this.bchd = bchd;
	}

	public String getJxys() {
		return jxys;
	}

	public void setJxys(String jxys) {
		this.jxys = jxys;
	}

	public String getBpdy() {
		return bpdy;
	}

	public void setBpdy(String bpdy) {
		this.bpdy = bpdy;
	}

	public String getQzjkms() {
		return qzjkms;
	}

	public void setQzjkms(String qzjkms) {
		this.qzjkms = qzjkms;
	}

	public String getJxfs() {
		return jxfs;
	}

	public void setJxfs(String jxfs) {
		this.jxfs = jxfs;
	}

	public String getNbsrms() {
		return nbsrms;
	}

	public void setNbsrms(String nbsrms) {
		this.nbsrms = nbsrms;
	}

	public String getZcsl() {
		return zcsl;
	}

	public void setZcsl(String zcsl) {
		this.zcsl = zcsl;
	}

	public String getXkxc() {
		return xkxc;
	}

	public void setXkxc(String xkxc) {
		this.xkxc = xkxc;
	}

	public String getSrqxg() {
		return srqxg;
	}

	public void setSrqxg(String srqxg) {
		this.srqxg = srqxg;
	}

	public String getDywz() {
		return dywz;
	}

	public void setDywz(String dywz) {
		this.dywz = dywz;
	}

	public String getJxcc() {
		return jxcc;
	}

	public void setJxcc(String jxcc) {
		this.jxcc = jxcc;
	}

	public String getZl() {
		return zl;
	}

	public void setZl(String zl) {
		this.zl = zl;
	}

	public String getFj() {
		return fj;
	}

	public void setFj(String fj) {
		this.fj = fj;
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
