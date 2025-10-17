# 🧠 El Arte de Programar en la Era de la Inteligencia Artificial  
**De Dijkstra a Clean Code: la vigencia del pensamiento humilde**

> “El arte de programar consiste en organizar el pensamiento para que otro ser humano pueda entender lo que queremos que la máquina haga.”  
> — Donald Knuth

---

## 🎯 Propósito del repositorio

Este repositorio acompaña una charla y conjunto de ejemplos prácticos sobre **la importancia del pensamiento disciplinado en la programación moderna**, inspirada en los aportes de:

- **Edsger W. Dijkstra** – *The Humble Programmer (1972)*  
- **Donald Knuth** – *The Art of Computer Programming*  
- **Robert C. Martin (Uncle Bob)** – *Clean Code, SOLID Principles*  
- **Martin Fowler** – *Refactoring, Patterns of Enterprise Application Architecture*

La charla busca mostrar cómo estos principios **siguen siendo la base de la buena arquitectura**, incluso en tiempos de Inteligencia Artificial generativa.

---

## 🧩 Contenido

### 1. El Humilde Programador
Dijkstra advertía en 1972 que el cerebro humano es limitado, y que el programador debía ser **humilde** frente a la complejidad del software.  
Esa humildad hoy se traduce en prácticas que promueven **claridad, simplicidad y razonamiento** sobre el código.

---

### 2. Clean Code – Escribir para humanos
> “El código se lee mucho más de lo que se escribe.” — Robert C. Martin

Un código limpio:
- Es **legible** y **coherente**.  
- Usa **nombres descriptivos**.  
- Se organiza en funciones pequeñas con una sola responsabilidad.  

Ejemplo:
```java
// Código limpio
public double calcularAreaDelCirculo(double radio) {
    return Math.PI * radio * radio;
}
