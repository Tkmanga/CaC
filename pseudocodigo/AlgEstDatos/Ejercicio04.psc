Algoritmo Ejercicio04	
	definir a,i, numUsuario, acumulador,max,posiMax,posiMin, min Como Entero;
	Definir promedio Como Real;
	Dimension a[20];
	promedio=0; 
	numUsuario=0;
	acumulador=0; 
	i=0; 
	max=0;
	min=0; 
	posiMax=0;
	posiMin=0;
	Para i<-0 Hasta 19 Con Paso 1 Hacer
		Escribir "Ingrese un numero:";
		leer numUsuario; 
		a[i]=numUsuario; 		
	FinPara
	
	Para i<-0 Hasta 19 Con Paso 1 Hacer
		acumulador=acumulador+a[i]; 
		promedio=acumulador/(i+1);
		Si max<a[i] Entonces
			max=a[i];
			posiMax=i; 
		SiNo
			si min>a[i] entonces 
				min=a[i]; 
				posiMin=i; 
			FinSi
		FinSi
	FinPara
	
	Escribir "El promedio es: ", promedio; 
	Escribir "El maximo valor en el arreglo es: ",max; 
	Escribir "La posicion del maximo valor es: ", posiMax; 
	Escribir "La posicicon del valor minimo es: ", posiMin; 
FinAlgoritmo

	