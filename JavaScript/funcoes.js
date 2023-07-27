// FUNÇÕES

// Definiçãode função

function saudacao() {
    console.log('Olá, seja bemvinda(o) ao curso de javascript!')
}

saudacao()

console.clear()

//Como enviar parametros para funções

function saudacao(nome, curso = 'JavaScript') {
    console.log(`Olá ${nome}, seja bemvinda(o) ao curso de ${curso}!`)
}

saudacao('Wagner')

function saudacao(nome, curso = 'JavaScript') {
    console.log(`Olá ${nome}, seja bemvinda(o) ao curso de ${curso}!`)
}

saudacao('Wagner', 'Java')

// Retorno da função

function soma(numero1, numero2) {
    console.log('Qualquer coisa')
    return numero1 + numero2
}

const resultado = soma(10, 20)

console.log(resultado / 2)

console.clear()

function maiorDoQue50(numero) {
    if (numero > 50) {
        return true
    }

    return false
}

const resultado2 = maiorDoQue50(10)

console.log(resultado2)