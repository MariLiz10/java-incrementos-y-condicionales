# java-incrementos-y-condicionales
Trabajo de POO
# Taller 1: Operaadores de Incremento e Instrucciones condicionales en Java
## 1. Mi informacion
* **Nombre Completo:** Sergio Alexander Murillo Puentes
* **Programa Académico:** Tecnologiaa en Desarrollo de Software
* **Fecha de Entrega** 26 de Agosto de 2026
---
## 2. Objetivo de la Actividad

Aplicar los conceptos de preincremento (`++variable`), posincremento (`variable++`) y las diferentes estructuras condicionales de Java mediante ejercicios prácticos.

## 3. Parte 1: Investigación de Preincremento y Posincremento

### Contexto de la Investigación
Un desarrollador junior afirma que los operadores `++variable` y `variable++` producen exactamente el mismo resultado en cualquier situación dentro de Java. Como estudiante de programación, el objetivo de esta sección es verificar teórica y prácticamente si dicha afirmación es verdadera o falsa mediante pruebas de código y análisis de flujo de memoria.

---

### Conceptos

#### 1. ¿Qué es un operador de incremento?
Un operador de incremento en Java (`++`) es un **operador unario**, lo que significa que opera sobre un único operando o variable numérica (como `int`, `long`, `byte`, `short`, `float` o `double`). Su función principal es sumar de manera implícita una unidad (`+1`) al valor almacenado en dicha variable y actualizar directamente su contenido en la memoria RAM.

A diferencia de una suma convencional (`a + 1`), el operador de incremento genera un efecto secundario (*side effect*) permanente sobre la variable original. Equivale sintácticamente a escribir `variable = variable + 1` o `variable += 1`, pero ofrece una notación más compacta y eficiente para el compilador.

#### 2. ¿Qué diferencia existe entre preincremento y posincremento?
Aunque ambos operadores terminan sumando 1 a la variable, la diferencia fundamental reside en el **orden de prioridad y temporización de la operación** dentro de la pila de ejecución (*evaluation stack*) de Java:

* **Preincremento (`++variable`):**
  En esta variante, el operador antecede a la variable. Durante el ciclo de instrucción, Java realiza primero la modificación de la variable en memoria (incremento de +1) y, posteriormente, devuelve y utiliza el valor ya actualizado dentro de la expresión en la que se encuentra inscrita.

* **Posincremento (`variable++`):**
  En esta variante, el operador se coloca después de la variable. Durante la evaluación de la instrucción, Java crea temporalmente una copia del valor actual de la variable para ser utilizado dentro de la expresión actual y, una vez evaluada la línea o el punto de secuencia (*sequence point*), ejecuta el incremento de +1 en la variable original.

#### 3. ¿En qué situaciones producen resultados distintos?
Los operadores de preincremento y posincremento arrojan resultados considerablemente diferentes en los siguientes escenarios:

1. **En asignaciones compuestas:** Cuando el resultado del incremento se almacena inmediatamente en otra variable (por ejemplo, `b = ++a` frente a `b = a++`).
2. **En expresiones aritméticas complejas:** Cuando la variable modificada forma parte de una fórmula matemática (por ejemplo, `(a++) * 5` frente a `(++a) * 5`).
3. **Como argumentos de métodos o funciones:** Al pasar la variable como parámetro a un método como `System.out.println(a++)` frente a `System.out.println(++a)`. En el primer caso se imprime el valor antiguo y en el segundo el valor ya incrementado.
4. **En evaluadores condicionales:** Dentro de estructuras `if` o ciclos `while`, donde la condición depende del estado inmediato de la variable (por ejemplo, `if (x++ > 5)` evalúa `x` antes del incremento, mientras que `if (++x > 5)` evalúa el valor ya modificado).

*Nota: Únicamente producen un resultado visualmente idéntico cuando se ejecutan como instrucciones independientes en una sola línea (por ejemplo, `i++;` frente a `++i;`) o en la cláusula de actualización de un ciclo `for`.*
### 1. Evidencia de Ejecución

![Evidencia de ejecución](Evidencias/captura1.png)
### Tabla Comparativa de Resultados (`Incrementos.java`)

| Variable | Valor Inicial | Operación | Valor Impreso | Explicación Técnica |
| :--- | :--- | :--- | :--- | :--- |
| `a` | 5 | `b = ++a` | 6 | **Preincremento**: Se suma 1 a `a` en memoria antes de evaluar o asignar su valor. |
| `b` | - | `b = ++a` | 6 | Recibe el valor de `a` ya modificado (6). |
| `c` | 5 | `d = c++` | 6 | **Posincremento**: Incrementa a 6 en memoria después de entregar su valor original. |
| `d` | - | `d = c++` | 5 | Recibe el valor previo de `c` (5) antes de que se ejecute la suma. |

---
### 2. Ejemplos Adicionales de Pre/Posincremento

2.1 EN UNA ASIGNACIÓN

int x = 10;
int y = ++x; // Preincremento: 'x' pasa a 11 primero; 'y' recibe 11.

int m = 10;
int n = m++; // Posincremento: 'n' recibe el 10 actual; luego 'm' pasa a 11.


 2.2 EN UNA OPERACIÓN MATEMÁTICA

int p = 4;
int resultado1 = (++p) * 2; // Preincremento: sube a 5 antes de multiplicar (5 * 2 = 10)

int q = 4;
int resultado2 = (q++) * 2; // Posincremento: multiplica con 4 (4 * 2 = 8), luego 'q' pasa a 5



 2.3 DENTRO DE UN CICLO DE CONTROL (FOR)

for (int i = 0; i < 3; i++) {
    System.out.println("Vuelta: " + i); // El incremento corre aislado al final de cada vuelta
}

**¿Por qué en el ciclo `for` da lo mismo `i++` que `++i`?**

Para entenderlo, miremos el orden en el que Java ejecuta un ciclo `for` en cada vuelta:

1. **Revisa la condición:** ¿`i < 3`?
2. **Ejecuta el código interno:** Imprime el mensaje en pantalla.
3. **Ejecuta el incremento:** Corre la parte de `i++` o `++i`.

La clave está en el **paso 3**. El incremento en el `for` se ejecuta como una **instrucción completamente sola y aislada** al final de la vuelta. 

Ahí se está guardando el valor en otra variable (`x = i++`), ni multiplicando (`i++ * 2`), ni imprimiéndolo directo en pantalla (`println(i++)`). Como nadie está "atrapando" o usando el valor justo en el milisegundo en que se hace la suma, la diferencia entre *"sumar antes"* o *"sumar después"* desaparece.
### Evidencias de los Ejemplos Adicionales

![Evidencia Asignación](Evidencias/captura2.png)

![Evidencia Operación Matemática](Evidencias/captura3.png)

![Evidencia Ciclo For](Evidencias/captura4.png)
### 3. Conclusiones Sustentadas

* **Verificación de la premisa:** La afirmación del desarrollador junior es **falsa**. Aunque ambos operadores le suman 1 a la variable en la memoria, no producen el mismo resultado cuando se usan dentro de asignaciones u operaciones compuestas.
* **Evidencia en la ejecución:** En las pruebas realizadas con valor inicial de 5, la salida de la consola confirmó la diferencia de tiempos:
  * `b = 6` con `b = ++a`: El preincremento sumó 1 a la variable **antes** de guardar el valor en `b`.
  * `d = 5` con `d = c++`: El posincremento entregó el valor original a `d` y **después** realizó la suma en memoria.
* **Impacto en el desarrollo:** Comprender esta diferencia es clave para evitar fallos lógicos en el código. Usar el operador equivocado no produce un error de sintaxis en NetBeans, pero hace que los cálculos o los condicionales procesen datos incorrectos, dandonos errores (bugs) dificiles de rastrear o capaces de generarnos problemas al llevarlos a un proyecto mas grande.
---

## Parte 2. Programación con IF

### Ejercicio 1. Sistema de Descuentos para un Supermercado
![Evidenca Del Primer Ejercicio](Evidencias/captura5.png)

### Ejercicio 2. Acceso a un Conjunto
![Evidenca Del Segundo Ejercicio](Evidencias/captura6.png)

### Ejercicio 3. Plataforma de Transporte
![Evidenca Del Tercer Ejercicio](Evidencias/captura7.png)

### Ejercicio 4. Credito Bancario
![Evidenca Del Cuarto Ejercicio](Evidencias/captura8.png)
### Ejercicio 5. Siatema de viajes de una Aerolíena
![Evidenca Del  Quinto Ejercicio](Evidencias/captura9.png)

**Nota para el docente:** Decidí no incluir capturas de pantalla de la terminal en cada ejercicio para mantener el documento limpio y ordenado ya que los programas tienen muchas combinaciones lógicas, poner una captura por cada caso haría el taller muy extenso, probe todo el código en NetBeans y funciona correctamente, ahora si explico la lógica de cada punto.

### Parte 3. Explicación de los resultados

**Ejercicio 1: Descuentos en el Supermercado**
Aquí usé la clase Scanner para pedir el valor de la compra en formato double. La lógica se basa en una estructura if else if que evalúa el monto para asignar un porcentaje de descuento. Si la compra es menor a 100000 no hay descuento, y los porcentajes suben progresivamente hasta el 20% para compras mayores a 500000. Al final el programa hace la multiplicación y muestra el total a pagar junto con el descuento aplicado.

**Ejercicio 2: Acceso a Conjunto Residencial**
Para este código armé un sistema de filtros con if anidados. Uso next() del Scanner para leer las respuestas y equalsIgnoreCase() para que no importe si el usuario escribe en mayúsculas o minúsculas. El programa revisa primero si la persona tiene tarjeta. Solo si la tiene, pasa a preguntar si está activa y luego si tiene deudas, mostrando un mensaje específico de acceso denegado o permitido según el filtro en el que se detenga el usuario.

**Ejercicio 3: Asignación de Conductor**
En este caso guardé las tres condiciones del problema en variables booleanas independientes llamadas c1, c2 y c3 para mantener el código más limpio. Para asignar un conductor premium el condicional exige que las tres variables sean verdaderas usando el operador &&. Para el conductor estándar usé paréntesis y el operador || para agrupar las posibles combinaciones donde se cumplen al menos dos requisitos. Lo que no encaja ahí cae en el else final y no se le asigna conductor.

**Ejercicio 4: Crédito Bancario**
La clave acá fue usar los tipos de datos correctos con el Scanner pidiendo los ingresos como double y los años o el puntaje como enteros. El flujo evalúa primero al cliente perfecto que cumple todo al mismo tiempo. Luego con un else if y operadores || se revisa si el cliente cumple dos de tres condiciones para darle un crédito condicionado. Si no logra cumplir ni siquiera dos, el flujo termina rechazando la solicitud por completo.

**Ejercicio 5: Sistema de Aerolínea**
Para evitar conflictos con los rangos de viajes, estructuré las categorías de mayor a menor jerarquía. Primero se evalúa la categoría Oro para los de más de 50 vuelos e incluye un if interno para dar el acceso VIP si superan los 70. La categoría Plata se maneja con un else if para el rango entre 20 y 50 vuelos. Para la categoría Básica definí una variable booleana que se vuelve verdadera si la persona tiene 20 vuelos o menos, o si no tiene la membresía activa, asegurando que nadie se quede sin categoría.

### 4. Conclusiones

**1. ¿Cuál es la principal diferencia entre ++variable y variable++?**
La diferencia está en cuándo se hace el aumento. Con el preincremento (++variable) primero se le suma 1 a la variable y luego ese nuevo valor se usa en la línea de código actual. Con el posincremento (variable++) el programa primero lee y usa el valor original y justo después de terminar esa instrucción le suma el 1.

**2. ¿Qué estructura if considera más adecuada para situaciones complejas y por qué?**
La mejor opción es combinar if else if con variables booleanas previas y condicionales anidados. Hacerlo así permite llevar un orden lógico desde la condición más estricta hasta la más general, el código queda mucho más fácil de leer y permite usar un else al final para atrapar los casos por descarte.

**3. ¿Qué dificultades encontró durante el desarrollo?**
Lo más complicado fue entender la jerarquía de los operadores lógicos y saber dónde poner los paréntesis para agrupar correctamente los && y los ||. También hubo detalles técnicos con el Scanner al momento de definir los tipos de variables correctos para no generar errores en consola, y fue un reto armar la lógica de los rangos para que los condicionales no chocaran entre sí.

**4. ¿Qué aprendizajes obtuvo durante la actividad?**
Comprendí que guardar las condiciones largas dentro de variables booleanas antes de armar el if ayuda mucho a simplificar la lectura del código. También aprendí que el orden en el que se escriben las estructuras importa bastante para que los filtros funcionen bien y que el bloque else sirve como un respaldo seguro para finalizar el flujo de un programa.
