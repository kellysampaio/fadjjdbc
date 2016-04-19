package br.com.herbertrausch.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.herbertrausch.spring.mongo.Carro;
import br.com.herbertrausch.spring.mongo.CarroService;

@Path("/carro")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class CarroResource {

	CarroService service = new CarroService();
	
	@GET
	public List<Carro> get() {
		return service.getAll();
	}
	
	@GET
	@Path("/usuario/{id}")
	public Carro getByUsuario(@PathParam("id") String id) {
		return service.getByUsuarioId(id);
	}
	
	@GET
	@Path("/buscar/{placa}")
	public Carro getByPlaca(@PathParam("placa") String id) {
		return service.getByPlaca(id);
	}
	
	
	@POST
	@Path("/incluir")
	public void save(Carro e){
		service.insert(e);
	}

}
