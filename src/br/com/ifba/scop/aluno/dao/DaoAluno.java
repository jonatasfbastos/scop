package br.com.ifba.scop.aluno.dao;

import br.com.ifba.scop.infraestructure.dao.BaseDao;
import br.com.ifba.scop.aluno.model.Aluno;
import java.util.List;
import javax.persistence.Query;
/**
 *
 * @author Igor Lopes
 */
public class DaoAluno extends BaseDao<Aluno> implements IDaoAluno {
    private String Alun;
    
    public DaoAluno(){
        super();
    }
    
    @Override
    public boolean saveAluno(Aluno aluno) {
        this.setAlun("SELECT c.id FROM Aluno AS c WHERE c.ano=:ano "
                + "OR (c.nome=:nome AND c.matricula=:matricula)");
        
          // mandando query // inserindo comando na querry e inserindo os dados
        Query query = entityManager.createQuery(this.getAlun());
        query.setParameter("Nomee", aluno.getNome());
        query.setParameter("Matricula", aluno.getMatricula());
        query.setParameter("Ano", aluno.getAno());
        if (!query.getResultList().isEmpty()) {
            // foi encontrado patente correspondente - erro
            return false;
        }
        try {
            this.save(aluno);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean deleteAluno(Aluno aluno) {
         try {
            this.delete(aluno);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }

    
    @Override
    public boolean updateAluno(Aluno aluno) {
        this.setAlun("SELECT c.matricula FROM Aluno AS c WHERE "
                + "c.ano=:ano AND c.matricula=:matricua");
        // mandando query // inserindo comando na querry e inserindo os dados
        Query query = entityManager.createQuery(this.getAlun());
        query.setParameter("Ano", aluno.getAno());
        query.setParameter("Matricula", aluno.getMatricula());
        if (query.getResultList().isEmpty()) {
            // não foi encontrado patente correspondente - erro
            return false;
        }
        
        this.setAlun("SELECT c.matricula FROM Aluno AS c WHERE "
                + "c.nome=:nome AND c.matricula=:matricula");
        // inserindo comando na querry e inserindo os dados
        query = entityManager.createQuery(this.getAlun());
        query.setParameter("Nome", aluno.getNome());
        query.setParameter("matricula", aluno.getMatricula());
        if (!query.getResultList().isEmpty()) {
            // foi encontrado patente correspondente - erro
            return false;
        }
        // verificando se operação foi concluida com sucesso ou não
        try {
            this.update(aluno);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<Aluno> takeAll() {
        return this.findAll();
    }

    @Override
    public List<Aluno> findByMatricula(Aluno aluno) {
    
        this.setAlun("SELECT c FROM Aluno AS c WHERE c.matricula=:matricula");
        // inserindo comando na querry e inserindo os dados
        Query query = entityManager.createQuery(this.getAlun());
        query.setParameter("Matricula", aluno.getMatricula());
        return query.getResultList();
    }

    @Override
    public List<Aluno> findByNome(Aluno aluno) {
          this.setAlun("SELECT c FROM Aluno AS c WHERE c.nome=:nome");
        // inserindo comando na querry e inserindo os dados
        Query query = entityManager.createQuery(this.getAlun());
        query.setParameter("Nome", aluno.getNome());
        return query.getResultList();
    }

    @Override
    public List<Aluno> findByAno(Aluno aluno) {
         this.setAlun("SELECT c FROM Aluno AS c WHERE c.ano=:ano");
        // inserindo comando na querry e inserindo os dados
        Query query = entityManager.createQuery(this.getAlun());
        query.setParameter("Ano",aluno.getAno());
        return query.getResultList();

    }

   public String getAlun() {
        return Alun;
    }

    public void setAlun(String Alun) {
        this.Alun = Alun;
    }

    @Override
    public List<Aluno> FindByNomeAluno(String Aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
