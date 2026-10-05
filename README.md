# Calculadora en Kotlin

Calculadora de consola desarrollada en Kotlin con IntelliJ IDEA. Muestra un menú, pide los datos por teclado y valida que la entrada sea correcta.

## Funcionalidades

- Suma
- Resta
- Multiplicación
- División (con control de división entre 0)
- [Otras operaciones: potencia, módulo, raíz...]
- Menú interactivo que se repite hasta que el usuario elige salir
- Control de errores si se introduce una letra en vez de un número

## Requisitos

- JDK 17 o superior
- IntelliJ IDEA (o cualquier IDE compatible con Kotlin)
- [Gradle, si el proyecto lo usa]

## Cómo ejecutarla

1. Clona el repositorio:
```bash
   git clone https://github.com/RaulTalbiDaza/Calculadora-Kotlin.git
```
2. Abre la carpeta del proyecto en IntelliJ IDEA.
3. Espera a que termine de cargar el proyecto.
4. Ejecuta el `main` (archivo `[Main.kt]`) con el botón de Run o `Shift + F10`.

## Ejemplo de uso

```
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
0. Salir
Selecciona una opción: 1
Primer número: 5
Segundo número: 3
Resultado: 8.0
```

## Estructura del proyecto

```
src/
└── [main/kotlin/]
    ├── Main.kt          # Punto de entrada y menú
    └── [Calculadora.kt] # Clase con las operaciones
```

## Autor

[Tu nombre] - [Instituto / Ciclo DAM]
