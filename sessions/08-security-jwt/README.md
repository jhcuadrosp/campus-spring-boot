# Sesión 08 — Introducción a Spring Security y JWT

Estado: planificación documental. Duración institucional: **210 minutos**.

## Problema empresarial y objetivo

Autenticar peticiones y validar tokens JWT.

## Prerrequisitos

Contrato REST y manejo de errores de sesiones anteriores.

## Contenidos y límites

Cadena de seguridad, autenticación, contraseñas con hash y validación de firma y expiración JWT.

No abordar todavía: Matrices de roles y CORS de sesión 09; sin OAuth completo, refresh tokens ni criptografía artesanal.

## Secuencia de trabajo

| Bloque | Minutos | Aplicación |
| --- | ---: | --- |
| Desarrollo conceptual | 150 | Explicación del tema, problema, análisis y diseño |
| Práctica | 60 | Demo con implementación, pruebas, depuración y mejora; labs en el tiempo sobrante |
| **Total** | **210** | |

La demo debe completarse dentro del bloque práctico de 60 minutos. Si termina antes, el resto se utiliza para avanzar en labs; no hay un tiempo mínimo reservado ni obligación de completarlos en clase.
## Demostración guiada

Proteger una operación con tokens de prueba emitidos por un mecanismo didáctico documentado.

Ver [demo/](demo/README.md). El proyecto se implementará en una etapa posterior.

## Laboratorio de práctica

Comprobar accesos con token válido, ausente, expirado y firma inválida.

Ver [labs/](labs/README.md). Avance durante el tiempo sobrante del bloque práctico de 60 minutos. El material inicial y la solución de referencia se distinguirán según las normas; ninguno se genera ahora.

## Criterios de aceptación y evidencia

Un token inválido o ausente recibe 401; nunca se registran contraseñas ni tokens completos.

Entregar un registro breve del resultado, un fallo diagnosticado y una mejora justificada. No exigir herramientas ni conceptos de sesiones posteriores.

## Referencias del curso

- [Convenciones](../../COURSE-CONVENTIONS.md)
- [Evolución de Commerce API](../../README.md#evolución-de-commerce-api)
- [Arquitectura](../../README.md#arquitectura-progresiva-de-commerce-api)
- [Normas de laboratorios](../../README.md#normas-de-laboratorios)

## Material de apoyo

La carpeta docs/ de esta sesión queda vacía, reservada para material futuro.
