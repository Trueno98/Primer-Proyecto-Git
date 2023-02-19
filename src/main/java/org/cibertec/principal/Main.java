package org.cibertec.principal;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.cibertec.model.Usuario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Sesion03");
		EntityManager manager = factory.createEntityManager();

		// Buscar un registro en una tabla de la bdatos
		Usuario user = manager.find(Usuario.class, 1);
		System.out.println(user.getNombre());

	}

}
