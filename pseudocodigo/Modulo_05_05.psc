Algoritmo Modulo_05_05 
	Definir a,b, matricula, tiempo,i,matrPri,matrUlt,tiempoPri, tiempoUlt Como Entero; 
	matricula=0;
	tiempo=0;
	i=0;
	Dimension a[5]; 
	Dimension b[5]; 
	
	Para i<-0 Hasta 45 Con Paso 1 Hacer
		Escribir "Ingrese matricula"; 
		leer matricula; 
		a[i]=matricula; 
		Escribir "Ingrese tiempo"; 
		leer tiempo; 
		b[i]=tiempo; 		
	FinPara
	
	tiempoPri=b[0]; 
	tiempoUlt=b[0]; 
	
	matrPri=a[0]; 
	matrUlt=a[0]; 
	Para i<-0 Hasta 45 Con Paso 1 Hacer
		Si tiempoPri>=b[i] Entonces
			matrPri<-a[i];
			tiempoPri=b[i]; 
		SiNo
			matrUlt<-a[i];
			tiempoUlt<-b[i]; 
		FinSi
	FinPara
	
	Escribir "La matricula del auto que llego primero es: ",matrPri; 
	Escribir "La matricula del auto que llego ultimo es: ",matrUlt;
	Escribir "El auto nro 5 ingresado llego primero? ",(b[5]<=tiempoPri); 
	
	
FinAlgoritmo
