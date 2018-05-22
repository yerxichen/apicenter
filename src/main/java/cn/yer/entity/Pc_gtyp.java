package cn.yer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author 作者 :陈曦
 * @date 创建时间:2017年4月19日 下午5:24:32
 * @version 1.0
 * @parameter
 * @since
 * @return
 */
@Entity
public class Pc_gtyp {
	@Id
	@GeneratedValue
	private int xxzjbh; // 信息主键编号
	private String xh; // 型号
	private String rl; // 容量
	private String hclx; // 缓存类型
	private String hcrl; // 缓存容量
	private String sclx; // 闪存类型
	private String zkxp; // 主控芯片
	private String kl; // 颗粒
	private String lxdqzdsd; // 连续读取最大速度
	private String lxxrzdsd; // 连续写入最大速度
	private String ypcc; // 硬盘尺寸
	private String jklx; // 接口类型
	private String pjwgzsj; // 平均无故障时间
	private String sksjdq; // 4K随机读取
	private String sksjxr; // 4K随机写入
	private String iopsdq; // IOPS读取
	private String iopsxr; // IOPS写入
	private String nvme; // NVMe
	private String trimgn; // TRIM功能
	private String wgcc; // 外观尺寸
	private String zl; // 重量
	private String gzwd; // 工作温度
	private String bx; // 保修
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

	public String getHclx() {
		return hclx;
	}

	public void setHclx(String hclx) {
		this.hclx = hclx;
	}

	public String getHcrl() {
		return hcrl;
	}

	public void setHcrl(String hcrl) {
		this.hcrl = hcrl;
	}

	public String getSclx() {
		return sclx;
	}

	public void setSclx(String sclx) {
		this.sclx = sclx;
	}

	public String getZkxp() {
		return zkxp;
	}

	public void setZkxp(String zkxp) {
		this.zkxp = zkxp;
	}

	public String getKl() {
		return kl;
	}

	public void setKl(String kl) {
		this.kl = kl;
	}

	public String getLxdqzdsd() {
		return lxdqzdsd;
	}

	public void setLxdqzdsd(String lxdqzdsd) {
		this.lxdqzdsd = lxdqzdsd;
	}

	public String getLxxrzdsd() {
		return lxxrzdsd;
	}

	public void setLxxrzdsd(String lxxrzdsd) {
		this.lxxrzdsd = lxxrzdsd;
	}

	public String getYpcc() {
		return ypcc;
	}

	public void setYpcc(String ypcc) {
		this.ypcc = ypcc;
	}

	public String getJklx() {
		return jklx;
	}

	public void setJklx(String jklx) {
		this.jklx = jklx;
	}

	public String getPjwgzsj() {
		return pjwgzsj;
	}

	public void setPjwgzsj(String pjwgzsj) {
		this.pjwgzsj = pjwgzsj;
	}

	public String getSksjdq() {
		return sksjdq;
	}

	public void setSksjdq(String sksjdq) {
		this.sksjdq = sksjdq;
	}

	public String getSksjxr() {
		return sksjxr;
	}

	public void setSksjxr(String sksjxr) {
		this.sksjxr = sksjxr;
	}

	public String getIopsdq() {
		return iopsdq;
	}

	public void setIopsdq(String iopsdq) {
		this.iopsdq = iopsdq;
	}

	public String getIopsxr() {
		return iopsxr;
	}

	public void setIopsxr(String iopsxr) {
		this.iopsxr = iopsxr;
	}

	public String getNvme() {
		return nvme;
	}

	public void setNvme(String nvme) {
		this.nvme = nvme;
	}

	public String getTrimgn() {
		return trimgn;
	}

	public void setTrimgn(String trimgn) {
		this.trimgn = trimgn;
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

	public String getGzwd() {
		return gzwd;
	}

	public void setGzwd(String gzwd) {
		this.gzwd = gzwd;
	}

	public String getBx() {
		return bx;
	}

	public void setBx(String bx) {
		this.bx = bx;
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
