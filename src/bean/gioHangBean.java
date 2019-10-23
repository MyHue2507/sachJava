package bean;

public class gioHangBean {
	private String maSach ;
	private String tenSach ;
	private String tacGia ;
	private long gia;
	private long soLuong;
	private long thanhTien ;
	public gioHangBean(String maSach, String tenSach, String tacGia, long gia, long soLuong) {
		super();
		this.maSach = maSach;
		this.tenSach = tenSach;
		this.tacGia = tacGia;
		this.gia = gia;
		this.soLuong = soLuong;
		this.thanhTien = soLuong*gia ;
	}
	public gioHangBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public String getTacGia() {
		return tacGia;
	}
	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}
	public long getGia() {
		return gia;
	}
	public void setGia(long gia) {
		this.gia = gia;
	}
	public long getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(long soLuong) {
		this.soLuong = soLuong;
	}
	public long getThanhTien() {
		return thanhTien;
	}
	public void setThanhTien() {
		this.thanhTien = soLuong*gia;
	}
	
	
}
