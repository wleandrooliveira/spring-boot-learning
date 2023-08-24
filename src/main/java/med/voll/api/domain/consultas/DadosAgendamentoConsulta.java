package med.voll.api.domain.consultas;

import jakarta.validation.constraints.Future;
import med.voll.api.domain.medico.Especialidade;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;

public record DadosAgendamentoConsulta(
        Long idMedico,

        @NotNull
        Long idPaciente,

        @NotNull
        @Future
        LocalDateTime data,

        Especialidade especialidade) {
}
