DROP TABLE IF EXISTS `tb_pokemon`;
CREATE TABLE `tb_pokemon` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `numero` int NOT NULL,
  `nome` varchar(50) NOT NULL,
  `value_effort` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);