package br.com.projetoecommerce.repository;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetoecommerce.model.Login;


public interface LoginRepository extends JpaRepository<Login, Long> {

	Optional<Login> findByEmail(String username);

}
