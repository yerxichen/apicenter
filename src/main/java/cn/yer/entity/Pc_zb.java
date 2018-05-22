package cn.yer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author 作者 :陈曦
 * @date 创建时间:2017年4月19日 下午5:13:23
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Entity
public class Pc_zb {
	@Id
	@GeneratedValue
	private int xxzjbh; // 信息主键编号
	private String title; // 标题
	private String price; // 价格
	private String pic; // 图片地址
	private String xh; // 型号
	private String sylx; // 适用类型
	private String xpcs; // 芯片厂商
	private String xpzhbqxp; // 芯片组或北桥芯片
	private String cpucc; // CPU插槽
	private String zccpulx; // 支持CPU类型
	private String zbjg; // 主板架构
	private String zcnclx; // 支持内存类型
	private String zctdms; // 支持通道模式
	private String nccc; // 内存插槽
	private String ncpl; // 内存频率
	private String zdzcncrl; // 最大支持内存容量
	private String jcxkhx; // 集成显卡核心
	private String bzsk; // 板载声卡
	private String bzwk; // 板载网卡
	private String ypjk; // 硬盘接口
	private String satasjksl; // SATA III接口数量
	private String sataesl; // SATA-Express数量
	private String cpzllx; // 磁盘阵列类型
	private String cpzlms; // 磁盘阵列模式
	private String zcxkbz; // 支持显卡标准
	private String kzcc; // 扩展插槽
	private String pcicc; // PCI插槽
	private String kzjk; // 扩展接口
	private String usbjksl; // USB接口数量
	@Column(length=1000)
	private String qtcs; // 其它参数
	private String dyhl; // 电源回路
	private String dyjk; // 电源接口
	private String yxdj; // 游戏等级
	@Column(length=1000)
	private String tsgn; // 特色功能
	private String wxcc; // 外形尺寸
	@Column(name = "fj" ,length=1000)
	private String fj; // 附件
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

	public String getSylx() {
		return sylx;
	}

	public void setSylx(String sylx) {
		this.sylx = sylx;
	}

	public String getXpcs() {
		return xpcs;
	}

	public void setXpcs(String xpcs) {
		this.xpcs = xpcs;
	}

	public String getXpzhbqxp() {
		return xpzhbqxp;
	}

	public void setXpzhbqxp(String xpzhbqxp) {
		this.xpzhbqxp = xpzhbqxp;
	}

	public String getCpucc() {
		return cpucc;
	}

	public void setCpucc(String cpucc) {
		this.cpucc = cpucc;
	}

	public String getZccpulx() {
		return zccpulx;
	}

	public void setZccpulx(String zccpulx) {
		this.zccpulx = zccpulx;
	}

	public String getZbjg() {
		return zbjg;
	}

	public void setZbjg(String zbjg) {
		this.zbjg = zbjg;
	}

	public String getZcnclx() {
		return zcnclx;
	}

	public void setZcnclx(String zcnclx) {
		this.zcnclx = zcnclx;
	}

	public String getZctdms() {
		return zctdms;
	}

	public void setZctdms(String zctdms) {
		this.zctdms = zctdms;
	}

	public String getNccc() {
		return nccc;
	}

	public void setNccc(String nccc) {
		this.nccc = nccc;
	}

	public String getNcpl() {
		return ncpl;
	}

	public void setNcpl(String ncpl) {
		this.ncpl = ncpl;
	}

	public String getZdzcncrl() {
		return zdzcncrl;
	}

	public void setZdzcncrl(String zdzcncrl) {
		this.zdzcncrl = zdzcncrl;
	}

	public String getJcxkhx() {
		return jcxkhx;
	}

	public void setJcxkhx(String jcxkhx) {
		this.jcxkhx = jcxkhx;
	}

	public String getBzsk() {
		return bzsk;
	}

	public void setBzsk(String bzsk) {
		this.bzsk = bzsk;
	}

	public String getBzwk() {
		return bzwk;
	}

	public void setBzwk(String bzwk) {
		this.bzwk = bzwk;
	}

	public String getYpjk() {
		return ypjk;
	}

	public void setYpjk(String ypjk) {
		this.ypjk = ypjk;
	}

	public String getSatasjksl() {
		return satasjksl;
	}

	public void setSatasjksl(String satasjksl) {
		this.satasjksl = satasjksl;
	}

	public String getSataesl() {
		return sataesl;
	}

	public void setSataesl(String sataesl) {
		this.sataesl = sataesl;
	}

	public String getCpzllx() {
		return cpzllx;
	}

	public void setCpzllx(String cpzllx) {
		this.cpzllx = cpzllx;
	}

	public String getCpzlms() {
		return cpzlms;
	}

	public void setCpzlms(String cpzlms) {
		this.cpzlms = cpzlms;
	}

	public String getZcxkbz() {
		return zcxkbz;
	}

	public void setZcxkbz(String zcxkbz) {
		this.zcxkbz = zcxkbz;
	}

	public String getKzcc() {
		return kzcc;
	}

	public void setKzcc(String kzcc) {
		this.kzcc = kzcc;
	}

	public String getPcicc() {
		return pcicc;
	}

	public void setPcicc(String pcicc) {
		this.pcicc = pcicc;
	}

	public String getKzjk() {
		return kzjk;
	}

	public void setKzjk(String kzjk) {
		this.kzjk = kzjk;
	}

	public String getUsbjksl() {
		return usbjksl;
	}

	public void setUsbjksl(String usbjksl) {
		this.usbjksl = usbjksl;
	}

	public String getQtcs() {
		return qtcs;
	}

	public void setQtcs(String qtcs) {
		this.qtcs = qtcs;
	}

	public String getDyhl() {
		return dyhl;
	}

	public void setDyhl(String dyhl) {
		this.dyhl = dyhl;
	}

	public String getDyjk() {
		return dyjk;
	}

	public void setDyjk(String dyjk) {
		this.dyjk = dyjk;
	}

	public String getYxdj() {
		return yxdj;
	}

	public void setYxdj(String yxdj) {
		this.yxdj = yxdj;
	}

	public String getTsgn() {
		return tsgn;
	}

	public void setTsgn(String tsgn) {
		this.tsgn = tsgn;
	}

	public String getWxcc() {
		return wxcc;
	}

	public void setWxcc(String wxcc) {
		this.wxcc = wxcc;
	}

	public String getFj() {
		return fj;
	}

	public void setFj(String fj) {
		this.fj = fj;
	}

	public String getLocalPic() {
		return localPic;
	}

	public void setLocalPic(String localPic) {
		this.localPic = localPic;
	}

}
