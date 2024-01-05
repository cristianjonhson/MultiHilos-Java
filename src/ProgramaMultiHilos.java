
class MiHilo extends Thread {
    public void run() {
        // Código que se ejecutará en el hilo
        for (int i = 0; i < 5; i++) {
            System.out.println("Hilo Secundario: " + i);
        }
    }
}

public class ProgramaMultiHilos {
    public static void main(String[] args) {
        MiHilo hilo1 = new MiHilo();
        MiHilo hilo2 = new MiHilo();

        // Inicia los hilos
        hilo1.start();
        hilo2.start();

        // Código principal del programa
        for (int i = 0; i < 5; i++) {
            System.out.println("Hilo principal: " + i);
        }
    }
}
