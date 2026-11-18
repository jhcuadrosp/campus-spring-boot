# campus-spring-boot

Curso Básico de Spring Boot.

Repositorio educativo universitario de **10 sesiones**, dirigido a estudiantes con conocimientos básicos de Java y POO. El caso transversal es **Commerce API**, una aplicación de comercio electrónico cuyo catálogo evoluciona de forma progresiva.

## Estado actual

Estructura documental inicial. Todavía no hay proyectos Spring Boot, código Java, dependencias, soluciones ni archivos pom.xml. Cada demo y cada laboratorio serán proyectos Maven independientes cuando se implementen. No habrá un pom.xml agregador en la raíz.

## Herramientas previstas

Java 21, Spring Boot **3.5.16**, Maven e IntelliJ IDEA Community o Ultimate. JUnit 5.12.2 administrado por Boot. Spring Boot 3.5.16 se utiliza como base educativa local; su soporte comunitario finalizó. Antes de un despliegue productivo se debe revisar la versión y su soporte.

## Recorrido

| Sesión | Tema |
| --- | --- |
| 01 | [Introducción a Spring Boot](sessions/01-introduccion-spring-boot/README.md) |
| 02 | [Manejo de dependencias y Java Beans](sessions/02-dependencias-java-beans/README.md) |
| 03 | [Introducción a JPA](sessions/03-introduccion-jpa/README.md) |
| 04 | [Gestión de bases de datos mediante JPA](sessions/04-gestion-bases-datos-jpa/README.md) |
| 05 | [Diseño de API REST en Spring Boot](sessions/05-api-rest/README.md) |
| 06 | [Documentación de APIs mediante OpenAPI y Swagger UI](sessions/06-openapi-swagger/README.md) |
| 07 | [Manejo y gestión de excepciones](sessions/07-excepciones/README.md) |
| 08 | [Introducción a Spring Security y JWT](sessions/08-security-jwt/README.md) |
| 09 | [Políticas de acceso y CORS](sessions/09-acceso-cors/README.md) |
| 10 | [Fundamentos de despliegue mediante Apache Tomcat](sessions/10-despliegue-tomcat/README.md) |

## Cómo utilizar este repositorio

1. Revisar las herramientas previstas y el enfoque pedagógico de este README.
2. Consultar el [mapa del curso](#evolución-de-commerce-api) y la [arquitectura progresiva](#arquitectura-progresiva-de-commerce-api).
3. Abrir el README de la sesión y sus índices demo/ y labs/.
4. Al implementar actividades, seguir las [normas de laboratorios](#normas-de-laboratorios) y las [plantillas documentales](README.md#plantillas-documentales).

En esta etapa se puede abrir la raíz en IntelliJ como carpeta de documentación; no hay aplicación que ejecutar. Más adelante se importará por separado el pom.xml del proyecto deseado con JDK 21.

## Enfoque

**Problema → Análisis → Diseño → Implementación → Pruebas → Depuración → Mejora.**

Cada sesión incluye una demostración guiada y práctica. La progresión respeta el nivel del estudiante: arranque y beans antes de persistencia; persistencia antes de REST; documentación y errores antes de seguridad; despliegue al final.

## Contribución

Conservar material inicial y soluciones separados, usar datos ficticios y documentar verificaciones reales. No crear commits automáticamente.

## Evolución de Commerce API

Estado: planificación; las capacidades de esta tabla aún no están implementadas.
Caso transversal: un comercio necesita gestionar y publicar su catálogo, proteger su modificación y ejecutar la aplicación localmente.

| Sesión | Incremento de Commerce API | Evidencia de aprendizaje |
| --- | --- | --- |
| [01](sessions/01-introduccion-spring-boot/README.md) | Ejecutar el arranque de Commerce API y reconocer su configuración básica. | La aplicación arranca y el estudiante explica los logs y corrige un error de ejecución. |
| [02](sessions/02-dependencias-java-beans/README.md) | Separar una regla de precios de su consumidor mediante inyección por constructor. | Explica qué instancia administra Spring y verifica el cálculo sin levantar el contexto. |
| [03](sessions/03-introduccion-jpa/README.md) | Persistir y consultar productos con identidad propia. | Guardar y recuperar un producto conserva sus atributos; un identificador ausente no produce un resultado. |
| [04](sessions/04-gestion-bases-datos-jpa/README.md) | Relacionar productos y categorías y delimitar operaciones transaccionales. | Las consultas filtran correctamente y una operación fallida no deja cambios parciales. |
| [05](sessions/05-api-rest/README.md) | Exponer el catálogo mediante un contrato HTTP comprensible. | Los casos válidos respetan el contrato y las entradas inválidas se rechazan; no se exponen entidades directamente. |
| [06](sessions/06-openapi-swagger/README.md) | Hacer verificable y explorable el contrato del catálogo. | La especificación describe rutas, cuerpos y estados realmente implementados. |
| [07](sessions/07-excepciones/README.md) | Ofrecer errores consistentes sin revelar detalles internos. | Pruebas verifican 400, 404 y 409 según el caso y ausencia de stack traces en las respuestas. |
| [08](sessions/08-security-jwt/README.md) | Autenticar peticiones y validar tokens JWT. | Un token inválido o ausente recibe 401; nunca se registran contraseñas ni tokens completos. |
| [09](sessions/09-acceso-cors/README.md) | Aplicar permisos por rol y permitir únicamente orígenes explícitos. | Se distinguen 401 y 403; las pruebas cubren roles y preflight sin confundir CORS con autenticación. |
| [10](sessions/10-despliegue-tomcat/README.md) | Empaquetar y ejecutar Commerce API en un Tomcat externo compatible. | Un tercero reproduce el despliegue, ejecuta una prueba de humo y explica cómo detenerlo. |

### Continuidad sin acoplamiento

Cada sesión parte conceptualmente de la anterior, pero su futura demo será autosuficiente. Al preparar una nueva instantánea se copiará solamente la base necesaria, se documentará su procedencia y se validará de forma independiente. Un laboratorio nunca dependerá del build de otra sesión.

Los criterios de cada fila orientan las pruebas, no describen funcionalidades ya existentes. El catálogo es el alcance obligatorio; pedidos, pagos y logística pueden discutirse como extensiones posteriores al curso.

Cada README de sesión concreta objetivos, límites, actividades y comprobaciones acordes con el nivel de aprendizaje.

## Arquitectura progresiva de Commerce API

### Principio

Monorepo documental con proyectos futuros independientes. Commerce API es el mismo caso empresarial, no un único binario compartido entre sesiones. Cada instantánea incorpora únicamente conocimientos ya enseñados. No existen servicios distribuidos ni módulos Maven compartidos.

### Evolución

| Sesiones | Flujo y responsabilidades | Paquetes que podrán aparecer |
| --- | --- | --- |
| 01 | main → arranque de servidor embebido y lectura de logs; sin endpoints propios | paquete base |
| 02 | ejecutor de consola → servicio de precios → objetos en memoria | service, model, config según necesidad |
| 03 | ejecutor → servicio → repositorio → H2; Product persistente | entity, repository |
| 04 | servicio transaccional → repositorios de Product y Category | mismos paquetes, sin capa artificial adicional |
| 05 | HTTP → controller → service → repository → base de datos | controller, dto |
| 06 | contrato OpenAPI describe la frontera HTTP existente | configuración documental solo si hace falta |
| 07 | excepciones de negocio → manejador global → ProblemDetail | exception |
| 08 | validación JWT → autenticación → controller | security |
| 09 | autenticación → autorización por rol → controller; CORS en frontera web | security y configuración CORS |
| 10 | Tomcat externo → aplicación WAR → mismo flujo de negocio | adaptación de arranque, sin reescribir dominio |

Los paquetes son decisiones futuras, no directorios vacíos que deban crearse ahora. Al pasar a JPA se explica la diferencia entre un objeto en memoria y una entidad con identidad persistente.

### Modelo acotado

Product representa identificador, nombre, precio y disponibilidad básica; Category agrupa productos desde sesión 04. Introducir cada atributo cuando tenga un criterio observable. La relación inicial es unidireccional desde Product a Category. No modelar pedidos, pagos o inventarios distribuidos para enseñar CRUD.

El servicio coordina reglas y transacciones desde sesión 04; el repositorio resuelve acceso a datos. El controlador traduce HTTP sin asumir reglas de negocio. Los DTO desacoplan JSON y persistencia desde sesión 05. No añadir interfaces duplicadas, repositorios genéricos propios ni arquitectura hexagonal obligatoria.

### Decisiones de ejecución

Sesión 01: creación desde IntelliJ con Spring Initializr y Spring Web, arranque del servidor embebido y lectura de logs, sin endpoints propios. Sesiones 02–04: reglas y persistencia mediante ejecutores de consola; no crear endpoints provisionales. H2 permite práctica reproducible sin servidor externo. Datos de prueba sintéticos y aislados; cualquier reinicialización de esquema se limita a perfiles didácticos y se explica.

Sesiones 05–09: servidor embebido y API local. OpenAPI se mantiene alineado con respuestas y errores; en 08 se añade el esquema de autenticación y en 09 los permisos. No implementar un servidor de identidad completo: documentar el emisor didáctico y validar firma, expiración y claims pertinentes mediante bibliotecas mantenidas.

Sesión 10: comparar JAR ejecutable con WAR para Tomcat externo 10.1 compatible con Jakarta. Documentar adaptación del inicializador, alcance provided del contenedor, context path, variables, puerto, logs, arranque y parada cuando se implemente. No mezclar Tomcat 9/javax con esta base. El despliegue obligatorio es local.

### Verificación y límites

Cada instantánea deberá ejecutarse y probarse sin otras sesiones. Priorizar pruebas unitarias para reglas, integración acotada para persistencia y pruebas HTTP para contratos. En seguridad cubrir resultados permitidos y denegados; CORS no sustituye autenticación ni autorización. No desactivar CSRF sin explicar el modelo de credenciales y su riesgo.

Las herramientas previstas y la limitación de soporte de Boot se describen al inicio de este README. Esta arquitectura no pretende ser una plataforma de producción.

## Normas de laboratorios

### Diseño

Cada sesión tiene un bloque práctico total de 60 minutos. La demo tiene prioridad y debe incluir ejecución, pruebas y depuración dentro de ese límite. El tiempo que sobre se utiliza para avanzar en los laboratorios; no existe un tiempo mínimo garantizado para resolverlos en clase ni se exige completarlos en ese bloque. Dividirlos en tareas pequeñas con puntos de reanudación; cualquier entrega posterior tendrá su propio plazo explícito. Partir del problema empresarial, explicitar conceptos disponibles y no exigir contenidos futuros.

Usar [la plantilla de laboratorio](README.md#plantilla-de-laboratorio). Incluir criterios observables, datos ficticios, resultados esperados, casos válidos y de fallo y una guía de depuración. Evitar instrucciones que revelen toda la solución.

### Material inicial y solución

Cuando se autorice implementar un laboratorio, labs/lab-NN-tema/README.md será el enunciado. starter/ contendrá un proyecto independiente, compilable, con trabajo pendiente claramente delimitado y sin implementaciones resueltas. Si se entregan pruebas inicialmente fallidas, declarar cuáles y por qué.

solution/ será otro proyecto independiente, creado únicamente por solicitud explícita; contendrá la solución de referencia, pruebas y explicación de decisiones. No dependerá de starter/ ni de demos. Un prefijo de carpeta no controla acceso: si la solución debe permanecer reservada al docente, no publicarla en el repositorio visible a estudiantes hasta el momento indicado.

La demo de la sesión 01 tiene una guía de creación manual; los laboratorios todavía contienen índices documentales. No crear estas variantes, código ni pom.xml en esta etapa.

### Trabajo y evidencia

1. Formular el problema y analizar entradas, salidas y restricciones.
2. Proponer un diseño mínimo antes de programar.
3. Implementar y ejecutar las comprobaciones acordes con la sesión.
4. Registrar al menos un fallo: síntoma, hipótesis, causa, corrección y repetición de la prueba.
5. Explicar una mejora y su costo; no incorporar contenido avanzado por obligación.

Entrega futura: código en el starter asignado, breve registro de decisiones, comandos ejecutados y resultados reproducibles. No entregar target/, configuración del IDE, secretos o bases con datos personales. Las capturas pueden complementar, pero no reemplazar instrucciones ni resultados textuales.

### Evaluación orientativa

| Criterio | Peso |
| --- | ---: |
| Cumplimiento funcional y criterios de aceptación | 40 % |
| Pruebas y evidencia reproducible | 25 % |
| Claridad del diseño y código | 20 % |
| Depuración y explicación de mejora | 15 % |

La sesión 01 evalúa ejecución y comprobaciones manuales; no exige JUnit antes de enseñarlo. Los casos de error crecen con el temario. Ajustar la rúbrica al enunciado antes de impartir la sesión, conservando el total de 100 %.

### Revisión docente

Comprobar que el material inicial no contiene la solución, las rutas son válidas, el tiempo es realista, los criterios son verificables y todas las herramientas se han explicado. Ejecutar el proyecto desde su propio directorio cuando exista; documentar cualquier requisito externo y su limpieza.

## Distribución del tiempo

El bloque práctico ocupa **60 minutos en total**: la demo guiada, incluidas sus pruebas y depuración, debe caber en ese tiempo. Si termina antes, los estudiantes pueden avanzar en los labs durante los minutos restantes. No se garantiza completar los labs en clase.

## Estructura del monorepo

El repositorio público contiene:

```text
campus-spring-boot/
├── README.md
├── .gitignore
├── .editorconfig
└── sessions/
    └── NN-tema/
        ├── README.md
        ├── demo/
        │   └── README.md
        └── labs/
            └── README.md
```

La estructura de sesión se repite para los diez temas del recorrido. Cada demo y laboratorio alojará su proyecto Maven independiente cuando se implemente.
## Plantillas documentales

### Plantilla de demo

Indicar título, sesión, objetivo, prerrequisitos y duración máxima de 60 minutos. Desarrollar Problema → Análisis → Diseño → Implementación → Pruebas → Depuración → Mejora. Incluir instrucciones de ejecución, configuración, resultados esperados, un fallo diagnosticable y cómo detener la aplicación. El tiempo sobrante se dedica a labs.

### Plantilla de laboratorio

Indicar título, objetivo, conocimientos previos, material inicial y criterios de aceptación. Dividir el trabajo en tareas reanudables con casos de prueba, pistas de depuración y una mejora final. Separar starter y solución de referencia. El avance en clase usa únicamente el tiempo sobrante de la demo; cualquier entrega posterior debe tener plazo explícito. Aplicar la rúbrica de las normas de laboratorios.
