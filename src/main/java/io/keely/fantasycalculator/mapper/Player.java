/***************************************************************************
 * COPYRIGHT (C) 2012-2018, Rapid7 LLC, Boston, MA, USA.
 * All rights reserved. This material contains unpublished, copyrighted
 * work including confidential and proprietary information of Rapid7.
 **************************************************************************/
package io.keely.fantasycalculator.mapper;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.csv.CSVRecord;

import com.google.common.base.MoreObjects;

@Entity
@Table(name = "players")
public class Player {

    @Id
    private String id;
    private String name;
    private String fangraphsId;
    private String fangraphsName;
    private String yahooId;
    private String yahooName;
    private String espnId;
    private String espnName;

    /**
     * Empty c-tor for hibernate
     */
    Player() { }

    public Player(CSVRecord record) {

        this.id = record.get("IDPLAYER");
        this.name = record.get("PLAYERNAME");
        this.fangraphsId = record.get("IDFANGRAPHS");
        this.fangraphsName = record.get("FANGRAPHSNAME");
        this.yahooId = record.get("YAHOOID");
        this.yahooName = record.get("YAHOONAME");
        this.espnId = record.get("ESPNID");
        this.espnName = record.get("ESPNNAME");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFangraphsId() {
        return fangraphsId;
    }

    public String getFangraphsName() {
        return fangraphsName;
    }

    public String getYahooId() {
        return yahooId;
    }

    public String getYahooName() {
        return yahooName;
    }

    public String getEspnId() {
        return espnId;
    }

    public String getEspnName() {
        return espnName;
    }

    void setId(String id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setFangraphsId(String fangraphsId) {
        this.fangraphsId = fangraphsId;
    }

    void setFangraphsName(String fangraphsName) {
        this.fangraphsName = fangraphsName;
    }

    void setYahooId(String yahooId) {
        this.yahooId = yahooId;
    }

    void setYahooName(String yahooName) {
        this.yahooName = yahooName;
    }

    void setEspnId(String espnId) {
        this.espnId = espnId;
    }

    void setEspnName(String espnName) {
        this.espnName = espnName;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("name", name)
                .add("fangraphsId", fangraphsId)
                .add("fangraphsName", fangraphsName)
                .add("yahooId", yahooId)
                .add("yahooName", yahooName)
                .add("espnId", espnId)
                .add("espnName", espnName)
                .toString();
    }
}
