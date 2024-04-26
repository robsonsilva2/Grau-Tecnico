# check_guest.py
# Script para verificar se um nome está na lista de convidados e se o convidado é maior de idade.

def check_guest(name, guest_list):
    # Verifica se o nome fornecido está na lista de convidados e se o convidado é maior de idade.
    if name in guest_list:
        if guest_list[name] >= 18:
            print("Acesso permitido.")
        else:
            print("Você foi convidado, mas é menor de idade.")
    else:
        print("Acesso negado. Nome não encontrado na lista.")

def main():
    # Lista de convidados autorizados com suas respectivas idades
    guest_list = {"Alice": 25, "Bob": 17, "Charlie": 22, "Diana": 15, "vitor": 24, "amanda": 18, "robson": 16 }

    # Solicita ao usuário que digite um nome
    name = input("Digite o nome do convidado: ")

    # Chama a função de verificação
    check_guest(name, guest_list)

if __name__ == "__main__":
    main()
