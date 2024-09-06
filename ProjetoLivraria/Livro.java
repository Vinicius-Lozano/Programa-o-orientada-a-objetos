package ProjetoLivraria;

public class Livro {

  String titulo; 
  int numeroPaginas;
  String genero;
  int anoPublicacao;
  double preco;
  String autor;

public Livro(){

}

public void setPreco(double preco){
    this.preco = preco;
}

public Livro(double preco, String titulo){
    this.preco = preco;
    this.titulo = titulo;
}

public double getPreco(){
    return this.preco;
}

    void cadastrar(){
        System.out.println("cadastro");
    }
    double calcFrete(String cep){
        double valorFrete = 0;
        System.out.println("calculando o Frete" + cep);
        return valorFrete; 
    }

    void vender(){
        System.out.printf("vendendo o Livro por R$%.2f%n", this.preco);
    }
    String trocar(){
        return "Livro trocado";
    }
}
