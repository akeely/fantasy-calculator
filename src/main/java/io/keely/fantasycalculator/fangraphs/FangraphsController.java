/***************************************************************************
 * COPYRIGHT (C) 2012-2018, Rapid7 LLC, Boston, MA, USA.
 * All rights reserved. This material contains unpublished, copyrighted
 * work including confidential and proprietary information of Rapid7.
 **************************************************************************/
package io.keely.fantasycalculator.fangraphs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1/fangraphs")
public class FangraphsController {

    private final FangraphsPlayerRepository repository;

    public FangraphsController(FangraphsPlayerRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Iterable<FangraphsPlayer> findAll() {

        return repository.findAll();
    }
}
