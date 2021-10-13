# Java 11 - Novidades
- <b>String.lines(str): </b> Retorna um stream de linhas separadas em cada posição de acordo com o caracterer <b>/n</b> de quebra de linha lidos no texto original.
- <b>String.writeString(path, string, StandardCharsets.UTF_8, options): </b>
  - Escreve uma string em um arquivo.
  - Possui duas sobrecargas:
    - 1ª: Escreve toda string em um arquivo usando UTF-8 charset.
    - 2ª: Escreve toda string em um arquivo usando o charset especificado no terceiro parâmetro.
  - O parâmetro options especifica como o arquivo é aberto.
