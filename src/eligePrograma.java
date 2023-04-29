import java.util.Scanner;

public class eligePrograma {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          String[] usuario = new String[2];
          usuario[0] = "jazmin";
          usuario[1] = "carlos";

          String[] password = new String[2];
          password[0] = "1325423";
          password[1] = "1425581";

          System.out.print("Ingresa tu usuario: ");
          String u = scanner.nextLine();
          System.out.print("Ingresa tu contraseña");
          String p = scanner.nextLine();

          boolean valida = false;
          for (int i=0; i< usuario.length; i++){
               if (usuario[i].equalsIgnoreCase(u) && password[i].equalsIgnoreCase(p)){
                    valida = true;
               }
          }

          if (valida){
               System.out.println("Bienvenid@");
          }else {
               System.out.println("Requiere validar");
          }




     }
}
