--
CREATE TABLE `players` (
  id VARCHAR(255),
  name VARCHAR(255),
  fangraphsid VARCHAR(255),
  fangraphsname VARCHAR(255),
  yahooid VARCHAR(255),
  yahooname VARCHAR(255),
  espnid VARCHAR(255),
  espnname VARCHAR(255),
  PRIMARY KEY (id)
);

CREATE TABLE `fangraphs` (
  id VARCHAR(255),
  name VARCHAR(255),
  team VARCHAR(255),
  adp DOUBLE,
  PRIMARY KEY (id)
);