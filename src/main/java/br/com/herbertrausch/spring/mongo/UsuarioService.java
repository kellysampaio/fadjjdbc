package br.com.herbertrausch.spring.mongo;

import java.util.List;

import org.springframework.context.ApplicationContext;

import br.com.herbertrausch.util.SpringUtil;

public class UsuarioService {

	private UsuarioRepository db;
	
	public UsuarioService(){
	
		ApplicationContext context =SpringUtil.getContext();
		db =  context.getBean(UsuarioRepository.class);
		
	}
	
	public void insert(Usuario c){
		db.save(c);
	}
	
	public List<Usuario> getAll(){
		
		return db.findAll();
	}
	
	public List<Usuario> getByNome(String nome) {
		return db.findByNome(nome);
	}

}

