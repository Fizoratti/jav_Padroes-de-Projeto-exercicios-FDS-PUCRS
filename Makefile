#!/bin/sh
SRC_PATH="./src/"
OUT_PATH="./out/"

GREEN=\033[1;32m
GREY=\033[1;30m
NC=\033[0m # No Color

all: run

compile:

	clear

	@echo "Project directory: "`pwd`
	@echo "";
	
	@# Compile --------------------------------

		@echo "${GREY}> Compiling...${NC}"
		@echo "All source code"
		@echo "From: [$(SRC_PATH)] to: [$(OUT_PATH)]"

			javac $(SRC_PATH)*.java -d $(OUT_PATH);
		
			wc -c $(OUT_PATH)*.class

		@echo "${GREEN}DONE Compiled!${NC}"

	@# ----------------------------------------
	@echo "";

compact: 
	@# Compact

		@echo "${GREY}> Compacting...${NC}"
		jar -cvf $(OUT_PATH)App.jar $(OUT_PATH)*.class
		@echo "${GREEN}DONE Compactated!${NC}"

	@# ----------------------------------------
	@echo "";

test:
	@# Test

		jar tf $(OUT_PATH)App.jar

	@# ----------------------------------------
	@echo "";

run: clean compile compact
	@# Run

		@echo "${GREY}> Starting...${NC}"
		@echo "";
			
			@java -cp $(OUT_PATH) App

	@# ----------------------------------------
	@echo "";

clean:
	@# Remove files

		@echo "${GREY}> Cleaning...${NC}"
		@echo "All binary code from [$(OUT_PATH)]"
		@rm -f $(OUT_PATH)*.class $(OUT_PATH)*.jar 
		@echo "${GREEN}DONE Clean!${NC}"

	@# ----------------------------------------
	@echo "";
