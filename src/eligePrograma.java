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

                    case 2:
                         int[] numeros;
                         System.out.println("Elige la cantidad de elementos del arreglo");
                         int cantidad = scanner.nextInt();
                         numeros = new int[cantidad];

                         for (int i=0; i< numeros.length; i++){
                              System.out.println("Ingresa valor para indice:" + i);
                              System.out.print(": ");
                              numeros[i] = scanner.nextInt();
                         }
                         // mostrar los elementos del arreglo
                         System.out.println("valores contenidos en el arreglo");
                         for (int i=0; i< numeros.length; i++){
                              System.out.println(numeros[i]);
                         }
                         int mayor =0;
                         for(int i=0; i<numeros.length; i++){
                              mayor = numeros[mayor] > numeros[i] ? mayor : i;
                         }

                         System.out.print("El numero mayor contenido en el arreglo es: " + numeros[mayor]);

                         break;

                    case 3:
                         System.out.println("Que operación deseas realizar?");
                         System.out.println("1: Suma" + "\n" +
                                            "2: Resta" + "\n" +
                                            "3: Multiplicación" + "\n" +
                                            "4: División");
                         System.out.print(": ");

                         int arit = scanner.nextInt();
                         float resultado = 0.0f;
                         float a= 0.0f;
                         float b= 0.0f;
                         switch (arit){
                              case 1:
                                   System.out.print("Ingresa primer valor: ");
                                   a = scanner.nextFloat();
                                   System.out.print("Ingresa segundo valor: ");
                                   b = scanner.nextFloat();
                                   resultado = (a+b);
                                   System.out.print("El resultado de la suma es: " + resultado);
                                   break;
                              case 2:
                                   System.out.print("Ingresa primer valor: ");
                                   a = scanner.nextFloat();
                                   System.out.print("Ingresa segundo valor: ");
                                   b = scanner.nextFloat();
                                   resultado = (a-b);
                                   System.out.print("El resultado de la resta es: " + resultado);
                                   break;
                              case 3:
                                   System.out.print("Ingresa primer valor: ");
                                   a = scanner.nextFloat();
                                   System.out.print("Ingresa segundo valor: ");
                                   b = scanner.nextFloat();
                                   resultado = (a*b);
                                   System.out.print("El resultado de la multiplicacion es: " + resultado);
                                   break;
                              case 4:
                                   System.out.print("Ingresa primer valor: ");
                                   a = scanner.nextFloat();
                                   System.out.print("Ingresa segundo valor: ");
                                   b = scanner.nextFloat();
                                   resultado = (a/b);
                                   System.out.print("El resultado de la divicion es: " + resultado);
                                   break;

                              default:
                                   System.out.println("Operacion invalida");
                                   break;

                         }// fin del switch




               }
          }else { //fin de if valida
               System.out.println("Requiere validar");
          }// fin del else




     }// fin del main
}// fin de la clase
