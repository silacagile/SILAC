-- -------------------------------------------------------------------------
-- PostgreSQL SQL create tables
-- exported at Tue Nov 11 18:31:21 AST 2014 with easyDesigner
-- -------------------------------------------------------------------------

-- -------------------------------------------------------------------------
-- Table: Paciente
-- -------------------------------------------------------------------------
CREATE TABLE "Paciente" (
  "id_Paciente" VARCHAR NOT NULL,
  "nombre" VARCHAR NULL,
  "direccion" VARCHAR NULL,
  "telefono" VARCHAR NULL,
  "ap_paterno" VARCHAR NULL,
  "ap_materno" VARCHAR NULL,
  "ci" VARCHAR NULL,
  "correo" VARCHAR NULL,
  PRIMARY KEY ("id_Paciente")
);

-- -------------------------------------------------------------------------
-- Table: Muestra
-- -------------------------------------------------------------------------
CREATE TABLE "Muestra" (
  "id_muestra" INTEGER NOT NULL,
  "Paciente_id_Paciente" VARCHAR NOT NULL,
  "tipo_muestra" VARCHAR NULL,
  "solucion_buffer" VARCHAR NULL,
  "instrumento" VARCHAR NULL,
  "vol_muestra" DOUBLE NULL,
  "resultado_final" VARCHAR(255) NULL,
  "observaciones" VARCHAR NULL,
  PRIMARY KEY ("id_muestra", "Paciente_id_Paciente")
);

-- -------------------------------------------------------------------------
-- Table: ensayo
-- -------------------------------------------------------------------------
CREATE TABLE "ensayo" (
  "id_ensayo" INTEGER NOT NULL,
  "Muestra_id_muestra" INTEGER NOT NULL,
  "Muestra_Paciente_id_Paciente" VARCHAR NOT NULL,
  "extraccion_fecha" DATE NULL,
  "extraccion_tipo" VARCHAR NULL,
  "resultado" VARCHAR NULL,
  "numero_extraccion" INTEGER NULL,
  "gel_tipo" VARCHAR NULL,
  "get_fecha" DATE NULL,
  PRIMARY KEY ("id_ensayo", "Muestra_id_muestra", "Muestra_Paciente_id_Paciente")
);

-- -------------------------------------------------------------------------
-- Table: Usuario
-- -------------------------------------------------------------------------
CREATE TABLE "Usuario" (
  "login" VARCHAR(255) NOT NULL,
  "password" VARCHAR(255) NOT NULL,
  "Usuario_id_Rol" INTEGER NULL,
  PRIMARY KEY ("login")
);

-- -------------------------------------------------------------------------
-- Table: Rol
-- -------------------------------------------------------------------------
CREATE TABLE "Rol" (
  "id_Rol" bigserial NOT NULL,
  "name" VARCHAR(255) NOT NULL
);

-- -------------------------------------------------------------------------
-- Relations for table: Muestra
-- -------------------------------------------------------------------------
ALTER TABLE "Muestra" ADD FOREIGN KEY ("Paciente_id_Paciente") 
    REFERENCES "Paciente" ("id_Paciente")
      ON DELETE NO ACTION
      ON UPDATE NO ACTION;

-- -------------------------------------------------------------------------
-- Relations for table: ensayo
-- -------------------------------------------------------------------------
ALTER TABLE "ensayo" ADD FOREIGN KEY ("Muestra_id_muestra", "Muestra_Paciente_id_Paciente") 
    REFERENCES "Muestra" ("id_muestra", "Paciente_id_Paciente")
      ON DELETE NO ACTION
      ON UPDATE NO ACTION;

-- -------------------------------------------------------------------------
-- Relations for table: Usuario
-- -------------------------------------------------------------------------
ALTER TABLE "Usuario" ADD FOREIGN KEY () 
    REFERENCES "Rol" ("id_Rol", "Usuario_id_Rol")
      ON DELETE NO ACTION
      ON UPDATE NO ACTION;

