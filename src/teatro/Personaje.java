package teatro;

public enum Personaje {
	PROTAGONISTA("Protagonista", "Laura"),
	ANTAGONISTA("Antagonista", "Sra. Jarriet"),
	SECUNDARIO("Secundario","Bandido"),
	SECUNDARIO2("Secundario","Willy"),
	SECUNDARIO3("Secundario","Nellie");

	ObraDeTeatro obra;
	private String rol;
	private String nombrePersonaje;
        private String dialogo;

	/**
	 * 
	 * @param tipo
	 */
	Personaje(String rol, String nombrePersonaje) {
         this.rol = rol;
         this.nombrePersonaje = nombrePersonaje;
	}
        Personaje(){
            
        }

	public String getNombrePersonaje() {
		return this.nombrePersonaje;
	}

	/**
	 * 
	 * @param nombrePersonaje
	 */
	public void setNombrePersonaje(String nombrePersonaje) {
		this.nombrePersonaje = nombrePersonaje;
	}

    public ObraDeTeatro getObra() {
        return obra;
    }

    public void setObra(ObraDeTeatro obra) {
        this.obra = obra;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getDialogo() {
        return dialogo;
    }

    public void setDialogo(String dialogo) {
        this.dialogo = dialogo;
    }
    // Hice este metodo para que se vea reflejado la relación de Asociacion
    public void nombreObra(String nombre){
        this.obra = new ObraDeTeatro();
        this.obra.setNombreObra(nombre);
    }

}