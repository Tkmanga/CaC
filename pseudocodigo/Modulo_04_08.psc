Algoritmo Modulo_04_08
	definir art1,art2,art3,nroFac, nroArt, cant, precioUni Como Real;
	Definir facMensual, facturacion, cantArt1, cuantoMas3 Como Real;
	art1=5;
	art2=7;
	art3=9; 
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
			si nroArt==1 Entonces
				Escribir "Ingrese cantidad del articulo: ";
				leer cant; 
				cantArt1=cantArt1+cant; 
				facturacion=cant*art1;
				si facturacion>3000 Entonces
					cuantoMas3=cuantoMas3+1; 
				FinSi
				facMensual = facMensual+facturacion; 
			SiNo
				si nroArt==2 Entonces
					Escribir "Ingrese cantidad del articulo: ";
					leer cant; 
					facturacion=cant*art2;
					si facturacion>3000 Entonces
						cuantoMas3=cuantoMas3+1; 
					FinSi
					facMensual = facMensual+facturacion; 
				SiNo
					si nroArt==3 Entonces
						Escribir "Ingrese cantidad del articulo: ";
						leer cant; 
						facturacion=cant*art3;
						si facturacion>3000 Entonces
							cuantoMas3=cuantoMas3+1; 
						FinSi
						facMensual = facMensual+facturacion; 
					SiNo
						Escribir "Ingreso un numero de articulo incorrecto";
					FinSi
					
				FinSi
			FinSi
		FinSi
	FinMientras
	
	Escribir "La facturacion mensual es: ", facMensual; 
	Escribir "Se vendio ", cantArt1, " del articulo 1"; 
	Escribir "Se emitieron ", cuantoMas3," facturas de mas de $3000";
	
FinAlgoritmo
