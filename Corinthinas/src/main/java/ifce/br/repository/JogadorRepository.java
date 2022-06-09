package ifce.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ifce.br.model.JogadorModel;

@Repository
public interface JogadorRepository  extends JpaRepository<JogadorModel,Integer>{

}
