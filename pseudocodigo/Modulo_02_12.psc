Algoritmo Modulo_02_12
	Definir dia,mes,anio Como Entero;
	Escribir 'Ingrese el dia: ';
	Leer dia;
	Escribir 'Ingrese el mes: ';
	Leer mes;
	Escribir 'Ingrese el anio: ';
	Leer anio;
	
	Si (anio%400)==0 Entonces
		Si (mes>=1 && mes<=12) Entonces
			Si mes=1 | mes=3 | mes=5 | mes=7 | mes=8 | mes=10 | mes=12 Entonces
				Si dia>=1 && dia<=31 Entonces
					Escribir 'Es una fecha VALIDA';
				SiNo
					Escribir 'Ingreso un dia no valido';
				FinSi
			SiNo
				Si mes=4 | mes=6 | mes=9 | mes=11 Entonces
					Si dia>=1 && dia<=30 Entonces
						Escribir 'Es una fecha VALIDA';
					SiNo
						Escribir 'Ingreso un dia no valido';
					FinSi
				SiNo
					Si mes=2 && (dia>=1 && dia<=29) Entonces
						Escribir 'Ingreso una fecha VALIDA';
					SiNo
						Escribir 'Ingreso un dia no valido';
					FinSi
				FinSi
			FinSi
		SiNo
			Escribir 'Ingreso un mes no valido';
		FinSi
	SiNo
		Si (anio%4)==0 && (anio%100)!=0 Entonces
			Si (mes>=1 && mes<=12) Entonces
				Si mes=1 | mes=3 | mes=5 | mes=7 | mes=8 | mes=10 | mes=12 Entonces
					Si dia>=1 && dia<=31 Entonces
						Escribir 'Es una fecha VALIDA';
					SiNo
						Escribir 'Ingreso un dia no valido';
					FinSi
				SiNo
					Si mes=4 | mes=6 | mes=9 | mes=11 Entonces
						Si dia>=1 && dia<=30 Entonces
							Escribir 'Es una fecha VALIDA';
						SiNo
							Escribir 'Ingreso un dia no valido';
						FinSi
					FinSi
					Si mes=2 && (dia>=1 && dia<=29) Entonces
						Escribir 'Ingreso una fecha VALIDA';
					SiNo
						Escribir 'Ingreso un dia no valido';
					FinSi
				FinSi
			SiNo
				Escribir 'Ingreso un mes no valido';
			FinSi
		SiNo
			Si (mes>=1 && mes<=12) Entonces
				Si mes=1 | mes=3 | mes=5 | mes=7 | mes=8 | mes=10 | mes=12 Entonces
					Si dia>=1 && dia<=31 Entonces
						Escribir 'Es una fecha VALIDA';
					SiNo
						Escribir 'Ingreso un dia no valido';
					FinSi
				SiNo
					Si mes=4 | mes=6 | mes=9 | mes=11 Entonces
						Si dia>=1 && dia<=30 Entonces
							Escribir 'Es una fecha VALIDA';
						SiNo
							Escribir 'Ingreso un dia no valido';
						FinSi
					SiNo
						Si mes=2 && (dia>=1 && dia<=28) Entonces
							Escribir 'Ingreso una fecha VALIDA';
						SiNo
							Escribir 'Ingreso un dia no valido';
						FinSi
					FinSi
				FinSi
			SiNo
				Escribir 'Ingreso un mes no valido';
			FinSi
		FinSi
	FinSi
FinAlgoritmo

