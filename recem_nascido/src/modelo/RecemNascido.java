/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class RecemNascido {
     private Integer codigo;
     private String nome_da_mae;
     private Double peso;
     private Integer numero_quarto;
     private String sexo;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome_da_mae() {
        return nome_da_mae;
    }

    public void setNome_da_mae(String nome_da_mae) {
        this.nome_da_mae = nome_da_mae;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Integer getNumero_quarto() {
        return numero_quarto;
    }

    public void setNumero_quarto(Integer numero_quarto) {
        this.numero_quarto = numero_quarto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "RecemNascido{" + "nome_da_mae=" + nome_da_mae + '}';
    }

    
     
     
  
      
    
    
}
