
INSERT INTO `usuario` (`ID`, `Nombre`, `Apellidos`, `Direccion`, `Telefono`, `Email`, `Nif`, `Password`, `FechaEliminacion`) VALUES
(1, 'Torsten', 'Lopez', 'Mallorca', '99999999', 'torsten@gmail.com', '2358359-Z', '1234', NULL),
(2, 'Usuario', 'Martinez', 'Mallorca', '99999999', 'usuario@gmail.com', '2410291-S', '1234', NULL);

INSERT INTO `administrador` (`UsuarioID`) VALUES
(1);

INSERT INTO `modalidad` (`ID`, `AdministradorUsuarioID`, `Nombre`, `Caracteristicas`, `Precio`, `Visibilidad`, `Tipo`, `FechaEliminacion`) VALUES
(1, NULL, '300MB', '300MB simetricos', 25, b'1111111111111111111111111111111', 'internet', NULL),
(2, NULL, 'Canal 23', 'Canal de futbol.', 5, b'1111111111111111111111111111111', 'television', NULL),
(3, 1, 'Internet + Futbol', 'Pos eso', 20, b'1111111111111111111111111111111', 'oferta', NULL),
(4, NULL, 'Canal 10', 'Canal de dibujos', 2, b'1111111111111111111111111111111', 'television', NULL),
(5, NULL, 'Canal 12', 'Canal de peliculas las 24 horas.', 8, b'1111111111111111111111111111111', 'television', NULL),
(6, 1, 'Familiar', 'Paquete de canales familiar', 12, b'1111111111111111111111111111111', 'television', NULL),
(7, 1, 'Sabado', 'Canales para ver los sabados', 10, b'1111111111111111111111111111111', 'television', NULL),
(8, NULL, 'Llamadas ilimitadas', 'Pos lo dicho', 25, b'1111111111111111111111111111111', 'movil', NULL),
(9, NULL, 'Telefono', 'Pos telefono', 10, b'1111111111111111111111111111111', 'telefonoFijo', NULL);


INSERT INTO `canal` (`ModalidadID`) VALUES
(2),
(4),
(5);


INSERT INTO `cliente` (`UsuarioID`, `AdministradorUsuarioID`) VALUES
(2, 1);


INSERT INTO `contrato` (`ID`, `Fecha`, `ClienteUsuarioID`, `ModalidadID`) VALUES
(1, '2017-06-05', 2, 1);

INSERT INTO `factura` (`ID`, `ClienteUsuarioID`, `Nombre`, `Fecha`, `NombreCliente`, `ApellidosCliente`, `NifCliente`, `DireccionCliente`, `TelefonoCliente`, `PrecioTotal`) VALUES
(1, 2, 'Facturacion_Mayo', '2017-06-05', 'Usuario', 'Martinez', '2410291-S', 'Mallorca', '99999999', 5),
(2, 2, 'Facturacion_Junio', '2017-07-06', 'Usuario', 'Martinez', '2410291-S', 'Mallorca', '99999999', 5);

INSERT INTO `incidencia` (`ID`, `ClienteUsuarioID`, `ComercialUsuarioID`, `CorreoCliente`, `Asunto`, `Descripcion`, `Observacion`, `TipoIncidencia`, `Estado`, `Fecha`) VALUES
(1, 2, NULL, 'usuario@gmail.com', 'Prueba', 'prueba?', NULL, 'modificarDatos', 'pendiente', '2017-06-07'),
(2, 2, NULL, 'usuario@gmail.com', 'Asunto', 'Descripción', '', 'contratacion', 'pendiente', '2017-06-08'),
(3, 2, NULL, 'usuario@gmail.com', 'borraaaamela', 'yeeeah', '', 'bajaModalidad', 'pendiente', '2017-06-08'),
(6, 2, NULL, 'usuario@gmail.com', 'NO QUERIIIIA', 'NO ME LA BOOOORRES', '', 'cancelarBajaCuenta', 'pendiente', '2017-06-08'),
(7, 2, NULL, 'usuario@gmail.com', 'PRUEBA', '', '', 'otros', 'pendiente', '2017-06-08'),
(8, 2, NULL, 'usuario@gmail.com', 'pRUEBA2', '', '', 'otros', 'pendiente', '2017-06-08'),
(9, 2, NULL, 'usuario@gmail.com', 'CONTRATAAAME', 'no soy pesado...', '', 'contratacion', 'pendiente', '2017-06-08'),
(10, 2, NULL, 'usuario@gmail.com', 'Probando Baja', '', '', 'bajaModalidad', 'pendiente', '2017-06-08');


INSERT INTO `modalidad_factura` (`ModalidadID`, `FacturaID`) VALUES
(1, 1),
(1, 2);


INSERT INTO `movil` (`ConsumoActual`, `ConsumoMax`, `ModalidadID`) VALUES
(0, 200, 8);

INSERT INTO `oferta` (`ModalidadID`) VALUES
(3);


INSERT INTO `oferta_modalidad` (`OfertaModalidadID`, `ModalidadID`) VALUES
(3, 1),
(3, 2);

INSERT INTO `paquete` (`ModalidadID`) VALUES
(6),
(7);

INSERT INTO `paquete_canal` (`PaqueteModalidadID`, `CanalModalidadID`) VALUES
(6, 2),
(6, 4),
(6, 5),
(7, 2),
(7, 5);

INSERT INTO `television` (`ModalidadID`) VALUES
(2),
(4),
(5),
(6),
(7);


