public class Imc {

    private float peso;
    private float altura;
    private String sexo;

    public Imc(float peso, float altura, String sexo) {
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

    public String calcularImc() {
        if(!this.sexo.equals("F") && !this.sexo.equals("M")){
            throw new IllegalArgumentException("Sexo Inexistente");
        }
        if(this.peso <= 0){
            throw new IllegalArgumentException("Peso nao pode ser menor ou igual a zero");
        }
        if(this.altura <= 0){
            throw new IllegalArgumentException("Altura nao pode ser menor ou igual a zero");
        }
        float imc;
        imc = this.peso / (this.altura * this.altura);




        if (this.sexo.equals("F")) {
            if (imc < 19.1f) {
                return "abaixo do peso";
            } else {
                if (imc < 25.8f) {
                    return "no peso normal";
                } else {
                    if (imc < 27.3f) {
                        return "marginalmente acima do peso";
                    } else {
                        if (imc < 32.3f) {
                            return "acima do peso ideal";
                        } else {
                            return "obeso";
                        }
                    }
                }
            }
        } else {
            if (imc < 20.7f) {
                return "abaixo do peso";
            } else {
                if (imc < 26.4f) {
                    return "no peso normal";
                } else {
                    if (imc < 27.8f) {
                        return "marginalmente acima do peso";
                    } else {
                        if (imc < 31.1f) {
                            return "acima do peso ideal";
                        } else {
                            return "obeso";
                        }
                    }
                }
            }
        }
    }
}