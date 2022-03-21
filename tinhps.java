package tamgiac;

import java.util.Scanner;

public class tinhps {
    double a,b,c,p,s,p1;

    public tinhps(){
        System.out.println("Nhập 3 cạnh");
        this.inputabc();
    }
    void inputabc(){
        Scanner abc = new Scanner(System.in);
        this.a = abc.nextFloat();
        this.b = abc.nextFloat();
        this.c = abc.nextFloat();
    }
    void tinhp(){
        p=a+b+c;
        p1=p/2;
        System.out.println("chu vi tam giác là" + p);
    }

    void tinhs(){
        s = Math.sqrt(p1*(p1-a)*(p1-b)*(p1-c));
        System.out.println("Diện tích tam giác là" + s);
    }
}
