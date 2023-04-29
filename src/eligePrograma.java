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
               }//ifn del if
          }// fin del for

          if (valida){
               System.out.println("Bienvenid@");
               System.out.println("Elige programa" + "\n" +
                       "1:Convierte numero a diferentes sistemas decimal" + "\n" +
                       "2:Obtener numero mayor de un arreglo" + "\n" +
                       "3:Usar calculadora" + "\n" +
                       "4:Obtener area de un circulo");
               System.out.print(": ");
               int programa = scanner.nextInt();

               switch (programa){
                    case 1:
                         System.out.print("Ingresa un numero entero:");
                         int numero = 0;

                         try {
                              numero = scanner.nextInt();
                         }catch (Exception e){
                              main(args);
                              System.exit(0);
                         }//fin try

                         String resultadoBinario = "El numero Binario de: " + numero + " es: " + Integer.toBinaryString(numero);
                         String resultadoOctal = "El numero Octal de: " + numero + " es: " + Integer.toOctalString(numero);
                         String resultadoHex = "El numero Hexadecimal de: " + numero + " es: " + Integer.toHexString(numero);

                         String mensaje = resultadoBinario + "\n" + resultadoOctal + "\n" + resultadoHex;
                         System.out.println(mensaje);

                         break;
               }
          }else { //fin de if valida
               System.out.println("Requiere validar");
          }// fin del else




     }// fin del main
}// fin de la clase
