public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente();

        cliente.edad = 25;
        cliente.nombre = "Ana";
        cliente.telefono = "30-0565-0009";
        cliente.credito = 5000.99;

        System.out.println("Hola " + cliente.nombre + ", Veo que tienes " + cliente.edad
                + " años y que tu número de teléfono es " + cliente.telefono + ". Te informo que tu crédito es $" + cliente.credito);
    }
}

class Persona {
    int edad;
    String nombre;
    String telefono;
} 

class Cliente extends Persona {
    double credito;
}

class Trabajador extends Persona {
    double salario;
}