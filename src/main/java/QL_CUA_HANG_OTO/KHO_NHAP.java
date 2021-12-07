package QL_CUA_HANG_OTO;

import java.util.Scanner;

public class KHO_NHAP extends KHO{
    private String MaNhapHang;
    private String NgayNhap;

    public KHO_NHAP() {
    }

    public KHO_NHAP(String MaNhapHang, String NgayNhap, int SoLuong, String LoaiXe) {
        super(SoLuong, LoaiXe);
        this.MaNhapHang = MaNhapHang;
        this.NgayNhap = NgayNhap;
    }

    public String getMaNhapHang() {
        return MaNhapHang;
    }

    public void setMaNhapHang(String MaNhapHang) {
        this.MaNhapHang = MaNhapHang;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    @Override
    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        super.NHAP(); 
        System.out.println("Moi Ban Nhap Ma Nhap Hang: ");
        MaNhapHang = sc.nextLine();
        System.out.println("Moi Ban Nhap Ngay Nhap: ");
        NgayNhap = sc.nextLine();
    }
    
    @Override
    public void XUAT() {
        super.XUAT();
        System.out.println("Ma Nhap Hnag: " + MaNhapHang);
        System.out.println("Ngay Nhap: " + NgayNhap);
    }

}
