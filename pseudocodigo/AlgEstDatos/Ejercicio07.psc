Funcion a <- reverso ( a )
	definir i,contador Como Entero; 
	contador=1; 
	i=0; 
	
	Para i<-16 Hasta 2 Con Paso 1 Hacer
		a[0]=a[i]; 
		a[i]=a[i-1];
		a[contador]=a[0];	
		contador=contador+1; 
	FinPara
	
	Para i<-1 Hasta 16 Con Paso 1 Hacer
		Escribir a[i];
	FinPara
FinFuncion


Algoritmo Ejercicio07
	definir a Como Caracter; 
	Dimension a[17];
	a[0]="\0";
	a[1]="P"; 
	a[2]="A"; 
	a[3]="N"; 
	a[4]="C"; 
	a[5]="H"; 
	a[6]="O"; 
	a[7]="Y"; 
	a[8]="D"; 
	a[9]="O"; 
	a[10]="R"; 
	a[11]="I"; 
	a[12]="T"; 
	a[13]="O"; 
	a[14]="S"; 
	a[15]="T"; 
	a[16]="K"; 
	
	Escribir reverso(a);
	
FinAlgoritmo
