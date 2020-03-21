Funcion cantidad <- seRepite (arreglo,tamano,valoraBuscar )
	definir cantidad,i Como Entero; 
	cantidad =0; 
	Para i<-0 Hasta (tamano-1) Con Paso 1 Hacer
		Si arreglo[i]=valoraBuscar Entonces
			cantidad=cantidad+1; 
		FinSi
	FinPara
	
FinFuncion

Algoritmo Ejercicio06
	definir a,j,tamano,valorBuscado,num Como Entero;
	tamano = 0; 
	j=0; 
	valorBuscado=0; 
	num=0;
	Escribir "Ingrese el tamaño del arreglo que quiere generar"; 
	leer tamano; 
	Dimension a[tamano]; 
	Escribir "Ingresar el valor que quiere buscar en el arreglo";
	leer valorBuscado; 
	
	Para j<-0 Hasta tamano-1 Con Paso 1 Hacer
		Escribir "Ingrese un numero"; 
		leer num;
		a[j]=num; 
		Escribir "la posi",j," tiene el valor",a[j]; 
	FinPara
	
	Escribir "El valor se repite... ",seRepite(a,tamano,valorBuscado);
	
FinAlgoritmo
