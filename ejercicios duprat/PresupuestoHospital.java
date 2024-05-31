public class PresupuestoHospital {
    public static void main(String[] args) {
        double presupuestoTotal = 1000000; // Ejemplo de presupuesto total de $1,000,000
        double presupuestoUrgencias = calcularPresupuesto(presupuestoTotal, 0.37);
        double presupuestoPediatría = calcularPresupuesto(presupuestoTotal, 0.42);
        double presupuestoTraumatología = calcularPresupuesto(presupuestoTotal, 0.21);

        // Mostrar presupuesto para cada área
        System.out.println("Presupuesto para Urgencias: $" + presupuestoUrgencias);
        System.out.println("Presupuesto para Pediatría: $" + presupuestoPediatría);
        System.out.println("Presupuesto para Traumatología: $" + presupuestoTraumatología);
    }

    // Función para calcular el presupuesto para un área dado el porcentaje y el presupuesto total
    public static double calcularPresupuesto(double presupuestoTotal, double porcentaje) {
        return presupuestoTotal * porcentaje;
    }
}