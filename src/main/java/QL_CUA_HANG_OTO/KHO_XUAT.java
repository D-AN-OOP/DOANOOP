package QL_CUA_HANG_OTO;

import java.util.Scanner;

public class KHO_XUAT extends KHO{
    private String MaXuatHang;
    private String NgayXuat;

    public KHO_XUAT() {
    }

    public KHO_XUAT(String MaXuatHang, String NgayXuat, int SoLuong, String LoaiXe) {
        super(SoLuong, LoaiXe);
        this.MaXuatHang = MaXuatHang;
        this.NgayXuat = NgayXuat;
    }

    public String getMaXuatHang() {
        return MaXuatHang;
    }

    public void setMaXuatHang(String MaXuatHang) {
        this.MaXuatHang = MaXuatHang;
    }

    public String getNgayXuat() {
        return NgayXuat;
    }

    public void setNgayXuat(String NgayXuat) {
        this.NgayXuat = NgayXuat;
    }

    @Override
    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        super.NHAP(); 
        System.out.println("Moi Ban Nhap Ma Xuat Hang: ");
        MaXuatHang = sc.nextLine();
        System.out.println("Moi Ban Nhap Ngay Xuat Hang: ");
        NgayXuat = sc.nextLine();
    }
    
    @Override
    public void XUAT() {
        super.XUAT();
        System.out.println("Ma Xuat Hang: " + MaXuatHang);
        System.out.println("Ngay Xuat Hang: " + NgayXuat);
    }

    
    
}
