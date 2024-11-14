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

}
