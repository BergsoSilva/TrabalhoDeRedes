/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import dao.BDMensagensPadrao;
import excecao.BDException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author GRS
 */
public class ControlaConexao {
    public static Connection getConexao() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getCause());
        }
        return DriverManager.getConnection("jdbc:mysql://localhost/rede","root","root");
    }

    public static void fecharResultSet(ResultSet resultados) throws BDException{
        if(resultados!=null){
            try{
                resultados.close();
            }catch(SQLException ex){
                throw new BDException(BDMensagensPadrao.FECHAR_RESULTSET_ERRO, ex);
            }
        }
    }
    
    
    public static void fecharInstrucao(PreparedStatement instrucao) throws BDException{
        if(instrucao!=null){
            try{
                instrucao.close();
            }catch(SQLException ex){
                throw new BDException(BDMensagensPadrao.FECHAR_INSTRUCAO_ERRO, ex);
            }
        }
    }
    
    public static void fecharConexao(Connection conexao) throws BDException {
        if(conexao!=null){
            try{
                conexao.close();
            }catch(SQLException ex){
                throw new BDException(BDMensagensPadrao.FECHAR_CONEXAO_ERRO, ex);
            }
        }
    }
}
