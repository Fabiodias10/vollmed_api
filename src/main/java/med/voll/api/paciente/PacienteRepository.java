package med.voll.api.paciente;

import org.antlr.v4.runtime.misc.MultiMap;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente,Long> {
    Page<Paciente> findAllByAtivoTrue(Pageable paginacao);
}
