/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraaplicacao;

/**
 *
 * @author Will
 */
public class Carro {

    private String chassi,
            cor,
            modelo;

    /**
     * Serve para retornar a informação do parâmetro chassi.
     *
     * @return
     */
    public String getChassi() {
        return chassi;
    }

    /**
     * Serve para incluir dados no parâmetro chassi.
     *
     * @param chassi
     */
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    /**
     * Serve para retornar a informação do parâmetro cor.
     *
     * @return
     */
    public String getCor() {
        return cor;
    }

    /**
     * Serve para incluir dados no parâmetro cor.
     *
     * @param cor
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * Serve para retornar a informação do parâmetro modelo.
     *
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Serve para incluir dados no parâmetro modelo.
     *
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
