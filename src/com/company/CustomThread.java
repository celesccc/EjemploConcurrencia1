package com.company;

public class CustomThread extends Thread{

    private final int tiempoDeEspera;

    public CustomThread (int tiempoDeEspera){
        this.tiempoDeEspera = tiempoDeEspera;
    }

    @Override
    public void run() {
        try {
            //sleep(1000);

            for (int i = 0; i < 10; i++) {
                //sleep(1000); // Bucle for más lento.
                sleep(tiempoDeEspera);
                System.out.println("Estoy en la repetición " + i + " y soy el hilo " + getName());
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
