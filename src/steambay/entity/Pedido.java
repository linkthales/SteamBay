/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steambay.entity;

/**
 *
 * @author Daniel, Thales e Gabriel
 */
public class Pedido {
    private int id;
    private int quantidade;
    private double total;

    public Pedido(){}
    
    public Pedido(int i, double d) {
        this.quantidade = i;
        this.total = d;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
