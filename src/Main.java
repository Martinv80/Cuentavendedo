public class Main {
    public static void main(String[] args) {

        // Instancia del vendedor con constructor por defecto
        Vendedor vendedor1 = new Vendedor();

        // 1. Asignación de valores válidos iniciales
        vendedor1.setNombre("Carlos Mendoza");
        vendedor1.setVentas(1500.0);
        vendedor1.setComision(15.0);
        vendedor1.setActivo(true);

        System.out.println("=== DATOS INICIALES ===");
        System.out.println("Vendedor: " + vendedor1.getNombre());
        System.out.println("Ventas totales: $" + vendedor1.getVentas());
        System.out.println("Comisión: " + vendedor1.getComision() + "%");
        System.out.println("Estado: " + (vendedor1.isActivo() ? "Activo" : "Inactivo"));

        // 2. Pruebas de validación con valores inválidos
        System.out.println("\n=== PRUEBAS DE VALIDACIÓN ===");
        vendedor1.setNombre("");          // No debe admitir nombre vacío
        vendedor1.setVentas(-500.0);      // No debe admitir ventas negativas
        vendedor1.setComision(-5.0);       // Inválido: menor a 0
        vendedor1.setComision(120.0);      // Inválido: mayor a 100

        System.out.println("\nValores verificados mediante getters (no cambiaron):");
        System.out.println("Nombre: " + vendedor1.getNombre());
        System.out.println("Ventas: $" + vendedor1.getVentas());
        System.out.println("Comisión: " + vendedor1.getComision() + "%");

        // 3. Prueba del desafío registrarVenta
        System.out.println("\n=== PRUEBA DE REGISTRAR VENTA ===");
        vendedor1.registrarVenta(-100.0); // Inválida
        vendedor1.registrarVenta(0.0);    // Inválida
        vendedor1.registrarVenta(350.50); // Válida (aumenta de 1500 a 1850.50)

        System.out.println("Ventas totales definitivas: $" + vendedor1.getVentas());
    }
}