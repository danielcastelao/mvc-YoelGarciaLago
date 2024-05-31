<h1>Readme examen </h1>
<h3>Primera parte</h3>
<ul>Hacemos que la clase Model sea un singleton. Para ello tienes que hacer:</ul>
1.  Que la única instancia de la clase esté privada y que esté en la propia clase. 
<br>2.  También necesitarás crear un constructor privado (para evitar instanciación) 
<br>3.  Un método para que la instancia que creas en la propia clase no sea nula.
<h3>Segunda parte</h3>
<ul>Para crear la funcionalidad que se nos pide hay que modificar el MVC</ul>
View:  Creamos dos método, uno para que muestre todos los datos del coche, pero, si la matricula no está registrada en nuestro programa, saltará el 2do método, el que te muestra que el coche es nulo
<br>Model: Creamos un método para que devuelva una lista de String's con los datos del coche (para la velocidad usas String.valueOf())
<br>Controller: Creamos un método para que recoga los datos que envia el model y se los pasa a la view
