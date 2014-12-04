INSERT INTO Persona (id_Persona, nombre, direccion, telefono, ap_paterno, ap_materno, ci, correo, fnac, rol)
VALUES ('PR1','Angel','Av. Primera','5466585','Olson','Navia','72154861','angel@gmail.com','01/01/2014', 0);

INSERT INTO Persona (id_Persona, nombre, direccion, telefono, ap_paterno, ap_materno, ci, correo, fnac)
VALUES ('P1','Ana','Av. Oquendo','589985','Flores','Sanchez','78945621','ana@gmail.com','01/01/2014');

INSERT INTO Persona (id_Persona, nombre, direccion, telefono, ap_paterno, ap_materno, ci, correo, fnac)
VALUES ('P2','Juana','Av. Sucre','4536944','Sabala','Sanchez','1254621','juana@gmail.com','01/01/2014');

INSERT INTO Persona (id_Persona, nombre, direccion, telefono, ap_paterno, ap_materno, ci, correo, fnac)
VALUES ('P3','Marcia','Calle Calama','4423657','Perez','Alvarez','78945621','ana@gmail.com','01/01/2014');

INSERT INTO Persona (id_Persona, nombre, direccion, telefono, ap_paterno, ap_materno, ci, correo, fnac, rol)
VALUES ('D1','Julia','Calla Crisantemos','4421478','Alcazar','Cabezas','78945621','ana@gmail.com','01/01/2014', 1);

INSERT INTO Persona (id_Persona, nombre, direccion, telefono, ap_paterno, ap_materno, ci, correo, fnac, rol)
VALUES ('D2','Adriana','Av. Pando','4236489','Mamani','Mercado','78945621','ana@gmail.com','01/01/2014', 8);

INSERT INTO Persona (id_Persona, nombre, direccion, telefono, ap_paterno, ap_materno, ci, correo, fnac, rol)
VALUES ('D3','Carla','Av. Circunvalacion','4214536','Juarez','Colque','78945621','ana@gmail.com','01/01/2014', 8);

INSERT INTO Persona (id_Persona, nombre, direccion, telefono, ap_paterno, ap_materno, ci, correo, fnac, rol)
VALUES ('A1','Juan','Av. Circunvalacion','4214533','Lagos','Carrasco','78945621','juan@gmail.com','01/02/2014', 2);

INSERT INTO Persona (id_Persona, nombre, direccion, telefono, ap_paterno, ap_materno, ci, correo, fnac, rol)
VALUES ('S1','Miriam','Av. Segunda','4786533','Sarabia','Rojas','78947861','miriam@gmail.com','01/02/2014', 7);

INSERT INTO Paciente (id_Paciente, tipo_sangre) 
VALUES ('P1','ORH+');

INSERT INTO Paciente (id_Paciente, tipo_sangre) 
VALUES ('P2','ORH+');

INSERT INTO Paciente (id_Paciente, tipo_sangre) 
VALUES ('P3','ORH+');

INSERT INTO Doctor (id_Doctor, grado, especialidad) 
VALUES ('D1','Maestria','Ginecologo');

INSERT INTO Doctor (id_Doctor, grado, especialidad) 
VALUES ('D2','Maestria','Ginecologo');

INSERT INTO Doctor (id_Doctor, grado, especialidad)
VALUES ('D3','Maestria','Ginecologo');

INSERT INTO Usuario(login, password, id_Persona) 
VALUES ('admin', 'admin', 'PR1');

INSERT INTO Usuario(login, password, id_Persona) 
VALUES ('doctor', 'doctor', 'D1');

INSERT INTO Usuario(login, password, id_Persona) 
VALUES ('analista', 'analista', 'A1');

INSERT INTO Usuario(login, password, id_Persona) 
VALUES ('secretaria', 'secretaria', 'S1');