# Sesión 04 — Gestión de bases de datos mediante JPA

Estado: planificación documental. Duración institucional: **210 minutos**.

## Problema empresarial y objetivo

Relacionar productos y categorías y delimitar operaciones transaccionales.

## Prerrequisitos

Entidades y repositorios de la sesión 03.

## Contenidos y límites

Category, relación muchos a uno, consultas, transacciones y configuración de base de datos.

No abordar todavía: REST, autenticación y optimizaciones avanzadas; evitar grafos bidireccionales innecesarios.

## Secuencia de trabajo

| Bloque | Minutos | Aplicación |
| --- | ---: | --- |
| Desarrollo conceptual | 150 | Explicación del tema, problema, análisis y diseño |
| Práctica | 60 | Demo con implementación, pruebas, depuración y mejora; labs en el tiempo sobrante |
| **Total** | **210** | |

La demo debe completarse dentro del bloque práctico de 60 minutos. Si termina antes, el resto se utiliza para avanzar en labs; no hay un tiempo mínimo reservado ni obligación de completarlos en clase.
## Demostración guiada

Clasificar productos y ejecutar una operación atómica del catálogo.

Ver [demo/](demo/README.md). El proyecto se implementará en una etapa posterior.

## Laboratorio de práctica

Consultar por categoría y verificar rollback frente a un fallo controlado.

Ver [labs/](labs/README.md). Avance durante el tiempo sobrante del bloque práctico de 60 minutos. El material inicial y la solución de referencia se distinguirán según las normas; ninguno se genera ahora.

## Criterios de aceptación y evidencia

Las consultas filtran correctamente y una operación fallida no deja cambios parciales.

Entregar un registro breve del resultado, un fallo diagnosticado y una mejora justificada. No exigir herramientas ni conceptos de sesiones posteriores.

## Referencias del curso

- [Convenciones](../../COURSE-CONVENTIONS.md)
- [Evolución de Commerce API](../../README.md#evolución-de-commerce-api)
- [Arquitectura](../../README.md#arquitectura-progresiva-de-commerce-api)
- [Normas de laboratorios](../../README.md#normas-de-laboratorios)

## Material de apoyo

La carpeta docs/ de esta sesión queda vacía, reservada para material futuro.
