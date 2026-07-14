# LlanquihueTourApp

## Descripción del proyecto

LlanquihueTourApp es un sistema desarrollado en Java que simula la gestión de entidades de una agencia de turismo. Esta versión incorpora conceptos de Programación Orientada a Objetos como interfaces, herencia, polimorfismo, colecciones genéricas y validación de tipos mediante el operador `instanceof`.

El sistema permite registrar diferentes entidades de la agencia, como guías turísticos y vehículos, almacenarlas en una colección dinámica y visualizar su información mediante una interfaz gráfica básica desarrollada con `JOptionPane`.

## Clases e interfaces utilizadas

### Paquete `model`
- **Registrable (Interfaz):** Define el método `mostrarResumen()`, implementado por todas las entidades registrables.
- **Persona (Clase abstracta):** Clase base para entidades que representan personas.
- **GuiaTuristico:** Hereda de `Persona` e implementa `Registrable`.
- **Vehiculo:** Implementa `Registrable`.
- **ColaboradorExterno:** Hereda de `Persona` e implementa `Registrable`.

### Paquete `data`
- **GestorEntidades:** Administra una colección `ArrayList<Registrable>`, permite agregar entidades, recorrer la colección y diferenciar objetos mediante `instanceof`.

### Paquete `ui`
- **LlanquihueTourApp:** Clase principal del proyecto. Contiene el menú interactivo desarrollado con `JOptionPane`, permitiendo registrar y visualizar las entidades del sistema.

## Conceptos de Programación Orientada a Objetos aplicados

- Interfaces
- Herencia
- Polimorfismo
- Sobrescritura de métodos
- Clases abstractas
- Colecciones genéricas (`ArrayList`)
- Operador `instanceof`
- Interfaz gráfica básica con `JOptionPane`

## Instrucciones para ejecutar el programa

1. Abrir el proyecto **LlanquihueTourApp** en NetBeans o IntelliJ IDEA.
2. Verificar que todos los archivos se encuentren organizados en los paquetes:
   - `model`
   - `data`
   - `ui`
3. Ejecutar la clase principal:

```
ui.LlanquihueTourApp
```
 
4. Utilizar el menú para:
   - Registrar un Guía Turístico.
   - Registrar un Vehículo.
   - Visualizar el resumen de las entidades registradas.
   - Salir del sistema.

## Autor

**Nombre del estudiante:** Nicolas Orozco Roblwa

**Asignatura:** Programación Orientada a Objetos

**Institución:** Duoc Uc

**Fecha:** 19/07/2026 

#TourAppLLanquihue
