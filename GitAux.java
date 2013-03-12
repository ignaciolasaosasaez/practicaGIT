/*
 * To change this template, choose Tools | Templates
 * Línea añadida
 */
package prgitejemplo;

/**
 *
 * @author Ignacio Lasaosa Saez
 */
public class GitAux {
    
    public void metodoAlumno1(){
        System.out.println("metodo 1");
	System.out.println("modificado por alum 1"); // insertado por alum1
    }
    
    public void metodoAlumno2(){
        System.out.println("metodo 2");
	System.out.println("modificado por alum 2"); // insertado por alum2
    }
    
    public void metodoComunitario(){
        System.out.println("Aqui escribimos todos");
	// modificacaciones alumno 1
	System.out.println("Alumno 1 inserta esta sentencia");
    }

    public void testGitAux(){
	// metodo rama testing
	System.out.println("Metodo de testing");
	}
}
