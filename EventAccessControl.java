// CheckGuest.java
// Script para verificar se um nome está na lista de convidados.

import java.util.*;

public class CheckGuest {
    public static void main(String[] args) {
        // Lista de convidados autorizados
        List<String> guestList = Arrays.asList("Alice", "Bob", "Charlie", "Diana");

        // Cria um scanner para ler o nome do teclado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do convidado: ");
        String name = scanner.nextLine();

        // Verifica se o nome está na lista de convidados
        if (guestList.contains(name)) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
