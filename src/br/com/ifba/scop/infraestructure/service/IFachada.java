package br.com.ifba.scop.infraestructure.service;

import br.com.ifba.scop.grupopesquisa.model.GrupoPesquisa;
import br.com.ifba.scop.infraestructure.endereco.model.Endereco;
import br.com.ifba.scop.login.tipousuario.model.TipoUsuario;
import br.com.ifba.scop.login.usuario.model.Usuario;
import br.com.ifba.scop.patente.model.Patente;
import br.com.ifba.scop.pesquisador.model.Pesquisador;
import br.com.ifba.scop.projetopesquisa.model.ProjetoPesquisa;
import java.util.List;
import br.com.ifba.scop.professor.model.Professor;
import br.com.ifba.scop.professor.service.IServiceProfessor;
import br.com.ifba.scop.professor.service.ServiceProfessor;


public interface IFachada {
    
    //------------------- Endereço ----------------------------//
    // Método que salva um Endereço na base de dados
    public abstract Endereco saveEndereco(Endereco endereco);
    // Método que salva um Endereço na base de dados
    public abstract Endereco updateEndereco(Endereco endereco);
    // Método que deleta um Endereço da base de dados
    public abstract void deleteEndereco(Endereco endereco);
    // Método que retorna todos Endereços da base de dados
    public abstract List<Endereco> getAllEndereco();
    
    //---------------- Grupo de Pesquisa ---------------------//
    
//     // Metodo que salva um Grupo de Pesquisa na base de dados
    public abstract GrupoPesquisa saveGrupoPesquisa (GrupoPesquisa grupoPesquisa);
    // Metodo que atualiza um Grupo de Pesquisa que já existe na base de dados
    public abstract GrupoPesquisa updateGrupoPesquisa (GrupoPesquisa grupoPesquisa);
    // Metodo que deleta um Grupo de Pesquisa da base de dados
    public abstract void deleteGrupoPesquisa (GrupoPesquisa grupoPesquisa);
    // Metodo que retorna todos os Grupo de Pesquisa da base de dados
    public abstract List<GrupoPesquisa> getAllGrupoPesquisa();
    // Método que retorna um Grupo de Pesquisa pelo Id
    public abstract GrupoPesquisa getByIdGrupoPesquisa(Long id);
    // Metodo que busca um Grupo de Pesquisa na base de dados através do nome
    public abstract List<GrupoPesquisa> findByNomeGrupoPesquisa (String titulo);
    
    // ---------- Patente ----------------------------------
    // valida savePatente
    public abstract boolean savePatente(Patente patente);
    // valida updatePatente
    public abstract boolean updatePatente(Patente patente);
    // valida deletePatente
    public abstract boolean deletePatente(Patente patente);
    // esse metodo retorna todas as patentes registradas
    public abstract List<Patente> getAllPatente();
    // esse metodo retorna pela area - pesquisa
    public abstract List<Patente> searchPatenteArea(Patente patente);
    // esse metodo retorna pelo titulo - pesquisa
    public abstract List<Patente> searchPatenteTitle(Patente patente);
    // esse metodo retorna pelo numero - pesquisa
    public abstract List<Patente> searchPatenteNumber(Patente patente);
    
    // ----------------------------- Pesquisador -------------------------
    
    // Metodo que salva um Projeto de Pesquisa na base de dados
    public abstract Pesquisador savePesquisador (Pesquisador  pesquisador );
    // Metodo que atualiza um Projeto de Pesquisa que já existe na base de dados
    public abstract Pesquisador updatePesquisador  (Pesquisador  pesquisador);
    // Metodo que deleta um Projeto de Pesquisa da base de dados
    public abstract void deletePesquisador  (Pesquisador  pesquisador);
    // Metodo que retorna todos os Projeto de Pesquisa da base de dados
    public abstract List<Pesquisador> getAllPesquisador();
    // Metodo que busca um Projeto de Pesquisa na base de dados através do nome
    public abstract Pesquisador findByMatricula(String matricula);
    
    //------------- ProjetoPesquisa ----------------------
    
    // Metodo que salva um Projeto de Pesquisa na base de dados
    public abstract ProjetoPesquisa saveProjetoPesquisa (ProjetoPesquisa projetoPesquisa);
    // Metodo que atualiza um Projeto de Pesquisa que já existe na base de dados
    public abstract ProjetoPesquisa updateProjetoPesquisa (ProjetoPesquisa projetoPesquisa);
    // Metodo que deleta um Projeto de Pesquisa da base de dados
    public abstract void deleteProjetoPesquisa (ProjetoPesquisa projetoPesquisa);
    // Metodo que retorna todos os Projeto de Pesquisa da base de dados
    public abstract List<ProjetoPesquisa> getAllProjetos();
    // Método que retorna um ProjetoPesquisa pelo Id
    public abstract ProjetoPesquisa getByIdProjeto(Long id);
    // Metodo que busca um Projeto de Pesquisa na base de dados através do titulo
    public abstract List<ProjetoPesquisa> findByTitulo (String titulo);
    
    //----------- Usuario ----------------------
    
    // Salva usuário na bsa de dados
    Usuario saveUsuario(Usuario usuario);
    // Atualiza usuário
    Usuario updateUsuario(Usuario usuario);
    // Constroi lista com todos os usuários cadastrados
    List<Usuario> getAllUsuario();
    // Deleta um usuário
    void deleteUsuario(final Usuario usuario);
    // Busca por nome
    public List<Usuario> findByNome(Usuario usuario);
    // Busca por ID
    public Usuario findById(Long id);
    // Verifica se usuário ja existe
    boolean usuarioExistente(Usuario usuario);
    //Valida login
    public List<Usuario> findByLoginSenha(Usuario usuario);
    
    // ---------------------------- PROFESSOR -------------------------------
    
    // Salva professor na base de dados
    public abstract Professor saveProfessor(Professor professor);
    // Deleta o professor da base de dados
    public abstract void deleteProfessor(Professor professor);
    // Metodo que atualiza um Grupo de Pesquisa que já existe na base de dados
    public abstract Professor  updateProfessor (Professor professor);
    // Metodo que retorna todos os Grupo de Pesquisa da base de dados
    public abstract List<Professor> getAllProfessor ();
    // Método que retorna um Grupo de Pesquisa pelo Id
    public abstract Professor  getByIdProfessor (Long id);
    // Metodo que busca um Grupo de Pesquisa na base de dados através do nome
    public abstract List<Professor> findByProfessor (String Professor);
    
    //---------------------------- Tipo Usuario -------------------------------
    public abstract TipoUsuario saveTipoUsuario(TipoUsuario tipousuario);
    public abstract List<TipoUsuario> getAllTipoUsuario();
    public abstract void deleteTipoUsuario(final TipoUsuario tipousuario);
    public abstract TipoUsuario updateTipoUsuario(TipoUsuario tipousuario);
    public abstract List<TipoUsuario> findByNome(TipoUsuario tipousuario);
    public abstract boolean tipoUsuarioExistente(TipoUsuario tipousuario);
}