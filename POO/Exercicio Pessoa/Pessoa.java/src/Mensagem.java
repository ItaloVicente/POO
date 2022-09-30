import java.io.DataInput;
import java.time.LocalDateTime;

public class Mensagem {
    private String contato;
    private String mensagem;
    private LocalDateTime envio;
    //private String data; (como fazer a data ficar automatica?)
    public Mensagem(String contato, String mensagem) {
        this.contato = contato;
        this.mensagem = mensagem;
        this.envio= LocalDateTime.now();

    }
    public String getContato() {
        return contato;
    }
    public void setContato(String contato) {
        this.contato = contato;
    }
    public String getMensagem() {
        return mensagem;
    }
    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    public void mostrarDados (Mensagem dados){
        System.out.println("Destinatario: " + dados.getContato());
        System.out.println("Mensagem enviada: " + dados.getMensagem());
        //nao sei o que enviar de hora.
    }
}
