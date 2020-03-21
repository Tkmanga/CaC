Algoritmo Modulo_06_01
	//defino variables 
	definir bAno,catEmpleado, antEmpleado,i,sueldoEmpleado,sueldoMax,catDelSueldoMax Como Entero; 
	definir sueldosCat como entero; 
	definir sueldoProm como real; 
	// las inicializo 
	sueldoProm=0; 
	catEmpleado=0;
	antEmpleado=0; 
	sueldoEmpleado=0; 
	bAno<-100;
	sueldoMax=0; 
	catDelSueldoMax=0; 
	
	// defino e inicializo 3 arrays que me sirven como datos fijos o acumuladores 
	definir categoriaSueldo, categoriaEmpleados,categoriaSueldoEmpl como entero;
	
	Dimension categoriaSueldo[3]; 
	categoriaSueldo[0]=1500; 
	categoriaSueldo[1]=1700; 
	categoriaSueldo[2]=2000; 
	
	Dimension categoriaEmpleados[3];
	categoriaEmpleados[0]=0;
	categoriaEmpleados[1]=0;
	categoriaEmpleados[2]=0;
	
	Dimension categoriaSueldoEmpl[3]; 
	categoriaSueldoEmpl[0]=0;
	categoriaSueldoEmpl[1]=0;
	categoriaSueldoEmpl[2]=0;
	
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		//solicito los datos 
		Escribir "Ingrese categoria: "; 
		leer catEmpleado; 
		Escribir "Ingrese antiguedad: ";
		leer antEmpleado; 
		
		// aca acumulo para dsp sacar el sueldo promedio de todos los empleados
		sueldoProm=sueldoProm+sueldoEmpleado; 
		// aca comparo para seleccionar el max sueldo con su respectiva cat 
		Si sueldoMax<sueldoEmpleado Entonces
			sueldoMax=sueldoEmpleado;
			catDelSueldoMax=catEmpleado; 
		FinSi
		// dependiendo de la cat aca voy hacer las cosas correspondientes 
		Segun catEmpleado Hacer
			1:
				categoriaEmpleados[0]=categoriaEmpleados[0]+1;
				sueldoEmpleado=categoriaSueldo[0]+(antEmpleado*bAno);
				categoriaSueldoEmpl[0]=categoriaSueldoEmpl[0]+sueldoEmpleado;
			2:
				categoriaEmpleados[1]=categoriaEmpleados[1]+1;
				sueldoEmpleado=categoriaSueldo[1]+(antEmpleado*bAno);
				categoriaSueldoEmpl[1]=categoriaSueldoEmpl[1]+sueldoEmpleado;
			3:
				categoriaEmpleados[2]=categoriaEmpleados[2]+1; 
				sueldoEmpleado=categoriaSueldo[2]+(antEmpleado*bAno);
				categoriaSueldoEmpl[2]=categoriaSueldoEmpl[2]+sueldoEmpleado;
		FinSegun
		
		Para i<-0 Hasta 2 Con Paso 1 Hacer
			Escribir "La categoria ",(i+1)," tiene un acumulado $", categoriaSueldoEmpl[i], " correspondiente a sueldos de ",categoriaEmpleados[i]," empleados";
		FinPara
		Escribir "El promedio de sueldos en toda la empresa es de: ",(sueldoProm/10);
		Escribir "El sueldo maximos es: ",sueldoMax," con cat ",catDelSueldoMax;
	FinPara
	
FinAlgoritmo
