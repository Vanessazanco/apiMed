package br.com.med.vol.api.domain.consulta;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosCancelamentoConsulta(
        @NotNull
        Long idConsulta,

        @NotNull
        MotivoCancelamento motivo) {
}
