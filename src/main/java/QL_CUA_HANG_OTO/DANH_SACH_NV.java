/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QL_CUA_HANG_OTO;

import java.util.Scanner;


public class DANH_SACH_NV extends NHAN_VIEN{
      static NHAN_VIEN[] nv = new NHAN_VIEN[100];
     private static int t=0;
    @Override
    public void Insert(){
           Scanner sc=new Scanner(System.in);
      //insert
        
      int opt;
        do {            
            System.out.println("Chon loai nhan vien :");
            System.out.println("1.QUAN LY");
            System.out.println("2.THU NGAN");
            System.out.println("3.BAN HANG");
            System.out.println("4.THOAT");
            opt=Integer.parseInt(sc.nextLine());
             System.out.println("Nhap thong tin nhan vien");
            switch(opt){
                case 1:
                    nv[t]=new QUAN_LI();
                     nv[t++].NHAP();
                    break;
                case 2:
                    nv[t]=new THU_NGAN();
                    nv[t++].NHAP();
                    break;
                case 3:
                    nv[t]=new BAN_HANG();
                    nv[t++].NHAP();
                    break;
            default: System.out.println("Chon Lua Cua Ban Nam Ngoai Pham Vi Cho Phep");break;
                
            }
        } while (opt!=4);
        
       System.out.println("---------------Danh Sach Nhan Vien--------------");
        for(int a=0;a<t;a++){
           
            nv[a].XUAT();
        }
    }
    
    @Override
    public void Update(){
        
        Scanner sc=new Scanner(System.in);
       int a;
        do {
            System.out.println("Moi Nhap Ma Nhan Vien Muon Sua Thong Tin: ");
            a = Integer.parseInt(sc.nextLine());
            if(a < 0)
                System.out.println("Ban Da Nhap Sai Ma Nhan Vien, Vui Long Nhap Lai!");
        } while(a <0);
        
        for(int o = 0; o < t; o++) {
            if(o == a) {
                if(nv[o] == null) 
                    System.out.println("Ma Nhan Vien Khong Ton Tai, Xin Vui Long Nhap Lai!");
        
                System.out.println("Thong Tin Nhan Vien Hien Tai: ");
                 nv[o].XUAT();
            }
        }
        
        for(int o = 0; o < t; o++) {
            if(o == a) {
                System.out.println("");
                System.out.println("Nhap Ho Ten Nhan Vien : ");
                String name = sc.nextLine();
                System.out.println("Nhap Gioi Tinh : ");
                String sex = sc.nextLine();
                System.out.println("Nhap Nam Sinh: ");
                String year = sc.nextLine();
                System.out.println("Nhap Dia Chi: ");
                String address = sc.nextLine();
                System.out.println("Nhap So Dien Thoai : ");
                String phone = sc.nextLine();
               System.out.println("Nhap ma so nhan vien :");
                String manv= sc.nextLine();
                System.out.println("Nhap cap bac :");
                String capbac= sc.nextLine();
                System.out.println("Nhap luong tieu chuan : ");
                float luong=sc.nextFloat();
                
                
                nv[o].setHoTen(name);
                nv[o].setGioiTinh(sex);
                nv[o].setNamSinh(year);
                nv[o].setDiaChi(address);
                nv[o].setSDT(phone);
                nv[o].setMaSoNhanVien(manv);
                nv[o].setCapBac(capbac);
                nv[o].setLuongTieuChuan(luong);
            }
        } 
        System.out.println("Thong Tin Nhan Vien Sau Khi Sua: ");
                 for(int c=0;c<t;c++){
                     nv[c].XUAT();
                     System.out.println("--------------------------");
                 }
    }
@Override
public void delete_nv(){
    int x, o;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Moi Nhap Ma Nhan Vien Muon Xoa: ");
            x = Integer.parseInt(sc.nextLine());
            if(x < 0 && x < nv.length)
                System.out.println("Ban Da Nhap Sai Ma Nhan Vien, Vui Long Nhap Lai!");
        } while(x < 0 && x < nv.length);
        
        for (o = x - 1; o < t; o++) {
            nv[o] = nv[o+1];
        }
        t--;
        
      
        System.out.println("Danh Sach Nhan vien sau khi xoa: ");
        for(o = 0; o < t ; o++) {
            System.out.println("" + (o+1) + ": ");
            nv[o].XUAT();
            System.out.println("");
        }
}
    @Override
    public float TienLuong() {
       return TienLuong();
    }
    public static void main(String[] args) {
        DANH_SACH_NV aDanh_sach_nv=new DANH_SACH_NV();
        aDanh_sach_nv.Insert();
        
    }
}
