package br.com.letscode.letsgoal.service;

import br.com.letscode.letsgoal.exception.JogadorNotFoundException;
import br.com.letscode.letsgoal.entity.Jogador;
import br.com.letscode.letsgoal.repository.JogadorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class JogadorService {
    final JogadorRepository jogadorRepository;

    public Jogador savejogador(Jogador jogador) {
        return jogadorRepository.save(jogador);
    }
    public List<Jogador> findAll() {
        return (List<Jogador>) jogadorRepository.findAll();
    }

    public Jogador findById(Long id) {
        return jogadorRepository
                .findById(id)
                .orElseThrow(JogadorNotFoundException::new);
    }
}
