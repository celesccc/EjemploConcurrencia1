package com.company;

public class Main {

    public static void main(String[] args) {
        long tiempoDeInicio = System.currentTimeMillis();

        /*for (int i = 0; i < 10; i++){
            System.out.println("Estoy en la repetición " + i);
        }*/
        // Si hacemos el for en el main tarda menos tiempo en terminar,
        // porque el join hace que el programa tenga que esperar a que termine el start.

        CustomThread t = new CustomThread(1000);
        t.start(); // Se ejecuta en segundo plano.
        try {
            t.join(); // Esperar a que el start termine para que continue el programa.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long tiempoDeFin = System.currentTimeMillis();

        System.out.println("He terminado en " + (tiempoDeFin - tiempoDeInicio)); //Esta línea se ejecuta antes porque el programa sigue funcionando.


        // Los 3 hilos se ejecutan en paralelo
        try {
            CustomThread t1 = new CustomThread(1000);
            t1.setName("Hilo1");

            //t1.tiempoDeEspera = 1000;

            t1.start();
            t1.join();
            CustomThread t2 = new CustomThread(2000);
            t2.setName("Hilo2");
            t2.start();
            t2.join();
            CustomThread t3 = new CustomThread(3000);
            t3.setName("Hilo3");
            t3.start();
            t3.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
