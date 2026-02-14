package umg;
import java.util.Arrays;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola tierra xd");
		
		int a = 6;
		int b = 7;
		
		int resultado = a*b;
		
		System.out.println("El resultado es: "+ resultado);
	//4.1	
		
		int[] numeros = new int[5]; 
		
// Aqui todos los elementos valen 0.
		numeros[0] = 10;  // se le asigna un valor en este dado caso es 10 en el numero uno es decir el indice 0 
        numeros[1] = 20; // y aqui igual en el indice 1 
        // los demas seguiran valiendo 0 
        System.out.println("Primer elemento del arreglo 'numeros': " + numeros[0]);
   
        
        //4.2
        
        
        // 1. RELLENAR CON ARRAYS.FILL
   
        int[] puntajes = new int[5]; // Se hacen 5 espacios vacíos 
      
        Arrays.fill(puntajes, 100); // le damos un valor a cada uno de 100
        
        // Lo imprimimos traduciéndolo a texto humano con Arrays.toString
        System.out.println("Después de fill: " + Arrays.toString(puntajes)); 
   


     
        // 2. ORDENAR CON ARRAYS.SORT
    
        int[] edades = {25, 12, 40, 5, 18}; // Pones un arreglo desorneado
        
    // se ordan los numeros del menor al mayor 
        Arrays.sort(edades); 
        
        System.out.println("Después de sort: " + Arrays.toString(edades)); 
 


               // 3. BUSCAR CON ARRAYS.BINARYSEARCH

        // Usaremos el arreglo 'edades' que YA ESTÁ ORDENADO del paso anterior.
        // asignamos que busque un numero en especifico 
        int posicion = Arrays.binarySearch(edades, 18);
        
        // Nos va a devolver la posición (índice) donde lo encontró. 
        // Las posiciones actuales son: [0]=5, [1]=12, [2]=18, [3]=25, [4]=40
        System.out.println("El número 18 está en la posición: " + posicion);
        // Lo que verás en pantalla: El número 18 está en la posición: 2


       
        // 4. CLONAR Y AMPLIAR CON ARRAYS.COPYOF
     
        int[] cajitaPequena = {1, 2, 3}; // Arreglo de tamaño 3
        
        // Hacemos una copia de 'cajitaPequena', pero le decimos que ahora queremos 5 espacios.
        // Los números originales se copian, y los espacios nuevos se rellenan con 0.
        int[] cajitaGrande = Arrays.copyOf(cajitaPequena, 5);
        
        System.out.println("Después de copyOf: " + Arrays.toString(cajitaGrande)); 
        // Lo que verás en pantalla: [1, 2, 3, 0, 0]


      
        // 5. COMPARAR CON ARRAYS.EQUALS
       
        int[] arregloA = {1, 2, 3};
        int[] arregloB = {1, 2, 3};
        int[] arregloC = {3, 2, 1}; // Mismos números, pero en otro orden
        
        // Preguntamos: ¿Son exactamente iguales?
        boolean igualAB = Arrays.equals(arregloA, arregloB); // Esto dirá que "Sí" (true)
        boolean igualAC = Arrays.equals(arregloA, arregloC); // Esto dirá que "No" (false) porque el orden importa
        
        System.out.println("¿A y B son iguales?: " + igualAB);
        System.out.println("¿A y C son iguales?: " + igualAC);
        
        
        
        
        //4.3
        
        
        
     // Creamos nuestro arreglo 
        String[] frutas = {"Manzana", "Banana", "Cereza", "Mango", "Uva"};
        
       
        // FORMA 1: Bucle 'for' tradicional
       

        
        // Explicación del for:
        // 1. int i = 0; -> Empezamos en la posición 0
        // 2. i < frutas.length; -> Mientras 'i' sea menor a la cantidad de frutas (5).
        // 3. i++ -> En cada vuelta, súmale 1 a 'i' para avanzar al siguiente casillero.
        for (int i = 0; i < frutas.length; i++) {
            // Aquí usamos frutas[i] para sacar la fruta de esa posición específica
            System.out.println("Posición " + i + ": " + frutas[i]);
        }


        // FORMA 2: Bucle 'for-each' 
    
        // Se lee así: "Por cada 'String' (que llamaremos 'frutaActual') dentro del arreglo 'frutas'..."
        for (String frutaActual : frutas) {
            // Ya no hay índices numéricos, directamente imprimimos la variable que sacamos
            System.out.println("Fruta: " + frutaActual);
        }


        // FORMA 3: Usando Streams (Arrays.stream)
    
      
        
        // Se lee así: "Convierte 'frutas' en un Stream y, por cada elemento (forEach), imprímelo"
        // La sintaxis 'System.out::println' es una forma moderna de decir "pásale este dato al System.out.println"
        Arrays.stream(frutas).forEach(System.out::println);
        
        
        // 4.4 Diferencias entre arreglos y ArrayList en Java
        
        
        // 1. TAMAÑO FIJO VS TAMAÑO DINÁMICO
        // Arreglo: Tiene TAMAÑO FIJO. Al crearlo debes decirle exactamente cuántos espacios necesitas. Una vez creado, no puede crecer ni encogerse.
        //- ArrayList: Tiene TAMAÑO DINÁMICO. Nace vacío y, al agregarle datos,  crece automáticamente por detrás. Si le sacas datos, se hace más pequeño.
        
        // 2. TIPOS PRIMITIVOS VS CLASES ENVOLVENTES
        //- Arreglo: Acepta tanto "tipos primitivos" puros (int, double, char, que son los más ligeros) como Objetos complejos.
        //- ArrayList: SOLO acepta Objetos. No puedes guardar un 'int' puro; debes usar su versión envolvente o "Wrapper", que es el objeto 'Integer'.
        
        // 3. MÉTODOS DISPONIBLES
        //- Arreglo: Es una estructura muy rústica. No tiene herramientas propias. Usas la propiedad .length para saber su tamaño y corchetes [] para meter o sacar datos en posiciones exactas manualmente. 
        // - ArrayList: Viene con herramientas listas. Tiene métodos directos como .add() para agregar al final, .remove() para borrar (y que el resto ser eacomode solo sin dejar huecos vacíos), y .size() para saber su tamaño.
        // 4. RENDIMIENTO
        // - Arreglo: Al ser tan básico y directo, es EXTREMADAMENTE RÁPIDO y consume muy poca memoria del sistema.
        // - ArrayList: Es un poco más lento y gasta más memoria porque hace mucho trabajo extra por ti (estirarse, encogerse, convertir primitivos), aunque en programas normales esta diferencia casi ni se nota.
        
        //5. ¿CUÁNDO USAR CADA UNO?
        //- Usa Arreglos cuando: Tienes la certeza de cuántos datos vas a manejar
        //- Usa ArrayList cuando: No tienes idea de cuántos datos vas a recibir
        
	}

}
