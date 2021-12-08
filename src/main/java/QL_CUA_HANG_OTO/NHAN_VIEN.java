package QL_CUA_HANG_OTO;

import static QL_CUA_HANG_OTO.CHI_TIET_HOA_DON.hd;
import static QL_CUA_HANG_OTO.CHI_TIET_HOA_DON.oto;
import java.util.Scanner;

public abstract class NHAN_VIEN extends CON_NGUOI{
    private String MaSoNhanVien;
    private String CapBac;
    private float LuongTieuChuan;
     static NHAN_VIEN[] nv = new NHAN_VIEN[100];
     int n;

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
//    public void Insert_nv(){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("---------------------nhap danh sach nhan vien------------------");
//        System.out.println("nhap so luong nhan vien :");
//         n = Integer.parseInt(sc.nextLine());
//        
//        for(int i=0;i<n;i++){
//            
//            nv[i].NHAP();
//        }
//        
//        for(int a=0;a<n;a++){
//            nv[a].XUAT();
//        }
//    }
   
//    public void update_nv(){
//         Scanner sc = new Scanner(System.in);
//        int id;
//        do {
//            System.out.println("Moi Nhap id nhan vien muon sua thong tin: ");
//            id = Integer.parseInt(sc.nextLine());
//            if(id < 0)
//                System.out.println("Ban Da Nhap Sai id nhan vien, Vui Long Nhap Lai!");
//        } while(id <0);
//        
//        for(int o = 0; o < n; o++) {
//            if(o == id) {
//                if(nv[o] == null) 
//                    System.out.println("Ma Nhan Vien Khong Ton Tai, Xin Vui Long Nhap Lai!");
//        
//                System.out.println("Thong Tin Nhan vien Hien Tai: ");
//                nv[o].XUAT();
//            }
//        }
//        
//        for(int o = 0; o < n; o++) {
//            if(o == id) {
//                System.out.println("");
//                System.out.println("Nhap ho Ten: ");
//                String name = sc.nextLine();
//                System.out.println("Nhap gioi tinh: ");
//                String sex = sc.nextLine();
//                System.out.println("Nhap nam sinh: ");
//                int nam = Integer.parseInt(sc.nextLine());
//                System.out.println("Nhap dia chi: ");
//                String address = sc.nextLine();
//                System.out.println("Nhap so dien thoai: ");
//                String phone = sc.nextLine();
//                System.out.println("Nhap ma so nhan vien :");
//                String manv= sc.nextLine();
//                System.out.println("Nhap cap bac :");
//                String capbac= sc.nextLine();
//                System.out.println("Nhap luong tieu chuan : ");
//                float luong=sc.nextFloat();
//                
//                
//                nv[o].setHoTen(name);
//                nv[o].setGioiTinh(sex);
//                nv[o].setNamSinh(name);
//                nv[o].setDiaChi(address);
//                nv[o].setSDT(sex);
//                nv[o].setMaSoNhanVien(manv);
//                nv[o].setCapBac(capbac);
//                nv[o].setLuongTieuChuan(luong);
//            }
//        }
//        
//
//    }
    public void delete_nv(){
       
    }
    
    public abstract float TienLuong();
    
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      //insert
      int opt = 0,t=0;
        do {            
            System.out.println("Chon loai nhan vien :");
            System.out.println("1.QUAN LY");
            System.out.println("2.THU NGAN");
            System.out.println("3.BAN HANG");
        } while (opt<=3);
        System.out.println("Nhap thong tin nhan vien");
        if(opt ==1){
            nv[t]=new QUAN_LI();
            nv[t++].NHAP();
        }
        if(opt==2){
            nv[t]=new THU_NGAN();
            nv[t++].NHAP();
        }
        if(opt==3){
            nv[t]=new BAN_HANG();
            nv[t++].NHAP();
        }
              
        

    }
}
