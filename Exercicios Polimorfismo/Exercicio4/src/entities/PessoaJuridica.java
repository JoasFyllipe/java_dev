package entities;

public class PessoaJuridica extends Pessoa{
    private Integer numeroDeFuncionarios;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String name, Double rendaAnual, Integer numeroDeFuncionarios) {
        super(name, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public Integer getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public String toString(){
        return getName()
                + String.format("$ %.2f ", valorImposto());
    }

    @Override
    public Double valorImposto() {
        if(numeroDeFuncionarios > 10){
            return super.getRendaAnual()*0.14;
        }
        else {
            return super.getRendaAnual()*0.16;
        }
    }
}
