-- -------------------------------------------------------------------------
-- PostgreSQL SQL create tables
-- exported at Fri Oct 24 14:22:51 BOT 2014 with easyDesigner
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
  "id_muestra" VARCHAR NOT NULL,
  "id_Paciente" VARCHAR NOT NULL,
  "tipo_muestra" VARCHAR NULL,
  "solucion_buffer" VARCHAR NULL,
  "instrumento" VARCHAR NULL,
  "vol_muestra" NUMERIC NULL,
  "resultado_final" VARCHAR(255) NULL,
  "observaciones" VARCHAR NULL,
  PRIMARY KEY ("id_muestra", "id_Paciente")
);

-- -------------------------------------------------------------------------
-- Table: ensayo
-- -------------------------------------------------------------------------
CREATE TABLE "ensayo" (
  "id_ensayo" VARCHAR NOT NULL,
  "id_muestra" VARCHAR NOT NULL,
  "id_Paciente" VARCHAR NOT NULL,
  "extraccion_fecha" DATE NULL,
  "extraccion_tipo" VARCHAR NULL,
  "resultado" VARCHAR NULL,
  "numero_extraccion" INTEGER NULL,
  "gel_tipo" VARCHAR NULL,
  "gel_fecha" DATE NULL,
  PRIMARY KEY ("id_ensayo", "id_muestra", "id_Paciente")
);

-- -------------------------------------------------------------------------
-- Relations for table: Muestra
-- -------------------------------------------------------------------------
ALTER TABLE "Muestra" ADD FOREIGN KEY ("id_Paciente") 
    REFERENCES "Paciente" ("id_Paciente")
      ON DELETE NO ACTION
      ON UPDATE NO ACTION;

-- -------------------------------------------------------------------------
-- Relations for table: ensayo
-- -------------------------------------------------------------------------
ALTER TABLE "ensayo" ADD FOREIGN KEY ("id_muestra", "id_Paciente") 
    REFERENCES "Muestra" ("id_muestra", "id_Paciente")
      ON DELETE NO ACTION
      ON UPDATE NO ACTION;

