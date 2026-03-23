package GerenciamentoDeCategorias.ex5.Service;

import GerenciamentoDeCategorias.ex5.Model.CategoriaModel;
import GerenciamentoDeCategorias.ex5.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<CategoriaModel> findAll() {
        return categoriaRepository.findAll();
    }

    public CategoriaModel salvar(CategoriaModel categoriaModel) {
        return categoriaRepository.save(categoriaModel);
    }

    public Optional<CategoriaModel> findById(Long id) {
        return categoriaRepository.findById(id);
    }

    public void deletar(Long id) {
        categoriaRepository.deleteById(id);
    }
}
