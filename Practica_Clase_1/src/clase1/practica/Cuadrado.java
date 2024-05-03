package clase1.practica;

public class Cuadrado extends Figura{
    private double lado1;
    private double lado2;

    public Cuadrado(String nombre, double lado1, double lado2) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    @Override
    public double area(){
        return this.lado1*this.lado2;
    }

    @Override
    public String mensaje() {
        return "El área del "+ super.getNombre()+" es "+ this.area()+" unidades";
    }
}
