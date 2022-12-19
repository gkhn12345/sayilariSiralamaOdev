import java.util.Scanner;
public class sayilariSiralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("ilk sayıyı giriniz :");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz :");
        b= input.nextInt();
        System.out.println("Üçüncü sayıyı giriniz :");
        c=input.nextInt();
        if((a<b) && (b<c)){
            System.out.println("a<b<c");
        }else if ((b<a) && (a<c)){
            System.out.println("b<a<c");
        }else if ((c<b) && (b<a)){
            System.out.println("c<b<a");
        }else if ((a<b) && (c<b)){
            System.out.println("a<c<b");
        }
    }
}
