/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CaC;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class CaC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // TODO code application logic here
        /*
        System.out.println("Texto\nen\nlineas\nseparadas");
        System.out.println("Esto no se ve \rCarro retornado");
        System.out.println("Borro espacio \ba la izquierda");
        System.out.println("Imprimo una barra invertida: \\");
        System.out.println("Imprimo una comilla simple: \'");
        System.out.println("Imprimo una comilla doble\"");
        */
        /*
        int a; 
        int b; 
        System.out.println("Ingresa un numero: ");
        a = entrada.nextInt(); 
        System.out.println("Ingresa otro numero: ");
        b = entrada.nextInt(); 
        System.out.println("La suma de ambos es "+ (a+b));
        */   
        /*
        char caracter; 
        System.out.println("Ingrese un texto: ");
        caracter = entrada.next().charAt(0); 
        System.out.println("Se detecto el caracter: "+ caracter);
        */
        
        /*
        String nombre; 
        System.out.println("Ingrese un nombre: ");
        nombre = entrada.nextLine(); 
        System.out.println("Hola "+nombre);
        */
        /*
        int edad;
        String nombre;
        
        System.out.println("Ingresa tu edad: ");
        edad = entrada.nextInt(); 
        entrada.nextLine(); //Limpiamos el buffer, ya que si no lo hacemos no lee lo siguiente 
        System.out.println("Ingresa tu nombre: ");
        nombre = entrada.nextLine(); 
        System.out.println("Hola "+ nombre + " tenes "+ edad + " años ");
        */
        
        
        // TODO code application logic here
        
        /*
        Ejercicio 1
        Ingresar el área de un cuadrado por teclado utilizando un objeto Scanner.
        Calcular e imprimir el valor del perímetro. Ejemplo: Ingresa 25, debe
        devolver 20.
        */
        
        /*
        // Declaramos la variable que recibe el area del cuadrado
        int variable; 
        //declaramos la variable que recibe el calculo de la raiz 
        double variable2; 
        //declaramos objeto scanner para recibir lo del usuario
        Scanner teclado = new Scanner(System.in);
        //pido el numero al usuario
        System.out.println("Ingrese el numero del perimetro: ");
        //guardo la variable que me paso el usuario
        variable = teclado.nextInt(); 
        //hago el calculo redondeando el valor para cumplir con lo solicitado
        variable=(int)(Math.sqrt(variable))*4;
        //devuelvo 
        System.out.println("El perimetro es: "+variable);
        */
        
        
        /*
        Ejercicio 2 
        Desarrollar un algoritmo que permita ingresar dos números enteros por
        teclado utilizando un objeto Scanner. La computadora deberá mostrar su
        cociente entero. El resto se deberá mostrar en otra línea. Ejemplo:
        Ingresa 23 y 5, debe devolver 4 y, en otra línea, 3.
        */
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el primer numero: ");
        int variable1= teclado.nextInt();
        System.out.println("Ingresar el segundo numero; ");
        int variable2= teclado.nextInt(); 
        double resultado=variable1/variable2; 
        System.out.println("El cociente de ambos numeros es: "+((int)resultado));
        resultado = variable1%variable2;
        System.out.println("El resto de ambos numeros es: "+((int)resultado));
        */
        
        /*
        Ejercicio 3 
        Desarrollar un algoritmo que permita ingresar dos números enteros por
        teclado. La computadora deberá mostrar su cociente con decimales.
        Recuerde utilizar Casting para obtener el resultado con los decimales
        correspondientes.
        */
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el primer numero: ");
        int variable1= teclado.nextInt();
        System.out.println("Ingresar el segundo numero; ");
        int variable2= teclado.nextInt(); 
        double resultado = variable1%variable2;
        System.out.println("El resto de ambos numeros es: "+(resultado));
        */
        
        /*
        Ejercicio 4
        Ingresar por teclado el diámetro (tipo de dato entero) de un círculo y
        calcular su perímetro pero sólo deberá mostrar la parte entera del
        resultado. Defina el valor de PI como una constante con valor 3,14.
        Ejemplo: Ingresa 10, debe devolver perímetro = 31. Realice Casting
        para obtener la parte entera del resultado.
        */
        /*
        final double MAT_PI = 3.14;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el diametro del circulo: ");
        int variable1= teclado.nextInt();
        
        double resultado = MAT_PI*variable1;
        
        System.out.println("El resultado es: "+(int)resultado);
        */ 
        /*
        Ejercicio 5
        Ingresar por teclado el radio (tipo de dato entero) de un círculo y calcular
        su perímetro y superficie (definidos como double). Utilice la Clase Math
        para obtener el valor de PI. Ejemplo: Ingresa 5, debe devolver
        perímetro = 31,41592654 y superficie = 78,53981634.
        */
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el diametro del circulo: ");
        int variable1= teclado.nextInt();
        
        double perimetro=Math.PI*variable1; 
        double superficie=(Math.PI*(Math.pow(variable1, 2))); 
        //creo que esta bien este resultado a pesar que en el ejemplo da otro valor por 
        que es con 10 que da ese resultado que buscan
        System.out.println("Perimetro: "+perimetro);
        System.out.println("Superficie: "+superficie);
        */
        
        /*
        Ejercicio 6
        Ingresar por teclado los lados de un triángulo rectángulo (valores enteros)
        y calcular el perímetro y su superficie. 
        
        Para la raíz cuadrada de la hipotenusa deberá utilizar la clase Math. 
        
        Ayuda: la superficie es base*altura/2 y el perímetro del triangulo es base+altura+hipotenusa,
        donde hipotenusa = √(base2 + altura2)
        */
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar lado A: ");
        int variable1= teclado.nextInt();
        System.out.println("Ingresar el segundo lado; ");
        int variable2= teclado.nextInt(); 
        
        double superficie = variable1*(variable2/2);
        double hipotenusa = Math.sqrt(Math.pow(variable1, 2)+Math.pow(variable2, 2)); 
        double perimetro = variable1+variable2+hipotenusa; 
        
        
        System.out.println("Perimetro: "+perimetro);
        System.out.println("Superficie: "+superficie);
        */    
        
        /*
        Ejercicio 7
        Codifique un programa en Java que permita saber si un número ingresado
        por teclado es par o impar.
        */
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar lado A: ");
        int variable1= teclado.nextInt();
        if (variable1%2==0) {
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
        */
        
        /*
        Ejercicio 8
        Desarrollar un algoritmo que, dada la edad de una persona (entre 1 y 120 años)
        y su género ('F' para mujeres, 'M' para hombres), la computadora indique si está en
        edad de jubilarse. Ayuda: Las mujeres se jubilan con 60 años o más. Los hombres se
        jubilan con 65 años o más. Ejemplo: Ingresa 62 y 'M', debe devolver “No se jubila”. 
        
        
        */
        /*
        Scanner teclado = new Scanner(System.in);
        int edadUsuario=0; 

        System.out.println("Ingrese la edad del usuario");
        edadUsuario = teclado.nextInt(); 
        
        teclado.nextLine();
        System.out.println("Ingrese el genero del usuario");
        String generoUsuario = teclado.nextLine();
        
        if (generoUsuario.equals("M") && edadUsuario>=60) {
            System.out.println("Se jubila");
        }else if (generoUsuario.equals("F") && edadUsuario>=65) {
            System.out.println("Se jubila");
        }else{
            System.out.println("No se jubila");
        }
        */
        
        /*
        Ejercicio 9
        Desarrollar un algoritmo que, dada la 
        cantidad de alumnos de un curso y la cantidad de sillas disponibles, la
        computadora indique si alcanzan las sillas, en caso contrario, indique cuántas 
        faltan para que todo el alumnado tenga asiento. 
        */
        
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de alumnos: ");
        int alumnos= teclado.nextInt();
        System.out.println("Ingresar la cantidad de sillas; ");
        int sillas= teclado.nextInt(); 
        
        if (sillas>=alumnos) {
            System.out.println("Hay suficientes sillas para todos los alumnos presentes");
        }else if (alumnos>sillas){
            System.out.println("faltan "+(alumnos-sillas)+" sillas ");
        }
        */
        /*
        10)Desarrollar un algoritmo que, dados dos números enteros entre 0 y 100,
        la computadora indique si el mayor es divisible por el menor. Ejemplo:
        Ingresa 4 y 28, debe imprimir “28 es divisible por 4”. Se deberá validar
        que los números ingresados se encuentren entre 0 y 100.
        */
        
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1= teclado.nextInt();
        System.out.println("Ingresar el segundo numero; ");
        int num2= teclado.nextInt(); 
        if ((num1>=0 && num1<=100)&&(num2>=0 && num2<=100)) 
        {
            if (num1<num2) 
            {
                if (num2%num1==0) 
                {
                    System.out.println("El "+num2+" es divisible por "+num1);
                }
            }else{
                if (num1%num2==0) {
                    System.out.println("El "+num1+" es divisible por "+num2);
                }
            }
        }else
        {
            System.out.println("Ingreso un numero que no respeta los parametros");
        }
        */
        /*
        11)Desarrollar un algoritmo que permita ingresar los lados A, B y C de un
        triángulo. La computadora informa si el triángulo es o no válido. En caso
        afirmativo, además informa si es equilátero, isósceles o escaleno. Ayuda:
        según el teorema de desigualdad triangular, un triángulo es válido si se
        cumple que cada uno de los lados no puede ser más largo que la suma
        de los otros dos. Un triángulo equilátero es aquel que tiene sus tres lados
        iguales. Un triángulo isósceles es aquel que tiene dos de sus lados
        iguales. Un triángulo escaleno es aquel que tiene sus tres lados
        desiguales. Ejemplo: Se ingresa un 3, 4 y 5, la computadora muestra:
        “Es un triángulo escaleno”.
        */
        
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el lado A: ");
        int num1= teclado.nextInt();
        System.out.println("Ingresar el lado B; ");
        int num2= teclado.nextInt(); 
        System.out.println("Ingresar el lado C; ");
        int num3= teclado.nextInt(); 
        
        if (esMayor(num1,num2,num3) && esMayor(num3, num2, num1) && esMayor(num1, num3, num2)) 
        {
            if (num1!=num2 && num2!=num3 && num3!=num1) {
                System.out.println("El triangulo es escaleno");
            }else if (num1==num2 && num2==num3 && num3==num1) {
                System.out.println("El triangulo es equilatero");
            }else {
                System.out.println("El triangulo es isoseles");
            }
        }else {
            System.out.println("no se cumple la primera forma");
        }
        */
        
        /*
        12)Desarrollar un algoritmo que permita ingresar un caracter. La
        computadora indica si es o no una letra vocal (utilice switch-case).
        */
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("El caracter: ");
        char carac = teclado.nextLine().charAt(0);
        switch (carac) {
            case 'a':
                System.out.println("Es una vocal");
                break;
            case 'e':
                System.out.println("Es una vocal");
                break;
            case 'i':
                System.out.println("Es una vocal");
                break;
            case 'o':
                System.out.println("Es una vocal");
                break;
            case 'u':
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("No es una vocal");
        }
        */
        
        /*
        13)Desarrollar un algoritmo que pida al usuario un número entre 1 y 12. La
        computadora muestra por pantalla el mes al que pertenece tal número. Si
        se ingresa un número fuera de rango, mostrar un error. Ejemplo: se
        ingresa un 4, la computadora muestra: “ABRIL” (utilice switch-case).
        */
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("El num de mes que quiere saber: ");
        int carac = teclado.nextInt();
        switch (carac) {
            case 1:
                System.out.println("enero");
                break;
            case 2:
                System.out.println("febrero");
                break;
            case 3:
                System.out.println("marzo");
                break;
            case 4:
                System.out.println("abril");
                break;
            case 5:
                System.out.println("mayo");
                break;
            case 6:
                System.out.println("junio");
                break;
            case 7:
                System.out.println("julio");
                break;
            case 8:
                System.out.println("agosto");
                break;
            case 9:
                System.out.println("septiembre");
                break;
            case 10:
                System.out.println("octubre");
                break;
            case 11:
                System.out.println("noviembre");
                break;
            case 12:
                System.out.println("diciembre");
                break;
            default:
                System.out.println("ingreso un numero de mes invalido");
        }
        */
        
        /*
        14)Desarrollar un algoritmo que permita el ingreso de una letra,
        correspondiente a un dígito del sistema de numeración romano. La
        computadora muestra su correspondiente valor decimal. Si se ingresa una
        letra inexistente, computadora informa que no existe tal dígito. Ejemplo:
        Se ingresa 'D', la computadora muestra: 500.
        */
         
        /*
        15)Desarrollar un algoritmo que simule una calculadora básica que realice
        operaciones de suma, resta, multiplicación y división. Se deben recibir
        como entrada dos números reales y un operador, que puede ser '+', '-', '*'
        ó '/'. La salida del programa debe ser el resultado de la operación. Ayuda:
        Prever que se puede llegar a intentar hacer una división por cero.
        */
        /*
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        int vari1 = teclado.nextInt(); 
        teclado.nextLine();
        System.out.println("simbolo: ");
        char carac = teclado.nextLine().charAt(0);
        System.out.println("Ingrese el primer numero: ");
        int vari2 = teclado.nextInt(); 
        switch (carac) {
            case '+':
                System.out.println("La suma es: "+(vari1+vari2));
                break;
            case '-':
                System.out.println("La resta es: "+(vari1-vari2));
                break;
                
            case '*':
                System.out.println("La multi es: "+(vari1*vari2));
                break;
            
            case '/':
                if (vari2==0) {
                    System.out.println("No se puede dividir por 0");
                }else {
                    System.out.println("La divi es: "+(vari1/vari2));
                }
                   
                break;
            default:
                throw new AssertionError();
        }
        
        */
        
        /*
        16)Codifique un programa en Java que permita el ingreso de un número, y a
        partir de ello, mostrar los diez números siguientes al mismo. Resuelva el
        ejercicio con las siguientes estructuras iterativas: for, while y do-while.
        */
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int vari1 = teclado.nextInt(); 
        int bandera = (vari1+10); 
        */
        /*
        while (vari1<bandera) {
            System.out.println("vamos: "+vari1);
            vari1++; 
        }
        */
        /*
        do {
            System.out.println("Vamos: "+vari1);
            vari1++;
        }while(vari1<bandera);
        */
        /*
        for (int i = vari1; i < (vari1+10); i++) {
            System.out.println("vamos: "+i);
        }
        */
        
        /*
        17)Ingresar por teclado 1 número entero y mostrar por pantalla su tabla de
        multiplicar entre 1 y 10 (usando la instrucción for).
        */
        
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int vari1 = teclado.nextInt(); 
        for (int i = 1; i <= 10; i++) {
            System.out.println(vari1+" x "+i+" = "+ (i*vari1));
        }
        */
        
        /*
        18)Ingresar por teclado 1 número entero y
        mostrar por pantalla su tabla de multiplicar entre 1 y 10 (usando la
        instrucción while).
        */
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int vari1 = teclado.nextInt(); 
        int i=1; 
        while (i<=10) {
            System.out.println(vari1+" x "+i+" = "+ (i*vari1));
            i++;
            
        }
        */
        
        /*
        19)Crear un programa que muestre en pantalla una escalera inversa de
        asteriscos. La cantidad de filas de la escalera se ingresa por teclado.
        Utilice la instrucción for.
        Ejemplo:
        Cantidad de filas=5:
        *****
        ****
        ***
        **
        *
        */
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int vari1 = teclado.nextInt();
        
        for (int i = vari1; i>=1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        */
        
        /*
        20)Desarrollar un algoritmo que permita ingresar un número N. Acto seguido,
        permitir ingresar N números enteros, correspondientes a las notas de un
        curso. La computadora muestra el promedio de las notas ingresadas.
        Ejemplo: Se ingresa 4, luego 4 7 3 9, la computadora muestra: 5.75.
        */
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int vari1 = teclado.nextInt();
        double acumulador=0; 
        for (int i = 0; i < vari1; i++) {
            System.out.println("Ingrese numero: ");
            acumulador += teclado.nextInt(); 
        }
        System.out.println("El promedio es: "+(acumulador/vari1));
        */
        /*
        21)Desarrollar un algoritmo que permita ingresar un número natural. La
        computadora muestra el factorial del número. Ejemplo: Se ingresa 5, la
        computadora muestra: 120.
        */
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int vari1 = teclado.nextInt();
        int factorial = 1; 
        
        for (int i = 1; i <=vari1; i++) {
            factorial*=i; 
        }
        
        System.out.println("Factorial "+factorial);
        */
        
        /*
        22)Crear un programa que muestre en pantalla una escalera de asteriscos.
        La cantidad de filas de la escalera deberá ser una constante. Utilice la
        instrucción while.
        Ejemplo:
        Cantidad de filas=5:
        *
        **
        ***
        ****
        *****
        */
        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int vari1 = teclado.nextInt();
        
        for (int i = 1; i <= vari1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        */
        /*
        23)Ingresar por teclado números enteros, la carga finaliza cuando se ingresa
        un cero. Se pide calcular y mostrar el número de valor máximo y el mínimo
        (utilice do-while).
        */
        Scanner teclado = new Scanner(System.in);
        int acumulador =0;
        int variable=-1; 
        do 
        {
            System.out.println("Ingrese un numero: ");
            variable=teclado.nextInt(); 
            acumulador+=variable; 
        }while(variable!=0);
        

    }
    
}
