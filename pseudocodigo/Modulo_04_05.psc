Algoritmo Modulo_04_05
	definir contSueldoMayor, i, num, acumu Como Real; 
	acumu=0; 
	contSueldoMayor=0;
	Para i<-1 Hasta 50 Con Paso 1 Hacer
		Escribir "Ingrese un sueldo"; 
		leer num; 
		acumu = acumu + num;
		Si num>1500 Entonces
			contSueldoMayor = contSueldoMayor +1;
		FinSi
		
	FinPara
	Escribir "La suma de todos los sueldos es:",acumu; 
 
	Escribir "La suma de todos los sueldos es:",contSueldoMayor; 
	
	
FinAlgoritmo