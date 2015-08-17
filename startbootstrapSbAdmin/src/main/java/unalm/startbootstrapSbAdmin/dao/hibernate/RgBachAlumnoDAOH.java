package unalm.startbootstrapSbAdmin.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import unalm.startbootstrapSbAdmin.dao.RgBachAlumnoDAO;
import unalm.startbootstrapSbAdmin.model.RgBachAlumno;

@Repository("rgBachAlumnoDAO")
public class RgBachAlumnoDAOH extends BaseHibernateDAO implements
		RgBachAlumnoDAO {

	public List<RgBachAlumno> list() {
		Criteria criteria = this.getSession().createCriteria(RgBachAlumno.class);
		return criteria.list();
	}

	public RgBachAlumno get(Long t) {
	Criteria criteria = this.getSession().createCriteria(RgBachAlumno.class);
	criteria.add(Restrictions.eq("id", t));
	return (RgBachAlumno) criteria.uniqueResult();
	}

	public void save(RgBachAlumno t) {
		this.getSession().save(t);

	}

	public void update(RgBachAlumno t) {
		// TODO Auto-generated method stub

	}

	public void delete(Long t) {
		this.getSession().delete(new RgBachAlumno(t));

	}

	public RgBachAlumno findbyCodigo(Long Codigo) {
	Criteria criteria = this.getSession().createCriteria(RgBachAlumno.class);
	criteria.add(Restrictions.eq("id", Codigo));
	return (RgBachAlumno) criteria.uniqueResult();
	}

}
