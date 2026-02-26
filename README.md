# DOSW_ParcialT1_JuanSalas


Juan Angel Salas Gomez Parcial 1 DOSW

SILABINFO


Que patron de Diseño se Uso?
Factory Method --> Con este metodo se logro instaciar elegantemente los servicios y con este generando extensibilidad para futuras Reservas.Como ? --> Product= Reserva, ProductsConcrets = OficinaReserva,EquipoReserva, SalonClaseReserva, Salas EstudioReserva . Service = ReservaServicio igualmente generando la herencia para cada tipo de reserva. 
Cuales se hubieran podido Implementar?
Builder y Chain of responsability , por la parte de builder que es creacional ya que en varias reservas se generaban constructores con muchos parametros lo cual lo vuelve poco eficiente y se puede instanciar mejor , por la parte de Chain Of responsability  que es de comportamiento se podia implementar para generar varias Validaciones para las reservas lo cual hubiera beneficiado muy bien el sistema.

Principios SOLID:
S --> Se utilizo Unica instancia para las reservas.
O --> Se utilizo el principio con el fin de poder extender futuras reservas mediante la implementacion del ´Patron Factory Method.

