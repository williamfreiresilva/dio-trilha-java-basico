import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
   public AboutMe() {
   }

   public static void main(String[] var0) {
      try {
         Scanner var1 = (new Scanner(System.in)).useLocale(Locale.US);
         System.out.println("Digite seu nome: ");
         String var2 = var1.next();
         var2 = var2.toUpperCase();
         System.out.println("Digite seu sobrenome: ");
         String var3 = var1.next();
         var3 = var3.toUpperCase();
         System.out.println("Digite sua idade: ");
         int var4 = var1.nextInt();
         System.out.println("Digite sua altura: ");
         double var5 = var1.nextDouble();
         String var7 = String.format("Ol\u00e1, me chamo %s %s\nTenho %d anos\nMinha altura \u00e9 %.2fcm", var2, var3, var4, var5);
         var1.close();
         System.out.println(var7);
      } catch (InputMismatchException var8) {
         System.err.println("Os campos idade e altura precisam ser num\u00e9ricos");
      }

   }
}