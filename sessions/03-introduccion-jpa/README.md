# Sesión 03 — Introducción a JPA

Estado: planificación documental. Duración institucional: **210 minutos**.

## Problema empresarial y objetivo

Persistir y consultar productos con identidad propia.

## Prerrequisitos

Beans, inyección y pruebas unitarias de la sesión 02.

## Contenidos y límites

Entidad Product, identificadores, repositorio Spring Data JPA y H2.

No abordar todavía: Relaciones complejas, REST y seguridad.

## Secuencia de trabajo

| Bloque | Minutos | Aplicación |
| --- | ---: | --- |
| Desarrollo conceptual | 150 | Explicación del tema, problema, análisis y diseño |
| Práctica | 60 | Demo con implementación, pruebas, depuración y mejora; labs en el tiempo sobrante |
| **Total** | **210** | |

La demo debe completarse dentro del bloque práctico de 60 minutos. Si termina antes, el resto se utiliza para avanzar en labs; no hay un tiempo mínimo reservado ni obligación de completarlos en clase.
## Demostración guiada

Guardar y recuperar productos desde un ejecutor de consola.

Ver [demo/](demo/README.md). El proyecto se implementará en una etapa posterior.

## Laboratorio de práctica

Construir consultas simples del catálogo y comprobar su persistencia en una prueba.

Ver [labs/](labs/README.md). Avance durante el tiempo sobrante del bloque práctico de 60 minutos. El material inicial y la solución de referencia se distinguirán según las normas; ninguno se genera ahora.

## Criterios de aceptación y evidencia

Guardar y recuperar un producto conserva sus atributos; un identificador ausente no produce un resultado.

Entregar un registro breve del resultado, un fallo diagnosticado y una mejora justificada. No exigir herramientas ni conceptos de sesiones posteriores.

## Referencias del curso

- [Convenciones](../../COURSE-CONVENTIONS.md)
- [Evolución de Commerce API](../../README.md#evolución-de-commerce-api)
- [Arquitectura](../../README.md#arquitectura-progresiva-de-commerce-api)
- [Normas de laboratorios](../../README.md#normas-de-laboratorios)

## Material de apoyo

La carpeta docs/ de esta sesión queda vacía, reservada para material futuro.
