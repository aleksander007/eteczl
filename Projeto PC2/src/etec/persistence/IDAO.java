package etec.persistence;

import java.util.List;

public interface IDAO {

	void inserir(Object o) throws Exception;
	List listar() throws Exception;
	
}
