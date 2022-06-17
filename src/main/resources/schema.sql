DROP TABLE IF EXISTS item;
CREATE TABLE item (
      id            IDENTITY PRIMARY KEY,
      name          VARCHAR(255) NOT NULL,
      description   VARCHAR(1000)
);