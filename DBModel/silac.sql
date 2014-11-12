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
  PRIMARY KEY(id_muestra,id_Paciente)
  FOREIGN KEY(id_Paciente) REFERENCES Paciente(id_Paciente)
);

CREATE TABLE Paciente(
  id_Paciente VARCHAR PRIMARY KEY NOT NULL,
  nombre VARCHAR NULL,
  direccion VARCHAR NULL,
  telefono VARCHAR NULL,
  ap_paterno VARCHAR NULL,
  ap_materno VARCHAR NULL,
  ci VARCHAR NULL,
  correo VARCHAR NULL
);

CREATE TABLE Ensayo(
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

CREATE TABLE Rol(
  id_rol INTEGER NOT NULL,
  name VARCHAR NOT NULL
  PRIMARY KEY(id_rol)
);

CREATE TABLE Usuario(
  login VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,
  id_Rol INTEGER NULL,
  PRIMARY KEY(login)
  FOREIGN KEY(id_Rol) REFERENCES Rol(id_Rol) 
);
