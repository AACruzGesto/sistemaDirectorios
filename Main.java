//DEBE IR FUERA DEL PACKAGE SISTEMA
import sistema.*;

public class Main {
    public static void main(String[] args) {
        Fichero f1 = new Fichero("foto.jpg", 1500, type.R);
        Fichero f2 = new Fichero("documento.txt", 500, type.RW);

        Directorio raiz = new Directorio("raiz");
        Directorio subDir = new Directorio("imagenes");

        raiz.addelemento(f1);
        raiz.addelemento(f2);
        raiz.addelemento(subDir);

        Directorio otro = new Directorio("backup");
        otro.addelemento(new Fichero("copia.txt", 100, type.W));

        // Pruebas de restricciones
        System.out.println("Intento de añadir raíz a subdirectorio (debe fallar): " +
            subDir.addelemento(raiz)); // false
        System.out.println("Intento de añadir subdirectorio a raíz (debe funcionar): " +
            raiz.addelemento(subDir)); // ya estaba, así que no lo añade de nuevo

        // Mostrar estructura
        raiz.imprimir();
    }
}
