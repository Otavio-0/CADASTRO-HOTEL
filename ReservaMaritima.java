public class ReservaMaritma {

    private Integer qtdPessoas;
    private Integer qtdDias;
    private String dataReserva;
    private String tipoBarco;
    private String tipoPasseio;

    public  ReservaMaritma(Integer qtdPessoas, Integer qtdDias, String dataReserva, String tipoBarco, String tipoPasseio){

        this.qtdPessoas = qtdPessoas;
        this.qtdDias= qtdDias;
        this.dataReserva = dataReserva;
        this.tipoBarco = tipoBarco;
        this.tipoPasseio = tipoPasseio;
    }

    public ReservaMaritma(){

    }

    public Integer getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(Integer qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public Integer getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(Integer qtdDias) {
        this.qtdDias = qtdDias;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public String getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(String tipoBarco) {
        this.tipoBarco = tipoBarco;
    }

    public String getTipoPasseio() {
        return tipoPasseio;
    }

    public void setTipoPasseio(String tipoPasseio) {
        this.tipoPasseio = tipoPasseio;
    }


}

