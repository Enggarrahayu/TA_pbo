-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Inang: 127.0.0.1
-- Waktu pembuatan: 08 Jun 2017 pada 07.24
-- Versi Server: 5.5.27
-- Versi PHP: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Basis data: `db_gaji`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_akun`
--

CREATE TABLE IF NOT EXISTS `tb_akun` (
  `username` varchar(50) NOT NULL,
  `password` varchar(10) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_akun`
--

INSERT INTO `tb_akun` (`username`, `password`) VALUES
('21112346', '12'),
('Enggar Rahayu', '12'),
('Paijo', '123');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_hitung_gaji`
--

CREATE TABLE IF NOT EXISTS `tb_hitung_gaji` (
  `nama_pegawai` varchar(50) NOT NULL,
  `tgl_lahir` varchar(20) NOT NULL,
  `status` varchar(20) NOT NULL,
  `jumlah_anak` int(11) NOT NULL,
  `gaji_pokok` int(11) NOT NULL,
  `jabatan_struktural` int(11) NOT NULL,
  `keluarga` int(11) NOT NULL,
  `anak` int(11) NOT NULL,
  `total_gaji` int(11) NOT NULL,
  `nip` int(11) NOT NULL,
  `bulan_gaji` varchar(20) NOT NULL,
  PRIMARY KEY (`nip`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tb_hitung_gaji`
--

INSERT INTO `tb_hitung_gaji` (`nama_pegawai`, `tgl_lahir`, `status`, `jumlah_anak`, `gaji_pokok`, `jabatan_struktural`, `keluarga`, `anak`, `total_gaji`, `nip`, `bulan_gaji`) VALUES
('enggar', '21 maret 1999', 'single', 0, 200000, 100000, 450000, 200000, 2199000, 91827, 'Februari');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
