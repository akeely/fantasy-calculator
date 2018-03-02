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
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class PlayerIdMapper implements InitializingBean {

    private static final File FILE = new File("data/sfb/playerIds.csv");

    private final PlayerRepository repository;

    public PlayerIdMapper(PlayerRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) throws IOException {

        PlayerIdMapper reader = new PlayerIdMapper(null);

        List<Player> players = reader.readPlayers(FILE);

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

    @Override
    public void afterPropertiesSet() throws Exception {

        List<Player> players = readPlayers(FILE);
        repository.saveAll(players);
    }
}
