/***************************************************************************
 * COPYRIGHT (C) 2012-2018, Rapid7 LLC, Boston, MA, USA.
 * All rights reserved. This material contains unpublished, copyrighted
 * work including confidential and proprietary information of Rapid7.
 **************************************************************************/
package io.keely.fantasycalculator.fangraphs;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.csv.CSVRecord;

import com.google.common.base.MoreObjects;

@Entity
@Table(name = "fangraphs")
public class FangraphsPlayer {

    @Id
    private String id;
    private String name;
    private String team;
    private double adp;

    public FangraphsPlayer(String id, String name, String team, double adp) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.adp = adp;
    }

    /**
     * Default c-tor for hibernate.
     */
    FangraphsPlayer() {}

    public FangraphsPlayer(CSVRecord record) {
        this.id = record.get("playerid");
        this.team = record.get("Team");
        this.adp = Double.valueOf(record.get("ADP"));
        this.name = record.get("Name");
        //this.name = record.get("\uFEFF\"Name\"");
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public double getAdp() {
        return adp;
    }

    void setId(String id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setTeam(String team) {
        this.team = team;
    }

    void setAdp(double adp) {
        this.adp = adp;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("name", name)
                .add("team", team)
                .add("adp", adp)
                .toString();
    }
}
