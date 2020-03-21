Algoritmo Modulo_03_02
	Definir num, i, nota Como Real; 
	Definir nombre Como Caracter; 
	i=0;
	Repetir
		i=i+1;
		Escribir "Ingresar nombre del alumno:";
		Leer nombre; 
		Escribir "Ingresar Nota del alumno:"; 
		Leer nota; 
		Si nota>8 Entonces
			Escribir "El alumno ", nombre," tiene mas de 8"; 
		FinSi
		
	Hasta Que i>=15|nota=0; 
FinAlgoritmo
