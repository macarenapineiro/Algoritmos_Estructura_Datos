package uy.ucu.tp1;


public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carrera carrera = new Carrera();
		carrera.setNombre("Licenciatura en informática");
		carrera.setAlumnos(10);
		
		Alumno alumno = new Alumno();
		alumno.setNombre("Macarena");
		alumno.setApellido("Piñeiro");
		alumno.setCedula(56123456);
		alumno.setTelefono("099123456");
		alumno.setCarrera(carrera);  

	}
}
