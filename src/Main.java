import management.*;
import utils.ConsoleUtils;


public class Main {
    public static void main(String[] args) {
        
        while(true){
            System.out.println("Bienvenido a Matrix Reloaded: Salvando la Humanidad");
            System.out.println("Elige una píldora para continuar:");
            System.out.println("1. Píldora Roja: Agentes de la Resistencia");
            System.out.println("2. Píldora Azul: Control de Anomalías");
            System.out.println("3. Solucion Requerimiento 7: Estadísticas Simples");
            
            int opcion = ConsoleUtils.leerEntero("Selecciona una opción (1 o 2 o 3): ");

            if (opcion == 1) {
                AgenteManager agenteManager = new AgenteManager();
                agenteManager.mostrarMenu();
            } else if (opcion == 2) {
                AnomaliaManager anomaliaManager = new AnomaliaManager();
                anomaliaManager.mostrarMenu();
            } else if (opcion == 3) {
                AgenteManager agenteManager = new AgenteManager();
                System.out.println("El total de Agentes es:" + agenteManager.mostrarAgentesRegistrados());
                AnomaliaManager anomaliaManager = new AnomaliaManager();
                System.out.println("El total de Anomalieas es:");
            }else {
                System.out.println("Opción no válida. Adiós.");
                break;
            }
        }
    }
}

