package br.com.med.vol.api.domain.consulta;

import br.com.med.vol.api.domain.medico.Especialidade;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosAgendamentoConsulta(

        Long idMedico,
        @NotNull
        Long idPaciente,

        @NotNull
        @Future
        //@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
        LocalDateTime data,

        Especialidade especialidade
) {
}
