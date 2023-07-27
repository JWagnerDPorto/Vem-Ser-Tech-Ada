// OBJETOS

// Como criar um objeto no javscript

let pessoa = {
    nome: 'Wagner',
    idade: 37
}

console.log(pessoa)

console.log(pessoa.nome)
console.log(pessoa['nome'])
console.log(pessoa.idade)

// Como adicionar um par chave-valor

pessoa.altura = 1.77

console.log(pessoa)

// Como remover um par chave-valor

delete pessoa.altura

console.log(pessoa)

console.clear

// Como percorrer

for (let chave in pessoa) {
    console.log(chave)
}