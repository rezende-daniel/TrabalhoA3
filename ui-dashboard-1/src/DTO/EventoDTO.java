/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author rezen
 */
public class EventoDTO {

    private String nomeEvento;
    private String tipoEvento;
    private Integer diaEvento;
    private Integer mesEvento;
    private Integer ID;
    private String localEvento;
    private String cliente;
    private String descricao;
    private Integer valor;

    /**
     * @return the nomeEvento
     */
    public String getNomeEvento() {
        return nomeEvento;
    }

    /**
     * @param nomeEvento the nomeEvento to set
     */
    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    /**
     * @return the tipoEvento
     */
    public String getTipoEvento() {
        return tipoEvento;
    }

    /**
     * @param tipoEvento the tipoEvento to set
     */
    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    /**
     * @return the diaEvento
     */
    public Integer getDiaEvento() {
        return diaEvento;
    }

    /**
     * @param diaEvento the diaEvento to set
     */
    public void setDiaEvento(Integer diaEvento) {
        this.diaEvento = diaEvento;
    }

    /**
     * @return the mesEvento
     */
    public Integer getMesEvento() {
        return mesEvento;
    }

    /**
     * @param mesEvento the mesEvento to set
     */
    public void setMesEvento(Integer mesEvento) {
        this.mesEvento = mesEvento;
    }

    /**
     * @return the ID
     */
    public Integer getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(Integer ID) {
        this.ID = ID;
    }

    /**
     * @return the localEvento
     */
    public String getLocalEvento() {
        return localEvento;
    }

    /**
     * @param localEvento the localEvento to set
     */
    public void setLocalEvento(String localEvento) {
        this.localEvento = localEvento;
    }

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the valor
     */
    public Integer getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Integer valor) {
        this.valor = valor;
    }

}
