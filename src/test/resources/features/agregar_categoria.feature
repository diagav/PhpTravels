# language : es
Característica: Agregar categoria
  Yo como usuario administrador quiero agregar una categoria en el modulo del blog
  para visualizarla en la tabla de la categoría y luego borrarla de la tabla

  Esquema del escenario: Diana quiere agregar una categoria en el modulo del blog
    para visualizarlo y luego borrarlo

    Dado que Diana quiere agregar una categoria y borrarla
    Cuando ella agrega una <categoria> en el modulo del blog
    Entonces se debe visualizar la <categoria> en la tabla de categoria

    Ejemplos: 
      | categoria    |
      | Sport Deanne |
