package ProjetoLivraria;

public class ProjetoLivraria {

        public static void main(String[] args){

        System.out.println("\033[4;42mSistema de Livraria\033[m");

        Livro obj1;
        obj1 = new Livro();
        obj1.titulo = "Harry Potter e a pedra Filosofal";
        obj1.numeroPaginas = 200;
        obj1.anoPublicacao = 2099;
        obj1.preco = 47.42;
        obj1.cadastrar();
        obj1.vender();
        double frete = obj1.calcFrete("66110069");
        System.out.println("titulo " + "\033[31m" + obj1.titulo + "\033[m");
        System.out.println("numero de pag.: " + "\033[31m" + obj1.numeroPaginas + "\033[m");
        System.out.println("Ano pub.: " + "\033[31m" + obj1.anoPublicacao + "\033[m");
        System.out.printf("Frete %.2f", frete);
    }

}