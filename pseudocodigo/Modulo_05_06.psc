Algoritmo Modulo_05_06
	//defino variables 
	Definir a,b, matricula, precio,i,matrPri,matrUlt,precioPri, precioUlt,x Como Entero; 
	//doy inicio a las necesarias 
	matricula=0;
	precio=0;
	i=0;
	//consulto cuantos productos va ingresar
	Escribir "Cuantos productos va ingresar?";
	leer x; 
	//utilizo ese dato para darle la dimension necesaria
	Dimension a[x]; 
	Dimension b[x]; 
	//recorro todo el array hasta x-1 pidiendo nro y precio 
	Para i<-0 Hasta x-1 Con Paso 1 Hacer
		Escribir "Ingrese nro producto: "; 
		leer matricula; 
		a[i]=matricula; 
		Escribir "Ingrese precio del producto:"; 
		leer precio; 
		b[i]=precio; 		
	FinPara
	//inicializo las variables max y min 
	precioPri=b[0]; 
	precioUlt=b[0]; 
		
	matrPri=a[0]; 
	matrUlt=a[0]; 
	//recorro para comparar y buscar el max y min
	Para i<-0 Hasta x-1 Con Paso 1 Hacer
		Si precioPri>=b[i] Entonces
			matrPri<-a[i];
			precioPri=b[i]; 
		SiNo
			matrUlt<-a[i];
			precioUlt<-b[i]; 
		FinSi
	FinPara
	//devuelvo datos 
	Escribir "El nro del producto mas caro es: ",matrUlt; 
	Escribir "El precio del producto mas barato es: ",precioPri;
FinAlgoritmo
