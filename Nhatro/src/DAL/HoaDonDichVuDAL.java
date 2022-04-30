package DAL;
import Entity.HoaDonDichVuEntity;
import Entity.ThongKeEntity;
import java.sql.ResultSet;


public class HoaDonDichVuDAL 
{
    ResultSet rs = null;
    DBAccess data = new DBAccess();
    
    //load dữ liệu dịch vụ vào table
    public ResultSet loadDichVu() throws Exception
    {        
        String sql = "select DichVu from DICH_VU";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Load dịch vụ theo mã khi click vào từng hàng trên table sẽ xuất ra tương ứng vào các textfiled
    public ResultSet loadDichVuTheoMa(HoaDonDichVuEntity hoadondichvu) throws Exception
    {        
        String sql = "select MaDichVu, DichVu,PARSENAME(convert(varchar,convert(money,GiaDichVu),1),2 ) as GiaDichVu, QuyCach from DICH_VU where DichVu =  N'"+hoadondichvu.getDichvu()+"'";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Lấy danh sách các phòng đang thuê và chưa có hóa đơn của ngày (tháng) hiện tại
    public ResultSet loadPhongChuaCoHoaDon(HoaDonDichVuEntity hoadondichvu) throws Exception
    {        
        String sql = "select maphong from PHONG_TRO where MaPhong in(select MaPhong from CT_KHACH_THUE) and MaPhong not in (select MaPhong from HOA_DON where right(convert(varchar(10),  NgayLap,103),7) = right(convert(varchar(10),  '"+hoadondichvu.getNgaylaphoadon()+"',103),7))";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Lấy danh sách các phòng đang thuê và ĐÃ có hóa đơn của ngày (tháng) hiện tại()
    public ResultSet loadPhongDaCoHoaDon(HoaDonDichVuEntity hoadondichvu) throws Exception
    {        
        String sql = "select maphong from PHONG_TRO where MaPhong in(	select MaPhong from CT_KHACH_THUE) and MaPhong in (select MaPhong from HOA_DON where right(convert(varchar(10),  NgayLap,103),7) = right(convert(varchar(10), '"+hoadondichvu.getNgaylaphoadon()+"',103),7))";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Lấy danh sách chi tiết dịch vụ của phòng đã sử dụng trong tháng khi click vào phóng đã có hóa đơn
    public ResultSet loadCT_dichvu(HoaDonDichVuEntity hoadondichvu) throws Exception
    {        
        String sql = "select HOA_DON.MaHoaDon, right(convert(varchar(10),  NgayLap,103),7) as ngaylap, MaPhong, CT_DICHVU.MaDichVu, PARSENAME(convert(varchar,convert(money,DonViSuDung*GiaDichVu),1),2 ) as chiphi from HOA_DON, CT_DICHVU, DICH_VU where HOA_DON.MaHoaDon = CT_DICHVU.MaHoaDon and DICH_VU.MaDichVu = CT_DICHVU.MaDichVu and right(convert(varchar(10),  NgayLap,103),7) = right(convert(varchar(10),  '"+hoadondichvu.getNgaylaphoadon()+"',103),7) and MaPhong = '"+hoadondichvu.getMaphong()+"'";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Thêm mới 1 hóa đơn
    public int ThemHoaDon(HoaDonDichVuEntity hoadondichvu) 
    {
        int thamso = 2;
        Object[] giatri = new Object[thamso];
        giatri[0] = hoadondichvu.getMaphong();
        giatri[1] = hoadondichvu.getNgaylaphoadon();
        
        return data.Update("{call ThemHoaDon(?,?)}", giatri, thamso);
    }
    
    //Thêm mới chi tiết sử dụng dịch vụ
    public int ThemChiTietDichVu(HoaDonDichVuEntity hoadondichvu) 
    {
        int thamso = 2;
        Object[] giatri = new Object[thamso];
        giatri[0] = hoadondichvu.getMadichvu();
        giatri[1] = hoadondichvu.getDonvisudung();
        
        return data.Update("{call ThemChiTietDichVu(?,?)}", giatri, thamso);
    }
    
    //Xóa hóa đơn theo mã
    public int XoaHoaDon(HoaDonDichVuEntity hoadondichvu) 
    {
        int thamso = 1;
        Object[] giatri = new Object[thamso];
        giatri[0] = hoadondichvu.getMahoadon();
        
        return data.Update("{call XoaHoaDon(?)}", giatri, thamso);
    }
    
    public ResultSet TongTienTheoThangCuaPhong(ThongKeEntity thongke) throws Exception
    {        
        String sql = "select PARSENAME(convert(varchar,convert(money,((sum(GiaDichVu*DonViSuDung))+GIA_THUE.GiaTien)),1),2 ) as giatien from CT_DICHVU, DICH_VU, HOA_DON, PHONG_TRO, GIA_THUE where CT_DICHVU.MaDichVu = DICH_VU.MaDichVu and CT_DICHVU.MaHoaDon = HOA_DON.MaHoaDon and GIA_THUE.SoNguoi = PHONG_TRO.SoNguoi and PHONG_TRO.MaPhong = HOA_DON.MaPhong and PHONG_TRO.MaPhong = '"+thongke.getMaphong()+"' and RIGHT(CONVERT(varchar(10), NgayLap, 103),7) = RIGHT(CONVERT(varchar(10), '"+thongke.getNgaylap()+"', 103),7) group by HOA_DON.MaHoaDon, ngaylap, HOA_DON.MaPhong, PHONG_TRO.SoNguoi, GIA_THUE.GiaTien";
        rs = data.executeQuery(sql);
        return rs;
    }
    public ResultSet loadTienPhongTheoMa(ThongKeEntity thongke) throws Exception
    {        
        String sql = "select MaPhong, PARSENAME(convert(varchar,convert(money,GiaTien),1),2 ) as giatien from GIA_THUE, PHONG_TRO";
        rs = data.executeQuery(sql);
        return rs;
    }
    
    //Load tiền dịch vụ theo mã phòng
    public ResultSet loadTienDichVuTheoMa(ThongKeEntity thongke) throws Exception
    {        
        String sql = "select MaPhong, HOA_DON.MaHoaDon, DichVu,  PARSENAME(convert(varchar,convert(money,DonViSuDung*GiaDichVu),1),2 ) as giatien from CT_DICHVU, DICH_VU, HOA_DON where CT_DICHVU.MaDichVu = DICH_VU.MaDichVu and HOA_DON.MaHoaDon = CT_DICHVU.MaHoaDon and MaPhong = '"+thongke.getMaphong()+"' and RIGHT(CONVERT(varchar(10), NgayLap, 103),7) =  RIGHT(CONVERT(varchar(10),  '"+thongke.getNgaylap()+"', 103),7)";
        rs = data.executeQuery(sql);
        return rs;
    }
    public ResultSet loadHDtheoThang(ThongKeEntity thongke) throws Exception
    {        
        String sql = "select MaHoaDon, CONVERT(varchar(10), NgayLap, 103) as ngaylap, MaPhong from HOA_DON where RIGHT(CONVERT(varchar(10), ngaylap, 103),7) = RIGHT(CONVERT(varchar(10), '"+thongke.getNgaylap()+"', 103),7)";
        rs = data.executeQuery(sql);
        return rs;
    }
}
