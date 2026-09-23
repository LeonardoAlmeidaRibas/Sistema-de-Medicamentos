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
public class MedicamentoGenerico extends Medicamento{
    public MedicamentoGenerico(String nome, float valor){
        super(nome,valor);
    }

    @Override
    public float ValorComDesconto() {
        return valor * 0.80f;
    }
    
}