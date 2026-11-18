# Sesión 10 — Fundamentos de despliegue mediante Apache Tomcat

Estado: planificación documental. Duración institucional: **210 minutos**.

## Problema empresarial y objetivo

Empaquetar y ejecutar Commerce API en un Tomcat externo compatible.

## Prerrequisitos

API documentada, probada y protegida de la sesión 09.

## Contenidos y límites

JAR frente a WAR, Tomcat 10.1, Jakarta, perfiles, variables de entorno y logs.

No abordar todavía: Kubernetes, microservicios, nube y CI/CD avanzado.

## Secuencia de trabajo

| Bloque | Minutos | Aplicación |
| --- | ---: | --- |
| Desarrollo conceptual | 150 | Explicación del tema, problema, análisis y diseño |
| Práctica | 60 | Demo con implementación, pruebas, depuración y mejora; labs en el tiempo sobrante |
| **Total** | **210** | |

La demo debe completarse dentro del bloque práctico de 60 minutos. Si termina antes, el resto se utiliza para avanzar en labs; no hay un tiempo mínimo reservado ni obligación de completarlos en clase.
## Demostración guiada

Preparar un WAR y verificar arranque y contexto en Tomcat externo.

Ver [demo/](demo/README.md). El proyecto se implementará en una etapa posterior.

## Laboratorio de práctica

Reproducir el despliegue local y diagnosticar un fallo de puerto o configuración.

Ver [labs/](labs/README.md). Avance durante el tiempo sobrante del bloque práctico de 60 minutos. El material inicial y la solución de referencia se distinguirán según las normas; ninguno se genera ahora.

## Criterios de aceptación y evidencia

Un tercero reproduce el despliegue, ejecuta una prueba de humo y explica cómo detenerlo.

Entregar un registro breve del resultado, un fallo diagnosticado y una mejora justificada. No exigir herramientas ni conceptos de sesiones posteriores.

## Referencias del curso

- [Convenciones](../../COURSE-CONVENTIONS.md)
- [Evolución de Commerce API](../../README.md#evolución-de-commerce-api)
- [Arquitectura](../../README.md#arquitectura-progresiva-de-commerce-api)
- [Normas de laboratorios](../../README.md#normas-de-laboratorios)

## Material de apoyo

La carpeta docs/ de esta sesión queda vacía, reservada para material futuro.
