# Sesión 02 — Manejo de dependencias y Java Beans

Estado: planificación documental. Duración institucional: **210 minutos**.

## Problema empresarial y objetivo

Separar una regla de precios de su consumidor mediante inyección por constructor.

## Prerrequisitos

Arranque y configuración de la sesión 01.

## Contenidos y límites

Maven, dependencias directas y transitivas, IoC, beans de Spring y ciclo de vida básico.

No abordar todavía: Persistencia, REST y seguridad. Distinguir JavaBean convencional de bean administrado por Spring.

## Secuencia de trabajo

| Bloque | Minutos | Aplicación |
| --- | ---: | --- |
| Desarrollo conceptual | 150 | Explicación del tema, problema, análisis y diseño |
| Práctica | 60 | Demo con implementación, pruebas, depuración y mejora; labs en el tiempo sobrante |
| **Total** | **210** | |

La demo debe completarse dentro del bloque práctico de 60 minutos. Si termina antes, el resto se utiliza para avanzar en labs; no hay un tiempo mínimo reservado ni obligación de completarlos en clase.
## Demostración guiada

Calcular el total de un catálogo en memoria mediante un servicio inyectado.

Ver [demo/](demo/README.md). El proyecto se implementará en una etapa posterior.

## Laboratorio de práctica

Cambiar una política de descuentos y probarla con JUnit 5.

Ver [labs/](labs/README.md). Avance durante el tiempo sobrante del bloque práctico de 60 minutos. El material inicial y la solución de referencia se distinguirán según las normas; ninguno se genera ahora.

## Criterios de aceptación y evidencia

Explica qué instancia administra Spring y verifica el cálculo sin levantar el contexto.

Entregar un registro breve del resultado, un fallo diagnosticado y una mejora justificada. No exigir herramientas ni conceptos de sesiones posteriores.

## Referencias del curso

- [Convenciones](../../COURSE-CONVENTIONS.md)
- [Evolución de Commerce API](../../README.md#evolución-de-commerce-api)
- [Arquitectura](../../README.md#arquitectura-progresiva-de-commerce-api)
- [Normas de laboratorios](../../README.md#normas-de-laboratorios)

## Material de apoyo

La carpeta docs/ de esta sesión queda vacía, reservada para material futuro.
