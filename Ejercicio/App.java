import java.util.Scanner;

public class App {

    static Scanner lector = new Scanner(System.in);

    static int intentos;
    static double areaLateral, areaTotal, volumen, base, altura, apotema, perimetroBase, longitud, cantidadLados, resultado;
    static double alfa, areaBase;

    public static void main(String[] args) throws Exception {
        
        System.out.println("Seleccione un cuerpo geometrico: ");
        System.out.println("1) Prisma: ");
        System.out.println("2) cilindro: ");
        System.out.println("3) Piramide: ");
        System.out.println("4) Cono: ");
        System.out.println("5) Esfera: ");
        System.out.println("6) Zona Esferica: ");
        System.out.println("7) Casquete Esferico: ");
        System.out.println("8) Huso esferico y Cuña Esferica: ");
        System.out.println("9) Ortoedro: ");
        System.out.println("10) Tetraedro: ");
        System.out.println("11) Hexaedro: ");
        System.out.println("12) Octaedro: ");
        System.out.println("13) Dodecaedro: ");
        System.out.println("14) Icosaedro: ");
        System.out.println("15) Tronco de Cono: ");
        System.out.println("16) Tronco de piramide: ");
        System.out.println("17) Salir");
        int opc = lector.nextInt();

        switch(opc){
            case 1:
                resolverPrisma();
                System.out.println("Resultados: ");
                System.out.println("Area Lateral: "+areaLateral);
                System.out.println("Area Total: " +areaTotal);
                System.out.println("Volumen: " +volumen);
                
            break;

            case 2:


            break;

            default:
            System.out.println("Opcion invalida");
        }
        lector.close();
    }    
    public static double resolverPrisma(){

        System.out.println("Digite la altura: ");
        altura = lector.nextDouble();

        System.out.println("Digite la cantidad de lados: ");
        cantidadLados = lector.nextDouble();

        System.out.println("Digite la longitud de los lados: ");
        longitud = lector.nextDouble();
        
        perimetroBase = longitud*cantidadLados;
        areaLateral = altura*perimetroBase;
        alfa = (Math.PI/180) * (360/cantidadLados);
        apotema = longitud / (2 * Math.tan((alfa)/2));
        areaBase = (perimetroBase * apotema)/2;
        areaTotal = areaLateral + 2 * areaBase;
        volumen = areaBase * altura;
        return areaLateral;
    }
    public static double resolverCilindro(){
        
        
        
        return areaLateral;
    }
}
