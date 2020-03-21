Algoritmo Modulo_04_04
	Definir contPosi, contNega, contCero, num, i, acuPosi, acuNega  Como Real; 
	contPosi = 0; 
	contNega = 0; 
	contCero = 0; 
	acuPosi = 0;
	acuNega = 0; 
	Para i<-1 Hasta 25 Con Paso 1 Hacer
		Escribir "Ingresar numero"; 
		Leer num; 
		
		Si num>0 Entonces
			acuPosi=acuPosi+num; 
			contPosi= contPosi+1; 
		SiNo
			Si num<0 Entonces
				
				acuNega=acuNega+num; 
				contNega= contNega+1; 
			SiNo
				contCero = contCero +1; 
			FinSi
		FinSi
	FinPara
	
	Escribir "El promedio posi: ",(acuPosi/contPosi);
	Escribir "El promedio nega: ",(acuNega/contNega);
	Escribir "El promedio cero: ",(contCero);
	
FinAlgoritmo
