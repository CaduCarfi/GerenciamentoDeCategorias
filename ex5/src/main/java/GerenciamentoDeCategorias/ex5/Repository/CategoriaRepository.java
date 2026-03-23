package GerenciamentoDeCategorias.ex5.Repository;

import GerenciamentoDeCategorias.ex5.Model.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
}
