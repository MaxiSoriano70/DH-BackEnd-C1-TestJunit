package clase1.practica;

public class Circulo extends Figura{
    private double radio;

    private double PI =  Math.PI;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
        this.PI = PI;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(float PI) {
        this.PI = PI;
    }

    @Override
    public double area(){
        return 2*this.PI*this.radio;
    }

    @Override
    public String mensaje() {
        return "El área del "+ super.getNombre()+" es "+ this.area()+" unidades";
    }
}
