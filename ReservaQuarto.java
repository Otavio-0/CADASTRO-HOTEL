mport java.math.BigInteger;

public class Pessoa {

    private String nome;
    private String email;
    private BigInteger cpf;
    private BigInteger rg;



    public Pessoa(String nome, String email, BigInteger cpf, BigInteger rg){

        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
}

    public Pessoa(){

    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {

        return nome;
    }

    public BigInteger getCpf() {

        return cpf;
    }

    public void setCpf(BigInteger cpf) {

        this.cpf = cpf;
    }

    public BigInteger getRg() {

        return rg;
    }

    public void setRg(BigInteger rg) {

        this.rg = rg;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }


}
