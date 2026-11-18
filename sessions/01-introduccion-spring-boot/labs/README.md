# Laboratorios — Sesión 01

Cinco ejercicios para ampliar la aplicación construida en clase: **tres básicos y dos intermedios**. Trabaja sobre el mismo proyecto [demo](../demo/README.md) y añade los nuevos métodos a [WelcomeController.java](../demo/src/main/java/edu/jhcp/springboot/commerce/controller/WelcomeController.java). No crees otro proyecto ni otro controller.

## Lo que aprendimos y trabajamos

- Creamos un proyecto Spring Boot desde IntelliJ con Java y Maven.
- Reconocimos la clase principal: main inicia la ejecución y SpringApplication.run arranca la aplicación y su servidor embebido.
- Conocimos @SpringBootApplication y el descubrimiento de componentes en el paquete principal y sus subpaquetes.
- Usamos @RestController para atender peticiones y devolver datos en el cuerpo de la respuesta.
- Relacionamos una petición HTTP GET con un método Java mediante @GetMapping.
- Devolvimos un Map con datos que Spring convierte a JSON; no escribimos el JSON mediante concatenación de texto.
- Consultamos /api/welcome desde el navegador y distinguimos la respuesta HTTP de los mensajes de consola.
- Revisamos logs, puerto y configuración para diagnosticar fallos.

Consulta el [resumen de conceptos de la sesión](../README.md#conceptos-nuevos-de-spring) si necesitas repasar.

## Forma de trabajo

1. Abre el proyecto demo en IntelliJ. Conserva su configuración Maven **Bundled (Maven 3)**.
2. Ejecuta la aplicación y comprueba que [la bienvenida](http://localhost:8080/api/welcome) funciona antes de modificarla.
3. Para cada ejercicio, identifica los datos y sus tipos, elige un nombre descriptivo para el método y añade una ruta GET distinta dentro de WelcomeController.
4. Conserva /api/welcome y su respuesta. No repitas la misma ruta en dos métodos.
5. Usa datos ficticios y fijos. No añadas dependencias, bases de datos, autenticación, clases de servicio ni operaciones de escritura.
6. Reinicia la aplicación después de cambiar el código y verifica cada ruta. Si usas otro puerto, ajusta las direcciones de esta guía.
7. Avanza en orden y comprueba un ejercicio antes de pasar al siguiente.

Aquí llamamos servicios a los endpoints HTTP; no se pide crear clases con @Service. Estos ejercicios introducen respuestas JSON, no el diseño completo de una API REST.

**Tiempo:** utiliza únicamente el tiempo que sobre de la demo dentro del bloque práctico de 60 minutos. Puedes detenerte al completar cualquier ejercicio y retomarlo después. No se exige terminar los cinco durante la clase; el docente indicará por separado el plazo de entrega.

## Lab 1 — Información de la tienda · Básico

**Problema:** un visitante necesita identificar el comercio y conocer su actividad.

**Tarea:** crea un método que atienda GET /api/store y devuelva un objeto JSON con estos campos:

| Campo | Tipo JSON | Contenido requerido |
| --- | --- | --- |
| name | Texto | Nombre de la tienda |
| description | Texto | Descripción breve de lo que vende |
| city | Texto | Ciudad donde opera |

**Pista:** todos los valores son texto, como en el Map<String, String> del ejemplo de bienvenida. Elige tus propios datos; no devuelvas una cadena que simule un objeto JSON.

**Comprobación:** abre [http://localhost:8080/api/store](http://localhost:8080/api/store). Debes obtener 200 OK y un objeto con los tres campos, sin valores vacíos.

**Depuración y mejora:** si aparece 404, compara la URL con la ruta de la anotación. Mejora la descripción para que explique claramente el negocio.

## Lab 2 — Datos de contacto · Básico

**Problema:** un cliente necesita saber cómo comunicarse con la tienda.

**Tarea:** añade GET /api/contact con un objeto JSON:

| Campo | Tipo JSON | Contenido requerido |
| --- | --- | --- |
| email | Texto | Correo ficticio, con dominio example.com |
| phone | Texto | Teléfono ficticio con prefijo internacional |
| address | Texto | Dirección ficticia del comercio |

**Pista:** el teléfono es texto, aunque contenga dígitos: puede incluir el símbolo +, espacios o ceros iniciales.

**Comprobación:** abre [http://localhost:8080/api/contact](http://localhost:8080/api/contact). Verifica 200 OK, los tres campos de texto y que /api/store siga funcionando.

**Depuración y mejora:** si los datos no son los nuevos, guarda el archivo y reinicia el proceso correcto. Presenta el teléfono de forma legible sin convertirlo a número.

## Lab 3 — Horarios de atención · Básico

**Problema:** un visitante quiere conocer los días y horas de atención.

**Tarea:** añade GET /api/schedule con un objeto JSON:

| Campo | Tipo JSON | Contenido requerido |
| --- | --- | --- |
| days | Texto | Días de atención |
| openingTime | Texto | Hora de apertura en formato HH:mm |
| closingTime | Texto | Hora de cierre en formato HH:mm |

**Pista:** en este ejercicio las horas son textos fijos; no necesitas cálculos de fechas ni indicar si la tienda está abierta en tiempo real. Usa un horario del mismo día, con cierre posterior a la apertura.

**Comprobación:** abre [http://localhost:8080/api/schedule](http://localhost:8080/api/schedule). Verifica 200 OK, campos completos y horas coherentes.

**Depuración y mejora:** si el arranque informa de un mapeo ambiguo, comprueba que no copiaste la ruta de otro método. Revisa que las dos horas utilicen el mismo formato.

## Antes de los intermedios: tipos y colecciones

JSON distingue texto, número, booleano, objeto y arreglo. El precio debe ser un número sin comillas; la disponibilidad debe ser true o false, también sin comillas. Un teléfono continúa siendo texto.

Un Map<String, String> solo admite valores de texto. Para reunir valores de tipos distintos en este ejercicio puedes usar Map<String, Object>. Object permite almacenar valores de diferentes tipos Java; Spring conserva su naturaleza al convertirlos a JSON. No conviertas números o booleanos en texto para hacerlos caber en el mapa anterior.

Para representar varios productos puedes usar una List de mapas. Cada mapa se convierte en un objeto JSON y la lista se convierte en un arreglo. List.of permite crear una lista fija; tanto esta lista como los mapas creados con Map.of son inmutables. Define sus elementos al construirlos.

Estas colecciones son recursos de Java. No requieren una nueva dependencia ni otra anotación de Spring.

## Lab 4 — Producto destacado · Intermedio

**Problema:** la tienda quiere mostrar un producto con su precio y disponibilidad.

**Tarea:** añade GET /api/product y devuelve un objeto JSON con:

| Campo | Tipo JSON | Contenido requerido |
| --- | --- | --- |
| id | Número entero | Identificador positivo |
| name | Texto | Nombre del producto |
| price | Número | Precio mayor que cero |
| available | Booleano | Disponibilidad: true o false |

**Pista:** combina los tipos de los valores en un mapa. Para representar un importe decimal puedes usar BigDecimal de Java, construido a partir de un texto decimal exacto; al serializarlo, el precio debe seguir apareciendo como número JSON. No se requieren cálculos de dinero en este ejercicio.

**Comprobación:** abre [http://localhost:8080/api/product](http://localhost:8080/api/product). Verifica 200 OK y los cuatro campos. Comprueba especialmente que id, price y available no aparezcan entre comillas.

**Depuración y mejora:** si Java rechaza un número o booleano al construir el mapa, revisa el tipo declarado para sus valores. Explica por qué un precio numérico es más útil para un cliente de la API que el texto “precio: 100 pesos”.

## Lab 5 — Catálogo de productos · Intermedio

**Problema:** el visitante necesita consultar varios productos en una sola petición.

**Tarea:** añade GET /api/catalog. La respuesta debe ser un **arreglo JSON de tres productos**, cada uno con id, name, price y available, respetando los tipos del laboratorio 4.

Requisitos:

- Tres identificadores positivos y diferentes.
- Nombres no vacíos y precios mayores que cero.
- Al menos un producto disponible y otro no disponible.
- La misma estructura de campos en los tres objetos.
- El primer producto debe coincidir con el producto destacado del laboratorio 4.

**Pista:** piensa primero en la representación de un producto y después en la colección que reúne tres productos. Una List de Map<String, Object> permite expresar esa estructura sin crear nuevas clases. No devuelvas tres objetos separados ni un texto que parezca una lista.

**Comprobación:** abre [http://localhost:8080/api/catalog](http://localhost:8080/api/catalog). Verifica 200 OK, que el JSON comience como arreglo y que contenga exactamente tres objetos con los tipos correctos. Comprueba de nuevo /api/product y /api/welcome.

**Depuración y mejora:** si obtienes un objeto en lugar de un arreglo, revisa qué estructura retorna el método. Explica qué mantenimiento adicional exigiría repetir los datos del producto destacado en dos métodos; basta con identificar el problema, sin introducir capas nuevas.

## Entrega y comprobación final

El trabajo se realiza en el WelcomeController del demo existente. Este documento contiene los enunciados, no soluciones de referencia.

Entrega según el medio y plazo que indique el docente:

- Los cambios realizados en el mismo proyecto demo.
- Una tabla con las cinco rutas, el estado HTTP observado y la respuesta JSON obtenida. Puedes usar la pestaña Network del navegador para revisar el estado y el Content-Type application/json.
- Un registro breve de un error: síntoma, hipótesis, causa, corrección y resultado al repetir la prueba.
- Una explicación de la diferencia entre un mapa de textos, un mapa con tipos mixtos y una lista de mapas.

Antes de entregar, comprueba:

- Las cinco rutas nuevas funcionan y /api/welcome conserva su respuesta.
- Los campos y tipos cumplen cada enunciado; el orden de las propiedades JSON no es un criterio de evaluación.
- No hay rutas duplicadas ni datos personales reales.
- No incluyes target/, out/, archivos del IDE ni secretos.
- Puedes explicar cómo una petición llega al método y cómo su retorno se convierte en JSON.
- Detienes la aplicación al terminar.

La evaluación sigue las [normas de laboratorios](../../../README.md#normas-de-laboratorios): funcionamiento 40 %, comprobaciones reproducibles 25 %, claridad 20 % y depuración/mejora 15 %. En esta sesión las comprobaciones son manuales; no se exige escribir pruebas JUnit.
