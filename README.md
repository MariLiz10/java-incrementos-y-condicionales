# java-incrementos-y-condicionales
Trabajo de POO
# Taller 1: Operaadores de Incremento e Instrucciones condicionales en Java
## 1. Mi informacion
* **Nombre Completo:** Lizeth Mariana Cotrino Ossa
* **Programa Académico:** Tecnologiaa en Desarrollo de Software
* **Fecha de Entrega** 27 de Agosto de 2026
---
## 2. Objetivo de la Actividad

Aplicar los conceptos de preincremento (`++variable`), posincremento (`variable++`) y las diferentes estructuras condicionales de Java mediante ejercicios prácticos.

## 3.Conceptos breves

#### 1. ¿Qué es un operador de incremento?
Un operador de incremento es aquel que permite aumentar el valor de una variable en 1. En Java se representa con ++. Por ejemplo, si tenemos int numero = 5; y escribimos numero++;, el valor de numero aumentará de 5 a 6.

#### 2. ¿Qué diferencia existe entre preincremento y posincremento?
La diferencia entre preincremento y posincremento está en el momento en que se realiza el aumento. El preincremento (++numero) aumenta primero el valor de la variable y después utiliza ese nuevo valor. Por ejemplo, si numero = 5 y escribimos int resultado = ++numero;, primero numero pasa a 6 y luego resultado recibe el valor 6.

En cambio, el posincremento (numero++) utiliza primero el valor actual de la variable y después lo aumenta. Por ejemplo, si numero = 5 y escribimos int resultado = numero++;, resultado recibe primero el valor 5 y después numero aumenta a 6.

#### 3. ¿En qué situaciones producen resultados distintos?
El preincremento y el posincremento producen resultados distintos cuando se utilizan dentro de una expresión o asignación, porque el momento del incremento cambia el valor que se utiliza. Por ejemplo, con ++x, si x vale 10, se utiliza 11; mientras que con x++, primero se utiliza 10 y después x pasa a valer 11. Por eso, la forma fácil de recordarlo es: preincremento = primero aumenta, posincremento = primero utiliza el valor.

#### 4. Estructuras condicionales
Las estructuras condicionales en Java permiten que un programa tome decisiones dependiendo de si una condición se cumple o no.

La estructura if se utiliza para ejecutar una instrucción cuando una condición es verdadera. Por ejemplo, si una persona tiene más de 18 años, se puede mostrar un mensaje indicando que es mayor de edad.

La estructura if - else permite elegir entre dos opciones: si la condición se cumple se ejecuta el if, y si no se cumple se ejecuta el else. Por ejemplo, si una nota es mayor o igual a 3, se muestra “Aprobado”; de lo contrario, “Reprobado”.

La estructura if - else if - else permite evaluar varias condiciones. Por ejemplo, se puede clasificar una nota como “Excelente”, “Bueno” o “Insuficiente” dependiendo de su valor.

Los if anidados son un if dentro de otro if. Se utilizan cuando una decisión depende de que primero se cumpla otra condición. Por ejemplo, primero comprobar si una persona es mayor de edad y después verificar si tiene una identificación.

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
![Evidenca Del Primer Ejercicio](<img width="808" height="500" alt="EvidenciaEjercicio1" src="https://github.com/user-attachments/assets/0e01e041-d305-4835-8b8a-07a74a720b62" />
)

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
