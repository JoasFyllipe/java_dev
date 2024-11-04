package entities;


public class Estudante {
    private String name;
    private String email;

    public Estudante(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String toString(){
        return ": "
                + name
                +", "
                +email;
    }
}
