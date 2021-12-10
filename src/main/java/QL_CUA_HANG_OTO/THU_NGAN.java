package QL_CUA_HANG_OTO;

public class THU_NGAN extends NHAN_VIEN {

    public THU_NGAN() {
    }

    public THU_NGAN(String MaSoNhanVien, String CapBac, float LuongTieuChuan, String HoTen, String GioiTinh, String NamSinh, String DiaChi, String SDT) {
        super(MaSoNhanVien, CapBac, LuongTieuChuan, HoTen, GioiTinh, NamSinh, DiaChi, SDT);
    }

    @Override
    public float TienLuong() {
        return (super.getLuongTieuChuan() + super.getLuongTieuChuan()*0.06f);
    }

    @Override
    public void Insert() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete_nv() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
