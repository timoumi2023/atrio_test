CREATE TABLE personne
(
    id INT PRIMARY KEY NOT NULL,
    nom VARCHAR(100),
    prenom VARCHAR(100),
    date_de_naissance DATE
);

INSERT INTO `personne`(`id`, `date_de_naissance`, `nom`, `prenom`) VALUES ('1','1990/02/02','nom1','prenom1'),
('2','1990/02/03','nom2','prenom2'),('3','1990/04/02','nom3','prenom3');

