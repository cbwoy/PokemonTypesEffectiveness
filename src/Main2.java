
//2. Efectividad de tipos. Pide el tipo del atacante y el del defensor (1 = fuego, 2 = agua, 3 = planta).
//Muestra "súper eficaz" si el atacante gana al defensor (fuego a planta, agua a fuego, planta a agua), 
//"poco eficaz" si pierde y "daño normal" en el resto de casos.
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hola entrenador!!!\nHoy vamos a aprender la efectividad de tipos");

		System.out.println("Voy a mostrarte los tipos pokemon:\n");

		String pokemonType[] = { "Fuego", "Planta", "Agua", "Eléctrico", "Tierra", "Roca", "Psíquico", "Fantasma",
				"Lucha", "Dragón", "Normal", "Volador", "Bicho", "Veneno", "Siniestro", "Acero", "Hada", "Hielo" };
		String effectiveness[] = { "Super eficaz", "Daño normal", "Poco eficaz", "No afecta" };
		int effectivenessPosition = 0;

		for (int i = 0; i < pokemonType.length; i++) {
			System.out.print(i + 1 + "." + pokemonType[i]);
			if (i == pokemonType.length / 2 || i == pokemonType.length - 1) {
				System.out.println();
			} else {
				System.out.print("||");
			}
		}
		String attacker = null;

		String defender = null;
		int aux = 0;
		boolean attackIsOk = false;
		boolean defendIsOk = false;

		System.out.println("\nAhora toca la parte divertida. Aprenderse la tabla de tipos.\n"
				+ "Como soy un profesor Pokemon enrollado, voy a echarte una mano.");
		while (!attackIsOk) {
			System.out.println("Elige el tipo atacante[1-"+ pokemonType.length+"]");
			aux = sc.nextInt();
			if (aux >= 1 && aux <= pokemonType.length) {
				attacker = pokemonType[aux - 1];
				attackIsOk = true;

			} else {
				System.out.println("Tipo no encontrado utiliza una opción correcta");
			}
		}
		while (!defendIsOk) {
			System.out.println("\nAhora decide el tipo defensor[1-18]");
			aux = sc.nextInt();
			if (aux >= 1 && aux <= pokemonType.length) {

				defender = pokemonType[aux - 1];
				defendIsOk = true;
			} else {
				System.out.println("Tipo no encontrado utiliza una opción correcta");
			}
		}
		System.out.println(
				"Las elecciones son las siguientes:\nAtaque[ " + attacker + " ]" + "\nDefensa[ " + defender + " ]");
		if (attacker.equals("Acero")) {
			if (defender.equals("Hielo") || defender.equals("Roca") || defender.equals("Hada")) {
				effectivenessPosition = 0;
			} else if (defender.equals("Acero") || defender.equals("Agua") || defender.equals("Eléctrico")
					|| defender.equals("Fuego")) {
				effectivenessPosition = 2;
			} else {
				effectivenessPosition = 1;
			}
		} else if (attacker.equals("Agua")) {
			if (defender.equals("Fuego") || defender.equals("Tierra") || defender.equals("Roca")) {
				effectivenessPosition = 0;
			} else if (defender.equals("Agua") || defender.equals("Dragón") || defender.equals("Planta")) {
				effectivenessPosition = 2;
			} else {
				effectivenessPosition = 1;
			}
		} else if (attacker.equals("Bicho")) {
			if (defender.equals("Planta") || defender.equals("Psíquico") || defender.equals("Siniestro")) {
				effectivenessPosition = 0;
			} else if (defender.equals("Acero") || defender.equals("Fuego") || defender.equals("Fantasma")
					|| defender.equals("Lucha") || defender.equals("Veneno") || defender.equals("Volador")
					|| defender.equals("Hada")) {
				effectivenessPosition = 2;
			} else {
				effectivenessPosition = 1;
			}
		} else if (attacker.equals("Dragón")) {
			if (defender.equals("Dragón")) {
				effectivenessPosition = 0;
			} else if (defender.equals("Acero")) {
				effectivenessPosition = 2;
			} else if (defender.equals("Hada")) {
				effectivenessPosition = 3;
			} else {
				effectivenessPosition = 1;
			}
		} else if (attacker.equals("Eléctrico")) {
			if (defender.equals("Agua") || defender.equals("Volador")) {
				effectivenessPosition = 0;
			} else if (defender.equals("Dragón") || defender.equals("Eléctrico") || defender.equals("Planta")) {
				effectivenessPosition = 2;
			} else if (defender.equals("Tierra")) {
				effectivenessPosition = 3;
			} else {
				effectivenessPosition = 1;
			}
		} else if (attacker.equals("Fantasma")) {
			if (defender.equals("Psíquico") || defender.equals("Fantasma")) {
				effectivenessPosition = 0;
			} else if (defender.equals("Siniestro")) {
				effectivenessPosition = 2;
			} else if (defender.equals("Normal")) {
				effectivenessPosition = 3;
			} else {
				effectivenessPosition = 1;
			}
		} else if (attacker.equals("Fuego")) {
			if (defender.equals("Planta") || defender.equals("Hielo") || defender.equals("Bicho")
					|| defender.equals("Acero")) {
				effectivenessPosition = 0;
			} else if (defender.equals("Agua") || defender.equals("Dragón") || defender.equals("Fuego")
					|| defender.equals("Roca")) {
				effectivenessPosition = 2;
			} else {
				effectivenessPosition = 1;
			}
		} else if (attacker.equals("Hada")) {
			if (defender.equals("Lucha") || defender.equals("Dragón") || defender.equals("Siniestro")) {
				effectivenessPosition = 0;
			} else if (defender.equals("Acero") || defender.equals("Fuego") || defender.equals("Veneno")) {
				effectivenessPosition = 2;
			} else {
				effectivenessPosition = 1;
			}
		} else if (attacker.equals("Hielo")) {
			if (defender.equals("Planta") || defender.equals("Tierra") || defender.equals("Volador")
					|| defender.equals("Dragón")) {
				effectivenessPosition = 0;
			} else if (defender.equals("Acero") || defender.equals("Agua") || defender.equals("Fuego")
					|| defender.equals("Hielo")) {
				effectivenessPosition = 2;
			} else {
				effectivenessPosition = 1;
			}
		} else if (attacker.equals("Lucha")) {
			if (defender.equals("Normal") || defender.equals("Hielo") || defender.equals("Roca")
					|| defender.equals("Siniestro") || defender.equals("Acero")) {
				effectivenessPosition = 0;
			} else if (defender.equals("Bicho") || defender.equals("Psíquico") || defender.equals("Veneno")
					|| defender.equals("Volador") || defender.equals("Hada")) {
				effectivenessPosition = 2;
			} else if (defender.equals("Fantasma")) {
				effectivenessPosition = 3;
			} else {
				effectivenessPosition = 1;
			}
		} else if (attacker.equals("Normal")) {
			if (defender.equals("Acero") || defender.equals("Roca")) {
				effectivenessPosition = 2;
			} else if (defender.equals("Fantasma")) {
				effectivenessPosition = 3;
			} else {
				effectivenessPosition = 1;
			}
		} else if (attacker.equals("Planta")) {
			if (defender.equals("Agua") || defender.equals("Tierra") || defender.equals("Roca")) {
				effectivenessPosition = 0;
			} else if (defender.equals("Acero") || defender.equals("Bicho") || defender.equals("Dragón")
					|| defender.equals("Fuego") || defender.equals("Planta") || defender.equals("Veneno")
					|| defender.equals("Volador")) {
				effectivenessPosition = 2;
			} else {
				effectivenessPosition = 1;
			}
		} else if (attacker.equals("Psíquico")) {
			if (defender.equals("Lucha") || defender.equals("Veneno")) {
				effectivenessPosition = 0;
			} else if (defender.equals("Acero") || defender.equals("Psíquico")) {
				effectivenessPosition = 2;
			} else if (defender.equals("Siniestro")) {
				effectivenessPosition = 3;
			} else {
				effectivenessPosition = 1;
			}
		} else if (attacker.equals("Roca")) {
			if (defender.equals("Fuego") || defender.equals("Hielo") || defender.equals("Volador")
					|| defender.equals("Bicho")) {
				effectivenessPosition = 0;
			} else if (defender.equals("Acero") || defender.equals("Lucha") || defender.equals("Tierra")) {
				effectivenessPosition = 2;
			} else {
				effectivenessPosition = 1;
			}
		} else if (attacker.equals("Siniestro")) {
			if (defender.equals("Psíquico") || defender.equals("Fantasma")) {
				effectivenessPosition = 0;
			} else if (defender.equals("Lucha") || defender.equals("Siniestro") || defender.equals("Hada")) {
				effectivenessPosition = 2;
			} else {
				effectivenessPosition = 1;
			}
		} else if (attacker.equals("Tierra")) {
			if (defender.equals("Fuego") || defender.equals("Eléctrico") || defender.equals("Veneno")
					|| defender.equals("Roca") || defender.equals("Acero")) {
				effectivenessPosition = 0;
			} else if (defender.equals("Bicho") || defender.equals("Planta")) {
				effectivenessPosition = 2;
			} else if (defender.equals("Volador")) {
				effectivenessPosition = 3;
			} else {
				effectivenessPosition = 1;
			}
		} else if (attacker.equals("Veneno")) {
			if (defender.equals("Planta") || defender.equals("Hada")) {
				effectivenessPosition = 0;
			} else if (defender.equals("Veneno") || defender.equals("Tierra") || defender.equals("Roca")
					|| defender.equals("Fantasma")) {
				effectivenessPosition = 2;
			} else if (defender.equals("Acero")) {
				effectivenessPosition = 3;
			} else {
				effectivenessPosition = 1;
			}
		} else if (attacker.equals("Volador")) {
			if (defender.equals("Planta") || defender.equals("Lucha") || defender.equals("Bicho")) {
				effectivenessPosition = 0;
			} else if (defender.equals("Acero") || defender.equals("Eléctrico") || defender.equals("Roca")) {
				effectivenessPosition = 2;
			} else {
				effectivenessPosition = 1;
			}
		} else {
			effectivenessPosition = 1;
		}

		System.out.println("Con tu combinación el resultado de daño es [" + effectiveness[effectivenessPosition] + "]");
		System.out.println("Nos vemos en el siguiente cápitulo de la guía del profesor Borja.");
		sc.close();

	}

}
