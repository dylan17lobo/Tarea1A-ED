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

        
        System.out.println("=== 1. DESARROLLO DE METODOS DE HASHTABLE ===\n");

        // a. Insertar o modificar un elemento (put)
        inventario.put("GPU-01", "NVIDIA RTX 4070");
        inventario.put("CPU-02", "AMD Ryzen 7 7800X3D");
        inventario.put("RAM-03", "Corsair Vengeance 32GB DDR5");
        inventario.put("SSD-04", "Samsung 990 Pro 2TB");
        // Modificación usando el mismo put
        inventario.put("GPU-01", "NVIDIA RTX 4070 Ti Super"); 
        System.out.println("a. (put): Elementos insertados y modificado 'GPU-01'.");

        // b. Obtener un elemento (get)
        String componente = inventario.get("CPU-02");
        System.out.println("b. (get): El elemento con clave 'CPU-02' es: " + componente);

        // c. Validar si existe un elemento (contains)
        // Nota: contains() busca por VALOR en la tabla
        boolean existeValor = inventario.contains("Samsung 990 Pro 2TB");
        System.out.println("c. (contains): Existe el valor 'Samsung 990 Pro 2TB'?: " + existeValor);

        // d. Validar si existe una clave (containsKey)
        boolean existeClave = inventario.containsKey("RAM-03");
        System.out.println("d. (containsKey): Existe la clave 'RAM-03'?: " + existeClave);

        // e. Eliminar un elemento (remove)
        String eliminado = inventario.remove("SSD-04");
        System.out.println("e. (remove): Se elimino la clave 'SSD-04' (Valor: " + eliminado + ")");

        // f. Obtener conjunto de llaves (keys)
        // Nota: El método keys() de la clase tradicional Hashtable retorna una Enumeration
        System.out.print("f. (keys): Claves del inventario: ");
        Enumeration<String> llaves = inventario.keys();
        while (llaves.hasMoreElements()) {
            System.out.print("[" + llaves.nextElement() + "] ");
        }
        System.out.println();

        // g. Obtener conjunto de valores (values)
        System.out.println("g. (values): Conjunto de valores actuales: " + inventario.values());

        // h. Recorrer los objetos (entrySet) en un ciclo para mostrar la llave (getKey) y el valor (getValue)
        System.out.println("h. (entrySet): Recorrido detallado de la coleccion:");
        for (Map.Entry<String, String> registro : inventario.entrySet()) {
            System.out.println("   -> Clave [ID]: " + registro.getKey() + " | Valor [Componente]: " + registro.getValue());
        }

        // i. Imprimir la colección (toString)
        System.out.println("\ni. (toString): Representacion textual completa de la HashTable:");
        System.out.println(inventario.toString());
    }
    
}
