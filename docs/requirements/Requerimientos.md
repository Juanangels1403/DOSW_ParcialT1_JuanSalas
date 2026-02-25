# DOSW_ParcialT1_JuanSalas


Juan Angel Salas Gomez Parcial 1 DOSW

SILABINFO

Actores :
1.Estudiantes
2.Profesores
3.Monitores
4.Enlace
5.Recursos Humanos
6.Administrador(Reservas)

Requerimientos del Sistema:
Requerimientos Funcional:
RF-01. El sistema debe permitir crear Reserva segun el tipo de reserva y el lugar.
Historia de Uso:
Como estudiante, monitor, profesor quiero generar una reserva para realizar actividades academicas.
Pre-condicion = el usuario tiene que escoger su reserva y existir el comportmaiento particular.
post-condicion = El usuario crea satisfactoriamente su reserva o es denegada.

RF-02. El sistema debe permitir denegar una Reserva segun los criterios del tipo de reserva.
Historia de uso:
Como estudiante, profesor, monitor quiero tener la claridad si puedo reservar es cierto lugar para evitar diferentes conflictos.
Pre-condicion = existencia del comportamiento para validar la reserva.
Post-condicion = Se denega la reserva.

RF-03. El sistema debe consultar la capacidad del Aula.
Historia de uso:
Como estudiante, profesor, monitor quiero saber la capacidad del aula para saber la disponibilidad de la reserva.
Pre-condicion = existencia del comportamiento que compara los puestos disponibles como los puestos que exige el usuario.
Post-condicion = denega la reserva.

RF-04. El sistema debe consultar en enlace la informacion de los estudiantes.
Historia de Uso:
Como administrador quiero tener en cuenta la informacion de estudiantes para validar las necesidades de las reservas.
Como estudiante, profesor, 
Pre-Condicion = Acceder a enlace.
Post-Condicion = Acceso a los datos de los estudiantes.


RF-05. El sistema debe consultar en Recursos Humanos la informacion de los profesores.
Historia de Uso:
Como Administrador quiero consultar la infromacion de los profesores para validar las necesidades de las reservas.
Pre-condicion = Acceder a recursos humanos.
Post-condicion = Acceso a la informacion de los profesores.

RF-06. El sistema Consulta el tiempo de instancia de los usuarios dentro del lugar de la reserva.
Historia de Uso:
Como administrador quiero tener claro fecha , hora y plazo del usuario para optimizar mas reservas.
Pre-condicion = Existencia de comportamiento para gestionar el tiempo del usuario.
Post-Condicion = El usuario termina su reserva. 

RF-07. El sistema consulta que tipo de usuario puede acceder a un tipo de reserva.
Historia de Uso:
Como administrador quiero consultar que tipo de Usuario puede acceder a cierta reserva para Organizar mejor las aulas y las reservas.

Pre-condicion = Existencia de comportamiento para limitar acceso a reserva.
Post-Condicion = limitaciones en cuanto a entrada para algunos usuarios en las reservas. 

Requerimientos No Funcionales:
RNF-01. El sistema debe resguardar la informacion de los Usuarios (estudiantes,profesores,monitores).
Historia de Uso:
Como estudiante, profesor , monitor quiero tener la seguridad de mis datos para confiar plenamente en el sistema.
RNF-02. El sistema debe conocer las materias por sus Siglas.
Historia de Uso:
Como administrador quiero diferenciar las materias por sus siglas para mayor simplicidad en el sistema.
RNF-03. El sistema reconoce que estudiantes son Monitores o no.
Historia de Uso:
Como adminitrador quiero diferenciar estudiantes y monitores para organizar las reservas.


