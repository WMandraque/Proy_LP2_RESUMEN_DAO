DROP DATABASE IF EXISTS base;
-- creamos la bd
CREATE DATABASE base;
-- activamos la bd
USE base;
-- creamos la bd
CREATE TABLE tb_usuario(
usuario char(4) NOT NULL,
clave char(5),
nombre varchar(15),
apellido varchar(15),
facceso date
);
-- creamos la pk
ALTER TABLE tb_usuario ADD PRIMARY KEY(usuario);
-- inserts
INSERT INTO tb_usuario VALUES('U001', '10001', 'Juan', 'Perez','2014/10/01');
INSERT INTO tb_usuario VALUES('U002', '10003', 'Jose', 'Atuncar','2014/10/02');
INSERT INTO tb_usuario VALUES('U003', '10004', 'Abel', 'paraguay','2014/10/03');
INSERT INTO tb_usuario VALUES('U004', '10005', 'Rosa', 'centeno','2014/10/04');



-- consultas
SELECT* FROM tb_usuario;


-- ejemplo de procedimiento almancenadode consulta

DROP procedure IF EXISTS usp_buscausuario;
DELIMiTER $$
create procedure usp_buscausuario(usr char(4), pas char(5))
begin
select * from tb_usuario where usuario= usr and clave = pas;
end$$
DELIMiTER  ;

-- llamar al sp
-- CALL usp_buscausuario('U001','10001');

-- Procedure para ingresar usuarios
DROP procedure IF EXISTS usp_insertarUsuario;
DELIMiTER $$
create procedure usp_insertarUsuario(usr char(4), pass varchar(5), nom varchar(70), ape varchar(70), fecha date )
begin
      insert into tb_usuario values (usr, pass, nom, ape, fecha);
end$$
DELIMiTER ;


-- Procedure para actualizar datos de los usuarios
DROP PROCEDURE IF EXISTS usp_modificarUsuarios;
DELIMITER $$
create procedure usp_modificarUsuarios(usr char(4), pass varchar(5), nom varchar(70), ape varchar(70))
begin
     update tb_usuario set  clave=pass, nombre=nom, apellido=ape where usuario=usr;
end$$
DELIMITER ;


