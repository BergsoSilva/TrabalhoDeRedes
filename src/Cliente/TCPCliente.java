/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;
/**
 *
 * @author GRS
 */

import java.io.*;
import java.net.*;

public class TCPCliente {
    
    public static void main(String[] args) throws IOException {
        String sentenca;
        String sentencaModificada;
        
        // cria o strens doteclado 
       
        BufferedReader cadeiaUsuario = new BufferedReader( new InputStreamReader(System.in));
        // cria o socket de acesso ao server hostname na porta 6789
        Socket clienteSocket = new Socket("localhost",6789);
        // cria stresn (eencadiamnet) de entrada e saida 
        DataOutputStream clienteParaServidor = new DataOutputStream(clienteSocket.getOutputStream());
        
        BufferedReader cadeiaServidor = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));
        // lê uma linha do teclaso de colaca numa senteca
        
        sentenca=cadeiaUsuario.readLine();
        
        // envia a linah para o servidor
        
        clienteParaServidor.writeBytes(sentenca+'\n');
        
        // lê uma linha do server
        
        sentencaModificada=cadeiaServidor.readLine();
        
        // apresenta a linha do server no video
        
        System.out.println("Para o servidor "+ cadeiaServidor);
        
        clienteSocket.close();
    }
    
}
