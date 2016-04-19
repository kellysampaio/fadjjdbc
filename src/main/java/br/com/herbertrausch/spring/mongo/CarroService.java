package br.com.herbertrausch.spring.mongo;

import java.util.List;

import org.springframework.context.ApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class CarroService {

	private CarroRepository db;
	
	public CarroService(){
		ApplicationContext context =SpringUtil.getContext();
		db =  context.getBean(CarroRepository.class);
	}
	
	public void insert(Carro c){
		db.save(c);
	}
	
	public List<Carro> getAll(){
		return db.findAll();
	}
	
	public Carro getByUsuarioId(String id) {
		return db.findByUsuario(id);
	}

	public Carro getByPlaca(String placa) {
		return db.findByPlacaLike(placa);
	}

}

