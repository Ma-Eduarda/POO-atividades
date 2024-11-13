public class Exemplar {
    private int codigo;
    private boolean ativa;
    private boolean emprestada;

    public Exemplar(int codigo, boolean ativa, boolean emprestada) {
        this.codigo = codigo;
        this.ativa = ativa;
        this.emprestada = emprestada;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public boolean isEmprestada() {
        return emprestada;
    }

    public void setEmprestada(boolean emprestada) {
        this.emprestada = emprestada;
    }

    @Override
    public String toString() {
        return "Exemplar [codigo=" + codigo + ", ativa=" + ativa + ", emprestada=" + emprestada + "]";
    }
}
