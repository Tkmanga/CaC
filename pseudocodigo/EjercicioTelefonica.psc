Algoritmo Telefonica 
	definir i,a,b Como Entero; 
	a=12; 
	b=150; 
	// defino las variables de la tabla productos 
	definir descr_producto Como Caracter; 
	definir  precio, productos Como Real;
	definir  codigo_tipo_producto, codigo_producto Como Entero; 
	
	dimension codigo_producto[b]; 
	dimension descr_producto[b]; 
	dimension precio[b]; 
	Dimension codigo_tipo_producto[a];
	
	Para i<-1 Hasta 12 Con Paso 1 Hacer
		codigo_tipo_producto[i-1]=i; 
	FinPara
	
	Para i<-1 Hasta 150 Con Paso 1 Hacer
		codigo_producto[i-1]=i; 
		descr_producto[i-1]="##";
		precio[i-1]=5.2; 
	FinPara
	
	definir nombre_tipo_producto como caracter; 
	Definir desc como real; 
	dimension nombre_tipo_producto[a];
	Dimension desc[a]; 
	
	Para i<-1 Hasta 12 Con Paso 1 Hacer
		codigo_tipo_producto[i-1]=i; 
		desc[i-1]=0.5;
	FinPara
	
	Definir edad como entero; 
	Definir edadDesde como entero; 
	Definir edadHasta Como Entero; 
	
	
	
	Escribir "Ingrese codigo del producto: "; 
	Escribir "Ingrese S/N de corresponder descuento: ";
	Escribir "Edad del comprador: "; 
	
	
FinAlgoritmo
