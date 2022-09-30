public class Principal{
    public static void main(String[] args) {
        Data d1 = new Data(2000,10,20);
        Data d2 = new Data(2022,12,30);
        d1.avancar(d1);
        d2.avancar(d2);
        System.out.println(d1.getDia());
        System.out.println(d2.getAno());
    }
}