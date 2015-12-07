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
public class Avaliacao {
   
    private Imagem imagem;
    private List<String> avaliadores =new ArrayList<>();
    private List<Integer> votos = new ArrayList<>();
    private Integer media;

    public Avaliacao() {
    }

    public Avaliacao(Imagem imagem, Integer media) {
        this.imagem = imagem;
        this.media = media;
    }

    public Imagem getImagem() {
        return imagem;
    }

    public void setImagem(Imagem imagem) {
        this.imagem = imagem;
    }

    public List<String> getAvaliadores() {
        return avaliadores;
    }

    public void setAvaliadores(List<String> avaliadores) {
        this.avaliadores = avaliadores;
    }

    public List<Integer> getVotos() {
        return votos;
    }

    public void setVotos(List<Integer> votos) {
        this.votos = votos;
    }

    public Integer getMedia() {
        return media;
    }

    public void setMedia(Integer media) {
        this.media = media;
    }
    
    

    
    
}
