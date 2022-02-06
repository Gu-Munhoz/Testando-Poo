public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("************************");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo:" + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String t){
        setTipo(t);
        setStatus(true);

        System.out.println("Conta aberta com sucesso!!");

        if (t == "CC"){
            this.setSaldo(50);
        }else if (t == "CP"){
            this.setSaldo(150);
        }
    }
    public void fecharConta(){
        if(this.getSaldo() > 0 ){
            System.out.println("Conta com dinheiro");
        }else if (this.getSaldo() < 0 ){
            System.out.println("Conta com débito");
        } else {
            this.setStatus(false);
        }
    }
    public void depositar(float v){
        if(this.getStatus()){
            this.setSaldo(getSaldo() + v);
        }else{
            System.out.println("Impossivel depositar");
        }
    }
    public void sacar(float v){
        if(this.getStatus()){
           if (this.getSaldo() >= v){
               this.setSaldo(this.getSaldo() - v);
               System.out.println("Saque realizado com sucesso");
           }else{
               System.out.println("Saldo insuficiente para saque");
           }
        }else{
            System.out.println("Impossível sacar");
        }
    }
    public void pagarMensal(){
        int v = 0;

        if(this.getTipo() == "CC"){
            v = 12;
        }else if (this.getTipo() == "CP"){
            v = 20;
        }

        if (getStatus() == true){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
            }else{
                System.out.println("Seu saldo é insuficiente");
            }
        }else{
            System.out.println("Você não tem conta aberta");
        }
    }

    //Métodos especiais
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
