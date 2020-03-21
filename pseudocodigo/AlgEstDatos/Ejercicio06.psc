Funcion respuesta  <- existeOno ( arreglo, num )
	Definir respuesta,i Como Entero;
	i=0; 
	respuesta=-1; 
	
	Para i<-0 Hasta 99 Con Paso 1 Hacer
		Si arreglo[i]=num Entonces
			respuesta=i;
		FinSi
	FinPara
FinFuncion

Funcion b <- numAleatorio ()
	definir b como entero; 
	b<-azar(100);
FinFuncion

Algoritmo Ejercicio06
	Definir a,i,numeroABuscar Como Entero;
	Dimension a[100]; 
	i=0;
	numeroABuscar=0; 
	Para i<-0 Hasta 99 Con Paso 1 Hacer
		a[i]=numAleatorio(); 
	FinPara
	
	Escribir "Ingrese un numero a buscar";
	Leer numeroABuscar; 
	Escribir "El numero existe en la posicion... ",existeOno(a,numeroABuscar);
	
FinAlgoritmo
