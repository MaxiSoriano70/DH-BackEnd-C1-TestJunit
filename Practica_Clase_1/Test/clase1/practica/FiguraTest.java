package clase1.practica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiguraTest {
    @Test
    void areaCirculo(){
        Figura circulo = new Circulo("Circulo",3);
        double areaCirculo = circulo.area();
        double areaCorrectaCirculo = 18.84955592153876;
        assertEquals(areaCorrectaCirculo,areaCirculo);
        assertTrue(areaCirculo>0);

        Figura cuadrado = new Cuadrado("Cuadrado",3,3);
        double areaCuadrado = cuadrado.area();
        double areaCorrectaCuadrado = 18.84955592153876;
        assertEquals(areaCorrectaCuadrado,areaCuadrado);
        assertTrue(areaCuadrado>0);
    }

    @Test
    void areaCirculoMayorACero(){
        Figura circulo = new Circulo("Circulo",3);
        double areaCirculo = circulo.area();
        assertTrue(areaCirculo>0);
    }

    @Test
    void areaCuadrado(){
        Figura cuadrado = new Cuadrado("Cuadrado",3,3);
        double areaCuadrado = cuadrado.area();
        double areaCorrectaCuadrado = 18.84955592153876;
        assertEquals(areaCorrectaCuadrado,areaCuadrado);
    }

    @Test
    void areaCuadradoMayorACero(){
        Figura cuadrado = new Cuadrado("Cuadrado",3,3);
        double areaCuadrado = cuadrado.area();
        assertTrue(areaCuadrado>0);
    }
}