package QL_CUA_HANG_OTO;

import java.util.Scanner;

public abstract class NHAN_VIEN extends CON_NGUOI{
    private String MaSoNhanVien;
    private String CapBac;
    private float LuongTieuChuan;

    public NHAN_VIEN() {
       
    }

    public NHAN_VIEN(String MaSoNhanVien, String CapBac, float LuongTieuChuan, String HoTen, String GioiTinh, String NamSinh, String DiaChi, String SDT) {
        super(HoTen, GioiTinh, NamSinh, DiaChi, SDT);
        this.MaSoNhanVien = MaSoNhanVien;
        this.CapBac = CapBac;
        this.LuongTieuChuan = LuongTieuChuan;
    }

    public String getMaSoNhanVien() {
        return MaSoNhanVien;
    }

    public void setMaSoNhanVien(String MaSoNhanVien) {
        this.MaSoNhanVien = MaSoNhanVien;
    }

    public String getCapBac() {
        return CapBac;
    }

    public void setCapBac(String CapBac) {
        this.CapBac = CapBac;
    }

    public float getLuongTieuChuan() {
        return LuongTieuChuan;
    }

    public void setLuongTieuChuan(float LuongTieuChuan) {
        this.LuongTieuChuan = LuongTieuChuan;
    }

    @Override
    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        super.NHAP(); 
        System.out.println("Moi Ban Nhap MSNV: ");
        MaSoNhanVien = sc.nextLine();
        System.out.println("Moi Ban Nhap Cap Bac: ");
        CapBac = sc.nextLine();
        System.out.println("Moi Ban Nhap Luong Tieu Chuan: ");
        LuongTieuChuan = Float.parseFloat(sc.nextLine());
    }

    @Override
    public void XUAT() {
        super.XUAT(); 
        System.out.println("MSNV: " + MaSoNhanVien);        
        System.out.println("Cap Bac: " + CapBac);
    }
    public void CreateDSNV(){
        Scanner sc=new Scanner(System.in);
        System.out.println("---------------------nhap danh sach nhan vien------------------");
        System.out.println("nhap so luong nhan vien :");
        int n = Integer.parseInt(sc.nextLine());
        String arr_DSNV[]= new String[n];
       
        for(int i=0;i<n;i++){
            
            arr_DSNV[i].NHAP();
        }
    }
    
    public abstract float TienLuong();
}
