Scanner T = new Scanner(System.in)
println "Escolha uma das oopcoes "
println "1-Adicao 2-Divisor  3-Raiz quadrada 4-Sair"
def opcao = T.nextInt()
switch(opcao)
{
    case 1: //caso a opcao seja 1
        println "Digite n1"
        n1 = T.nextInt()
        println "Digite n2"
        n2 = T.nextInt()
        println "$n1 + $n2 ="+(n1+n2)
        break	// fim do caso

    case 2: //caso  a opcao seja 2
        println "Digite n1"
        n1 = T.nextInt()
        println "Digite n2"
        n2 = T.nextInt()
        if(n2==0) {
            println "Erro, divisao por zero"
        }
        else {
            println "$n1 / $n2 ="+(n1/n2)
        }

        break // fim do caso

    case 3: //caso a opcao seja 3
        println "Digite um numero"
        def n = T.nextInt()
        println "Raiz de $n ="+(Math.sqrt(n))

        break // fim do caso

    default: //caso nenhum dos casos anteriores seja satisfeito
        println "Bye Bye"
        System.exit(0)
}
