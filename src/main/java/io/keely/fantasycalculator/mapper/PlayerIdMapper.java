/***************************************************************************
 * COPYRIGHT (C) 2012-2018, Rapid7 LLC, Boston, MA, USA.
 * All rights reserved. This material contains unpublished, copyrighted
 * work including confidential and proprietary information of Rapid7.
 **************************************************************************/
package io.keely.fantasycalculator.mapper;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.csv.CSVFormat;

public class PlayerIdMapper {

    public static void main(String[] args) throws IOException {

        PlayerIdMapper reader = new PlayerIdMapper();

        List<Player> players = reader.readPlayers(new File("data/sfb/playerIds.csv"));

        players.forEach(System.out::println);
    }

    public List<Player> readPlayers(File playerIdFile) throws IOException {

        try (FileReader reader = new FileReader(playerIdFile)) {
            return CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(reader).getRecords()
                    .stream()
                    .map(Player::new)
                    .collect(Collectors.toList());
        }
    }
}
