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
public class SistemaVendaMedicamentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MedicamentoGenerico g1= new MedicamentoGenerico("Dipirona", 20);
        MedicamentoGenerico g2= new MedicamentoGenerico("Paracetamol", 20);
        MedicamentoGenerico g3= new MedicamentoGenerico("Ibuprofeno", 20);
        
        MedicamentoMarca m1= new MedicamentoMarca("Dorflex", 30, "Sanofi");
        MedicamentoMarca m2= new MedicamentoMarca("Tylenol", 40, "Janssen");
        
        Farmacia f = new Farmacia();
        
        f.adicionarMedicamento(g1);
        f.adicionarMedicamento(g2);
        f.adicionarMedicamento(g3);
        
        f.adicionarMedicamento(m1);
        f.adicionarMedicamento(m2);
        
        f.resumoVenda();

    }
    
}
