
public class Questao1{
    public static void main(String[] args) {
        Pais pais = new Pais("Brasil","Brasilia",8516000);
        Pais pais1 = new Pais("Argentina","Buenos Aires",2780000);
        Pais pais2 = new Pais("Alemanha","Berlim",357376);
        Pais pais3 = new Pais("Uruguai","Montevidéu",176215);
        Pais pais4 = new Pais("Afeganistão","Cabul",652864);
        Pais pais5 = new Pais("Croácia","Zagreb",56594);
        Pais pais6 = new Pais("Itália","Roma",301338);
        System.out.println("EX: - Retorno da comparação entre o primeiro país com o segundo país: "+pais.equals(pais1));
        
        Pais[] lista_de_paises = {pais1,pais3};
        pais.defineFronteira(lista_de_paises);
        
        Pais[] lista_de_paises_classe = pais.getFronteiras();
        
        System.out.println("EX: - Países que fazem fronteira com o "+pais.getnome());
        for(int i=0;i<lista_de_paises_classe.length;i++){
            System.out.println("Nome : "+lista_de_paises_classe[i].getnome());
        }
        
        Pais[] lista_de_paises_comuns = {pais,pais1,pais2,pais3,pais4,pais5,pais6};
        pais.defineFronteira(lista_de_paises_comuns);
        pais4.defineFronteira(lista_de_paises_comuns);
        
        Pais[] lista_de_paises_comuns_classe = pais.vizinhosComuns(pais4);
        
        System.out.println("EX (hipotetico): - Países que fazem fronteira com o "+pais.getnome()+" e com o "+pais4.getnome());
        for(int i=0;i<lista_de_paises_comuns_classe.length;i++){
            System.out.println("Nome : "+lista_de_paises_comuns_classe[i].getnome());
        }
        
    }
}