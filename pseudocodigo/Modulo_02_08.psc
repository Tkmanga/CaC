Algoritmo Modulo_02_08 
	
	Definir a,b,c,d Como Real;
	Escribir "Ingrese un numero"; 
	Leer a; 
	Escribir "Ingrese un numero"; 
	Leer b; 
	Escribir "Ingrese un numero"; 
	Leer c; 
	Escribir "Ingrese un numero"; 
	Leer d;
	Si a==b && b==c && c==d Entonces
		Escribir "Todos son iguales"; 
	SiNo
		Si (a+b)>(c+d) Entonces
			Escribir "La suma de los 2 primeros es mayor que la suma de los 2 segundos"; 
		SiNo
			Escribir "La suma de los 2 segundos es mayor que la suma de los 2 primeros"; 
		FinSi
	FinSi
	
		
FinAlgoritmo
