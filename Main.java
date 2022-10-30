import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("User/Usuario: ");
		String idUsuario = sc.nextLine();
		System.out.println("Password/contrasena: ");
		String contraseña = sc.nextLine();
		
		PaginaPais pagina;
		BDUsuarios perfiles = new BDUsuarios();
		Usuario user;
		user = perfiles.BuscaPerfil(idUsuario, contraseña);
		if (user == null) {
			System.out.println("Your user or password are incorrect, "
					+ "please try again");
			System.out.println("Tu usuario o contrasena son incorrectos, "
					+ "por favor intente de nuevo.");
		}else {
			pagina = new PaginaPais(user);
		}
	}

}
