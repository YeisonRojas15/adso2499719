package com.casanova.adso2499719.interfaces;

import java.util.List;
import java.util.Optional;
import com.casanova.adso2499719.entities.Grado;

public interface IntGradoService {

	List<Grado> getAll();

    Grado getById(Long id) throws Exception;

	Grado save(Grado grado);

	void updated(Long id, Grado grado) throws Exception;

	void deleted(Long id) throws Exception;
}
