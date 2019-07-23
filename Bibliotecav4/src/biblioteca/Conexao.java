package biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexao {
    
        private ResultSet rs = null;
        private Connection con = null;
        private Statement stmt = null;
        public  static String url = "jdbc:postgresql://localhost:5432/BIBLIOTECA";
        public static String usuario = "postgres";
        public static String senha = "12345678";
          
        boolean teste_conexao(){
            try{    
                con = DriverManager.getConnection(url, usuario, senha);
                con.close();
                return true;
            
            }catch(SQLException e){
                return false;
            }   
        }
        
        
        boolean insere_cliente(String nome, String cpf, String fone){
            try{
            if(nome.length() != 0 && cpf.length() != 0 && fone.length() != 0){
                con = DriverManager.getConnection(url, usuario, senha);
                stmt = con.createStatement();
                String sql = "INSERT INTO CLIENTE(nome_cliente, cpf_cliente, fone_cliente) VALUES( '"
                        +nome + "' ,'"
                        +cpf + "' ,'"
                        +fone + "');";
                
                stmt.executeUpdate(sql);
                stmt.close();
                con.close();
                return true;
            }else{
                return false;
            }
            }catch(SQLException e){
                return false;
            }
        }
            
        boolean insere_livro(String codLivro, String titulo, int ano, String isbn, int copias, String editora, String categoria, String autor){
            try{
            if(titulo.length() != 0 && ano != 0 && isbn.length() != 0 && copias != 0 && editora.length() != 0 && categoria.length() != 0 && autor.length() != 0){
                con = DriverManager.getConnection(url, usuario, senha);
                stmt = con.createStatement();
                String sql1 = "INSERT INTO LIVRO(cod_livro, titulo, ano_publicacao, isbn, copias, editora, categoria, autor) VALUES( '"
                        +codLivro + "' ,'"
                        +titulo + "' ,"
                        +ano + " ,'"
                        +isbn + "' ,"
                        +copias + " ,'"
                        +editora + "' ,'"
                        +categoria + "' ,'"
                        +autor + "');";
                
                stmt.executeUpdate(sql1);
                stmt.close();
                con.close();
                return true;
            }else{
                return false;
            }
            }catch(SQLException e){
                return false;
            }
            
        }
        
        boolean atualiza_livro(String codLivro, String titulo, int ano, String isbn, int copias, String editora, String categoria, String autor){
            try{
            con = DriverManager.getConnection(url, usuario, senha);
                stmt = con.createStatement();
                String sql1;
                if(titulo.length() != 0 && ano != 0 && isbn.length() != 0 && copias != 0 && editora.length() != 0 && categoria.length() != 0 && autor.length() != 0){
                    sql1 = "UPDATE LIVRO" +
                            " SET titulo = '" + titulo + "', " + 
                            "ano_publicacao = " + ano + ", " +
                            "isbn = '" + isbn + "', " +
                            "copias = " + copias + ", " +
                            "editora = '" + editora + "', " +
                            "categoria = '" + categoria + "', " +
                            "autor = '" + autor + "' " + 
                            "WHERE cod_livro = '" + codLivro + "';";
                    stmt.executeUpdate(sql1);
                }
                
                stmt.close();
                con.close();
                return true;
            }catch(SQLException e){
                return false;
            }
            
        }
        
        boolean atualiza_cliente(int id, String nomeCliente, String cpfCliente, String foneCliente){
            try{
            con = DriverManager.getConnection(url, usuario, senha);
                stmt = con.createStatement();
                String sql1;
                
                if(nomeCliente.length() != 0 && cpfCliente.length() != 0 && foneCliente.length() != 0){
                    sql1 = "UPDATE CLIENTE " + 
                            "SET nome_cliente = '" + nomeCliente + "', " +
                            "cpf_cliente = '" + cpfCliente + "', " +
                            "fone_cliente = '" + foneCliente + "' " +
                            "WHERE id_cliente = " + id + ";";
                    stmt.executeUpdate(sql1);
                }
                
                
                stmt.close();
                con.close();
                return true;
            }catch(SQLException e){
                return false;
            }
            
        }
        
        boolean empresta_livro(String dtEmprestimo, String dtDevolucao, int prazo, int idLivro, int idCliente){
            try {
                con = DriverManager.getConnection(url, usuario, senha);
                stmt = con.createStatement();
                String sql1 = "INSERT INTO LOCACAO(data_locacao, data_devolucao, prazo_devolucao, devolvido, id_livro_FK, id_cliente_FK) VALUES( '"
                        +dtEmprestimo + "' ,'"
                        +dtDevolucao + "' ,"
                        +prazo + " ,"
                        +"'nao' ,"
                        +idLivro + " ,"
                        +idCliente + ");";
                
                stmt.executeUpdate(sql1);
                stmt.close();
                con.close();
                return true;
            }catch(SQLException e){
                return false;
            }   
        }
        
        public ResultSet BuscarCliente(String busca, int tipo){
            ResultSet rs = null;
            String sql="";
            try{
                con = DriverManager.getConnection(url,usuario,senha);
                stmt = con.createStatement();
                if(tipo == 0){
                    sql = "SELECT * FROM CLIENTE WHERE nome_cliente ilike '%"
                        + busca + "%' ;  ";
                }else if(tipo == 1){
                    sql = "SELECT * FROM CLIENTE WHERE cpf_cliente ilike '%"
                        + busca + "%' ;  ";
                }else if(tipo == 2){
                    sql = "SELECT * FROM CLIENTE;";
                }
                
                stmt.executeQuery(sql);
                rs = stmt.getResultSet();
                con.close();
                return rs;
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao consultar Cliente");
                return rs;
            }
        }
        
        public ResultSet BuscarLivro(String busca, int tipo){
            ResultSet rs = null;
            String sql="";
            try{
                con = DriverManager.getConnection(url,usuario,senha);
                stmt = con.createStatement();
                if(tipo == 0){
                    sql = "SELECT * FROM LIVRO WHERE titulo ilike '%"
                        + busca + "%';";
                }else if(tipo == 1){
                    sql = "SELECT * FROM LIVRO;";
                }else if(tipo == 2){
                    sql = "SELECT * FROM LIVRO WHERE cod_livro ilike '%"
                        + busca + "%';";
                }else if(tipo == 3){
                    sql = "SELECT * FROM LIVRO WHERE id_livro = " + Integer.parseInt(busca) + ";";
                }
                
                stmt.executeQuery(sql);
                rs = stmt.getResultSet();
                con.close();
                return rs;
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao consultar Livro");
                return rs;
            }    
        }
        
        public ResultSet BuscarClienteLocacao(int busca, int tipo){
            ResultSet rs = null;
            String sql="";
            try{
                con = DriverManager.getConnection(url,usuario,senha);
                stmt = con.createStatement();
                if(tipo == 0){
                    sql = "SELECT * FROM LOCACAO WHERE id_cliente_FK = "
                        + busca;
                }else if(tipo == 1){
                    sql = "SELECT * FROM LOCACAO;";
                }
                stmt.executeQuery(sql);
                rs = stmt.getResultSet();
                con.close();
                return rs;
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Erro ao buscar Locação");
                return rs;
            }
        }
        
        boolean atualiza_locacao(int id){
            try {
                con = DriverManager.getConnection(url, usuario, senha);
                stmt = con.createStatement();
                String sql1 = "UPDATE LOCACAO SET devolvido = 'sim' WHERE id_locacao = " + id;
                       
                stmt.executeUpdate(sql1);
                stmt.close();
                con.close();
                return true;
            }catch(SQLException e){
                return false;
            }   
        }        
}