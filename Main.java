import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        Usuario usuario1 = new Usuario("João", "12345678901", "987654321", "A123");
        Usuario usuario2 = new Usuario("Maria", "10987654321", "912345678", "B456");

        System.out.println(usuario1);
        System.out.println(usuario2);
        System.out.println();

        Livro livro1 = new Livro("Java para Iniciantes", "Carlos", new Date(), 1, "Editora Exemplo", "978-3-16-148410-0");
        Livro livro2 = new Livro("Estruturas de Dados", "Ana", new Date(), 2, "Editora Exemplo 2", "978-1-23-456789-0");

        System.out.println(livro1);
        System.out.println(livro2);
        System.out.println();

        Exemplar exemplar1 = new Exemplar(1, true, false);
        Exemplar exemplar2 = new Exemplar(2, true, false);

        System.out.println(exemplar1);
        System.out.println(exemplar2);
        System.out.println();

        Emprestimo emprestimo1 = new Emprestimo(usuario1, exemplar1, new Date(), null);
        Emprestimo emprestimo2 = new Emprestimo(usuario2, exemplar2, new Date(), new Date(System.currentTimeMillis() + 86400000));

        System.out.println(emprestimo1);
        System.out.println(emprestimo2);
    }
}
