# Sesión 09 — Políticas de acceso y CORS

Estado: planificación documental. Duración institucional: **210 minutos**.

## Problema empresarial y objetivo

Aplicar permisos por rol y permitir únicamente orígenes explícitos.

## Prerrequisitos

Autenticación JWT de la sesión 08.

## Contenidos y límites

Autorización, roles CUSTOMER/ADMIN, CORS y solicitudes preflight.

No abordar todavía: Despliegue externo y administración avanzada de identidades.

## Secuencia de trabajo

| Bloque | Minutos | Aplicación |
| --- | ---: | --- |
| Desarrollo conceptual | 150 | Explicación del tema, problema, análisis y diseño |
| Práctica | 60 | Demo con implementación, pruebas, depuración y mejora; labs en el tiempo sobrante |
| **Total** | **210** | |

La demo debe completarse dentro del bloque práctico de 60 minutos. Si termina antes, el resto se utiliza para avanzar en labs; no hay un tiempo mínimo reservado ni obligación de completarlos en clase.
## Demostración guiada

Restringir escritura del catálogo a ADMIN y configurar un origen local permitido.

Ver [demo/](demo/README.md). El proyecto se implementará en una etapa posterior.

## Laboratorio de práctica

Probar la matriz de acceso y solicitudes desde orígenes permitidos y rechazados.

Ver [labs/](labs/README.md). Avance durante el tiempo sobrante del bloque práctico de 60 minutos. El material inicial y la solución de referencia se distinguirán según las normas; ninguno se genera ahora.

## Criterios de aceptación y evidencia

Se distinguen 401 y 403; las pruebas cubren roles y preflight sin confundir CORS con autenticación.

Entregar un registro breve del resultado, un fallo diagnosticado y una mejora justificada. No exigir herramientas ni conceptos de sesiones posteriores.

## Referencias del curso

- [Convenciones](../../COURSE-CONVENTIONS.md)
- [Evolución de Commerce API](../../README.md#evolución-de-commerce-api)
- [Arquitectura](../../README.md#arquitectura-progresiva-de-commerce-api)
- [Normas de laboratorios](../../README.md#normas-de-laboratorios)

## Material de apoyo

La carpeta docs/ de esta sesión queda vacía, reservada para material futuro.
