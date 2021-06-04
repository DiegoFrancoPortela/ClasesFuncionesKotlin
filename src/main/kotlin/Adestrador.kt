class Adestrador {

    //Atributos do Adestrador
    var id: Int = 0
    var nome: String = ""
    var apelido: String = ""
    var idade: Int = 0
    var idFederacion: String = ""

    //Métodos
    fun concentrarse(tempoDeConcentracion: Int): Int = tempoDeConcentracion

    fun viaxar(PaisDestino: String): String = PaisDestino

    fun dirixirPartido(): Unit {}

    fun dirixirAdestramento(): Unit {}

    override fun toString(): String {
        return "Adestrador(id=$id, Nome='$nome', Apelido='$apelido', Idade=$idade, idFederacion='$idFederacion')"
    }
}