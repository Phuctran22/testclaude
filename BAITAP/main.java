package BAITAP;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        hinhtron hinhTron = new hinhtron();
        hinhTron.nhapbankinh();
        hinhTron.tinhchuvi();
        hinhTron.tinhdientich();
        hinhTron.xuatTen();
        hinhTron.inchuvi();
        hinhTron.indientich();

        hinhchunhat hinhChuNhat = new hinhchunhat();
        hinhChuNhat.nhapchieudai();
        hinhChuNhat.nhapchieurong();
        hinhChuNhat.tinhChuVi();
        hinhChuNhat.tinhdientich();
        hinhChuNhat.xuatTen();
        hinhChuNhat.inchuvi();
        hinhChuNhat.indientich();

        hinhtru hinhTru = new hinhtru();
        hinhTru.nhapbankinh();
        hinhTru.nhapchieucao();
        hinhTru.tinhchuvi();
        hinhTru.tinhdientich();
        hinhTru.tinhthetich();
        hinhTru.xuatTen();
        hinhTru.inchuvi();
        hinhTru.indientich();
        hinhTru.inthetich();

        hinhvuong hinhVuong = new hinhvuong();
        hinhVuong.nhapcanh();
        hinhVuong.tinhChuVi();
        hinhVuong.tinhdientich();
        hinhVuong.xuatTen();
        hinhVuong.inchuvi();
        hinhVuong.indientich();
    }
}