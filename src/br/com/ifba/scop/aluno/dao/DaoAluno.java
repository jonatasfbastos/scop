package br.com.ifba.scop.aluno.dao;

import br.com.ifba.scop.infraestructure.dao.BaseDao;
import br.com.ifba.scop.aluno.model.Aluno;
import java.util.List;
/**
 *
 * @author Igor Lopes
 */
public class DaoAluno extends BaseDao<Aluno> implements IDaoAluno {

    @Override
    public List<Aluno> FindByNomeAluno(String aluno) {
         String query = "select a from professor a WHERE upper(a.aluno) like upper('" + aluno +"%')";
        return BaseDao.entityManager.createQuery(query).getResultList();
    }
    
}
