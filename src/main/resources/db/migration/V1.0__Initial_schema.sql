--
CREATE TABLE `players` (
  id VARCHAR(255),
  name VARCHAR(255),
  fangraphs_id VARCHAR(255),
  fangraphs_name VARCHAR(255),
  yahoo_id VARCHAR(255),
  yahoo_name VARCHAR(255),
  espn_id VARCHAR(255),
  espn_name VARCHAR(255),
  PRIMARY KEY (id)
);

CREATE TABLE `fangraphs` (
  id VARCHAR(255),
  name VARCHAR(255),
  team VARCHAR(255),
  adp DOUBLE,
  PRIMARY KEY (id)
);