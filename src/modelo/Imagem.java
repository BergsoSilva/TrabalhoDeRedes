/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GRS
 */
public class Imagem {
    private String descricao;
    private String urlImg;
    

    public Imagem() {
        this.descricao ="";
        this.urlImg = "";
       
    }

    public Imagem(String descricao, String urlImg) {
        this.descricao = descricao;
        this.urlImg = urlImg;
        
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    @Override
    public String toString() {
        return  descricao ;
    }
   
    
   
    
    
}
