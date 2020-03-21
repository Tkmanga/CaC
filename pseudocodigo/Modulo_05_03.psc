Algoritmo Modulo_05_03
	definir maxSueldo, sueldo, i, cantidad Como Real;
	maxSueldo=-1; 
	sueldo=0;
	i=0; 
	cantidad=0; 
	Escribir "Ingrese la cantidad de sueldos a ingresar: ";
	leer cantidad; 
	Para i<-1 Hasta cantidad Con Paso 1 Hacer
		Escribir "Ingrese sueldo: ";
		leer sueldo; 
		si sueldo>maxSueldo Entonces
			maxSueldo=sueldo;
		FinSi
	FinPara
	Escribir "el max sueldo es: ",maxSueldo;
FinAlgoritmo
