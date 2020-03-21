Algoritmo Modulo_04_06
	Definir edad, edadProm, estatura, estaturaProm, cantMayores, canMidenMenos,i Como Real;
	edad = 0; 
	edadProm = 0; 
	estatura = 0; 
	estaturaProm = 0; 
	cantMayores = 0; 
	canMidenMenos = 0; 
	i=0;
	
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		Escribir "Ingrese la edad del alumno";
		Leer edad; 
		edadProm=edadProm+edad; 
		Si edad>10 Entonces
			cantMayores=cantMayores+1; 
		FinSi
		Escribir "Ingrese la estatura del alumno"; 
		leer estatura; 
		estaturaProm = estaturaProm+estatura; 
		si estatura<1.40 entonces 
			canMidenMenos=canMidenMenos+1;
		FinSi
	FinPara
	
	Escribir "Edad Promedio: ",(edadProm/10);
	Escribir "Estatura Promedio: ",(estaturaProm/10);
	Escribir "Cantidad alumnos mayores: ", cantMayores;
	Escribir "Cantidad alumnos que miden menos 1.40: ",canMidenMenos;
FinAlgoritmo
