import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a,b,c;

        System.out.print("a sayısını giriniz: ");
        a= inp.nextInt();
        System.out.print("\nb sayısını giriniz: ");
        b=inp.nextInt();
        System.out.print("\nc sayısını giriniz: ");
        c=inp.nextInt();

        if ((a<b)&&(b<c)){
            System.out.print("a<b<c");
        } else if ((b<a)&&(a<c)) {
            System.out.print("b<a<c");
        } else if ((c<b)&&(b<a)) {
            System.out.print("c<b<a");
        } else if ((a<c)&&(c<b)) {
            System.out.print("a<c<b");
        } else if ((c<a)&&(a<b)) {
            System.out.print("c<a<b");
        }else {
            System.out.print("Girdiğiniz sayılardan ikisi eşit! Lütfen farklı sayılar giriniz");
        }


    }
}