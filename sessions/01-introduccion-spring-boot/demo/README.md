# Demo — Crear Commerce API desde IntelliJ IDEA

Durante la clase, cada estudiante creará un nuevo proyecto de tipo **Spring Boot** con Spring Initializr desde IntelliJ IDEA, siguiendo esta guía.

## Problema, análisis y diseño

El comercio necesita una aplicación base que pueda arrancar de forma reproducible. Al terminar podrás crear el proyecto,
reconocer sus archivos, ejecutarlo, interpretar los logs y corregir un error de configuración.

Java es el lenguaje; JDK 21 permite compilar y ejecutar; Maven gestiona el proyecto; Spring Boot configura y arranca la
aplicación. Spring Web incorpora el servidor embebido: no necesitas instalar Tomcat por separado.

Se incluye un controller básico de bienvenida que devuelve JSON. No añadiremos JPA, seguridad o bases de datos. El diseño completo de API REST
corresponde a la sesión 05.

## Tiempo de la práctica

Disponemos de **60 minutos como máximo**, incluidas ejecución, pruebas y depuración.

| Actividad                       | Minutos orientativos |
|---------------------------------|---------------------:|
| Problema, análisis y diseño     |                    5 |
| Crear e importar el proyecto    |                   15 |
| Reconocer archivos y configurar |                   10 |
| Ejecutar y comprobar            |                   10 |
| Depurar y repetir               |                   10 |
| Mejora y cierre                 |                    5 |
| Margen para incidencias o labs  |                    5 |

Todo el tiempo sobrante se destina a avanzar en los [labs](../labs/README.md). No es obligatorio completarlos dentro de
este bloque.

## 1. Preparar el entorno

1. Abre el repositorio existente campus-spring-boot en IntelliJ IDEA.
2. Localiza sessions/01-introduccion-spring-boot/demo/. Ya contiene este README: consérvalo.
3. Comprueba que tienes JDK 21 instalado. En **File → Project Structure → Project**, selecciona el SDK 21. Algunas
   etiquetas cambian según la versión del IDE.
4. Comprueba tu conexión a Internet: Initializr genera el proyecto y Maven descargará dependencias.
5. Identifica la carpeta de destino: el archivo resultante debe quedar en **demo/pom.xml**, directamente dentro de
   demo/.

## 2. Crear el proyecto desde IntelliJ

1. Con el monorepo abierto, selecciona **File → New → Project...**.
2. Elige **Spring Boot** o **Spring Initializr**, según tu versión.
3. Mantén el servicio https://start.spring.io.
4. Completa estos campos:

| Campo               | Valor                                                            |
|---------------------|------------------------------------------------------------------|
| Tipo de proyecto    | Spring Boot / Spring Initializr                                  |
| Name                | demo                                                             |
| Location            | ...\campus-spring-boot\sessions\01-introduccion-spring-boot |
| Language            | Java                                                             |
| Build system / Type | Maven                                                            |
| JDK                 | 21                                                               |
| Java                | 21                                                               |
| Packaging           | Jar                                                              |
| Group               | edu.jhcp.springboot                                            |
| Artifact            | commerce-api-s01-demo                                            |
| Package name        | edu.jhcp.springboot.commerce                                   |

El prefijo ... representa la ubicación real de tu repositorio; no lo escribas literalmente. **Name debe ser demo**: el IDE lo añade como carpeta final al Location. Selecciona como Location la carpeta de la sesión y verifica que la ruta resultante sea sessions/01-introduccion-spring-boot/demo/, con el POM en demo/pom.xml. No dupliques demo/demo/. Mantén **Artifact** en **commerce-api-s01-demo**, aunque Name sea demo.

5. **Desmarca Create Git repository** si aparece. La aplicación pertenece al repositorio existente y no debe tener un
   .git/ propio.
6. Pulsa **Next** si las dependencias están en otra pantalla.
7. Selecciona **Spring Boot 3.5.16**, la versión fijada
   en [las convenciones](../../../COURSE-CONVENTIONS.md#stack-fijado). No uses SNAPSHOT, milestone ni RC.
8. Añade únicamente **Spring Web MVC**, que puede aparecer como **Spring Web**. Para Boot 3.5 corresponde al starter
   Maven spring-boot-starter-web. No selecciones WebFlux, JPA, Spring Security, bases de datos, Lombok ni DevTools.
9. Revisa los valores y pulsa **Create**. Si se ofrece abrir en una nueva ventana, acepta para mantener accesible el
   monorepo.

**Si no aparece Boot 3.5.16:** el catálogo del servicio cambia y el asistente usa el mismo servicio que la web. No
cambies de versión mayor ni adaptes Boot 4 cambiando solo un número. Informa al docente para que prepare una instancia
de Initializr compatible o revise y comunique la versión de toda la edición antes de la práctica. La alternativa web
resuelve la ausencia del asistente, pero no garantiza versiones antiguas.

**Si el asistente rechaza la carpeta por no estar vacía:** usa la alternativa web y combina sus archivos con demo/,
conservando este README. No borres la carpeta existente.

## 3. Alternativa mediante Spring Initializr web

Esta ruta también permite trabajar en IntelliJ IDEA Community cuando no esté disponible el asistente.

1. Abre [Spring Initializr](https://start.spring.io/).
2. Selecciona **Maven**, **Java**, **Java 21**, **Jar** y la versión de Boot indicada.
3. Completa Group, Artifact, Name y Package name con los mismos valores de la tabla.
4. Añade únicamente **Spring Web** y pulsa **Generate**.
5. Abre el ZIP descargado y localiza la carpeta que contiene pom.xml.
6. Copia **su contenido**, incluidos .mvn/, mvnw y mvnw.cmd, directamente a sessions/01-introduccion-spring-boot/demo/.
7. Si aparece un conflicto con el README, conserva el del curso. No reemplaces archivos existentes sin revisarlos.
8. Comprueba que existe demo/pom.xml y que no hay una carpeta intermedia adicional. No inicialices otro repositorio Git.
9. En IntelliJ, selecciona **File → Open...**, abre demo/pom.xml y elige **Open as Project** cuando se solicite. Ábrelo
   en una nueva ventana.

## 4. Importar Maven y comprobar Java

1. Si el proyecto no se reconoce como Maven, abre demo/pom.xml como proyecto.
2. Abre **File → Settings → Build, Execution, Deployment → Build Tools → Maven**.
3. En **Maven home path**, selecciona **Bundled (Maven 3)**. **No selecciones Use Maven wrapper** para esta práctica; utilizaremos el Maven integrado de IntelliJ para evitar el error de sincronización observado con el wrapper.
4. En las opciones **Importing** y **Runner**, comprueba que el JDK del importador y el JRE del runner usen **Java 21**.
5. Pulsa **Apply** y **OK**.
6. Abre **View → Tool Windows → Maven** y pulsa **Reload All Maven Projects**. Espera a que finalicen la sincronización y la descarga de dependencias. Si la importación inicial había fallado, repítela después de cambiar Maven home path.
7. En **File → Project Structure**, verifica Project SDK 21 y nivel de lenguaje 21.

Los archivos mvnw, mvnw.cmd y .mvn/ pueden permanecer en el proyecto. Su presencia no obliga a utilizarlos: para sincronizar y ejecutar tareas Maven desde IntelliJ en esta práctica se usará **Bundled (Maven 3)**.

No añadas un POM a la raíz del monorepo. Toda la ejecución de esta demo pertenece al proyecto situado en demo/.

## 5. Reconocer los archivos y configurar

En la vista **Project**, localiza:

| Archivo o carpeta                             | Función                                       |
|-----------------------------------------------|-----------------------------------------------|
| pom.xml                                       | Versión de Boot, Java y dependencias          |
| src/main/java/edu/jhcp/springboot/commerce/ | Paquete de la aplicación                      |
| Clase terminada en Application                | Contiene main y @SpringBootApplication        |
| src/main/resources/application.properties     | Configuración                                 |
| src/test/java/                                | Prueba inicial generada; se estudiará después |
| mvnw, mvnw.cmd y .mvn/                        | Maven Wrapper                                 |
| target/                                       | Resultado de compilación; no se versiona      |

1. Abre la clase principal e identifica main y la llamada a SpringApplication.run(...). Revisa también WelcomeController en el subpaquete controller; su explicación está en el README de la sesión.
2. Abre application.properties y establece o comprueba:

```properties
spring.application.name=commerce-api-s01-demo
```

3. Guarda el archivo. Explica la diferencia entre nombre de aplicación, artifact y paquete Java.

## 6. Ejecutar y comprobar

1. Pulsa el triángulo verde junto a main y elige **Run**.
2. Abre la ventana **Run** y espera al mensaje Started ...Application.
3. Localiza el mensaje de arranque de Tomcat y su puerto, normalmente **8080**. La aplicación permanece ejecutándose
   hasta que la detengas.
4. Abre http://localhost:8080/api/welcome en el navegador y comprueba el JSON de bienvenida descrito en el [README de la sesión](../README.md#primer-controller-bienvenida-en-json).
5. Si consultas únicamente http://localhost:8080/, es esperable recibir **404** o una página de error predeterminada: aún no existe una ruta para /. Esto es diferente
   de «conexión rechazada», que indica que no pudiste conectar con el servidor en ese puerto.
6. Registra el nombre, el puerto y el mensaje de arranque. No necesitas escribir pruebas JUnit en esta sesión.
7. Pulsa **Stop**. Actualiza el navegador para comprobar que ese proceso ya no atiende peticiones.

## 7. Depurar un fallo controlado

1. Con la aplicación detenida, añade temporalmente a application.properties:

```properties
server.port=abc
```

2. Ejecuta de nuevo. El arranque debe fallar porque el puerto requiere un número.
3. Lee el error en **Run** y localiza la propiedad que no puede convertirse.
4. Formula una hipótesis y sustituye el valor por:

```properties
server.port=8081
```

5. Ejecuta otra vez y verifica el puerto 8081 en los logs.
6. Abre http://localhost:8081/api/welcome y comprueba el JSON de bienvenida en el nuevo puerto.
7. Detén la aplicación y elimina server.port si quieres volver al puerto predeterminado 8080.

| Problema                                   | Qué revisar                                                                       |
|--------------------------------------------|-----------------------------------------------------------------------------------|
| Puerto ocupado                             | Detén tu ejecución anterior o usa otro puerto libre; no finalices procesos ajenos |
| Java incompatible / invalid target release | SDK, importador y runner Maven en 21                                              |
| Dependencias sin resolver                  | Maven home path en Bundled (Maven 3), conexión, modo offline y recarga del proyecto                            |
| No aparece Run                             | Importación terminada, POM correcto y JDK configurado                             |
| Navegador sin conexión                     | Proceso en ejecución y puerto indicado en los logs                                |
| 404 en la raíz                             | Resultado previsto en /; la ruta implementada es /api/welcome                                     |

## 8. Mejora, cierre y evidencia

- Explica cómo cambiar nombre y puerto mediante configuración sin modificar Java.
- Comprueba que pom.xml está directamente en demo/ y que el único repositorio Git es el monorepo.
- Registra el fallo, su causa, la corrección y el resultado de repetir la ejecución.
- Detén la aplicación al terminar.
- Si sobra tiempo del bloque de 60 minutos, avanza en los [labs](../labs/README.md).

## Referencias

- [JetBrains: asistente Spring Boot](https://www.jetbrains.com/help/idea/spring-initializr-project-wizard.html).
- [JetBrains: soporte de Spring Boot](https://www.jetbrains.com/help/idea/spring-boot.html).
- [Spring Initializr](https://start.spring.io/).
- [Spring Boot 3.5: dependencias y starters](https://docs.spring.io/spring-boot/3.5/reference/using/build-systems.html).
