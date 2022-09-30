public class Data {
    int ano;
    int mes;
    int dia;
    public Data(int ano, int mes, int dia) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void toString (Data data){
        System.out.println(data.getDia() + "/" + data.getMes() + "/" + data.getAno());
    }
    public void avancar(Data data){
        if(data.getDia()==30){
            if(data.getMes()==12){
                data.setDia(1);
                data.setMes(1);
                data.setAno(data.getAno()+1);
            }
            else{
                data.setDia(1);
                data.setMes(data.getMes()+1);
            }
        }
        else{
            data.setDia(data.getDia()+1);
        }
    }
    public boolean verificar (Data data){
        if(this.ano>data.getAno()){
            System.out.println("A data passada como parametro e mais antiga");
            return false;
        }
        if(this.ano<data.getAno()){
            System.out.println("A data passada como parametro e mais recente");
            return true;
        }
        if(this.ano==data.getAno()){
            if(this.mes>data.getMes()){
                System.out.println("A data passada como parametro e mais antiga");
                return false;
            }
            if(this.mes<data.getMes()){
                System.out.println("A data passada como paramentro e mais recente");
                return true;
            }
            if(this.mes==data.getMes()){
                if(this.dia>data.getDia()){
                    System.out.println("A data passada como parametro e mais antiga");
                    return false;
                }
                if(this.dia<data.getDia()){
                    System.out.println("A data passada como parametro e mais recente");
                    return true;
                }
                if(this.dia==data.getDia()){
                    System.out.println("As datas possuem o mesmo dia, mes e ano");
                }
            }
        }
        return false;
    }


}
