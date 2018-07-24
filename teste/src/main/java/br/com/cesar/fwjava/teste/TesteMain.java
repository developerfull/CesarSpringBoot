
package br.com.cesar.fwjava.teste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TesteMain implements CommandLineRunner {
	@Autowired
	Componente1 component1;
	public void run(String...arg0) {
		component1.teste();
	}
}
