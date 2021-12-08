package QL_CUA_HANG_OTO;

import java.util.Scanner;

public abstract class NHAN_VIEN extends CON_NGUOI{
    private String MaSoNhanVien;
    private String CapBac;
    private float LuongTieuChuan;
     static NHAN_VIEN[] nv = new NHAN_VIEN[100];

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
    public void Insert_nv(){
        Scanner sc=new Scanner(System.in);
        System.out.println("---------------------nhap danh sach nhan vien------------------");
        System.out.println("nhap so luong nhan vien :");
        int n = Integer.parseInt(sc.nextLine());
        
        for(int i=0;i<n;i++){
            
            nv[i].NHAP();
        }
        
        for(int a=0;a<n;a++){
            nv[a].XUAT();
        }
    }
   
    public void update_nv(){
        
    }
    public void delete_nv(){
        
    }
    
    public abstract float TienLuong();
    
    public static void main(String[] args) {
        NHAN_VIEN[] nv=new NHAN_VIEN[100];
        nv[0]=new BAN_HANG();
        nv[1]=new QUAN_LI();
        nv[2]=new THU_NGAN();
        nv[0].Insert_nv();
        

    }
}
