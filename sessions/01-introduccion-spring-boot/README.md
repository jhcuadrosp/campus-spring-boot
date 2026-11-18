# Sesión 01 — Introducción a Spring Boot

Estado: demo inicial implementada; laboratorios en planificación. Duración institucional: **210 minutos**.

## Problema empresarial y objetivo

Ejecutar el arranque de Commerce API y reconocer su configuración básica.

## Prerrequisitos

Java, POO, terminal y estructura básica de un proyecto.

## Contenidos y límites

Creación desde Spring Initializr en IntelliJ IDEA, Maven, Java 21, Spring Web, clase principal, servidor embebido, configuración y lectura de logs.

Se introduce un endpoint GET de bienvenida como primer contacto con HTTP y JSON. El diseño completo de una API REST se estudia en la sesión 05. No abordar todavía JPA, seguridad ni despliegue externo.

## Secuencia de trabajo

| Bloque | Minutos | Aplicación |
| --- | ---: | --- |
| Desarrollo conceptual | 150 | Explicación del tema, problema, análisis y diseño |
| Práctica | 60 | Demo con implementación, pruebas, depuración y mejora; labs en el tiempo sobrante |
| **Total** | **210** | |

La demo debe completarse dentro del bloque práctico de 60 minutos. Si termina antes, el resto se utiliza para avanzar en labs; no hay un tiempo mínimo reservado ni obligación de completarlos en clase.

## Demostración guiada

Crear commerce-api-s01-demo desde IntelliJ, arrancar el servidor embebido y comprobar los logs y consultar un controller básico que devuelve JSON.

Ver [demo/](demo/README.md). La guía explica cómo generar el proyecto manualmente durante la clase; el proyecto y el controller de bienvenida ya están disponibles en demo/.


## Primer controller: bienvenida en JSON

Se creó [WelcomeController.java](demo/src/main/java/edu/jhcp/springboot/commerce/controller/WelcomeController.java) para atender una petición **HTTP GET** en [http://localhost:8080/api/welcome](http://localhost:8080/api/welcome).

Con la aplicación ejecutándose, abre esa dirección en el navegador. La respuesta esperada es un estado **200 OK**, contenido JSON y estos datos:

```json
{
  "application": "Commerce API",
  "message": "Bienvenido a nuestra tienda",
  "status": "running"
}
```

El orden de las propiedades puede variar: un objeto JSON no depende del orden de sus claves. El campo status es un mensaje didáctico fijo; no comprueba la salud de una base de datos ni de otros servicios.

## Conceptos nuevos de Spring

Estas explicaciones corresponden a los comentarios de [DemoApplication.java](demo/src/main/java/edu/jhcp/springboot/commerce/DemoApplication.java) y del controller.

### La clase principal y el arranque

- **main:** sigue siendo el punto de entrada de Java.
- **@SpringBootApplication:** reúne la configuración principal, la autoconfiguración y el escaneo de componentes. No necesitamos escribir sus tres anotaciones por separado.
- **@SpringBootConfiguration:** identifica la clase como una fuente de configuración de Spring.
- **@EnableAutoConfiguration:** permite configurar componentes según las dependencias y condiciones de la aplicación. Con el starter web, Boot prepara la infraestructura web y el servidor embebido.
- **@ComponentScan:** busca componentes en el paquete de la clase principal y sus subpaquetes. DemoApplication está en edu.jhcp.springboot.commerce y WelcomeController en edu.jhcp.springboot.commerce.controller; por eso puede descubrirlo.
- **SpringApplication.run(DemoApplication.class, args):** inicia el contexto de Spring y, en esta aplicación web, el servidor embebido. El contexto administra los componentes de la aplicación; los beans se estudiarán con más detalle en la sesión 02.

### El controller y la respuesta

- **@RestController:** marca una clase que atiende solicitudes web y escribe sus resultados en el cuerpo de la respuesta, en lugar de buscar una plantilla de vista. Spring administra su instancia; no necesitamos crearla con new para atender la petición.
- **@GetMapping("/api/welcome"):** relaciona el método HTTP GET y esa ruta con el método welcome(). El método se ejecuta cuando llega una petición coincidente, no simplemente por arrancar la aplicación.
- **Map<String, String>:** es una colección de Java de claves y valores de texto. No es una clase de Spring ni una cadena JSON.
- **Map.of(...):** crea el mapa devuelto por el método; el mapa no admite modificaciones.
- **Conversión a JSON:** la infraestructura de Spring MVC utiliza un convertidor de mensajes para serializar el mapa. Por eso no concatenamos llaves, comillas ni texto JSON manualmente.

El recorrido es: **navegador → servidor embebido → Spring MVC → WelcomeController.welcome() → mapa Java → respuesta JSON**.

### Logs frente a la respuesta HTTP

La clase principal incluye logger.info(...) y System.out.println(...). Ambos muestran el saludo en la consola, pero solo el logger pasa por el sistema de logging, que permite niveles y configuración de salida. Se muestran como comparación; en una aplicación normalmente se prefiere el logger para registrar eventos.

Estos mensajes se ejecutan durante el arranque, después de SpringApplication.run(...). **No son el JSON que recibe el navegador**: esa respuesta procede del valor retornado por welcome().

## Comprobación del endpoint

1. Ejecuta DemoApplication desde IntelliJ y espera el mensaje de arranque.
2. Abre http://localhost:8080/api/welcome y comprueba las tres propiedades y sus valores.
3. En las herramientas del navegador, abre Network, recarga y revisa el estado 200 y el Content-Type application/json.
4. Si configuraste server.port=8081, usa http://localhost:8081/api/welcome.
5. La dirección raíz http://localhost:8080/ puede seguir devolviendo 404: no tiene un método asociado.
6. Si /api/welcome devuelve 404, revisa la ruta, las anotaciones, el paquete del controller y reinicia la aplicación para cargar los cambios.
7. Explica qué parte ejecuta Java, qué parte administra Spring y cómo se obtiene el JSON. Detén la aplicación al terminar.
## Laboratorio de práctica

Personalizar la identificación del comercio y diagnosticar un fallo de configuración.

Ver [labs/](labs/README.md). Avance durante el tiempo sobrante del bloque práctico de 60 minutos. El material inicial y la solución de referencia se distinguirán según las normas; ninguno se genera ahora.

## Criterios de aceptación y evidencia

La aplicación arranca y el estudiante explica los logs y corrige un error de ejecución.

Entregar un registro breve del resultado, un fallo diagnosticado y una mejora justificada. No exigir herramientas ni conceptos de sesiones posteriores.

## Referencias del curso

- [Convenciones](../../COURSE-CONVENTIONS.md)
- [Evolución de Commerce API](../../README.md#evolución-de-commerce-api)
- [Arquitectura](../../README.md#arquitectura-progresiva-de-commerce-api)
- [Normas de laboratorios](../../README.md#normas-de-laboratorios)

## Material de apoyo

La carpeta docs/ de esta sesión queda vacía, reservada para material futuro.
