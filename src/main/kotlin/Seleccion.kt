open abstract class Seleccion {

    var id: Int
    var nome: String
    var apelido: String
    var idade: Int

    // Constructor con parámetros
    constructor(id: Int, nome: String, apelido: String, idade: Int) {
        this.id = id
        this.nome = nome
        this.apelido = apelido
        this.idade = idade
    }

    //Metodos
    open fun viaxar(): String = "A seleccion sae de Viaxe"

}