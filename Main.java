import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		do {
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
				int opcion;
				System.out.println(pagina.Saludar());
				pagina.mostrarOferta();
				do{
					System.out.println(pagina.opcionesMenu());
					while (true){
						try {
							String opcionUsuario = sc.nextLine();
							opcion = Integer.parseInt(opcionUsuario);
							break;
						}catch (NumberFormatException ex){
							System.out.println(pagina.opcionesMenu());
						}
					}
					
					switch(opcion){
						case 1:
							pagina.catalogo();
							break;
						
						case 2:
							pagina.comprar();
							do {
								pagina.catalogo();
								while (true){
									try {
										String opcionUsuario = sc.nextLine();
										opcion = Integer.parseInt(opcionUsuario);
										break;
									}catch (NumberFormatException ex){
										System.out.println(pagina.opcionesMenu());
									}
								}
								switch(opcion){
								case 1:
									pagina.comprar();
									break;
								case 2:
									pagina.pagar();
									if(pagina.getEstadoActual().equals(pagina.getModoPagar())) {
										pagina.pagar();
										opcion = 0;
									}
									break;
								case 0:
									pagina.salir();
									break;
								default:
									break;
								}
								
							}while(opcion!=0);
							break;
						
						case 0:
							pagina.salir();
							break;
						
						default:
							break;
					
					}
				}while(opcion!=0);
			}
			
		}while(true);
	}

}
