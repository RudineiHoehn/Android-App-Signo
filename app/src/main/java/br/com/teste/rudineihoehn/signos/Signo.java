package br.com.teste.rudineihoehn.signos;

import java.io.Serializable;

/**
 * Created by RudineiH on 23/08/2017.
 */

public class Signo implements Serializable {
    private int diaInicio;
    private int diaFim;
    private int mesInicio;
    private int mesFim;
    private String nome;
    private String imagem;

    public Signo() {

    }

    public Signo(int diaInicio, int mesInicio, int diaFim, int mesFim, String nome, String imagem) {
        this.diaInicio = diaInicio;
        this.diaFim = diaFim;
        this.mesInicio = mesInicio;
        this.mesFim = mesFim;
        this.nome = nome;
        this.imagem = imagem;
    }

    public int getDiaInicio() {
        return diaInicio;
    }

    public void setDiaInicio(int diaInicio) {
        this.diaInicio = diaInicio;
    }

    public int getDiaFim() {
        return diaFim;
    }

    public void setDiaFim(int diaFim) {
        this.diaFim = diaFim;
    }

    public int getMesInicio() {
        return mesInicio;
    }

    public void setMesInicio(int mesInicio) {
        this.mesInicio = mesInicio;
    }

    public int getMesFim() {
        return mesFim;
    }

    public void setMesFim(int mesFim) {
        this.mesFim = mesFim;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

}
