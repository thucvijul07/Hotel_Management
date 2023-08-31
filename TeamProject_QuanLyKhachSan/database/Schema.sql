
--CREATE DATABASE
GO
CREATE DATABASE HotelManagement

GO
USE HotelManagement

GO
--CREATE TABLES (No constraint)
CREATE TABLE KhachHang
(
	MaKhachHang		int				NOT NULL IDENTITY(10000,1),
	HoDem			nvarchar(30)	NOT NULL,
	Ten				nvarchar(10)	NOT NULL,
	CCCD			varchar(15)		NOT NULL,
	SDT				varchar(12),
	QuocTich		nvarchar(20)
)
CREATE TABLE Phong
(
	MaPhong			varchar(7)		NOT NULL,
	SoPhong			int				NOT NULL,
	SoTang			int				NOT NULL,
	TenPhong		nvarchar(20),
	TinhTrang		nvarchar(20)	NOT NULL,
	MaLoaiPhong		varchar(7)		NOT NULL,
)
CREATE TABLE LoaiPhong
(
	MaLoaiPhong		varchar(7)		NOT NULL,
	TenLoaiPhong	nvarchar(20),
	DonGia			money			NOT NULL
)
CREATE TABLE TiepTan
(
	MaTiepTan		varchar(7)		NOT NULL,
	HoDem			nvarchar(30)	NOT NULL,
	Ten				nvarchar(10)	NOT NULL,
	CCCD			varchar(15)		NOT NULL,
	SDT				varchar(12),
	MaTaiKhoan		varchar(10)		NOT NULL
)
CREATE TABLE DichVu
(
	MaDichVu		varchar(7)		NOT NULL,
	TenDichVu		nvarchar(30),
	DonGia			money			NOT NULL,
	LoaiDichVu		nvarchar(20)	NOT NULL
)
CREATE TABLE DonDatPhong
(
	MaDonDat			int				NOT NULL IDENTITY(100000,1),
	MaKhachHang			int				NOT NULL,
	MaTiepTan			varchar(7)		NOT NULL,
	SoLuongKhach		int				NOT NULL,
	HinhThucThue		nvarchar(20)	NOT NULL,
	TrangThaiThanhToan	nvarchar(30)	NOT NULL,
	NgayDatPhong		DateTime		DEFAULT GETDATE()
)
CREATE TABLE DonDatPhong_Phong
(
	ID				int					NOT NULL IDENTITY(1,1),
	MaDonDat		int					NOT NULL,
	MaPhong			varchar(7)			NOT NULL
)
CREATE TABLE DonDatPhong_DichVu
(
	ID				int					NOT NULL IDENTITY(1,1),
	MaDonDat		int					NOT NULL,
	MaDichVu		varchar(7)			NOT NULL,
	MaPhong			varchar(7)			NOT NULL,
	SoLuong			int					NOT NULL
)
CREATE TABLE HoaDon
(
	MaHoaDon		int					NOT NULL IDENTITY(100000,1),
	MaDonDat		int					NOT NULL,
	PhuPhi			money				NOT NULL,
	TongThanhTien	money				NOT NULL,
	NgayDatPhong	DateTime,
	NgayTraPhong	DateTime			DEFAULT GETDATE()
)
CREATE TABLE TaiKhoan
(
	MaTaiKhoan		varchar(10)			NOT NULL,
	TenTaiKhoan		varchar(30)			NOT NULL,
	MatKhauTaiKhoan	varchar(30)		NOT NULL
)

GO
--CREATE CONSTRAINT
GO
ALTER TABLE TaiKhoan
ADD CONSTRAINT PK_TaiKhoan PRIMARY KEY (MaTaiKhoan);

GO
ALTER TABLE LoaiPhong
ADD CONSTRAINT PK_LoaiPhong		PRIMARY KEY (MaLoaiPhong),
	CONSTRAINT CK_DonGia_LP		CHECK (DonGia>0);

GO
ALTER TABLE Phong
ADD CONSTRAINT PK_Phong			PRIMARY KEY (MaPhong),
	CONSTRAINT CK_SoPhong		CHECK(SoPhong>0),
	CONSTRAINT CK_SoTang		CHECK(SoTang>0),
	CONSTRAINT CK_TinhTrang		CHECK(TinhTrang in ('Available', 'Booked', 'Not Available')),
	CONSTRAINT FK_MaLoaiPhong	FOREIGN KEY (MaLoaiPhong) REFERENCES LoaiPhong(MaLoaiPhong);

GO
ALTER TABLE KhachHang
ADD CONSTRAINT PK_KhachHang PRIMARY KEY (MaKhachHang),
	CONSTRAINT UN_KhachHang UNIQUE (CCCD);

GO
ALTER TABLE TiepTan
ADD CONSTRAINT PK_TiepTan		PRIMARY KEY (MaTiepTan),
	CONSTRAINT FK_MaTaiKhoan	FOREIGN KEY (MaTaiKhoan) REFERENCES TaiKhoan(MaTaiKhoan),
	CONSTRAINT UN_TiepTan		UNIQUE (CCCD);

GO
ALTER TABLE DichVu
ADD CONSTRAINT PK_DichVu		PRIMARY KEY (MaDichVu),
	CONSTRAINT CK_DonGia_DV		CHECK (DonGia>0),
	CONSTRAINT CK_LoaiDV		CHECK (LoaiDichVu in ('Foods', 'Drinks', 'Others'));

GO
ALTER TABLE DonDatPhong
ADD CONSTRAINT PK_DonDatPhong			PRIMARY KEY (MaDonDat),
	CONSTRAINT FK_MaKhachHang			FOREIGN KEY (MaKhachHang)	REFERENCES KhachHang(MaKhachHang),
	CONSTRAINT FK_MaTiepTan				FOREIGN KEY (MaTiepTan)		REFERENCES TiepTan(MaTiepTan),
	CONSTRAINT CK_SoLuongKhach			CHECK (SoLuongKhach>0),
	CONSTRAINT CK_HinhThucThue			CHECK (HinhThucThue in (N'Theo giờ', N'Theo ngày')),
	CONSTRAINT CK_TrangThaiThanhToan	CHECK (TrangThaiThanhToan in (N'Đã thanh toán', N'Chưa thanh toán'))
	

GO
ALTER TABLE DonDatPhong_Phong
ADD CONSTRAINT FK_MaDonDat_DP			FOREIGN KEY (MaDonDat)	REFERENCES DonDatPhong(MaDonDat),
	CONSTRAINT FK_MaPhong_DP			FOREIGN KEY (MaPhong)	REFERENCES Phong(MaPhong),
	CONSTRAINT PK_DonDatPhong_Phong		PRIMARY KEY(ID);

GO
ALTER TABLE DonDatPhong_DichVu
ADD CONSTRAINT FK_MaDonDat_DDV			FOREIGN KEY (MaDonDat)	REFERENCES DonDatPhong(MaDonDat),
	CONSTRAINT FK_MaDichVu_DDV			FOREIGN KEY (MaDichVu)	REFERENCES DichVu(MaDichVu),
	CONSTRAINT FK_MaPhong_DDV			FOREIGN KEY (MaPhong)	REFERENCES Phong(MaPhong),
	CONSTRAINT CK_SoLuong_DDV			CHECK (SoLuong>0),
	CONSTRAINT PK_DonDatPhong_DichVu	PRIMARY KEY (ID);

GO
ALTER TABLE HoaDon
ADD CONSTRAINT PK_HoaDon		PRIMARY KEY (MaHoaDon),
	CONSTRAINT FK_MaDonDat		FOREIGN KEY (MaDonDat) REFERENCES DonDatPhong(MaDonDat),
	CONSTRAINT CK_PhuPhi_HD		CHECK (PhuPhi>=0),
	CONSTRAINT CK_TTT_HD		CHECK (TongThanhTien>=0),
	CONSTRAINT CK_NTP_NDP_HD	CHECK (NgayTraPhong > NgayDatPhong);
GO

