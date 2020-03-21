Algoritmo Modulo_03_08
	Definir nota, aprobado, aplazados, promocionados,i Como Real; 
	nota = 0; 
	aprobado = 0; 
	aplazados = 0;
	promocionados = 0; 
	Para i<-1 Hasta 9 Con Paso 1 Hacer
		Escribir "Ingresar Nota del alumno:"; 
		Leer nota; 
		Si nota>=4 Entonces
			Si nota>=8 Entonces
				promocionados=promocionados+1; 
			SiNo
				aprobado=aprobado+1; 
			FinSi
		SiNo
			aplazados=aplazados+1;
		FinSi
	FinPara
	
	Escribir "La cantidad de alumnos promocionados son:", promocionados; 
	Escribir "La cantidad de alumnos aprobados son:",aprobado; 
	Escribir "La cantidad de alumnos aplazados son:",aplazados;
	
	
FinAlgoritmo
