# Sesión 05 — Diseño de API REST en Spring Boot

Estado: planificación documental. Duración institucional: **210 minutos**.

## Problema empresarial y objetivo

Exponer el catálogo mediante un contrato HTTP comprensible.

## Prerrequisitos

Servicio y persistencia de la sesión 04; nociones de cliente y servidor.

## Contenidos y límites

Spring MVC, recursos, verbos, estados HTTP, DTO y validación de entradas.

No abordar todavía: Manejo global de errores, OpenAPI y seguridad. Usar respuestas HTTP básicas hasta la sesión 07.

## Secuencia de trabajo

| Bloque | Minutos | Aplicación |
| --- | ---: | --- |
| Desarrollo conceptual | 150 | Explicación del tema, problema, análisis y diseño |
| Práctica | 60 | Demo con implementación, pruebas, depuración y mejora; labs en el tiempo sobrante |
| **Total** | **210** | |

La demo debe completarse dentro del bloque práctico de 60 minutos. Si termina antes, el resto se utiliza para avanzar en labs; no hay un tiempo mínimo reservado ni obligación de completarlos en clase.
## Demostración guiada

Consultar y crear productos con separación controller/service/repository.

Ver [demo/](demo/README.md). El proyecto se implementará en una etapa posterior.

## Laboratorio de práctica

Completar actualización y eliminación de productos con pruebas HTTP.

Ver [labs/](labs/README.md). Avance durante el tiempo sobrante del bloque práctico de 60 minutos. El material inicial y la solución de referencia se distinguirán según las normas; ninguno se genera ahora.

## Criterios de aceptación y evidencia

Los casos válidos respetan el contrato y las entradas inválidas se rechazan; no se exponen entidades directamente.

Entregar un registro breve del resultado, un fallo diagnosticado y una mejora justificada. No exigir herramientas ni conceptos de sesiones posteriores.

## Referencias del curso

- [Convenciones](../../COURSE-CONVENTIONS.md)
- [Evolución de Commerce API](../../README.md#evolución-de-commerce-api)
- [Arquitectura](../../README.md#arquitectura-progresiva-de-commerce-api)
- [Normas de laboratorios](../../README.md#normas-de-laboratorios)

## Material de apoyo

La carpeta docs/ de esta sesión queda vacía, reservada para material futuro.
