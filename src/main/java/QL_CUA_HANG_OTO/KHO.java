package QL_CUA_HANG_OTO;

import java.util.Scanner;

public class KHO {
    private int SoLuong;
    private String LoaiXe;
    O_TO[] oto = new O_TO[100];

    public KHO() {
    }

    public KHO(int SoLuong, String LoaiXe) {
        this.SoLuong = SoLuong;
        this.LoaiXe = LoaiXe;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getLoaiXe() {
        return LoaiXe;
    }

    public void setLoaiXe(String LoaiXe) {
        this.LoaiXe = LoaiXe;
    }
    
    public void NHAP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi Ban Nhap So Luong: ");
        SoLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Moi Ban Nhap Loai Xe: ");
        LoaiXe = sc.nextLine();
    }
    
    public void XUAT() {
        System.out.println("So Luong Xe: " + SoLuong);
        System.out.println("Loai Xe: " + LoaiXe);
    }
    
    public void LoaiXe() {
        for(int i = 0; i < oto.length ; i++) {
            if(i < oto.length/2)
                oto[i] = new BON_BANH();
            else 
                oto[i] = new SAU_BANH();
        }
    }
}
