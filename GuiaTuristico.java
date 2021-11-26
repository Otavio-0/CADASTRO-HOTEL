public class GuiaTuristico {


    private Integer qtdPessoas;
    private String tipoPasseio;
    private String tipoLocomoção;

    public GuiaTuristico( Integer qtdPessoas, String tipoPasseio, String tipoLocomoção ){

        this.qtdPessoas = qtdPessoas;
        this.tipoPasseio = tipoPasseio;
        this.tipoLocomoção = tipoLocomoção;

    }

    public GuiaTuristico(){

    }

    public Integer getQtdPessoas() {

        return qtdPessoas;
    }

    public void setQtdPessoas(Integer qtdPessoas) {

        this.qtdPessoas = qtdPessoas;
    }

    public String getTipoPasseio() {

        return tipoPasseio;
    }

    public void setTipoPasseio(String tipoPasseio) {

        this.tipoPasseio = tipoPasseio;
    }

    public String getTipoLocomoção() {

        return tipoLocomoção;
    }

    public void setTipoLocomoção(String tipoLocomoção) {

        this.tipoLocomoção = tipoLocomoção;
    }



}

