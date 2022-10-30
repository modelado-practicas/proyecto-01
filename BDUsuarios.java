import java.util.ArrayList;
import java.util.Arrays;



public class BDUsuarios {
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	public BDUsuarios() {
		Usuario usuario1 = new Usuario("dinodolph", "K&835Tc", "JAIME DELFIN", "+525545784213",
				"RIO DE LOS REMEDIOS 14", "8326552656294363", new Mexico());
		Usuario usuario2 = new Usuario("juanoso", "6wzW945", "JUAN OSORIO", "+34915118827", 
				"RONDA CORTEZ 12","9398752274589722" , new Espana());
		Usuario usuario3 = new Usuario("desEwan", "d292Z$4", "EWAN RHODES", "+19133263023",
				"529 DIETRICH LOCK", "8326552656294363", new EstadosUnidos());
		
		usuarios.add(usuario1);	
		usuarios.add(usuario2);
		usuarios.add(usuario3);	
	}
	
	public Usuario BuscaPerfil(String idUsuario, String password) {
	    Usuario resultado = null;
	    for (Usuario perfil : usuarios) {
	        if (perfil.getIdUsuario().equals(idUsuario)
	            && perfil.getPassword().equals(password)) {
	            resultado = perfil;
	            break;
	        }
	    }
	    return resultado;
	}
	
    

}
