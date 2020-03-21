Algoritmo Modulo_03_05
	Definir nega, posi, sonCero, num,i Como Real; 
	nega=0; 
	posi=0;
	sonCero=0;
	i=0;
	
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		Escribir "Ingresar un numero"; 
		Leer num;
		Si num<0 Entonces
			nega=nega+1; 
		SiNo
			Si num>0 Entonces
				posi=posi+1; 
			SiNo
				sonCero=sonCero+1; 
			FinSi
		FinSi
	FinPara
	
	Escribir  "La cantidad negativos son: ",nega;
	Escribir  "La cantidad positivos son: ",posi;
	Escribir  "La cantidad cer son: ",sonCero;  
FinAlgoritmo
