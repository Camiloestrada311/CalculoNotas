package Operaciones;


public class Persona {

private static  String nombre;
private static double nota1;
private static double nota2;
private static double nota3;
private String documento;

private static double promedio;

public static String getNombre() {
return nombre;
}


public void setNombre(String nombre) {
Persona.nombre = nombre;
}

public static double getNota1() {
return nota1;
}

public void setNota1(double nota1) {
this.nota1 = nota1;
}

public static double getNota2() {
return nota2;
}

public void setNota2(double nota2) {
this.nota2 = nota2;
}

public static double getNota3() {
return nota3;
}

public void setNota3(double nota3) {
this.nota3 = nota3;
}

public static double getPromedio() {
return promedio;
}

public void setPromedio(double promedio) {
this.promedio = promedio;
}


public String getDocumento() {
	return documento;
}


public void setDocumento(String documento) {
	this.documento = documento;
}





}