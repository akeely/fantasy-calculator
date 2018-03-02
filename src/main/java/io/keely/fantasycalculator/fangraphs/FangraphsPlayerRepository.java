/***************************************************************************
 * COPYRIGHT (C) 2012-2018, Rapid7 LLC, Boston, MA, USA.
 * All rights reserved. This material contains unpublished, copyrighted
 * work including confidential and proprietary information of Rapid7.
 **************************************************************************/
package io.keely.fantasycalculator.fangraphs;

import org.springframework.data.repository.CrudRepository;

public interface FangraphsPlayerRepository extends CrudRepository<FangraphsPlayer, String> {
}
