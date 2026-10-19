
package petshop;


public class Atendimento {
    private int codigo;
    private Pet pet;
    private String servico;
    private int valorCentavos;
    private boolean concluido;
     
    public Atendimento(int codigo, Pet pet, String servico, int valorCentavos){
    this.codigo = codigo;
    this.pet = pet;
    this.servico = servico;
    this.valorCentavos = valorCentavos;
    this.concluido = false;
    }
    
    public int getCodigo(){
        return codigo;
    }
    public String getSituacao(){
        if (concluido){
            return "Concluído";
        } else {
            return "Pendente";
        }
    }
    
        public boolean concluir(){
            if(concluido) {
                return false;
            } else {
                concluido = true;
                return true;
            }
        }
        //Valores de serviço 
    
    
   
        
    
}

