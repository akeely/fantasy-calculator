/***************************************************************************
 * COPYRIGHT (C) 2012-2018, Rapid7 LLC, Boston, MA, USA.
 * All rights reserved. This material contains unpublished, copyrighted
 * work including confidential and proprietary information of Rapid7.
 **************************************************************************/
package io.keely.fantasycalculator.mapper;

import org.apache.commons.csv.CSVRecord;

import com.google.common.base.MoreObjects;

public class Player {

    private final String id;
    private final String name;
    private final String fangraphsId;
    private final String fangraphsName;
    private final String yahooId;
    private final String yahooName;
    private final String espnId;
    private final String espnName;

    public Player(String id, String name, String fangraphsId, String fangraphsName, String yahooId, String yahooName,
            String espnId, String espnName) {

        this.id = id;
        this.name = name;
        this.fangraphsId = fangraphsId;
        this.fangraphsName = fangraphsName;
        this.yahooId = yahooId;
        this.yahooName = yahooName;
        this.espnId = espnId;
        this.espnName = espnName;
    }

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
