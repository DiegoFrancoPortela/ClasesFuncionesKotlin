class Xogador {

    //Atributos do Xogador:
    var id: Int = 0
    var nome: String = ""
    var apelido: String = ""
    var idade: Int = 0
    var dorsal: Int = 0
    var demarcacion: String = ""

    //Constructor con parámetros
    constructor(id: Int, nome: String, apelido: String, idade: Int, dorsal: Int, demarcacion: String) {
        this.id = id
        this.nome = nome
        this.apelido = apelido
        this.idade = idade
        this.dorsal = dorsal
        this.demarcacion = demarcacion
    }

    //Métodos
    fun concentrarse(tempoDeConcetracion: Int) {
        println("O xogador concéntrase coa Selección durante "+tempoDeConcetracion+" dias")
    }

    fun viaxar(PaisDestino: String) {
        println("O xogador viaxa ca selección a " + PaisDestino)
    }

    fun xogarPartido(): Unit {}

    fun entrenar(): Unit {}

    override fun toString(): String {
        return "Xogador(id=$id, nome='$nome', apelido='$apelido', idade=$idade, dorsal=$dorsal, demarcacion='$demarcacion')"
    }

}