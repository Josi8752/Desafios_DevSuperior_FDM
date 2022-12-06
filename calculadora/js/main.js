// CONSTANTES

const inputNumber1 = document.querySelector("#number1");
const inputNumber2 = document.querySelector("#number2");
const resultBox = document.querySelector("#result-box");
const btnPlus = document.querySelector("#btn-plus");
const btnTimes = document.querySelector("#btn-times");
const btnClear = document.querySelector("#btn-clear");

// EVENTOS

btnPlus.addEventListener("click", handleClickPlus);
btnTimes.addEventListener("click", handleClickTimes);
btnClear.addEventListener("click", handlenClickClear);
inputNumber1.addEventListener("change", handleChangeInputError);
inputNumber2.addEventListener("change", handleInputErrorChange);
inputNumber1.addEventListener("keypress", onlyNumber);
inputNumber2.addEventListener("keypress", onlyNumber);

// FUNÇÕES

clearForm();

function handleClickPlus(event) {
  resultBox.innerHTML =
    parseInt(inputNumber1.value) + parseInt(inputNumber2.value);
  resultBox.innerHTML =
    parseFloat(inputNumber1.value) + parseFloat(inputNumber2.value);
}

function handleClickTimes(event) {
  resultBox.innerHTML =
    parseInt(inputNumber1.value) * parseInt(inputNumber2.value);
  resultBox.innerHTML =
    parseFloat(inputNumber1.value) * parseFloat(inputNumber2.value);
}

function handlenClickClear(event) {
  inputNumber1.value = "";
  inputNumber2.value = "";
  resultBox.innerHTML = 0;
}

function clearForm() {
  inputNumber1.value = "";
  inputNumber2.value = "";
  inputNumber1.classList.remove("input-error");
  inputNumber2.classList.remove("input-error");
}

function handleChangeInputError(event) {
  if (isNumber(event.target.value)) {
    inputNumber1.classList.remove("input-error");
  } else {
    inputNumber1.classList.add("input-error");
  }
}

function handleInputErrorChange(event) {
  if (isNumber(event.target.value)) {
    inputNumber2.classList.remove("input-error");
  } else {
    inputNumber2.classList.add("input-error");
  }
}

function onlyNumber(evt) { // [1]
  let theEvent = evt || window.event;
  let key = theEvent.keyCode || theEvent.key; //[2]
  key = String.fromCharCode(key); //[3]
  let regex = /^[0-9.]+$/; //[4]
  if (!regex.test(key)) { //[5]
    theEvent.returnValue = false; //[6]
    if (theEvent.preventDefault) theEvent.preventDefault(); //[7]
  }
}


function isNumber(n) {
  return !isNaN(parseFloat(n)) && isFinite(n);
}

// EXPLICAÇÕES FUNCTION onlyNumber

// [1]
/* evt é um apelido dado ao parâmetro, 
   pode ser qualquer nome, os mais comuns são: e, evt e event. 
   Esta sendo usado porque quando invocamos um evento 
   é necessário que passemos a ele um primeiro argumento. */

//[2] Obtem o valor Unicode da tecla do teclado pressionada.

// [3] Retorna uma String criada para usar uma sequência específica de valores unicode.

//[4] let regex = /^[0-9.,]+$/, valores a serem rejeitados.

// [5] Condicionais para testar se as keypress são letras ou números.

//[6] Retorna o valor da função.

//[7] Impede que a ação padrão de um elemento aconteça.
