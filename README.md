## Definiciones propias:

# CLASE:
Es la porción de código que funciona como un molde que contiene los atributos y los métodos que se usarán para los objetos que se creen en el proyecto. En este proyecto se usó una clase llamada "Auto" y es una clase publica: "public class Auto"

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
En esta práctica no usamos private, ya que esto nos permite usar los atributos y los metodos con varios objetos y no con uno solo. A futuro se puede usar private si solamente necesitamos aplicar atributos y metodos a una sola clase, es decir cuando es algo muy específico y que no requiere repetirse dentro del proyecto.