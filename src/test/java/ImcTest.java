import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImcTest {

    @Test
    public void deveTestarMulherAbaixoPeso() {
        Imc imc = new Imc(19.0f, 1.0f, "F");
        assertEquals("abaixo do peso", imc.calcularImc());
    }

    @Test
    public void deveTestarMulherPesoNormal() {
        Imc imc = new Imc(25.7f, 1.0f, "F");
        assertEquals("no peso normal", imc.calcularImc());
    }

    @Test
    public void deveTestarMulherMarginalmenteAcimaPeso() {
        Imc imc = new Imc(27.2f, 1.0f, "F");
        assertEquals("marginalmente acima do peso", imc.calcularImc());
    }

    @Test
    public void deveTestarMulherAcimaPesoIdeal() {
        Imc imc = new Imc(32.2f, 1.0f, "F");
        assertEquals("acima do peso ideal", imc.calcularImc());
    }

    @Test
    public void deveTestarMulherObeso() {
        Imc imc = new Imc(32.3f, 1.0f, "F");
        assertEquals("obeso", imc.calcularImc());
    }

    @Test
    public void deveTestarHomemAbaixoPeso() {
        Imc imc = new Imc(20.6f, 1.0f, "M");
        assertEquals("abaixo do peso", imc.calcularImc());
    }

    @Test
    public void deveTestarHomemPesoNormal() {
        Imc imc = new Imc(26.3f, 1.0f, "M");
        assertEquals("no peso normal", imc.calcularImc());
    }

    @Test
    public void deveTestarHomemMarginalmenteAcimaPeso() {
        Imc imc = new Imc(27.7f, 1.0f, "M");
        assertEquals("marginalmente acima do peso", imc.calcularImc());
    }

    @Test
    public void deveTestarHomemAcimaPesoIdeal() {
        Imc imc = new Imc(31.0f, 1.0f, "M");
        assertEquals("acima do peso ideal", imc.calcularImc());
    }

    @Test
    public void deveTestarHomemObeso() {
        Imc imc = new Imc(31.1f, 1.0f, "M");
        assertEquals("obeso", imc.calcularImc());
    }
}