package com.alura.Desafio_Forum.dto.response;

import java.util.List;

public record TopicoDetalhamentoDto (
        Long id,
        String titulo,
        String mensagem,
        UsuarioIdDto autor,
        CursoIdDto curso,
        List<RespostaIdDto> resposta,
        boolean status
) {
    public TopicoDetalhamentoDto(Long id, String titulo, String mensagem, UsuarioIdDto autor, CursoIdDto curso, List<RespostaIdDto> resposta, boolean status) {
        this.id = id;
        this.titulo = titulo;
        this.mensagem = mensagem;
        this.autor = autor;
        this.curso = curso;
        this.resposta = resposta;
        this.status = status;
    }
}
