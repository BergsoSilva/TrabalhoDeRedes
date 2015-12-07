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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Imagem;

public class TCPCliente {
    
    
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String sentenca;
        String sentencaModificada;
        List<String> imagens= new ArrayList<>();
        
        
        // cria o strens doteclado 
       
       // BufferedReader cadeiaUsuario = new BufferedReader( new InputStreamReader(System.in));
        // cria stresn (eencadiamnet) de entrada e saida
      // cria o socket de acesso ao server hostname na porta 6789
                Socket clienteSocket = new Socket("127.0.0.1",5000);
                
                Scanner c = new Scanner (clienteSocket.getInputStream());
                for (int i = 0; i < 10; i++) {
                 imagens.add(c.nextLine());
                 }
                System.out.println("Vamos ve "+c.nextLine());
               // ObjectInputStream objeto = new ObjectInputStream(clienteSocket.getInputStream());
                //imagens = (List<Object>) objeto.readObject();
                
                System.out.println(imagens);
                c.close();
                //objeto.close();
                // cria stresn (eencadiamnet) de entrada e saida
          //  DataOutputStream clienteParaServidor = new DataOutputStream(clienteSocket.getOutputStream());
            
           // BufferedReader cadeiaServidor = new BufferedReader(new InputStreamReader(clienteSocket.getInputStream()));
            // lê uma linha do teclaso de colaca numa senteca
            
           // sentenca=cadeiaUsuario.readLine();
            
            // envia a linah para o servidor
            
            //clienteParaServidor.writeBytes(sentenca+'\n');
            
            // lê uma linha do server
            
            //sentencaModificada=cadeiaServidor.readLine();
            
            // apresenta a linha do server no video
            
            //System.out.println("Para o servidor "+ cadeiaServidor);
        
    }
    
}
