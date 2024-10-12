package generation.rencapp.repositories;

import generation.rencapp.models.Agendamiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamientoRepository extends JpaRepository<Agendamiento, Long> {
}
