package unalm.startbootstrapSbAdmin.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import unalm.startbootstrapSbAdmin.dao.AlumnosDao;
import unalm.startbootstrapSbAdmin.model.Alumnos;
import unalm.startbootstrapSbAdmin.model.Programa;
import unalm.startbootstrapSbAdmin.model.PromCiclos;

@Repository("alumnosDAO")
public class AlumnosDAOH extends BaseHibernateDAO implements AlumnosDao {

	public List<Alumnos> list() {
		/*
		  Criteria criteria = this.getSession().createCriteria(Alumnos.class);
		 return criteria.list();
		 */
		 
		 
/*
		Criteria criteria = this.getSession().createCriteria(Alumnos.class)
				.createAlias("alumnosEsp", "s", Criteria.LEFT_JOIN)
				.createAlias("alumnosFac", "f", Criteria.LEFT_JOIN);
		return criteria.list();
*/
		
		Criteria criteria = this.getSession().createCriteria(PromCiclos.class);
		return criteria.list();
		 
		 
	}

	public Alumnos get(Long t) {
		Criteria criteria = this.getSession().createCriteria(Alumnos.class);
		criteria.add(Restrictions.eq("matricula", String.valueOf(t)));
		return (Alumnos) criteria.uniqueResult();
	}

	public void save(Alumnos t) {
		this.getSession().save(t);

	}

	public void update(Alumnos t) {
		// TODO Auto-generated method stub

	}

	public void delete(Long t) {
		// TODO Auto-generated method stub

	}

	public Alumnos findByAlumno(String codigo) {
		Criteria criteria = this.getSession().createCriteria(Alumnos.class);
		criteria.add(Restrictions.eq("codigo", codigo));
		return (Alumnos) criteria.uniqueResult();
	}

	public PromCiclos get1(Long id) {
		Criteria criteria = this.getSession().createCriteria(PromCiclos.class,"p")
				.createAlias("alumnosPromCiclos","a")
				.createAlias("a.especial", "e")
				.createAlias("a.alumnosFac", "af");
		criteria.add(Restrictions.isNotNull("p.ppg"));
		criteria.add(Restrictions.eq("a.matricula", String.valueOf(id)));
		return (PromCiclos) criteria.uniqueResult();
	}

}
