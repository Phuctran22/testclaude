package BAITAP;
import java.util.Scanner;
public class hinhtru extends hinhtron {
    public float chieucao;

    public hinhtru(){
        this.ten="hinhtru";
        this.chieucao=0;

    }

    public void nhapchieucao(){
        nhapbankinh();
        System.out.println("chieu cao = ");
        Scanner scanner = new Scanner(System.in);
        chieucao=scanner.nextFloat();
    }

    public void tinhthetich(){
        thetich = dientich * chieucao;
    }
}
