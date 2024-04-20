/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Natalia
 */
package Banco;

import java.util.*;

public class PruebaCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		String nombre= new String();
		
		Cuenta miCuenta = new Cuenta();
		
		Cuenta tuCuenta= new Cuenta();
		
		System.out.println("El nombre de la cuenta es: "+miCuenta.obtenerNombre());
		
		
		
		System.out.println("Hola ingresa el nombre de la cuenta: ");
		nombre=leer.nextLine();
		
		miCuenta.establecerNombre(nombre);
		
		System.out.println("El nombre de mi cuenta es: "+miCuenta.obtenerNombre());
		
		System.out.println("El nombre de tu cuenta es: "+tuCuenta.obtenerNombre());
		

	}

}
