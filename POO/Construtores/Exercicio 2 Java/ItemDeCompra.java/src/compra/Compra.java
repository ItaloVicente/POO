package compra;
import java.util.ArrayList;
import java.util.List;

public class Compra{
    private ItemDeCompra[] produtos = new ItemDeCompra[5]; //Array com os produtos comprados (Nome, preço e todas os atributos de um objeto da classe ItemDeCompra)
	private double total = 0.0; //Valor total da compra, que será definido com os métodos de inserir item e o de dar desconto, mas que por padrão é zero
	private double desconto = 0.0;
	private int formaDePagamento;
	private int quantidadeParcelas = 0;
    Compra(){

    }
    public Compra(ItemDeCompra[] produtos) {
        this.produtos = produtos;
    }
    public ItemDeCompra[] getProdutos() {
        return produtos;
    }
    public int getQuantidadeParcelas() {
        return quantidadeParcelas;
    }
    public void setFormaDePagamento(int formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
    public void setQuantidadeParcelas(int quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }
    public void inserirItem(ItemDeCompra itemDeCompra) {
		for(int i = 0; i < produtos.length; i++) {
			if(produtos[i] == null) {
				produtos[i] = itemDeCompra;
				break;
			}
		}
	}
    public double calcularTotalCompra() {
		double total = 0.0;
		for(int i = 0; i < produtos.length; i++) {
			if(produtos[i] != null) {
				total += produtos[i].calcularTotal();
			}
		}
		return total;
	}
    public void darDesconto(double porcentagem) {
		this.desconto = calcularTotalCompra()*porcentagem/100;
	}
    public void calcularTotalFinal() {
		this.total = calcularTotalCompra() - desconto;
	}
    public void gerarRelatorio() {
		System.out.println("-------------CUPOM FISCAL-------------");
		for(int i = 0; i < produtos.length; i++) {
			if(produtos[i] != null) {
				System.out.println("Produto:               " + produtos[i].getNome());
				System.out.println("Codigo do Produto:     " + produtos[i].getCodigo());
				System.out.println("Preco unitario:        R$" + produtos[i].getPrecoUnitario());
				System.out.println("Quantidade:            " + produtos[i].getQuantidadeComprada());
				System.out.println();
			}
		}
		System.out.println("...........................................................");
		switch(this.formaDePagamento) {
		case 1:
			System.out.println("Forma de Pagamento:     A vista");
			System.out.println("Valor bruto             R$" + calcularTotalCompra());
			System.out.println("Valor do desconto       R$" + desconto);
			System.out.printf("Valor total da compra:  R$%.2f", this.total);
			break;
		case 2:
			System.out.println("Forma de Pagamento:     Cartao de Credito");
			System.out.println("Valor bruto             R$" + calcularTotalCompra());
			System.out.println("Valor do desconto       R$" + desconto);
			System.out.printf("Numero de Parcelas:     %d%n", quantidadeParcelas);
			System.out.printf("Valor de cada parcela:  R$%.2f%n", this.total / quantidadeParcelas);
			System.out.printf("Valor total da compra:  R$%.2f", this.total);
		}
    }
}
