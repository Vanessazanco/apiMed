package br.com.med.vol.api.repository;

import br.com.med.vol.api.domain.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario , Long> {

    UserDetails findByLogin(String login);
}
