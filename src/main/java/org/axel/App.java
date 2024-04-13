package org.axel;

public class App 
{

    public static void main( String[] args)
    {
       try {
           int opcion=args.length;

           if (opcion==2){
               String dato=args[0];
               int tipoDeDato=Integer.parseInt(args[1]);


               convertidor(dato,tipoDeDato);

           }

           if (opcion==4){
               String numeroX=args[0];
               String numeroY=args[1];
               int tipoDato=Integer.parseInt(args[2]);
               int operacion=Integer.parseInt(args[3]);

               operacionesAritmeticas(numeroX,numeroY,tipoDato,operacion);

           }

       }catch (Exception e){
           System.out.println("As introducido un valor no valido");
           System.out.println("Revisa que los datos ingresados correspondan al tipo de dato");
           System.out.println("las operaciones son: \n1.sumar\n 2.restar\n 3.multiplicar\n 4.dividir");
       }

    }

    private  static void convertidor(String dato, int tipoDeDato){
        int decimal=Integer.parseInt(dato);
        if (tipoDeDato !=10){
            switch(tipoDeDato){
                case 2:
                    decimal=binario(dato);
                    break;
                case 8:
                    decimal=octal(dato);
                    break;
                case 16:
                    decimal=hexadecimal(dato);
                    break;

            }
        }

        imprimirConversion(decimal);
    }

    private static int binario(String dato){
        int decimal=Integer.parseInt(dato,2);

        return decimal;
    }
    private static int octal(String dato){
        int decimal=Integer.parseInt(dato,8);
        return  decimal;
    }
    private  static int hexadecimal(String dato){
        int decimal=Integer.parseInt(dato,16);
        return decimal;
    }
    private static void imprimirConversion(int decimal){
        System.out.println("En notacion binaria es: "+Integer.toBinaryString(decimal));
        System.out.println("En notacion octal es: "+Integer.toOctalString(decimal));
        System.out.println("En notacion decimal es: "+decimal);
        System.out.println("En notacion hexadecimal es: "+Integer.toHexString(decimal));
    }

    private static  int sumar(String x, String y,int tipoDato){

        int numeroX=Integer.parseInt(x,tipoDato);
        int numeroy=Integer.parseInt(y,tipoDato);
        int resultado=numeroX+numeroy;
        return resultado;

    }
    private static  int restar(String x, String y,int tipoDato){

        int numeroX=Integer.parseInt(x,tipoDato);
        int numeroy=Integer.parseInt(y,tipoDato);
        int resultado=numeroX-numeroy;
        return resultado;

    }
    private static  int multiplicador(String x, String y,int tipoDato){

        int numeroX=Integer.parseInt(x,tipoDato);
        int numeroy=Integer.parseInt(y,tipoDato);
        int resultado=numeroX*numeroy;
        return resultado;

    }
    private static  int dividir (String x, String y,int tipoDato){

        int numeroX=Integer.parseInt(x,tipoDato);
        int numeroy=Integer.parseInt(y,tipoDato);
        int resultado=numeroX/numeroy;
        return resultado;

    }
    private static void operacionesAritmeticas(String numeroX, String numeroY, int tipoDato, int operacion){
        switch (tipoDato){
            case 2:
                if(operacion==1){
                    System.out.println(Integer.toBinaryString(sumar(numeroX,numeroY,2)));
                }
                if(operacion==2){
                    System.out.println(Integer.toBinaryString(restar(numeroX,numeroY,2)));
                }
                if(operacion==3){
                    System.out.println(Integer.toBinaryString(multiplicador(numeroX,numeroY,2)));
                }
                if(operacion==4){
                    System.out.println(Integer.toBinaryString(dividir(numeroX,numeroY,2)));
                }
                break;

            case 8:
                if(operacion==1){
                    System.out.println(Integer.toOctalString(sumar(numeroX,numeroY,8)));
                }
                if(operacion==2){
                    System.out.println(Integer.toOctalString(restar(numeroX,numeroY,8)));
                }
                if(operacion==3){
                    System.out.println(Integer.toOctalString(multiplicador(numeroX,numeroY,8)));
                }
                if(operacion==4){
                    System.out.println(Integer.toOctalString(dividir(numeroX,numeroY,8)));
                }
                break;
            case 10:
                if(operacion==1){
                    System.out.println(sumar(numeroX,numeroY,10));
                }
                if(operacion==2){
                    System.out.println(restar(numeroX,numeroY,10));
                }
                if(operacion==3){
                    System.out.println(multiplicador(numeroX,numeroY,10));
                }
                if(operacion==4){
                    System.out.println(dividir(numeroX,numeroY,10));
                }
                break;
            case 16:
                if(operacion==1){
                    System.out.println(Integer.toHexString(sumar(numeroX,numeroY,16)));
                }
                if(operacion==2){
                    System.out.println(Integer.toHexString(restar(numeroX,numeroY,16)));
                }
                if(operacion==3){
                    System.out.println(Integer.toHexString(multiplicador(numeroX,numeroY,16)));
                }
                if(operacion==4){
                    System.out.println(Integer.toHexString(dividir(numeroX,numeroY,16)));
                }
                break;
        }

    }

}
