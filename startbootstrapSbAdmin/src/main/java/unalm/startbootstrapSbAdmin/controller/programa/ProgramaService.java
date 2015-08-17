/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unalm.startbootstrapSbAdmin.controller.programa;

import unalm.startbootstrapSbAdmin.model.Programa;
import java.util.List;

/**
 *
 * @author PCC
 */
public interface ProgramaService {
    List<Programa> allPrograma();
    Programa findPrograma(Long id);
    void guardarPrograma(Programa programa);
    void deletePrograma(Long id);
}
