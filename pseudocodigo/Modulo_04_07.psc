Algoritmo Modulo_04_07
	definir nroFac, nroArt, cant, precioUni Como Real;
	Definir facMensual, facturacion, cantArt1, cuantoMas3 Como Real;
	nroFac=-1;  
	nroArt=0;
	cant=0;
	precioUni=0;
	facMensual=0; 
	cantArt1=0;
	cuantoMas3=0; 
	
	Mientras nroFac!=0 Hacer
		Escribir "Ingrese numero de factura: "; 
		leer nroFac;
		si nroFac!= 0 entonces
			Escribir "Ingrese numero de articulo: "; 
			leer nroArt;
			Escribir "Ingrese cantidad del articulo: ";
			leer cant; 
			si nroArt==1 Entonces
				cantArt1=cantArt1+cant; 
			FinSi
			Escribir "Ingrese precio del producto";
			leer precioUni; 
			facturacion=cant*precioUni;
			si facturacion>3000 Entonces
				cuantoMas3=cuantoMas3+1; 
			FinSi
			facMensual = facMensual+facturacion; 
		FinSi
	FinMientras
	
	Escribir "La facturacion mensual es: ", facMensual; 
	Escribir "Se vendio ", cantArt1, " del articulo 1"; 
	Escribir "Se emitieron ", cuantoMas3," facturas de mas de $3000";
	
FinAlgoritmo
