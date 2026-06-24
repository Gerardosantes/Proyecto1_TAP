---Proyecto1_TAP----
-----Sistema Hospitalario - HospitalGUI


----Descripcion

HospitalGUI es una aplicacion desarrollada en Java utilizando la biblioteca Swing para crear una interfaz grafica de usuario. El sistema permite gestionar turnos de personal hospitalario mediante un inicio de sesion, registro de turnos, consulta de turnos activos y finalizacion de turnos.

Este proyecto fue desarrollado con fines academicos para aplicar conceptos de programacion orientada a objetos, interfaces graficas, eventos y estructuras de datos en Java.

----- Funcionalidades--------

* Inicio de sesion con usuario y contrasena.
* Registro de turnos del personal hospitalario.
* Seleccinn de areas hospitalarias mediante listas desplegables.
* Validacion de horarios en formato de 24 horas.
* Consulta de turnos activos registrados.
* Finalizacion y eliminacion de turnos activos.
* Interfaz grafica amigable desarrollada con Java Swing.

------- Credenciales de Acceso--------

Para ingresar al sistema utilice:

* Usuario: `admin`
* Contrasena: `1234`

-------- Requisitos-------

Antes de ejecutar el programa asegurese de tener instalado:

* Java JDK 8 o superior.
* NetBeans, IntelliJ IDEA o Eclipse (opcional).

-------- Descarga del Proyecto-------

-------- Metodo 1: Descargar desde GitHub

1. Ingrese al repositorio del proyecto.
2. Haga clic en el boton **Code**.
3. Seleccione **Download ZIP**.
4. Extraiga el archivo descargado en cualquier carpeta.

-------- Metodo 2: Clonar el repositorio-------

Abra una terminal y ejecute:

```bash
git clone URL_DEL_REPOSITORIO
```

Despues acceda a la carpeta del proyecto:

```bash
cd HospitalGUI
```

------- Como Ejecutar el Programa----------

---------- Desde un IDE

1. Abra NetBeans, IntelliJ IDEA o Eclipse.
2. Seleccione **Abrir Proyecto**.
3. Busque la carpeta del proyecto descargado.
4. Ejecute la clase `HospitalGUI.java`.

------- Desde la Terminal-------

Compile el programa:

```bash
javac HospitalGUI.java
```

Ejecute el sistema:

```bash
java HospitalGUI
```

-------Modulos del Sistema---------

------Registro de Turnos-------

Permite registrar personal indicando:

* Nombre del empleado.
* area hospitalaria.
* Hora de entrada.

-------Turnos Activos------

Muestra una lista completa de todos los turnos registrados actualmente.

------- Finalizar Turno---------

Permite seleccionar y eliminar un turno activo cuando el empleado termina su jornada.

---------Tecnologias Utilizadas---------

* Java
* Java Swing
* ArrayList
* ActionListener
* JOptionPane
* Programacion Orientada a Objetos (POO)


