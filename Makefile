	bash
	#!/bin/bash

	# Compilar
	javac 11 -d out/ -cp Pikinim.java Cyan.java Magenta.java Amarillo.java Zona.java Pieza.java Enemigo.java Pildora.java Muralla.java Juego.java ILevantar.java

	# Ejecutar
	java -cp out/ Pikinim Cyan Magenta Amarillo Zona Pieza Enemigo Pildora Muralla Juego ILevantar

	# Limpiar archivos compilados
	rm -rf out/
