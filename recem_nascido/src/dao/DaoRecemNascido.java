/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.RecemNascido;

/**
 *
 * @author Administrador
 */
public class DaoRecemNascido {
     public static boolean inserir(RecemNascido objeto) {
        String sql = "INSERT INTO recem_nascido (codigo, nome_da_mae, peso, numero_quarto, sexo) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
             ps.setString(1, objeto.getNome_da_mae());
             ps.setDouble(2, objeto.getPeso());
             ps.setInt(3, objeto.getNumero_quarto());
             ps.setString(4, objeto.getSexo());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
      public static void main(String[] args) {
        RecemNascido objeto = new RecemNascido ();
        objeto.setNome_da_mae("Brasil");
        objeto.setPeso("4");
        objeto.setNumero_quarto(102);
        objeto.setSexo("F");
        
        
        boolean resultado = inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
      public static boolean alterar(RecemNascido objeto) {
        String sql = "UPDATE recemnascido SET codigo = ?, nome_da_mae = ?, peso = ?,  WHERE codigo=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.getNome_da_mae());
            ps.setDouble(2, objeto.getPeso());
             ps.setInt(3, objeto.getNumero_quarto());
             ps.setString(4, objeto.getSexo());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
      public static boolean excluir(RecemNascido objeto) {
        String sql = "DELETE FROM recemnascido WHERE nome-da_mãe=?";
        try {
            PreparedStatement ps = conexao.Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, objeto.Nome_da_mae());
            ps.executeUpdate();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    
}
