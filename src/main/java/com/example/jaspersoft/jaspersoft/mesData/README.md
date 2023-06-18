#### Para obter os nomes dos meses em português em Java, você pode utilizar a classe `java.time.Month` juntamente com um `Locale` específico para o idioma desejado. Aqui está um exemplo:


```java
import java.time.Month;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale locale = new Locale("pt", "BR");
        String[] nomesMeses = new String[12];

        for (int i = 0; i < 12; i++) {
            nomesMeses[i] = Month.of(i + 1).getDisplayName(TextStyle.FULL, locale);
        }

        String meses = String.join(", ", nomesMeses);
        System.out.println(meses);
    }
}
```

Neste exemplo, definimos o `Locale` como "pt" (português) e "BR" (Brasil) para garantir que os nomes dos meses sejam retornados em português do Brasil. Em seguida, utilizamos o método `getDisplayName()` da classe `Month` com o `TextStyle.FULL` para obter os nomes completos dos meses.

A saída será: "janeiro, fevereiro, março, abril, maio, junho, julho, agosto, setembro, outubro, novembro, dezembro".

Dessa forma, os nomes dos meses serão exibidos em português de acordo com o Locale especificado.