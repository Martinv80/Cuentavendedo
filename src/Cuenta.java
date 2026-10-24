public class Vendedor {

    // Atributos privados
    private String nombre;
    private double ventas;
    private double comision;
    private boolean activo;

    // Getters y Setters con validaciones y uso de this

    public String getNombre() {
        return this.nombre;
    }

    // Regla: nombre no vacío
    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío.");
        }
    }

    public double getVentas() {
        return this.ventas;
    }

    // Regla: ventas no negativas
    public void setVentas(double ventas) {
        if (ventas >= 0) {
            this.ventas = ventas;
        } else {
            System.out.println("Error: Las ventas no pueden ser negativas (" + ventas + ").");
        }
    }

    public double getComision() {
        return this.comision;
    }

    // Regla: comisión entre 0 y 100
    public void setComision(double comision) {
        if (comision >= 0 && comision <= 100) {
            this.comision = comision;
        } else {
            System.out.println("Error: La comisión debe estar entre 0 y 100 (" + comision + ").");
        }
    }

    public boolean isActivo() {
        return this.activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Desafío: registrar venta (solo acepta cantidades positivas)
    public void registrarVenta(double cantidad) {
        if (cantidad > 0) {
            this.ventas += cantidad;
            System.out.println("Venta registrada: $" + cantidad + ". Ventas acumuladas: $" + this.ventas);
        } else {
            System.out.println("Error: La cantidad de la venta debe ser positiva.");
        }
    }
}