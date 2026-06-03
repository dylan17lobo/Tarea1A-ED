/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea1_dylan_c5g526_samuel_c5f560;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
/**
 *
 * @author Dylan Lobo & Samuel Gonzales
 */
public class Tarea1_Dylan_C5G526_Samuel_C5F560 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hashtable<String, String> inventario = new Hashtable<>();


        // a. Insert
        inventario.put("GPU-01", "NVIDIA RTX 4070");
        inventario.put("CPU-02", "AMD Ryzen 7 7800X3D");
        inventario.put("RAM-03", "Corsair Vengeance 32GB DDR5");
        inventario.put("SSD-04", "Samsung 990 Pro 2TB");
        System.out.println();

        // b.get
        String componente = inventario.get("CPU-02");
        System.out.println("El elemento con clave CPU-02 es:" + componente);
        System.out.println();

        // c.contains
        boolean existeValor = inventario.contains("Samsung 990 Pro 2TB");
        System.out.println("Existe el valor Samsung 990 Pro 2TB: " + existeValor);
        System.out.println();

        // d.containsKey
        boolean existeClave = inventario.containsKey("RAM-03");
        System.out.println("Existe la clave RAM-03: " + existeClave);
        System.out.println();

        // e.remove
        String eliminado = inventario.remove("SSD-04");
        System.out.println("Se elimino la clave SSD-04 con el valor : " + eliminado);
        System.out.println();

        // f.keys
        System.out.print("Claves del inventario: ");
        Enumeration<String> llaves = inventario.keys();
        while (llaves.hasMoreElements()) {
            System.out.print(llaves.nextElement()+", ");
        }
        System.out.println();
        System.out.println();

        // g.values
        System.out.println("Values: " + inventario.values());
        System.out.println();

        // h.entrySet, getKey y getValue
        System.out.println("Recorrido con el entrySet:");
        for (Map.Entry<String, String> registro : inventario.entrySet()) {
            System.out.println("  Clave:  " + registro.getKey() + " | Valor: " + registro.getValue());
        }
        System.out.println();

        // i. Imprimir la colección (toString)
        System.out.println("\nToString de la hastable");
        System.out.println(inventario.toString());
    }
    
}
