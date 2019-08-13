/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.DaoRecemNascido;
import javax.swing.JOptionPane;
import modelo.RecemNascido;
import tela.manutencao.ManutencaoRecemNascido;


/**
 *
 * @author Administrador
 */
public class ControladorRecemNascido {
    public static void inserir(ManutencaoRecemNascido man){
        RecemNascido objeto = new RecemNascido();
        objeto.setNome_da_mae(man.jtfNomeDaMae.getText());
        objeto.setPeso(man.jtfPeso.getText());
        objeto.setNumero_quarto(man.jtfNumerodeQuarto.getText());
        objeto.setsexo(man.jtfSexo.getText());
        
        
        
        boolean resultado = DaoRecemNascido.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}

    public static void alterar(ManutencaoRecemNascido aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void excluir(ManutencaoRecemNascido aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
}
