# Sesión 07 — Manejo y gestión de excepciones

Estado: planificación documental. Duración institucional: **210 minutos**.

## Problema empresarial y objetivo

Ofrecer errores consistentes sin revelar detalles internos.

## Prerrequisitos

REST, validación y documentación de sesiones 05 y 06.

## Contenidos y límites

Excepciones de negocio, manejo global, ProblemDetail y trazabilidad básica.

No abordar todavía: Autenticación, autorización y filtros de seguridad.

## Secuencia de trabajo

| Bloque | Minutos | Aplicación |
| --- | ---: | --- |
| Desarrollo conceptual | 150 | Explicación del tema, problema, análisis y diseño |
| Práctica | 60 | Demo con implementación, pruebas, depuración y mejora; labs en el tiempo sobrante |
| **Total** | **210** | |

La demo debe completarse dentro del bloque práctico de 60 minutos. Si termina antes, el resto se utiliza para avanzar en labs; no hay un tiempo mínimo reservado ni obligación de completarlos en clase.
## Demostración guiada

Convertir producto inexistente, conflicto y validación fallida en respuestas uniformes.

Ver [demo/](demo/README.md). El proyecto se implementará en una etapa posterior.

## Laboratorio de práctica

Cubrir errores del catálogo y actualizar su contrato OpenAPI.

Ver [labs/](labs/README.md). Avance durante el tiempo sobrante del bloque práctico de 60 minutos. El material inicial y la solución de referencia se distinguirán según las normas; ninguno se genera ahora.

## Criterios de aceptación y evidencia

Pruebas verifican 400, 404 y 409 según el caso y ausencia de stack traces en las respuestas.

Entregar un registro breve del resultado, un fallo diagnosticado y una mejora justificada. No exigir herramientas ni conceptos de sesiones posteriores.

## Referencias del curso

- [Convenciones](../../COURSE-CONVENTIONS.md)
- [Evolución de Commerce API](../../README.md#evolución-de-commerce-api)
- [Arquitectura](../../README.md#arquitectura-progresiva-de-commerce-api)
- [Normas de laboratorios](../../README.md#normas-de-laboratorios)

## Material de apoyo

La carpeta docs/ de esta sesión queda vacía, reservada para material futuro.
