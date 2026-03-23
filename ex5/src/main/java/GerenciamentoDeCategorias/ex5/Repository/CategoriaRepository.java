package GerenciamentoDeCategorias.ex5.Repository;

import GerenciamentoDeCategorias.ex5.Model.CategoriasModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriasModel, Long> {
}
