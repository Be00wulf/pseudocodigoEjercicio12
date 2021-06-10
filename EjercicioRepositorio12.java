//EjercicioRepositorio12
import java.util.Scanner;
public class EjercicioRepositorio12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char sexo;
        int edad, contadorF = 0, sumaAlturaF = 0, contadorM = 0, sumaAlturaM = 0, sumaEdades = 0, contadorEdades = 0;
        double altura, promedioAF, promedioAM, promedioEdades;
 
        do {                      
 
        System.out.println("INFORMACION: para salir ingrese una altura negativa");
        
        System.out.print("Ingrese altura (solo la cantidad, en centimetros) : ");
        altura = entrada.nextDouble();
        if (altura > 0) {
                
            
            System.out.print("Ingrese edad: ");
            edad = entrada.nextInt();

            //revisar el problema del salto de linea
            System.out.println("Ingrese sexo (f = femenino ó m = masculino): ");
            sexo = entrada.next().charAt(0);

                if (sexo == 'f') {
                    ++contadorF;
                    sumaAlturaF += altura;

                }   else if (sexo == 'm') {
                    ++contadorM;
                    sumaAlturaM += altura;

                }   

            ++contadorEdades;
            sumaEdades += edad;
        }
        
        } while (altura > 0);
        
        if (contadorF != 0) {
            promedioAF = (sumaAlturaF / contadorF);
            System.out.println("El promedio de altura de las mujeres es de: " + promedioAF);
        }
        if (contadorM != 0) {
            promedioAM = (sumaAlturaM / contadorM);
            System.out.println("El promedio de altura de los hombres es de: " + promedioAM);
        }
    
        if (contadorEdades != 0) {
            promedioEdades = (sumaEdades / contadorEdades);
            System.out.println("El promedio de edad  de los participantes es de: " + promedioEdades);
        }
    
    }
}