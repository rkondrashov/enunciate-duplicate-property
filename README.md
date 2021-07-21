# enunciate-duplicate-property

Sample project to reproduce generation of duplicate properties with jackson annotation @JsonProperty and lombok.

Steps to reproduce:

1. Clone the project.
2. Execute `mvn clean generate-resources`.
3. Take a look at the generated documetation for `LombokExample` and `PlainExample` data types under `target/docs/apidocs/`.
