package com.crud1interativo;

import java.util.HashMap;
import java.util.Scanner;

public class ClientService {

	static Scanner input = new Scanner(System.in);
	static HashMap<Integer, Client> clientes = new HashMap<>();

	static public void novoCliente(String nome, String email, int id){
		Client client = new Client(nome, email, id);
		clientes.put(client.getId(), client);
	}
	
	static public Client buscarCliente(int index){
		if(clientes.containsKey(index)) {
			Client c = clientes.get(index);
			System.out.println(c);
			return c;
		} else {
			System.out.println("Cliente não existe");
			return null;
		}
	}
	
	static public void atualizarCliente(String nome, String email, int id) {
		if(clientes.containsKey(id)) {
			Client client = new Client(nome, email, id);
			clientes.put(client.getId(), client);
			System.out.println("Cliente atualizado para: "+clientes.get(id));
		} else {
			System.out.println("Cliente não existe");
		}
	}
	
	static public void deletarCliente(int index) {
		if(clientes.containsKey(index)) {
			clientes.remove(index);
			System.out.println("Cliente deletado.");
		} else {
			System.out.println("Cliente não existe");
		}
	}
	
	

	public static void main(String[] args) {
		
		ClientService.novoCliente("Alice Souza", "alice.souza@example.com", 0);
		ClientService.novoCliente("Bruno Silva", "bruno.silva@example.com", 1);
		ClientService.novoCliente("Alex Ritter", "alex.ritter@example.com", 2);
		ClientService.novoCliente("Jaque Barreto", "jaquebarreto@example.com", 3);
		ClientService.novoCliente("Aline", "aline.silva@example.com", 4);
		ClientService.novoCliente("Lucas Souza", "lucas.souza@example.com", 5);
		ClientService.novoCliente("Mirian Silva", "mirian.ssilva@example.com", 6);
		ClientService.novoCliente("Aasdas", "arrrrr@example.com", 7);
		
		String nome, email;
		int id;
		
		var flag=true;
		while(flag) {
			System.out.print("\n=====BEM VINDO AO HASHMAP CLIENTES====="+
					"\n[1] Adicionar novo cliente;"+
					"\n[2] Deletar cliente;"+
					"\n[3] Buscar cliente;"+
					"\n[4] Mostrar todos os clientes;"+
					"\n[5] Atualizar cliente;"+
					"\n[0] Sair."+
					"\nDIGITE A OPÇÃO DESEJADA: ");
			
			int opc = input.nextInt();
			
			if (opc==1) {
				System.out.println("\n--------ADICIONAR NOVO CLIENTE--------- ");
				System.out.print("NOME cliente: ");
				nome = input.next();

				System.out.print("EMAIL cliente: ");
				email = input.next();

				System.out.print("ID cliente: ");
				id = input.nextInt();
				
				ClientService.novoCliente(nome, email, id);
				
			} else if (opc==2) {
				System.out.println("\n--------DELETAR CLIENTE--------- ");
				System.out.print("ID cliente: ");
				id = input.nextInt();
				ClientService.deletarCliente(id);
				
			} else if (opc==3) {
				System.out.println("\n--------BUSCAR CLIENTE--------- ");
				System.out.print("ID cliente: ");
				id = input.nextInt();
				ClientService.buscarCliente(id);
				
			} else if (opc==4) {
				System.out.println(clientes);
				
			} else if (opc==5) {
				System.out.println("\n--------ATUALIZAR CLIENTE--------- ");
				System.out.print("NOME cliente: ");
				nome = input.next();

				System.out.print("EMAIL cliente: ");
				email = input.next();

				System.out.print("ID cliente: ");
				id = input.nextInt();
				
				ClientService.atualizarCliente(nome, email, id);
			} else {
				System.out.print("PROGRAMA ENCERRADO");
				break;
			}
		}		
	}
}






