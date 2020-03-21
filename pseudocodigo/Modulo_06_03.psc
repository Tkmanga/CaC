Algoritmo Modulo_06_03
	
	definir totalcadaFacturas, totalGeneralFacturado, bandera, precioUnitario como real; 
	Definir  nroFactura, codigoArticulo, cantArticulo, cantArticuloT, i,articulo como entero; 
	Definir cantVendidas, cantFacturasVendidas, nroFacturaM, valorM, artMenor, cantMenor, plataPorArt, tCantVendida como entero; 
	totalcadaFacturas = 0; 
	totalGeneralFacturado = 0; 
	bandera = -1; 
	nroFactura=0; 
	cantArticuloT = 0; 
	valorM=0; 
	//creo el arreglo que va guardar la cantidad vendida por cada articulo en el mismo orden 
	Dimension cantVendidas[4];	
	Dimension cantFacturasVendidas[4]; 
	Dimension plataPorArt[4]; 
	
	Para i<-0 Hasta 3 Con Paso 1 Hacer
		plataPorArt[i]=0; 
		cantFacturasVendidas[i]=0; 
		cantVendidas[i]=0; 
	FinPara
	
	dimension articulo[4];
	articulo[0]=10;
	articulo[1]=20;
	articulo[2]=30;
	articulo[3]=40;
	
	Mientras bandera!=0 Hacer
		
		Escribir "Ingresar numero de factura"; 
		Leer nroFactura; 
		
		Si nroFactura!=0 Entonces
			Escribir "Ingresar codigo del articulo"; 
			leer codigoArticulo; 
			Escribir "Ingresar cantidad del articulo"; 
			leer cantArticulo; 
			
			Escribir "Ingresar precio unitario"; 
			leer precioUnitario; 
			
			//Aca resolvemos el punto A por cada factura generada se muestra el precio
			totalcadaFacturas = cantArticulo*precioUnitario;
			//acumulamos por cada operacion el total
			totalGeneralFacturado = totalGeneralFacturado+totalcadaFacturas; 
			
			//con este para nos aseguramos que el codigo de articulo exista en el arreglo articulos 
			Para i<-0 Hasta 3 Con Paso 1 Hacer
				//consultamos si existe
				Si articulo[i]=codigoArticulo Entonces
					//guardamos la cantidad que se vende de ese articulo 
					cantVendidas[i]=cantVendidas[i]+cantArticulo;
					cantFacturasVendidas[i]=cantFacturasVendidas[i]+1; 
					plataPorArt[i]=plataPorArt[i]+totalcadaFacturas;
				FinSi
			FinPara
			
			Escribir "Total factura: ",totalcadaFacturas;
			Si valorM<totalcadaFacturas Entonces
				nroFacturaM=nroFactura; 
				valorM=totalcadaFacturas;
			FinSi
		FinSi
		bandera=nroFactura; 
	FinMientras
	//Aca resolvemos el punto B 
	Escribir "Punto B: "; 
	Escribir "Total general facturado: ", totalGeneralFacturado; 
	//Aca resolvemos el punto C y el punto E
	
	Escribir "Punto C y E: "; 
	Para i<-0 Hasta 3 Con Paso 1 Hacer
		Escribir "Del articulo codigo: ", articulo[i]," se vendieron: ", cantVendidas[i]; 
		Escribir "La cantidad de facturas vendidas del articulo: ", articulo[i], " son ", cantFacturasVendidas[i]; 
		cantArticuloT=cantArticuloT+cantVendidas[i]; 
	FinPara
	//Aca resolvemos el punto D
	
	Escribir "Punto D: ";
	Escribir "El total de articulos vendidos es: ", cantArticuloT;
	//Aca resolvemos el punto F 
	
	Escribir "Punto F: ";
	Escribir "la factura con mayor valor es: ", nroFacturaM;
	//Aca resolvemos el punto H
	
	Escribir "Punto H: ";
	Escribir "El porcentaje de dinero por el articulo ", articulo[0], " es ", ((plataPorArt[0]*100)/totalGeneralFacturado);
	Escribir "El porcentaje de dinero por el articulo ", articulo[1], " es ", ((plataPorArt[1]*100)/totalGeneralFacturado);
	Escribir "El porcentaje de dinero por el articulo ", articulo[2], " es ", ((plataPorArt[2]*100)/totalGeneralFacturado);
	Escribir "El porcentaje de dinero por el articulo ", articulo[3], " es ", ((plataPorArt[3]*100)/totalGeneralFacturado);
	
FinAlgoritmo

