CREATE TABLE Factura (ID int(11) NOT NULL AUTO_INCREMENT, ClienteUsuarioID int(11) NOT NULL, Nombre varchar(255) NOT NULL, Fecha date NOT NULL, NombreCliente varchar(255) NOT NULL, ApellidosCliente varchar(255) NOT NULL, NifCliente varchar(255) NOT NULL, DireccionCliente varchar(255) NOT NULL, TelefonoCliente varchar(255) NOT NULL, PrecioTotal double NOT NULL, PRIMARY KEY (ID)) ENGINE=InnoDB;
CREATE TABLE Canal (ModalidadID int(11) NOT NULL, PRIMARY KEY (ModalidadID)) ENGINE=InnoDB;
CREATE TABLE Incidencia (ID int(11) NOT NULL AUTO_INCREMENT, ClienteUsuarioID int(11) NOT NULL, ComercialUsuarioID int(11), CorreoCliente varchar(255) NOT NULL, Asunto varchar(255) NOT NULL, Descripcion varchar(255), Observacion varchar(255), TipoIncidencia varchar(255), Estado varchar(255), PRIMARY KEY (ID)) ENGINE=InnoDB;
CREATE TABLE Usuario (ID int(11) NOT NULL AUTO_INCREMENT, Nombre varchar(255) NOT NULL, Apellidos varchar(255) NOT NULL, Direccion varchar(255) NOT NULL, Telefono varchar(255) NOT NULL, Email varchar(255) NOT NULL, Nif varchar(255) NOT NULL, Password varchar(255) NOT NULL, FechaEliminacion date, PRIMARY KEY (ID)) ENGINE=InnoDB;
CREATE TABLE Modalidad (ID int(11) NOT NULL AUTO_INCREMENT, AdministradorUsuarioID int(11), Nombre varchar(255) NOT NULL, Caracteristicas varchar(255), Precio double NOT NULL, Visibilidad bit(1) NOT NULL, Tipo varchar(255) NOT NULL, FechaEliminacion date, PRIMARY KEY (ID)) ENGINE=InnoDB;
CREATE TABLE Incidencia_administrador (CorreoComercial varchar(255) NOT NULL, IncidenciaID int(11) NOT NULL, AdministradorUsuarioID int(11) NOT NULL, PRIMARY KEY (IncidenciaID)) ENGINE=InnoDB;
CREATE TABLE Cliente (UsuarioID int(11) NOT NULL, AdministradorUsuarioID int(11) NOT NULL, PRIMARY KEY (UsuarioID)) ENGINE=InnoDB;
CREATE TABLE Movil (ConsumoActual double NOT NULL, ConsumoMax double NOT NULL, ModalidadID int(11) NOT NULL, PRIMARY KEY (ModalidadID)) ENGINE=InnoDB;
CREATE TABLE Oferta (ModalidadID int(11) NOT NULL, PRIMARY KEY (ModalidadID)) ENGINE=InnoDB;
CREATE TABLE contrato (ID int(11) NOT NULL AUTO_INCREMENT, Fecha date, ClienteUsuarioID int(11) NOT NULL, ModalidadID int(11) NOT NULL, PRIMARY KEY (ID)) ENGINE=InnoDB;
CREATE TABLE Comercial (UsuarioID int(11) NOT NULL, AdministradorUsuarioID int(11) NOT NULL, PRIMARY KEY (UsuarioID)) ENGINE=InnoDB;
CREATE TABLE Television (ModalidadID int(11) NOT NULL, PRIMARY KEY (ModalidadID)) ENGINE=InnoDB;
CREATE TABLE Administrador (UsuarioID int(11) NOT NULL, PRIMARY KEY (UsuarioID)) ENGINE=InnoDB;
CREATE TABLE Paquete (ModalidadID int(11) NOT NULL, PRIMARY KEY (ModalidadID)) ENGINE=InnoDB;
CREATE TABLE Paquete_Canal (PaqueteModalidadID int(11) NOT NULL, CanalModalidadID int(11) NOT NULL, PRIMARY KEY (PaqueteModalidadID, CanalModalidadID)) ENGINE=InnoDB;
CREATE TABLE Modalidad_Factura (ModalidadID int(11) NOT NULL, FacturaID int(11) NOT NULL, PRIMARY KEY (ModalidadID, FacturaID)) ENGINE=InnoDB;
CREATE TABLE Oferta_Modalidad (OfertaModalidadID int(11) NOT NULL, ModalidadID int(11) NOT NULL, PRIMARY KEY (OfertaModalidadID, ModalidadID)) ENGINE=InnoDB;
CREATE TABLE Cliente_Comercial (ClienteUsuarioID int(11) NOT NULL, ComercialUsuarioID int(11) NOT NULL, PRIMARY KEY (ClienteUsuarioID, ComercialUsuarioID)) ENGINE=InnoDB;
ALTER TABLE Canal ADD INDEX FKCanal450766 (ModalidadID), ADD CONSTRAINT FKCanal450766 FOREIGN KEY (ModalidadID) REFERENCES Modalidad (ID);
ALTER TABLE Incidencia_administrador ADD INDEX FKIncidencia40536 (IncidenciaID), ADD CONSTRAINT FKIncidencia40536 FOREIGN KEY (IncidenciaID) REFERENCES Incidencia (ID);
ALTER TABLE Cliente ADD INDEX FKCliente703699 (UsuarioID), ADD CONSTRAINT FKCliente703699 FOREIGN KEY (UsuarioID) REFERENCES Usuario (ID);
ALTER TABLE Movil ADD INDEX FKMovil110996 (ModalidadID), ADD CONSTRAINT FKMovil110996 FOREIGN KEY (ModalidadID) REFERENCES Modalidad (ID);
ALTER TABLE Oferta ADD INDEX FKOferta368780 (ModalidadID), ADD CONSTRAINT FKOferta368780 FOREIGN KEY (ModalidadID) REFERENCES Modalidad (ID);
ALTER TABLE Comercial ADD INDEX FKComercial611390 (UsuarioID), ADD CONSTRAINT FKComercial611390 FOREIGN KEY (UsuarioID) REFERENCES Usuario (ID);
ALTER TABLE Television ADD INDEX FKTelevision291016 (ModalidadID), ADD CONSTRAINT FKTelevision291016 FOREIGN KEY (ModalidadID) REFERENCES Modalidad (ID);
ALTER TABLE Administrador ADD INDEX FKAdministra741035 (UsuarioID), ADD CONSTRAINT FKAdministra741035 FOREIGN KEY (UsuarioID) REFERENCES Usuario (ID);
ALTER TABLE Paquete ADD INDEX FKPaquete399386 (ModalidadID), ADD CONSTRAINT FKPaquete399386 FOREIGN KEY (ModalidadID) REFERENCES Modalidad (ID);
ALTER TABLE Modalidad ADD INDEX FKModalidad105721 (AdministradorUsuarioID), ADD CONSTRAINT FKModalidad105721 FOREIGN KEY (AdministradorUsuarioID) REFERENCES Administrador (UsuarioID);
ALTER TABLE Paquete_Canal ADD INDEX FKPaquete_Ca366352 (PaqueteModalidadID), ADD CONSTRAINT FKPaquete_Ca366352 FOREIGN KEY (PaqueteModalidadID) REFERENCES Paquete (ModalidadID);
ALTER TABLE Paquete_Canal ADD INDEX FKPaquete_Ca515694 (CanalModalidadID), ADD CONSTRAINT FKPaquete_Ca515694 FOREIGN KEY (CanalModalidadID) REFERENCES Canal (ModalidadID);
ALTER TABLE Modalidad_Factura ADD INDEX FKModalidad_971817 (ModalidadID), ADD CONSTRAINT FKModalidad_971817 FOREIGN KEY (ModalidadID) REFERENCES Modalidad (ID);
ALTER TABLE Modalidad_Factura ADD INDEX FKModalidad_425328 (FacturaID), ADD CONSTRAINT FKModalidad_425328 FOREIGN KEY (FacturaID) REFERENCES Factura (ID);
ALTER TABLE Comercial ADD INDEX FKComercial707677 (AdministradorUsuarioID), ADD CONSTRAINT FKComercial707677 FOREIGN KEY (AdministradorUsuarioID) REFERENCES Administrador (UsuarioID);
ALTER TABLE Oferta_Modalidad ADD INDEX FKOferta_Mod833372 (OfertaModalidadID), ADD CONSTRAINT FKOferta_Mod833372 FOREIGN KEY (OfertaModalidadID) REFERENCES Oferta (ModalidadID);
ALTER TABLE Oferta_Modalidad ADD INDEX FKOferta_Mod112700 (ModalidadID), ADD CONSTRAINT FKOferta_Mod112700 FOREIGN KEY (ModalidadID) REFERENCES Modalidad (ID);
ALTER TABLE Factura ADD INDEX FKFactura492005 (ClienteUsuarioID), ADD CONSTRAINT FKFactura492005 FOREIGN KEY (ClienteUsuarioID) REFERENCES Cliente (UsuarioID);
ALTER TABLE Incidencia ADD INDEX FKIncidencia649775 (ComercialUsuarioID), ADD CONSTRAINT FKIncidencia649775 FOREIGN KEY (ComercialUsuarioID) REFERENCES Comercial (UsuarioID);
ALTER TABLE Cliente_Comercial ADD INDEX FKCliente_Co283875 (ClienteUsuarioID), ADD CONSTRAINT FKCliente_Co283875 FOREIGN KEY (ClienteUsuarioID) REFERENCES Cliente (UsuarioID);
ALTER TABLE Cliente_Comercial ADD INDEX FKCliente_Co272738 (ComercialUsuarioID), ADD CONSTRAINT FKCliente_Co272738 FOREIGN KEY (ComercialUsuarioID) REFERENCES Comercial (UsuarioID);
ALTER TABLE contrato ADD INDEX FKcontrato232458 (ClienteUsuarioID), ADD CONSTRAINT FKcontrato232458 FOREIGN KEY (ClienteUsuarioID) REFERENCES Cliente (UsuarioID);
ALTER TABLE contrato ADD INDEX FKcontrato371368 (ModalidadID), ADD CONSTRAINT FKcontrato371368 FOREIGN KEY (ModalidadID) REFERENCES Modalidad (ID);
ALTER TABLE Incidencia_administrador ADD INDEX FKIncidencia495098 (AdministradorUsuarioID), ADD CONSTRAINT FKIncidencia495098 FOREIGN KEY (AdministradorUsuarioID) REFERENCES Administrador (UsuarioID);
ALTER TABLE Cliente ADD INDEX FKCliente948822 (AdministradorUsuarioID), ADD CONSTRAINT FKCliente948822 FOREIGN KEY (AdministradorUsuarioID) REFERENCES Administrador (UsuarioID);
ALTER TABLE Incidencia ADD INDEX FKIncidencia660912 (ClienteUsuarioID), ADD CONSTRAINT FKIncidencia660912 FOREIGN KEY (ClienteUsuarioID) REFERENCES Cliente (UsuarioID);
