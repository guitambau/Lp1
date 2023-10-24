package org.example.classes;

public class Main {
    public static void main(String[] args) {
        // Pessoa
        Pessoa pessoa = new Pessoa("João", 25, "Engenheiro");
        pessoa.falar();
        pessoa.trabalhar();

        // Carro
        Carro carro = new Carro("Toyota", "Corolla", 2022);
        carro.buzinar();
        carro.acelerar();

        // Livro
        Livro livro = new Livro("Aventuras na Selva", "John Doe", "Aventura");
        livro.abrir();
        livro.ler();

        // Animal
        Animal animal = new Animal("Cachorro", "Preto", 3);
        animal.fazerSom();
        animal.comer();

        // Cidade
        Cidade cidade = new Cidade("São Paulo", 12000000, "São Paulo");
        cidade.apresentarPopulacao();
        cidade.celebrarFeriado();

        // Computador
        Computador computador = new Computador("Dell", "Intel i7", 16);
        computador.ligar();
        computador.desligar();

        // Música
        Musica musica = new Musica("Alegria da Vida", "Roberto Carlos", "3:45");
        musica.tocar();
        musica.pausar();

        // Planta
        Planta planta = new Planta("Orquídea", "Roxa", 0.3);
        planta.realizarFotossintese();
        planta.crescer();

        // Telefone
        Telefone telefone = new Telefone("(11) 98765-4321", "Apple", "iPhone 13");
        telefone.fazerChamada();
        telefone.encerrarChamada();

        // Artista
        Artista artista = new Artista("Carlos", "Rock", 5);
        artista.cantar();
        artista.ensaiar();
    }
}
