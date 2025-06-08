package med.voll.api.medico;


//representa os dados que vamos devolver para o controller
public record DadosListagemMedicos(
        Long id,
        String nome,
        String email,
        String crm,
        Especialidade especialidade

        ){
    public DadosListagemMedicos (Medico medico){
        this(medico.getId(),medico.getNome(), medico.getEmail(), medico.getCrm(),medico.getEspecialidade());
    }
}