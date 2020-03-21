Algoritmo Modelo_06_01
	Definir nombrEmpl, nombrEmplM  Como Caracter;
	definir sueldo, totalSueldos, sueldoM Como Real;
	Definir categoria, i, cantEmplM200, cantEmplm500, totalSuelCat1, totalSuelCat2, totalSuelCat3 Como Entero; 
	
	totalSueldos = 0; 
	cantEmplM200 = 0; 
	cantEmplm500 = 0; 
	sueldoM = 0; 
	totalSuelCat1 = 0; 
	totalSuelCat2 = 0; 
	totalSuelCat3= 0; 
	
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		Escribir "Ingrese el nombre del empleado"; 
		leer nombrEmpl; 
		Escribir "Ingrese el sueldo del empleado"; 
		leer sueldo;
		Escribir "Ingrese la categoria del empleado"; 
		leer categoria;
		Si (categoria=1 || categoria=2 || categoria=3) && sueldo>sueldoM Entonces
			sueldoM = sueldo;  
			nombrEmplM = nombrEmpl; 
		FinSi
		Segun categoria Hacer
			1:
				totalSueldos=totalSueldos+sueldo; 
				totalSuelCat1=totalSuelCat1+sueldo;
				Si sueldo<500 Entonces
					cantEmplm500=cantEmplm500+1; 
				SiNo
					Si sueldo>2000 Entonces
						cantEmplM200=cantEmplM200+1; 
					FinSi
				FinSi
			2:
				totalSueldos=totalSueldos+sueldo; 
				totalSuelCat2=totalSuelCat2+sueldo;
				Si sueldo>2000 Entonces
					cantEmplM200=cantEmplM200+1; 
				FinSi
			3:
				totalSueldos=totalSueldos+sueldo;
				totalSuelCat3=totalSuelCat3+sueldo;
				Si sueldo>2000 Entonces
					cantEmplM200=cantEmplM200+1; 
				FinSi
			De Otro Modo:
				Escribir "Ingreso una categoria incorrecta";
		FinSegun
	FinPara
	
	Escribir "El total de sueldos que la empresa paga es: ", totalSueldos;
	Escribir "La cantidad de empleados que ganan mas de 2000: ", cantEmplM200;
	Escribir "La cantidad de empleados que ganan menos de 500 y son cat 1: ", cantEmplm500; 
	Escribir "El empleado que mas gana es", nombrEmplM," con sueldo: ", sueldoM ;
	Escribir "Total de sueldos categoria 1: ", totalSuelCat1;
	Escribir "Total de sueldos categoria 2: ", totalSuelCat2;
	Escribir "Total de sueldos categoria 3: ", totalSuelCat3;
	
FinAlgoritmo
