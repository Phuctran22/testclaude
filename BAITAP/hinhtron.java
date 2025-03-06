package BAITAP;
import java.util.Scanner;
public class hinhtron extends hinhhoc {
    public float bankinh;

    public hinhtron(){
        this.ten="hinhtron";
        this.bankinh=0;
    }
        public void nhapbankinh(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhap ban kinh =: ");
            bankinh= scanner.nextFloat();
        }

        public void tinhchuvi(){
            this.chuvi=2*PI*bankinh;
        }

        public void tinhdientich(){
            this.dientich= PI*bankinh*bankinh;
        }
    }


