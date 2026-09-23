/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavendamedicamentos;

/**
 *
 * @author leoal
 */
public class Farmacia {
    private Medicamento[] medicamentos;
    private int qtd;
    
    public Farmacia(){
        medicamentos = new Medicamento[10];
        qtd=0;
    }
    
    public void adicionarMedicamento(Medicamento m){
        if(qtd<medicamentos.length){
            medicamentos[qtd]=m;
            qtd++;
        } else{
            System.out.println("A farmácia está cheia.");
        }
    }
    
    public float calcularTotalComDesconto(){
        float total = 0;
        for(int i = 0; i< qtd; i++){
            total+=medicamentos[i].ValorComDesconto();
        }
        return total;
    }
    
    public void resumoVenda(){
        float totalSemDesconto = 0;
        float totalComDesconto = 0;
        
        System.out.println("***** R E S U M O  D A  V E N D A *****");
        
        for(int i = 0; i <qtd; i++){
            Medicamento m = medicamentos[i];
            totalSemDesconto+=m.getValor();
            totalComDesconto+=m.ValorComDesconto();
            
            if(m instanceof MedicamentoMarca){
                MedicamentoMarca mm = (MedicamentoMarca) m;
                System.out.printf("%s (%s) - R$ %.2f -> R$ %.2f\n", mm.getNome(), mm.getMarca(), mm.getValor(), mm.ValorComDesconto());
            } else{
                System.out.printf("%s - R$ %.2f -> R$ %.2f\n", m.getNome(), m.getValor(), m.ValorComDesconto());
            }
        }
        
        System.out.println("****************************");
        System.out.printf("VALOR TOTAL SEM DESCONTO: R$ %.2f\n", totalSemDesconto);
        System.out.printf("VALOR TOTAL COM DESCONTO: R$ %.2f\n", totalComDesconto);
        System.out.println("****************************");
    }
}
