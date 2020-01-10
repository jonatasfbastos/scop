/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.scop.infraestructure.dao;

import br.com.ifba.scop.infraestructure.model.AbstractEntity;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 *
 * @author beatriz
 */

//Salva, atualiza, deleta e lista o banco de dados

/**
 *
 * @author beatriz
 * @param <Entity>
 */
@SuppressWarnings("unchecked")
public class BaseDao<Entity extends AbstractEntity> implements IBaseDao<Entity>{
    
    protected static EntityManager entityManager;
    
    static{
        EntityManagerFactory fac = Persistence.createEntityManagerFactory("ProjetoLoja");
        entityManager = fac.createEntityManager();
    }
    
    /**
     * {@inheritDoc}
     */
    public Entity save(Entity entity){
       entityManager.getTransaction().begin();
       entityManager.persist(entity);
       entityManager.getTransaction().commit();
       return entity;
        
    }
    
    /**
     * {@inheritDoc}
     * @param entity
     * @return 
     */
    public Entity update(Entity entity){
        entityManager.getTransaction().begin();
        entityManager.merge(entity);
        entityManager.getTransaction().commit();
        return entity;

    }
    
    /**
     * {@inheritDoc}
     * @param entity
     */
    public void delete(Entity entity){
       entityManager.getTransaction().begin();
       entityManager.remove(entity);
       entityManager.getTransaction().commit();       
    }
    
    /**
     * {@inheritDoc}
     * @return 
     */
    public List<Entity> findAll(){
        return entityManager.createQuery(("FROM " + getTypeClass().getName())).getResultList();
    }
    
    
    /**
     * {@inheritDoc}
     * @param id
     * @return 
     */
    public Entity findById(Long id){
        return (Entity) entityManager.find(getTypeClass(), id);
    }
    
    
    protected Class<?> getTypeClass(){
        
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        
        return clazz;
    }

    
}
