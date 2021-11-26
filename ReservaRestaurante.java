public class ReservaRestaurante {

    private Integer qtdPessoas;
    private String tipoBife;
    private String data;
    private String horario;

    public ReservaRestaurante(Integer qtdPessoas, String tipoBife, String data, String horario){

        this.qtdPessoas = qtdPessoas;
        this.tipoBife = tipoBife;
        this.data =  data;
        this.horario = horario;

    }

    public ReservaRestaurante(){

    }

    public Integer getQtdPessoas() {

        return qtdPessoas;
    }

    public void setQtdPessoas(Integer qtdPessoas) {

        this.qtdPessoas = qtdPessoas;
    }

    public String getTipoBife() {

        return tipoBife;
    }

    public void setTipoBife(String tipoBife) {

        this.tipoBife = tipoBife;
    }

    public String getData() {

        return data;
    }

    public void setData(String data) {

        this.data = data;
    }

    public String getHorario() {

        return horario;
    }

    public void setHorario(String horario) {

        this.horario = horario;
    }

}

