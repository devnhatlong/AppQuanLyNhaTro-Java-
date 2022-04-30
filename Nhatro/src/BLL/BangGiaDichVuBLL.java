package BLL;

import DAL.BangGiaDichVuDAL;
import Entity.BangGiaDichVuEntity;
import java.sql.ResultSet;

public class BangGiaDichVuBLL 
{
     BangGiaDichVuDAL dichvu = new BangGiaDichVuDAL();
    
    public ResultSet LoadThongTinDichVu() throws Exception
    {
        return dichvu.LoadThongTinDichVu();
    }
    
    public int ThemDichVu(BangGiaDichVuEntity dichvuEntity) throws Exception
    {
        return dichvu.ThemDichVu(dichvuEntity);
    }
    
    public int SuaDichVu(BangGiaDichVuEntity dichvuEntity) throws Exception
    {
        return dichvu.SuaDichVu(dichvuEntity);
    }
    public ResultSet loadMaLoaiDichVu() throws Exception
    {
        return dichvu.loadMaLoaiDichVu();
    }
     public int XoaDichVu(BangGiaDichVuEntity dichvuEntity) throws Exception
    {
        return dichvu.XoaDichVu(dichvuEntity);
    }
}
