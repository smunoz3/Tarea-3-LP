# Definición de variables
JAVAC = javac
JAVA = java
SRC_DIR = src
BIN_DIR = bin

# Lista de archivos fuente
SOURCES = $(wildcard $(SRC_DIR)/*.java)
CLASSES = $(patsubst $(SRC_DIR)/%.java,$(BIN_DIR)/%.class,$(SOURCES))

# Regla para compilar archivos .java en archivos .class
$(BIN_DIR)/%.class: $(SRC_DIR)/%.java
    $(JAVAC) -d $(BIN_DIR) $<

# Reglas para ejecutar programas individuales
run1: $(BIN_DIR)/Archivo1.class
    $(JAVA) -cp $(BIN_DIR) Archivo1

run2: $(BIN_DIR)/Archivo2.class
    $(JAVA) -cp $(BIN_DIR) Archivo2

run3: $(BIN_DIR)/Archivo3.class
    $(JAVA) -cp $(BIN_DIR) Archivo3

run4: $(BIN_DIR)/Archivo4.class
    $(JAVA) -cp $(BIN_DIR) Archivo4

run5: $(BIN_DIR)/Archivo5.class
    $(JAVA) -cp $(BIN_DIR) Archivo5

# Regla para limpiar los archivos compilados
clean:
    rm -rf $(BIN_DIR)
