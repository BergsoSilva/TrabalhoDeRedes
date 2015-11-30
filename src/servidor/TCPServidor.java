
package Servidor;
/**
 *
 * @author GRS
 */

import java.io.*; // classes para entrada e saidad de dados
import java.net.*;// classe para socket , servidorsocket , clientesocket
public class TCPServidor {

    public static void main(String[] args) throws IOException {
         String clienteCentenca;
         String sentencaCapturada;
         
         // cria sockete  de comunicação com os  cliente com a porta 6789
         ServerSocket bemvindoSocket = new ServerSocket(6789);
             System.out.println("Bemvindo1");
         // espera msg de lgum client e trata;
         
         while(true){
              System.out.println("Bemvindo2");
             // espera a conexao de algum cliente
              Socket conexaoSocket =  bemvindoSocket.accept();
              System.out.println(conexaoSocket.getLocalSocketAddress());
              // cria strens de entrada e saida com o cliente que chegou;
              
              BufferedReader cadeiaCliente = new BufferedReader(new InputStreamReader(conexaoSocket.getInputStream()));
              
              DataOutputStream servidorParaCliente =  new DataOutputStream(conexaoSocket.getOutputStream());
              
              // le linha do cliente
              
              clienteCentenca=cadeiaCliente.readLine();
              System.out.println(clienteCentenca);
              // tranfere a linha em mauscula
              sentencaCapturada=clienteCentenca.toUpperCase();
              System.out.println(sentencaCapturada);
              // enviar a linha maiuscula para o cliente
              
              servidorParaCliente.writeBytes(sentencaCapturada);
              
              
              
         }
         
         
        
    }
     
    
}
