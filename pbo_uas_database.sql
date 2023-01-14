-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 14, 2023 at 07:59 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pbo_uas_database`
--

-- --------------------------------------------------------

--
-- Table structure for table `form_mahasiswa`
--

CREATE TABLE `form_mahasiswa` (
  `nim` int(10) NOT NULL,
  `nama_mahasiswa` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `kelamin` varchar(50) NOT NULL,
  `jurusan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `form_mahasiswa`
--

INSERT INTO `form_mahasiswa` (`nim`, `nama_mahasiswa`, `alamat`, `kelamin`, `jurusan`) VALUES
(2010010152, 'Achmad Fathur', 'Pondok Pinus', 'Laki-laki', 'Teknik Informatika'),
(2010010153, 'Fathur Kuyy', 'jl duren', 'Laki-laki', 'Teknik Informatika'),
(2010010222, 'nana kila', 'jl kastuari no 2', 'Perempuan', 'Teknik Informatika'),
(2010010321, 'Mahmud', 'Kemangi', 'Laki-laki', 'Hubungan Internasional'),
(2010010555, 'Hana Nurhalisa', 'Jalan Mangga No. 2', 'Perempuan', 'Ekonomi Syariah'),
(2010010777, 'NurKholis', 'Jalan amuntai', 'Laki-laki', 'Politik Dan Hukum');

-- --------------------------------------------------------

--
-- Table structure for table `form_matakuliah`
--

CREATE TABLE `form_matakuliah` (
  `id_matkul` varchar(12) NOT NULL,
  `mata_kuliah` varchar(20) NOT NULL,
  `waktu` varchar(20) NOT NULL,
  `semester` varchar(4) NOT NULL,
  `dosen` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `form_matakuliah`
--

INSERT INTO `form_matakuliah` (`id_matkul`, `mata_kuliah`, `waktu`, `semester`, `dosen`) VALUES
('01-BGL', 'Bangun Logika', '08:00 - 09:30', '6', 'Bpk Gowes'),
('01-GGG', 'Sains', '13:00 - 14:30', '4', 'Tokino'),
('11-MTK', 'Jaringan Komputer', '08:00 - 09:30', '5', 'PAK Hafidz'),
('88-MMT', 'Logika Matematika', '08:00 - 09:30', '3', 'Bu Ratna');

-- --------------------------------------------------------

--
-- Table structure for table `inputkrs`
--

CREATE TABLE `inputkrs` (
  `nim` int(10) NOT NULL,
  `id_krs` varchar(50) NOT NULL,
  `mata_kuliah` varchar(50) NOT NULL,
  `sks` varchar(50) NOT NULL,
  `semester` varchar(50) NOT NULL,
  `nama_dosen` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `inputkrs`
--

INSERT INTO `inputkrs` (`nim`, `id_krs`, `mata_kuliah`, `sks`, `semester`, `nama_dosen`) VALUES
(2010010123, '1900023', 'Bahasa Arab', '1', '4', 'Ibu Mona'),
(2010010153, '1900013', 'Pemrograman Berbasis Web', '2', '5', 'Pak Edya'),
(2010010321, '1900023', 'Jaringan', '2', '3', 'Khastolani'),
(2010010555, '1900066', 'Ekonomi', '1', '2', 'Norma');

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `per_semester` int(9) NOT NULL,
  `jurusan` varchar(50) NOT NULL,
  `biaya_semester` bigint(50) NOT NULL,
  `total_biaya` bigint(50) NOT NULL,
  `pajak` bigint(50) NOT NULL,
  `total_keseluruhan` bigint(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`per_semester`, `jurusan`, `biaya_semester`, `total_biaya`, `pajak`, `total_keseluruhan`) VALUES
(3, 'Ekonomi Syariah', 30299000, 90897000, 9998670, 100895670),
(2, 'Sistem Informatika', 2950000, 5900000, 649000, 6549000),
(2, 'Teknik Informatika', 32499000, 64998000, 7149780, 72147780);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `form_mahasiswa`
--
ALTER TABLE `form_mahasiswa`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `form_matakuliah`
--
ALTER TABLE `form_matakuliah`
  ADD PRIMARY KEY (`id_matkul`);

--
-- Indexes for table `inputkrs`
--
ALTER TABLE `inputkrs`
  ADD PRIMARY KEY (`nim`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
