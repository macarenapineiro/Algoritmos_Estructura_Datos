package uy.ucu.ut1;

public class Carrera {

	
	private int alumnos;
	private String nombre;
 
	public Carrera() {
	}
	public int getAlumnos() {
		return alumnos;
	}


	public void setAlumnos(int alumnos) {
		this.alumnos = alumnos;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String caracteristicas() {
		return "La carrera " + nombre + " tiene " + alumnos + " alumnos";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Carrera carrera1 = new Carrera();
		carrera1.setNombre("Desarrollador de Software");
		carrera1.setAlumnos(15);
		
		Carrera carrera2 = new Carrera();
		carrera2.setNombre("Contador");
		carrera2.setAlumnos(10);
		
		System.out.println(carrera1.alumnos + carrera2.alumnos);
		System.out.println(carrera1.caracteristicas());
		System.out.println(carrera2.caracteristicas());
		
		if (carrera1.alumnos > carrera2.alumnos) {
			System.out.println("La carrera con mayor cantidad de alumnos es " + carrera1.nombre);
		}
		else {
			System.out.println("La carrera con mayor cantidad de alumnos es " + carrera2.nombre);
		}
		
		
		
	}

}
