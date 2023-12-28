package br.com.footed.CentroEsportivo.repository;

import br.com.footed.CentroEsportivo.model.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    UserDetails findByCpf (String cpf);
    Usuario findByUsuarioId(Integer usuarioId);

}

