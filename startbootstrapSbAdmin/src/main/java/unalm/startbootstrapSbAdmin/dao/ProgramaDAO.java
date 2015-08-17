package unalm.startbootstrapSbAdmin.dao;

import unalm.startbootstrapSbAdmin.model.Programa;

public interface ProgramaDAO extends GenericDAO<Programa>{
    
    
    Programa findByCodigo(String codigo);
    
}
