package br.com.herbertrausch.spring.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository  extends MongoRepository<Carro, String> {

	@Query("{'usuario' :{'$ref' : 'usuario' , '$id' : ?0}}")
	Carro findByUsuario(String idUsuario);

	Carro findByPlacaLike(String placa);

}
