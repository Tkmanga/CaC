Algoritmo Modulo_02_09
	Definir  edad, edadTemp, estatura, estaTemp Como Real;
	Escribir "Ingresar la edad de alumno: ";
	Leer edadTemp; 
	edad=edad+edadTemp; 
	Escribir "Ingresar la estatura de alumno: "; 
	Leer estaTemp; 
	estatura = estatura+estaTemp; 
	Si edadTemp>15 && estaTemp<1.50 Entonces
		Escribir "Tiene: ", edadTemp, " de edad.";
	SiNo
	FinSi
	
	
FinAlgoritmo
