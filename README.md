## Definiciones propias:

# CLASE:
Es la estructura que funciona como un molde que define cómo´serán los objetos.

# OBJETO:
Es la porción de código a la cual se le asignan los atributos y los métodos creados dentro de la clase.

# ATRIBUTO:
Es lo que define las características de un objeto, tal como su apariencia física o sus especificaciones.

# METODO:
El método es la función que realiza un objeto o incluso el mismo código, por ejemplo en este proyecto se usaron metodos para acelerar, frenar y apagar, pero también se usó un método para mostrar la información de cada objeto:
public void acelerar
public void frenar
public void apagar
public void mostrarInformacion

# GUIA DE COMANDOS:
Para compilar des la terminal: mvn clean compile
Para ejecutar desde la terminal: mvn exec:java -Dexec.mainClass="com.actividad.Main"

# REFLEXIÓN:
En esta práctica no usamos private, porque el objetivo era acceder directamente a los atributos desde el método main. Considero que el modificador private lo podemos emepezar a implementar una vez tengamos mas claros otros conceptos de Java.