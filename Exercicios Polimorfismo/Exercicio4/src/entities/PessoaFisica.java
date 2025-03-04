package entities;

public class PessoaFisica extends Pessoa{

    private Double gastosComSaude;

    public PessoaFisica() {
    }

    public PessoaFisica(String name, Double rendaAnual, Double gastosComSaude) {
        super(name, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public String toString(){
        return getName()
                + String.format("$ %.2f ", valorImposto());
    }

    @Override
    public Double valorImposto() {
        if(super.getRendaAnual() < 20000.0){
            return (super.getRendaAnual() * 0.15) - (gastosComSaude * 0.5);
        }
        else{
            return (super.getRendaAnual() * 0.25) - (gastosComSaude * 0.5);
        }
    }
}
