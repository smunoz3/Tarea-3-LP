bash
#!/bin/bash

# Compilar
javac 11 -d out/ -cp . TuClase.java

# Ejecutar
java -cp out/ TuClase

# Limpiar archivos compilados
rm -rf out/
