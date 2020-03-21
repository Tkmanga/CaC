Algoritmo ejercicio52
	definir a,filas,columnas, contadorCero,array Como Entero; 
	a=4; 
	contadorCero=0; 
	Dimension array[a,a]; 
	array[0,0] = 0;
	array[0,1] = 0; 
	array[0,2] = 0; 
	array[0,3] = 0; 
	array[1,0] = 0; 
	array[1,1] = 0; 
	array[1,2] = 2; 
	array[1,3] = 3; 
	array[2,0] = 0;
	array[2,1] = 1; 
	array[2,2] = 2; 
	array[2,3] = 3; 
	array[3,0] = 0; 
	array[3,1] = 1; 
	array[3,2] = 2; 
	array[3,3] = 3; 
	
	Para filas<-0 Hasta 3 Con Paso 1 Hacer
		Para columnas<-0 Hasta 3 Con Paso 1 Hacer
			Si array[filas,columnas]==0 Entonces
				contadorCero=contadorCero+1;
			FinSi
		FinPara
	FinPara
	
	Escribir "la cantidad de 0 es: ", contadorCero; 
FinAlgoritmo
