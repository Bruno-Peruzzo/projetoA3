/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.de.dados;

import entities.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author user
 */
public class DAO{
    public boolean existe(Usuario usuario) throws Exception{
       String sql = "SELECT * FROM tb_user WHERE username = ? AND pass = ?";
        try (Connection conn = ConexaoBanco.getConexao();
        PreparedStatement ps = conn.prepareStatement(sql)){
        ps.setString(1, usuario.getUsername());
        ps.setString(2, usuario.getPass());
        try (ResultSet rs = ps.executeQuery()){
            return rs.next();
           }
       
    }
 }
 }
