package unalm.startbootstrapSbAdmin.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import unalm.startbootstrapSbAdmin.dao.ProfesorDAO;
import unalm.startbootstrapSbAdmin.model.Profesor;
import unalm.startbootstrapSbAdmin.model.RgBachAlumno;


@Repository("profesorDAO")
public class ProfesorDAOH extends BaseHibernateDAO implements ProfesorDAO {

	public List<Profesor> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public Profesor get(Long t) {
		Criteria criteria = this.getSession().createCriteria(Profesor.class);
		criteria.add(Restrictions.eq("proCodigo", t));
		return (Profesor) criteria.uniqueResult();
	}

	public void save(Profesor t) {
		// TODO Auto-generated method stub
		
	}

	public void update(Profesor t) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Long t) {
		// TODO Auto-generated method stub
		
	}

	public Profesor findByCodigo(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	public Profesor get1(String codigo) {
		Criteria criteria = this.getSession().createCriteria(Profesor.class);
		criteria.add(Restrictions.eq("proCodigo", codigo));
		return (Profesor) criteria.uniqueResult();
	}
	

}
