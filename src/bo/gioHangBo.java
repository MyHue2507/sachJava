package bo;

import java.util.ArrayList;

import bean.gioHangBean;


public class gioHangBo {
	public ArrayList<gioHangBean> ds = new ArrayList<gioHangBean>();
	public void themSach(String maSach, String tenSach, String tacGia, long gia, long soLuong) {
		int kt = 0 ;
		for (gioHangBean gioHang : ds) {
			if(gioHang.getMaSach().equals(maSach)) {
				kt = 1 ;
				gioHang.setSoLuong(gioHang.getSoLuong() + soLuong);
				gioHang.setThanhTien();
			}
		}
		if(kt == 0) {
		gioHangBean gh = new  gioHangBean( maSach,tenSach, tacGia,gia,soLuong);
		ds.add(gh);
		}
	}
	public long tong() {
		long s = 0 ;
		for (gioHangBean gioHang : ds) {
			s += gioHang.getThanhTien();
		}
		return s ;
	}
}
