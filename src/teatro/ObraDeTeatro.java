package teatro;

import java.awt.AWTException;
import java.awt.Robot;

public class ObraDeTeatro {

	Personaje personaje;
	private String nombreObra;
	Festival_de_Teatro festival;

	public ObraDeTeatro() { }
        
        public ObraDeTeatro(String nombre, String dialogo){
            this.nombreObra= nombre;
        }

	public String getNombreObra() {
		return this.nombreObra;
	}

	/**
	 * 
	 * @param nombreObra
	 */
	public void setNombreObra(String nombreObra) {
		this.nombreObra = nombreObra;
	}

        public Personaje getPersonaje() {
            return this.personaje;
        }

        public void setPersonaje(Personaje personaje) {
            this.personaje = personaje;
        }
        
  public void empezoLaFuncion(String monologo) throws AWTException{
           //Use la clase Robot para usar el metodo delay par hacer pausa en el dialogo
                Robot robot = new Robot();
                System.out.println();
                System.out.println("Nombre de la obra: "+getNombreObra());
                 System.out.println();        
                System.out.println("Se inicia el Monologo");
                robot.delay(3000);
                System.out.println("habla: "+personaje.getNombrePersonaje());
                getPersonaje().setDialogo(monologo);
                robot.delay(3000);
                System.out.println(getPersonaje().getDialogo());
                robot.delay(3000);
                System.out.println("Fin de la Escena");
                robot.delay(3000);
                
        
    }


    @Override
    public String toString() {
        return "Obra de Teatro: "+ nombreObra + "\t Actor: "+ personaje.getNombrePersonaje();
    }
        

}