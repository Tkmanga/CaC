Algoritmo Modulo_03_09
	Definir prom, promMayor, promMenor, i Como Real;
	prom = 0; 
	promMayor = 0;  
	promMenoR = 0;
	
	Para i<-1 Hasta 700 Con Paso 1 Hacer
		Escribir "Ingresar promedio del alumno";
		Leer prom; 

		Si prom>5 Entonces
			promMayor=promMayor+1; 
		SiNo
			promMenor=promMenor+1; 
		FinSi
		
	FinPara
	Escribir "Alumnos con nota promedio > 5: ",promMayor; 
	
	Si promMenor>400 Entonces
		Escribir "ESTA UNIVERSIDAD TIENE PROMEDIO MUY BAJO"; 
	FinSi
FinAlgoritmo
