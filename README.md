# Sistema de Gerenciamento de Escola de Música 🎶

Este projeto é um **Sistema de Gerenciamento de Escola de Música**, desenvolvido como parte do trabalho de Programação
Orientada a Objetos (POO). Ele permite gerenciar cursos, alunos, professores e o agendamento de aulas para uma escola de
música.

## 📋 Descrição do Projeto

O sistema gerencia diferentes tipos de cursos, como:

- Instrumento
- Canto
- Teoria Musical

### Funcionalidades:

- **Inscrições** e **cancelamentos** de cursos pelos alunos.
- **Agendamento** e **cancelamento** de aulas pelos professores.
- **Monitoramento do progresso** dos alunos.

## 📐 Estrutura e Conceitos Utilizados

O projeto aplica os principais conceitos de POO e padrões de projeto, incluindo:

1. **Herança e Polimorfismo**
    - **Classe Pessoa**: Classe base que contém atributos comuns (nome, idade, endereço).
    - **Classes Derivadas**:
        - **Aluno**: Possui métodos como `inscreverCurso()` e `cancelarInscricao()`.
        - **Professor**: Possui métodos como `agendarAula()` e `cancelarAula()`.

2. **Encapsulamento**
    - Atributos privados, como curso e horários, acessados via métodos `get` e `set`.

3. **Interface (Contrato)**
    - Interface **Agendavel** com métodos como `agendarAula()` e `cancelarAula()`.

4. **Padrões de Projeto**
    - **Factory**: Para criar tipos específicos de curso (ex.: `CursoDePiano`, `CursoDeViolao`).
    - **Singleton**: Gerencia o agendamento de aulas, garantindo uma única instância.
    - **Observer**: Atualiza automaticamente alunos e professores sobre mudanças de horário.

## 🛠 Estrutura de Arquivos

- `src/`: Código-fonte do sistema.
- `README.md`: Documentação do projeto.
- `docs/`: Documentação adicional e diagramas do projeto.

## 🚀 Tecnologias Utilizadas

- **Java**: Linguagem principal do sistema.
- **Paradigmas de POO**: Herança, polimorfismo, encapsulamento e abstração.
- **Padrões de Projeto**: Factory, Singleton, Observer.

## 👥 Contribuidores

<a href="https://github.com/hugo-loiola12/EscolaDeMusica/graphs/contributors">
  <img src="https://contrib.rocks/image?repo=hugo-loiola12/EscolaDeMusica" />
</a>

Made with [contrib.rocks](https://contrib.rocks).

## 📅 Data de Entrega

22 de Novembro de 2024
