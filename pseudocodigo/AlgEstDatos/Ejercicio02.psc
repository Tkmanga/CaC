Algoritmo Ejercicio02
	
	Definir promedio como real; 
	Definir contador,num,acumulador como entero; 
	contador=1; 
	promedio=0; 
	acumulador=0; 
	Repetir
		Escribir "Ingrese un numero"; 
		leer num; 
		acumulador=acumulador+num;
		promedio=acumulador/contador; 
		contador=contador+1; 
	Hasta Que promedio>=20 || contador>=100; 
	Escribir "Se leyeron ", contador-1," numeros ingresados"; 
FinAlgoritmo
