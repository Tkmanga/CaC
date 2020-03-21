Algoritmo Modulo_03_03
	Definir num, nota Como Real; 
	Definir nombre Como Caracter; 
	Repetir
		Escribir "Ingresar nombre del alumno:";
		Leer nombre; 
		Escribir "Ingresar Nota del alumno:"; 
		Leer nota; 
		Si nota>8 Entonces
			Escribir "El alumno ", nombre," tiene mas de 8"; 
		FinSi
	Hasta Que nota=0; 
FinAlgoritmo
