package generation.rencapp.services;

import generation.rencapp.models.Funcionario;
import generation.rencapp.repositories.FuncionarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class FuncionarioServiceImp implements FuncionarioService {
    //Inyeccion de depencias
    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Override
    public List<Funcionario> findAll() {
        return funcionarioRepository.findAll();
    }


    @Override
    public Funcionario findById(Long id) {
        //Llama al repository y al método para buscar por ID
        return funcionarioRepository.findById(id).get();
    }

    @Transactional
    public Funcionario saveFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }
}
