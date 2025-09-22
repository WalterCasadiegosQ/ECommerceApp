package org.ecommerce;

import org.ecommerce.adapter.CreditCardAdapter;
import org.ecommerce.adapter.CryptoAdapter;
import org.ecommerce.adapter.PayPalAdapter;
import org.ecommerce.app.ECommerceApp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ECommerceApp app = new ECommerceApp();

        boolean running = true;

        while (running) {
            System.out.println("\n=== Sistema de Pagos ===");
            System.out.println("1. Pagar con Tarjeta");
            System.out.println("2. Pagar con PayPal");
            System.out.println("3. Pagar con Criptomonedas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int choice = scanner.nextInt();

            if (choice == 4) {
                running = false;
                System.out.println("Saliendo del sistema...");
                break;
            }

            System.out.print("Ingrese el monto a pagar: ");
            double amount = scanner.nextDouble();

            switch (choice) {
                case 1 -> app.setProcessor(new CreditCardAdapter());
                case 2 -> app.setProcessor(new PayPalAdapter());
                case 3 -> app.setProcessor(new CryptoAdapter());
                default -> {
                    System.out.println("Opción inválida.");
                    continue;
                }
            }

            app.checkout(amount);
        }

        scanner.close();
    }
}