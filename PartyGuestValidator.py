# check_guest.py
# Script para verificar se um nome está na lista de convidados.

def check_guest(name, guest_list):
    # Verifica se o nome fornecido está na lista de convidados.
    if name in guest_list:
        print("Acesso permitido.")
    else:
        print("Acesso negado.")

def main():
    # Lista de convidados autorizados
    guest_list = ["Alice", "Bob", "Charlie", "Diana"]

    # Solicita ao usuário que digite um nome
    name = input("Digite o nome do convidado: ")

    # Chama a função de verificação
    check_guest(name, guest_list)

if __name__ == "__main__":
    main()
