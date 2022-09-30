public class Pais {
    private String nome;
    private String capital;
    private double dimensao;
    private Pais[] fronteiras;
    public Pais (String n, String c, double d){
        nome=n;
        capital=c;
        dimensao=d;
    }
    public String getcapital(){
        return capital;
    }
    public void setcapital(String capital){
        this.capital=capital;
    }
    public String getnome(){
        return nome;
    }
    public void setnome(String nome){
        this.nome= nome;
    }
    public double getdimensao(){
        return dimensao;
    }
    public void setdimensao(double dimensao){
        this.dimensao=dimensao;
    }
    void print(){
        System.out.println("Pais: " + nome);
        System.out.println("Capital: " + capital);
        System.out.println("Dimensao (km quadrados): " + dimensao);
    }
    public boolean equals (final Pais outro){
        boolean x= false;
        String nome=this.nome;
        String capital=this.capital;
        String nomeOutroPais= outro.getnome();
        String capitalOutroPais=outro.getcapital();
        if(nome.equals(nomeOutroPais) && (capital.equals(capitalOutroPais))){
            return true;
        }else{
            return false;
        }
    }
    public void defineFronteira(Pais... paises){
        int quantPaisesIguais=0;
        for(int i = 0;i<paises.length;i++){
            if(this.equals(paises[i])){
                quantPaisesIguais++;
            }
        }
        this.fronteiras= new Pais[paises.length-quantPaisesIguais];
        int xFronteira = 0;
        for(int i=0;i<paises.length;i++){
            if(!this.equals(paises[i])){
                this.fronteiras[xFronteira]=paises[i];
                xFronteira++;
            }
        }
    }
    public Pais[] getFronteiras(){
        return this.fronteiras;
    }
    public Pais[] vizinhosComuns(Pais outro){
        int totaisIguais=0;
        for(Pais fronteiraPais : this.fronteiras){
            for(Pais fronteiraOutro : outro.fronteiras){
                if(fronteiraPais.equals(fronteiraOutro)){
                    totaisIguais++;
                }
            }
        }
        if(totaisIguais>0){
            int xVizinhos=0;
            Pais[] mesmosVizinhos = new Pais [totaisIguais];
            for(Pais fronteiraPais:this.fronteiras){
                for(Pais fronteiraOutro : outro.fronteiras){
                    if(fronteiraPais.equals(fronteiraOutro)){
                        mesmosVizinhos[xVizinhos] = fronteiraOutro;
                        xVizinhos++;
                    }
                }
            }
            return mesmosVizinhos;
        }
        return null;
    }
}

