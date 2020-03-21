Algoritmo Modulo_03_08
	Definir sueldo, ganaMas, ganaMenos,i Como Real; 
	sueldo = 0; 
	ganaMas = 0; 
	ganaMenos = 0; 
	i=1; 
	Repetir
		i=i+1;
		Escribir "Ingresar sueldo empleado:"; 
		Leer sueldo; 
		Si sueldo>1999.99 Entonces
			ganaMas=ganaMas+1;
		SiNo
			ganaMenos=ganaMenos+1; 
		FinSi
	Hasta Que sueldo=0|i=20; 
	Escribir "Cuantos ganan menos de 2000:", ganaMenos; 
	Escribir "Cuantos ganan mas de 2000:",ganaMas; 
FinAlgoritmo
