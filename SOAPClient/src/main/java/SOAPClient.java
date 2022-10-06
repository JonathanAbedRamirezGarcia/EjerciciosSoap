import utez.Service;
import utez.ServiceService;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SOAPClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceService service = new ServiceService();
        Service port = service.getServicePort();
        int paramNum;
        String respose;
//        do {
//            System.out.print("Ingresa un numero: ");
//            paramNum = sc.nextInt();
//            respose = port.numRandom(paramNum);
//            System.out.println(respose);
//        } while (!respose.equals("Bien hecho!"));



//         System.out.println("Ingresa una palabra: ");
//         String paramPalabra = sc.nextLine();
//         respose = port.consonantes(paramPalabra);
//         System.out.println(respose);

//        System.out.println("Ingresa el nombre: ");
//        String paramName = sc.nextLine();
//        System.out.println("Ingresa tu apellido paterno: ");
//        String paramlastname1 = sc.nextLine();
//        System.out.println("Ingresa tu apellido materno: ");
//        String paramlastname2 = sc.nextLine();
//        System.out.println("Ingresa tu año de nacimiento: ");
//        String paramYear = sc.nextLine();
//        System.out.println("Ingresa tu mes de nacimiento: ");
//        String paramMounth = sc.nextLine();
//        System.out.println("Ingresa tu dia de nacimiento: ");
//        String paramDay = sc.nextLine();
//        respose = port.rfc(paramName, paramlastname1, paramlastname2, paramYear, paramMounth, paramDay);
//        System.out.println(respose);
    }
}