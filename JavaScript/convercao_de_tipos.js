// COERÇÃO (CONVERSÃO) DE TIPOS

// 1. Coerção Explícita (Manual)

const numero = 10

console.log(numero, typeof numero)

const numeroEmFormatoDeString = String(numero)
console.log(numeroEmFormatoDeString, typeof numeroEmFormatoDeString)

console.log(Number('123456'))
console.log(parseFloat('12.3456'))
console.log(parseInt('12.3456'))
console.log(Boolean(1))
console.log(Boolean(0))

console.clear()

// 2.Coerção Implícita (Automática)

console.log('10' + 1)
console.log('10' - 1)
console.log(10 * '3')
console.log(10 - 'asasa')

// Outros exemplos

//   Qual será a saída desse códígo?

let n = 1 + '1'

n = n - 1

console.log(n)

//   Qual será a saída desse códígo?

console.log(2 + 3 + 4 + '5')

//   Qual será a saída desse códígo?

console.log('5' + 2 + 3 + 4)

//   Qual será a saída desse códígo?

console.log('10' - '4' - '3' - 2 + '5')

//   Qual será a saída desse códígo?

