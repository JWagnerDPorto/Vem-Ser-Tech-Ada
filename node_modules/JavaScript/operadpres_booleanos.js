// OPERADORES BOOLEANOS

// Igualdade:       == (ou ===)
// Desigualdade:    != (ou !==)
// Maior que:       >
// Maior ou igual:  >=
// Menor que:       <=

const numero = 10

console.log(numero == 10)
console.log(numero == 10)
console.log(numero === '10')

console.clear()

console.log(numero != 10)
console.log(numero != '10')
console.log(numero !== '10')


// - Conjunções Lógicas

// AND => &&
let idade = 26
let tenhoCNH = true

const possoDirigir = idade >= 18 && tenhoCNH === true

console.log('Posso dirigir?', possoDirigir)

// OR => ||

idade = 40

const votoFaculdativo = idade < 18 || idade >= 70

// NOT => !

const estuGostandoDoCurso = false

console.log(!estuGostandoDoCurso)
