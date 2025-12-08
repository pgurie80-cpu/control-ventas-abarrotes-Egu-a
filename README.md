Resumen Ejecutivo
Descripción

Este proyecto es un Sistema de Control de Ventas desarrollado en Java, que permite gestionar la venta de productos, registrar los movimientos del negocio y facilitar la administración del inventario.

Problema Identificado

Los negocios pequeños suelen registrar ventas de forma manual, lo que causa:

Errores en montos

Dificultad para llevar control del inventario

Pérdida de información histórica

Poco análisis del rendimiento

 Solución Propuesta

Crear una aplicación que permita:

Registrar productos

Gestionar y consultar inventario

Registrar ventas

Consultar historial de ventas

Todo de forma automatizada y estructurada.

Arquitectura de la Solución

Java como lenguaje base

Patrón simple de capas:

Presentación → Interacción con el usuario

Requerimientos
Java JDK	17+
IDE recomendado	Visual Studio Code / IntelliJ IDEA
Sistema Operativo	Windows / Linux / macOS

Instalación
Instalar Java JDK 17 o superior
Instalar un IDE compatible

Ejecutar manualmente

Abrir el proyecto en el IDE

Ejecutar la clase Main.java

Seguir las instrucciones del menú de la aplicación

Configuración

No se requiere configuración avanzada.
El sistema se ejecutará localmente y guardará la información en archivos.

En versiones futuras:

Configuración de rutas de almacenamiento

Gestión de usuarios y contraseñas

Uso
Para Usuario Final

Agregar productos al inventario
Registrar ventas desde el menú
Visualizar reporte de ventas

Para Administrador

Consultar inventario
Modificar productos
Revisar resurtido
Monitorear historial

Contribución
Clonar el repositorio

Crear un nuevo branch desde develop
Cada funcionalidad o corrección se trabaja en un branch independiente:

git checkout develop
git checkout -b feature/nombre-de-la-funcionalidad

Realizar cambios en el código

Escribir código y actualizar archivos necesarios.

Crear commit con mensaje claro
git add .
git commit -m "Descripción breve del cambio realizado"

Subir branch al repositorio
git push origin feature/nombre-de-la-funcionalidad

 Crear un Pull Request

Abrir GitHub → pestaña Pull Requests

Seleccionar:

Base branch: develop

Compare branch: el branch creado (ej. feature/registro-de-productos)

Describir los cambios realizados

Enviar el PR para revisión

Revisión y aprobación

El administrador del proyecto revisará los cambios, pedirá ajustes si son necesarios y finalmente hará el merge hacia develop

Roadmap 
Versión	             Mejoras previstas
Beta	       Registrar ventas, inventario básico, guardado en archivos
GA	         Reportes, login de usuario, posible base de datos
Futuro	     Integración para punto de venta con lector de código de barras
 
Negocio → Lógica para ventas e inventario

Datos → Gestión de listas internas (simulación futura a base de datos)
