/***************************************************************************
 * COPYRIGHT (C) 2012-2018, Rapid7 LLC, Boston, MA, USA.
 * All rights reserved. This material contains unpublished, copyrighted
 * work including confidential and proprietary information of Rapid7.
 **************************************************************************/
package io.keely.fantasycalculator.fangraphs;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.csv.CSVFormat;

import com.google.common.collect.ImmutableList;

public class FangraphsReader {

    public static void main(String[] args) throws IOException {

        FangraphsReader reader = new FangraphsReader();
        List<FangraphsPlayer> players = reader.readPlayers(ImmutableList.of(
                new File("data/fangraphs/batters.atc.projections.csv"),
                new File("data/fangraphs/pitchers.atc.projections.csv")
        ));

        players.forEach(System.out::println);
    }

    public List<FangraphsPlayer> readPlayers(List<File> projectionFiles) throws IOException {

        ImmutableList.Builder<FangraphsPlayer> players = ImmutableList.builder();

        for (File projectionFile : projectionFiles) {
            try (FileReader reader = new FileReader(projectionFile)) {
                List<FangraphsPlayer> p = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(reader).getRecords()
                        .stream()
                        .map(FangraphsPlayer::new)
                        .collect(Collectors.toList());
                players.addAll(p);
            }
        }

        return players.build();
    }


}
