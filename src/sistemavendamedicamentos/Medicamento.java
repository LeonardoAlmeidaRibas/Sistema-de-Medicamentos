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
public abstract class Medicamento {
    protected String nome;
    protected float valor;

    public Medicamento(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
    }
    
    public abstract float ValorComDesconto();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "Nome:" + nome + ", Valor:" + valor + '}';
    }
}
