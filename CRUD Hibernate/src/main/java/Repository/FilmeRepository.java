package Repository;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.Transaction;

import Model.FilmeModel;
import config.HibernateConfig;

public class FilmeRepository {
	
	@Transactional
	public void salvarFilme(FilmeModel filme) {
		Transaction transaction = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		
		session.save(filme);
		
		transaction.commit();
	}
	
	
	public void excluirFilme(long id) {
		Transaction transaction = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		FilmeModel filme = null;
		filme = session.get(FilmeModel.class, id);
		session.delete(filme);
		
		transaction.commit();
		
	}
	
	
	public void EditarFilme (FilmeModel filme) {
		Transaction transaction = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		session.saveOrUpdate(filme);
		transaction.commit();
		
	}
	
	public FilmeModel pegarFilmePeloId(long id) {
		Transaction transaction = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		transaction = session.beginTransaction();
		FilmeModel filme = null;
		
		filme = session.get(FilmeModel.class, id);
		
		return filme;
		
		
	}

}
