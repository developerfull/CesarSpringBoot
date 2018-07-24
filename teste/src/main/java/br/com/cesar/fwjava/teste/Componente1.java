package br.com.cesar.fwjava.teste;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

@Component
@Transactional
public class Componente1 {
	
	@PersistenceContext
	EntityManager em;
	
	public void teste() {
		Entidade1 e1 = new Entidade1();
		e1.setCampo("Teste");
		em.persist(e1);
		System.out.println(em.createQuery("Select e1 from  Entidade1 e1").getResultList());
	}
	
}
