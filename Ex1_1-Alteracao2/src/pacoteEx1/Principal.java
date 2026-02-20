package pacoteEx1;
public class Principal {
    public static void main(String[] args) {
        Produto produto =  new Produto();
        produto.nome = "Shampoo";
        produto.preco = 22.99;
        produto.estoque = 20;
        
        System.out.println("Nome do produto: " + produto.nome);
        System.out.println("Preço: " + produto.preco);
        System.out.println("Valor total do estoque: " + produto.estoque * produto.preco);
        
        Produto produto2 = new Produto();
        produto2.nome = "Condicionador";
        produto2.preco = 24.90;
        produto2.estoque = 10;
        
        System.out.println("Nome do produto: " + produto2.nome);
        System.out.println("Preço: " + produto2.preco);
        System.out.println("Valor total do estoque: " + produto2.estoque * produto2.preco);
        
        if(produto.preco > produto2.preco){
            System.out.println("\nProduto mais caro: " + produto.nome);
        } else{
            System.out.println("\nProduto mais caro: " + produto2.nome);
        }
       
        
    }
    
}
