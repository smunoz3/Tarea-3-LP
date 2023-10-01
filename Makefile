# Variables
JAVAC = javac
JAVA = java
SRC_FILES = *.java
BIN_DIR = bin
MAIN_CLASS = MainClass

# Reglas
all: $(BIN_DIR)/$(MAIN_CLASS).class

$(BIN_DIR)/$(MAIN_CLASS).class: $(SRC_FILES)
	$(JAVAC) -d $(BIN_DIR) $^

run: all
	$(JAVA) -cp $(BIN_DIR) $(MAIN_CLASS)

run1: all
	$(JAVA) -cp $(BIN_DIR) $(Zona)

clean:
	rm -rf $(BIN_DIR)/*
