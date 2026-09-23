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
public class MedicamentoMarca extends Medicamento{

    private String marca;
    
    public MedicamentoMarca(String nome, float valor, String marca){
        super(nome, valor);
        this.marca=marca;
    }
    
    @Override
    public float ValorComDesconto() {
        return valor * 0.90f;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
