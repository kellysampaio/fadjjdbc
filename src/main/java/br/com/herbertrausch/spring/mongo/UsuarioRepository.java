package br.com.herbertrausch.spring.mongo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository  extends MongoRepository<Usuario, String> {

	/*@Query("{'enderecos' :{'$ref' : 'endereco' , '$id' : ?0}}")
	List<Caroneiro> findByEndereco(String enderecoId);*/

	@Query("{'nome' :{'$nome' : ?0}}")
	List<Usuario> findByNome(String nome);
}
