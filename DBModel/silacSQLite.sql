-- -------------------------------------------------------------------------
-- Table: Paciente
-- -------------------------------------------------------------------------
CREATE TABLE Persona(
  id_Persona VARCHAR PRIMARY KEY NOT NULL,
  nombre VARCHAR NULL,
  direccion VARCHAR NULL,
  telefono VARCHAR NULL,
  ap_paterno VARCHAR NULL,
  ap_materno VARCHAR NULL,
  ci VARCHAR NULL,
  correo VARCHAR NULL,
  fnac DATE NULL
);

CREATE TABLE Paciente(
  id_Paciente VARCHAR PRIMARY KEY NOT NULL,
  tipo_sangre VARCHAR NULL,
  FOREIGN KEY (id_Paciente) REFERENCES Persona(id_Persona)
);

CREATE TABLE Doctor(
  id_Doctor VARCHAR PRIMARY KEY NOT NULL,
  grado VARCHAR NULL,
  especialidad VARCHAR NULL,
  FOREIGN KEY (id_Doctor) REFERENCES Persona(id_Persona)
);

-- -------------------------------------------------------------------------
-- Table: Historial
-- -------------------------------------------------------------------------
CREATE TABLE Tratamiento(
  id_Tratamiento VARCHAR NOT NULL,
  id_muestra VARCHAR NOT NULL,
  id_Paciente VARCHAR NOT NULL,
  id_Doctor  VARCHAR NOT NULL,
  fecha_tratamiento VARCHAR NOT NULL,
  descripcion VARCHAR NOT NULL, 
  PRIMARY KEY(id_muestra,id_Paciente, id_Tratamiento)
  FOREIGN KEY(id_muestra, id_Paciente) 
  REFERENCES Muestra(id_muestra, id_Paciente)
  FOREIGN KEY(id_Doctor) 
  REFERENCES Doctor(id_Doctor)
);

-- -------------------------------------------------------------------------
-- Table: Muestra
-- -------------------------------------------------------------------------
CREATE TABLE Muestra(
  id_muestra VARCHAR NOT NULL,
  id_Paciente VARCHAR NOT NULL,
  tipo_muestra VARCHAR NULL,
  tipo_test VARCHAR NULL,
  solucion_buffer VARCHAR NULL,
  instrumento VARCHAR NULL,
  vol_muestra NUMERIC NULL,
  resultado_final VARCHAR(255) NULL,
  observaciones VARCHAR NULL,
  PRIMARY KEY (id_muestra,id_Paciente)
  FOREIGN KEY (id_Paciente) REFERENCES Paciente(id_Paciente)
);

-- -------------------------------------------------------------------------
-- Table: ensayo
-- -------------------------------------------------------------------------
CREATE TABLE ensayo(
  id_ensayo VARCHAR NOT NULL,
  id_muestra VARCHAR NOT NULL,
  id_Paciente VARCHAR NOT NULL,
  extraccion_fecha DATE NULL,
  extraccion_tipo VARCHAR NULL,
  resultado VARCHAR NULL,
  numero_extraccion INTEGER NULL,
  gel_tipo VARCHAR NULL,
  gel_fecha DATE NULL,
  PRIMARY KEY(id_muestra,id_Paciente, id_ensayo)
  FOREIGN KEY(id_muestra, id_Paciente) 
  REFERENCES Muestra(id_muestra, id_Paciente)
);



