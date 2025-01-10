package com.crud1interativo;

public class Client {
	private String nome;
	private int id;
	private String email;

	public Client(String nome, String email, int id){
		this.nome = nome;
		this.email = email;
		this.id = id;
	}
	
	public int getId(){
		return this.id;
	}

	public String getNome(){
		return this.nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getEmail(){
		return this.email;
	}

	public void setEmail(String email){
		this.email = email;
	}

	@Override
	public String toString() {
		return "\nObj-Client [nome: " + nome + ", email: " + email + ", id: " + id + "]";
	}


}