package BAITAP;
import java.util.Scanner;
public class hinhchunhat extends hinhhoc {
    public float dai;
    public float rong;

    public hinhchunhat (){
        this.ten="hinhchunhat";
        this.dai=0;
        this.rong=0;
    }

    public void nhapchieudai(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu dai =: ");
        dai= scanner.nextFloat();
    }
    public void nhapchieurong(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chieu rong =: ");
        rong= scanner.nextFloat();
    }

    public void tinhChuVi(){
        this.chuvi=(dai+rong)*2;
    }
    public void tinhdientich(){
        this.dientich=dai*rong;
    }
    
}
