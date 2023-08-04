import java.util.Scanner;

public class suhu {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan suhu dalam Celcius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;
        double kelvin = celsius + 273.15;

        System.out.println("Hasil konversi suhu:");
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);

        input.close();
            
    }
}
