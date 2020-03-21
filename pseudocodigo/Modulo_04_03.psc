Algoritmo Modulo_04_03
	Definir numUsu, acumulador,i,num Como Real;
	acumulador = 0; 
	Escribir "Cuantos numeros va ingresar?"; 
	leer numUsu;
	Para i<-1 Hasta numUsu Con Paso 1 Hacer
		Escribir "ingrese numero: ";
		Leer num; 
		acumulador = acumulador+num; 
	FinPara
	
	Escribir "el promedio es:", (acumulador/numUsu); 
FinAlgoritmo
