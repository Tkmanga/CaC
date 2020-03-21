Algoritmo Ejercicio01
	
	Definir a, base, resultado,tope Como Entero;
	base=1;
	resultado=0; 
	tope=50; 
	//aca le pido un numero al usuario hasta que este dentro de los parametros solicitados
	Repetir
		Escribir "Ingrese un numero: "; 
		Leer a; 
	Hasta Que a>=2 && a<=9
	// aca imprimo mientras el resultado del numero*secuencia no sea mayor o igual a 100
	Escribir "Orden ascendente"; 
	
	Repetir
		resultado=a*base;
		Si resultado<=100 Entonces
			
			Escribir "Un numero multiplo de ",a," es: ",resultado; 
		FinSi
		base=base+1; 
	Hasta Que resultado>=100
	//
	Escribir "Orden descendente"; 
	Repetir
		resultado=a*tope;
		Si resultado<=100&&resultado>=a Entonces
			Escribir "Un numero multiplo de ",a," es: ",resultado; 
		FinSi
		tope=tope-1; 
	Hasta Que resultado<a
FinAlgoritmo

