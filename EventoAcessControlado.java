// CheckGuest.java
// Script para verificar se um nome está na lista de convidados e se o convidado é maior de idade.

import java.util.*;

public class CheckGuest {
    public static void main(String[] args) {
        // Lista de convidados autorizados com suas respectivas idades
        Map<String, Integer> guestList = new HashMap<>();
        guestList.put("Alice", 25);
        guestList.put("Bob", 17);
        guestList.put("Charlie", 22);
        guestList.put("Diana", 15);

        // Cria um scanner para ler entradas do teclado
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o nome do convidado
        System.out.print("Digite o nome do convidado: ");
        String name = scanner.nextLine();

        // Verifica se o nome está na lista de convidados
        if (guestList.containsKey(name)) {
            // Obtém a idade do convidado da lista
            int age = guestList.get(name);
            // Verifica se o convidado é maior de idade
            if (age >= 18) {
                System.out.println("Acesso permitido.");
            } else {
                System.out.println("Você foi convidado, mas é menor de idade.");
            }
        } else {
            System.out.println("Acesso negado. Nome não encontrado na lista.");
        }

        // Fecha o scanner
        scanner.close();
    }
}
