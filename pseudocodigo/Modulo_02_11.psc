Algoritmo Modulo_02_11
	Definir valorHora, cantHoras, sueldo Como Real;
	Escribir "Ingrese el valor de las horas: "; 
	Leer valorHora; 
	Escribir "Ingrese la cantidad de horas que trabajo: "; 
	Leer cantHoras; 
	sueldo=valorHora*cantHoras; 
	Si cantHoras>199.99 Entonces
		sueldo=sueldo+50; 
	SiNo 
		Si cantHoras>99.99 Entonces
			sueldo=sueldo+100; 
		FinSi
	FinSi
	Escribir "El sueldo es: ", sueldo;
FinAlgoritmo
