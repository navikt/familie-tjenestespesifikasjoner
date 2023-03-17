# familie-tjenestespesifikasjoner

Det er valgt å generere filene til `src/main/java` i stedet for `target/generated-sources/...` for å faktiskt kunne se forskjell i hva som blir generert i en endring.

### Bakgrunn
Denne erstatter familie sitt behov av https://github.com/navikt/tjenestespesifikasjoner då denne fortsatt kjører på `javax` og ikke `jakarta`.
I tillegg så er xsd'er dratt inn i `familie-tilbake` og `familie-oppdrag` for å overskrive genererte klasser, med bruk av `LocalDate` i stedet `XMLGregorianCalendar`

Man må generere filer lokalt, dette gjøres for å kunne følge med på endringer som gjøres i javaobjekten som blir generert.

## Generer nye filer lokalt
Når man genererer nye filer så slettes også allt under `*/src/main/java`, og sen genererer helt nye filer. 
```bash
mvn clean install -Pclear-and-generate
```

