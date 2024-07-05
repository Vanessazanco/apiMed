package br.com.med.vol.api.domain.consulta.validacoes.agendamento;

import br.com.med.vol.api.domain.consulta.DadosAgendamentoConsulta;
import br.com.med.vol.api.domain.consulta.ValidacaoException;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Component("ValidadorHorarioAntecedenciaAgendamento")
public class ValidadorHorarioAntecedencia implements ValidadorAgendamentoDeConsulta {

    public void validar(DadosAgendamentoConsulta dados) {
    var dataConsulta = dados.data();
    var agora = LocalDateTime.now();
    var diferencaEmMinutos = Duration.between(agora, dataConsulta).toMinutes();

    if (diferencaEmMinutos<30){
        throw new ValidacaoException("Consulta de ver agendada com antecedência minima de 30min");
    }

    }
}
