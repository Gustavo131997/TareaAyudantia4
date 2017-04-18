package teatro;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.Robot;

public class Festival_de_Teatro {

	ArrayList<ObraDeTeatro> obras;
	private String nombre;
	private int numeroDeObras;

        
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroDeObras() {
		return this.numeroDeObras;
	}

	/**
	 * 
	 * @param numeroDeObras
	 */
	public void setNumeroDeObras(int numeroDeObras) {
		this.numeroDeObras = numeroDeObras;
	}

        public ArrayList<ObraDeTeatro> getObras() {
            return obras;
        }

        public void setObras(ArrayList<ObraDeTeatro> obras) {
            this.obras = obras;
        }
        
        
        public void añadirObra(int i, ObraDeTeatro obra){
            this.obras.add(i, obra);
        }
        
        public ObraDeTeatro getObra(int i){
            return this.getObras().get(i);
        }
        public void empezoFestival() throws AWTException {
            this.setNombre("Festival de Teatro Temuco 2017");
            System.out.println(this.getNombre());
            this.setNumeroDeObras(5);
            System.out.println("Numero de obra: "+this.getNumeroDeObras());
            setObras(new ArrayList<>());
            for (int i = 0; i < this.numeroDeObras; i++) {
                ObraDeTeatro obra = new ObraDeTeatro();
                this.añadirObra(i, obra);
            }
            this.AsignarPersonajeyNombreObra();
            MostrarCartelera();
            getObra(0).empezoLaFuncion("Yo soy Laura una pequeña niña criada en Walnut Grove es un muy pequeño pueblo pero de una gran calidad personas "
                    + "sin duda nuna me cambiaria\n de este pueblo (por lo menos eso lo que creo) aqui esta la gente que mas quiero, mis padres, mis amigos. Amo Walnut Grove");
            getObra(1).empezoLaFuncion("Yo soy Bandido un perro muy afortunado de tener gente que me ama todo el tiempo y me cuida "
                    + "\n sin importar la circunstancia. Yo amo mucho a mi ama preferida Laura aunque en un principio no me queria por "
                    + "\n el triste recuerdo de su otro perro que se le murio, al cual amada mucho.");
            getObra(2).empezoLaFuncion("Yo soy Willy Olsson soy hijo Nels Olsson y Harriet Olsson, me hacer muchas maldades, hago  "
                    + "\n siempre hago rabiar a mi profesora y por cual siempre me mandan siempre al rincor de la sala");
            //Estos dos ultimos los copie del primero porque me dio flojera cambiarlo asjd.
            getObra(3).empezoLaFuncion("Yo soy Nellie Olsson una niña muy mala criada en Walnut Grove es un muy pequeño pueblo pero de una gran calidad personas "
                    + "sin duda nuna me cambiaria de este pueblo (por lo menos eso lo que creo) aqui la gente que mas quiero, mis padres, mis amigos. Amo Walnut Grove");
            getObra(4).empezoLaFuncion("Yo soy la Sra Harriet soy la señora de Nels Olsson en Walnut Grove es un muy pequeño pueblo pero de una gran calidad personas "
                    + "sin duda nuna me cambiaria de este pueblo (por lo menos eso lo que creo) aqui la gente que mas quiero, mis padres, mis amigos. Amo Walnut Grove");
            System.out.println("Termino del Festival");
        }
        public void AsignarPersonajeyNombreObra(){
            getObra(0).personaje = Personaje.PROTAGONISTA;
            getObra(0).setNombreObra("La pequeña Laura");
            getObra(1).personaje = Personaje.SECUNDARIO;
            getObra(1).setNombreObra("El perro pensante");
            getObra(2).personaje = Personaje.SECUNDARIO2;
            getObra(2).setNombreObra("El niño molestoso");
            getObra(3).personaje = Personaje.SECUNDARIO3;
            getObra(3).setNombreObra("La mala niña Olsson");
            getObra(4).personaje = Personaje.ANTAGONISTA;
            getObra(4).setNombreObra("La mama protectora");
        }
        public void MostrarCartelera(){
            obras.forEach((obra) -> {
                System.out.println(obra.toString());
            });
        }

}