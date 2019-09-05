-- phpMyAdmin SQL Dump
-- version 4.0.10deb1ubuntu0.1
-- http://www.phpmyadmin.net
--
-- Máquina: localhost
-- Data de Criação: 03-Set-2019 às 23:49
-- Versão do servidor: 5.5.62-0ubuntu0.14.04.1
-- versão do PHP: 5.5.9-1ubuntu4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de Dados: `cadmais`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionario`
--

CREATE TABLE IF NOT EXISTS `funcionario` (
  `id_funcionario` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(40) NOT NULL,
  `cpf` varchar(14) NOT NULL,
  `data_nascimento` date DEFAULT NULL,
  `login` varchar(12) NOT NULL,
  `senha` varchar(12) NOT NULL,
  PRIMARY KEY (`cpf`),
  KEY `id_funcionario` (`id_funcionario`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;


-- --------------------------------------------------------

--
-- Estrutura da tabela `veiculo`
--

CREATE TABLE IF NOT EXISTS `veiculo` (
  `id_veiculo` int(11) NOT NULL AUTO_INCREMENT,
  `placa` varchar(10) NOT NULL,
  `ativo` varchar(1) NOT NULL DEFAULT 'S',
  `ano_fabricacao` varchar(4) NOT NULL,
  `ano_modelo` varchar(4) NOT NULL,
  `chassi` varchar(40) NOT NULL,
  `data_cadastro` date DEFAULT NULL,
  `data_desativacao` date DEFAULT NULL,
  `modelo` varchar(30) NOT NULL,
  `cor` varchar(20) DEFAULT NULL,
  `consumo_medio_km` decimal(10,0) NOT NULL,
  `quantidade_passageiros` int(11) NOT NULL DEFAULT '4',
  PRIMARY KEY (`placa`),
  UNIQUE KEY `chassi` (`chassi`),
  KEY `id_veiculo` (`id_veiculo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
