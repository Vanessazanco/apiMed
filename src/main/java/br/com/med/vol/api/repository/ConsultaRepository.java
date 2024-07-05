package br.com.med.vol.api.repository;

import br.com.med.vol.api.domain.consulta.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface ConsultaRepository extends JpaRepository<Consulta , Long> {

    Boolean existsByPacienteIdAndDataBetween(Long idPaciente,LocalDateTime primeiroHorario,LocalDateTime ultimohorario);

    //Boolean existsByMedicoIdAndData(Long idMedico, LocalDateTime data);

    boolean existsByMedicoIdAndDataAndMotivoCancelamentoIsNull(Long idMedico, LocalDateTime data);
}
