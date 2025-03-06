package BAITAP;
import java.util.Scanner;
public class hinhhoc {
    public static final float PI = 3.14f;
    public float chuvi;
    public float dientich;
    public float thetich;
    public String ten;

       public hinhhoc(){
        this.ten="";
        this.dientich=0;
        this.chuvi=0;
        this.thetich=0;
       } 

       public void xuatTen(){
        System.out.println("tenhinh "+ ten);
       }
       
       public void inchuvi(){
        System.out.println("chu vi "+ chuvi);
       }

       public void indientich(){
        System.out.println("dien tich "+dientich);
       }

       public void inthetich(){
        System.out.println("the tich "+thetich);
       }

} 