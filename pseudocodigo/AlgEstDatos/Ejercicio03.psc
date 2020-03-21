

Algoritmo Ejercicio03
	Definir n1, n2,a como real; 
	Definir a Como Caracter;
	Definir opc Como Caracter;
	n1=0; 
	n2=0; 
	a<-'+'; 
	Repetir
		
		Escribir "Ingrese el primer numero: "; 
		leer n1; 
		Escribir "Ingrese el segundo numero: "; 
		leer n2; 
		Escribir "Ingrese el caracter de lo que quiere hacer: ";
		leer opc;
		Segun opc Hacer
			a:
				secuencia_de_acciones_1
			opcion_2:
				secuencia_de_acciones_2
			opcion_3:
				secuencia_de_acciones_3
			De Otro Modo:
				secuencia_de_acciones_dom
		FinSegun
	Hasta Que opc!="f"
FinAlgoritmo

