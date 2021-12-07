package QL_CUA_HANG_OTO;

import java.util.Scanner;

public class CON_NGUOI {
    private String HoTen;
    private String GioiTinh;
    private String NamSinh;
    private String DiaChi;
    private String SDT;

    public CON_NGUOI() {
    }

    public CON_NGUOI(String HoTen, String GioiTinh, String NamSinh, String DiaChi, String SDT) {
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.NamSinh = NamSinh;
        this.DiaChi = DiaChi;
        this.SDT = SDT;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(String NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
    
    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi Ban Nhap Ho Ten: ");
        HoTen = sc.nextLine();
        System.out.println("Moi Ban Nhap Gioi Tinh: ");
        GioiTinh = sc.nextLine();
        System.out.println("Moi Ban Nhap Nam Sinh: ");
        NamSinh = sc.nextLine();
        System.out.println("Moi Ban Nhap Dia Chi: ");
        DiaChi = sc.nextLine();
        System.out.println("Moi Ban Nhap So Dien Thoai: ");
        SDT = sc.nextLine();
    }
    
    public void XUAT() {
        System.out.println("Ho Ten: " + HoTen);        
        System.out.println("Gioi Tinh: " + GioiTinh);
        System.out.println("Nam Sinh: " + NamSinh);
        System.out.println("Dia Chi: " + DiaChi);
        System.out.println("So Dien Thoai: " + SDT);
    }
}
