import java.util.Date;

public class Emprestimo {
    private Date dataDeEmprestimo;
    private Date dataPrevistaDeDevolucao;
    private Date dataDeEntregaReal;
    private int situacao;
    private Exemplar exemplar;
    private Usuario usuario;

    public Emprestimo(Date dataDeEmprestimo, Date dataPrevistaDeDevolucao, Date dataDeEntregaReal, int situacao, Exemplar exemplar, Usuario usuario) {
        this.dataDeEmprestimo = dataDeEmprestimo;
        this.dataPrevistaDeDevolucao = dataPrevistaDeDevolucao;
        this.dataDeEntregaReal = dataDeEntregaReal;
        this.situacao = situacao;
        this.exemplar = exemplar;
        this.usuario = usuario;
    }

    public Emprestimo(Usuario usuario, Exemplar exemplar, Date dataDeEmprestimo, Date dataPrevistaDeDevolucao) {
        this.usuario = usuario;
        this.exemplar = exemplar;
        this.dataDeEmprestimo = dataDeEmprestimo;
        this.dataPrevistaDeDevolucao = dataPrevistaDeDevolucao;
        this.situacao = 0; 
    }

    public Date getDataDeEmprestimo() {
        return dataDeEmprestimo;
    }

    public void setDataDeEmprestimo(Date dataDeEmprestimo) {
        this.dataDeEmprestimo = dataDeEmprestimo;
    }

    public Date getDataPrevistaDeDevolucao() {
        return dataPrevistaDeDevolucao;
    }

    public void setDataPrevistaDeDevolucao(Date dataPrevistaDeDevolucao) {
        this.dataPrevistaDeDevolucao = dataPrevistaDeDevolucao;
    }

    public Date getDataDeEntregaReal() {
        return dataDeEntregaReal;
    }

    public void setDataDeEntregaReal(Date dataDeEntregaReal) {
        this.dataDeEntregaReal = dataDeEntregaReal;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public Exemplar getExemplar() {
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar) {
        this.exemplar = exemplar;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Emprestimo [usuario=" + usuario + ", dataDeEmprestimo=" + dataDeEmprestimo + ", dataPrevistaDeDevolucao=" + dataPrevistaDeDevolucao + ", dataDeEntregaReal=" + dataDeEntregaReal + ", situacao=" + situacao + "]";
    }
}
