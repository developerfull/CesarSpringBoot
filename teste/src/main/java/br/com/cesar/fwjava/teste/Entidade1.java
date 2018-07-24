package br.com.cesar.fwjava.teste;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Entidade1 {

	@Id
	@GeneratedValue

	private long id;
	private String campo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	@Override
	public String toString() {
		return "Entidade1 [id=" + id + ", campo=" + campo + "]";
	}

}
