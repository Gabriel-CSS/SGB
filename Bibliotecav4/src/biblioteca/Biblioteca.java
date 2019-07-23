package biblioteca;

import javax.swing.JOptionPane;

public class Biblioteca {

    public static void main(String[] args) {
        
        Conexao C = new Conexao();
        
        if(C.teste_conexao() == true){
            TelaPrincipal TelaP = new TelaPrincipal();
            TelaP.show();
        }else if(C.teste_conexao() == false){
            JOptionPane.showMessageDialog(null, "Conexão mal sucedida!");
        }
 
    }
    
}
