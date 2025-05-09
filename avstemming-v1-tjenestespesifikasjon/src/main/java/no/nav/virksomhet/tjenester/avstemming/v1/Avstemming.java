package no.nav.virksomhet.tjenester.avstemming.v1;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.1.1
 * 2025-04-24T22:50:51.706+02:00
 * Generated source version: 4.1.1
 *
 */
@WebService(targetNamespace = "http://nav.no/virksomhet/tjenester/avstemming/v1", name = "Avstemming")
@XmlSeeAlso({ObjectFactory.class, no.nav.virksomhet.tjenester.avstemming.meldinger.v1.ObjectFactory.class, no.nav.virksomhet.tjenester.avstemming.informasjon.konsistensavstemmingsdata.v1.ObjectFactory.class})
public interface Avstemming {

    /**
     * Operasjonen mottar en asynkron melding fra PEN og sender den videre til MQ som går mot Avstemmingskomponenten (Økonomi). Alle avstemminger starter med en 110-melding hvor aksjonskoden er ’START’. Selve avstemmingsdataene overføres sammen med en 110-melding hvor aksjonskoden er ’DATA’. Alle avstemminger avsluttes med en 110-melding hvor aksjonskoden er ’AVSL’. 
     */
    @WebMethod
    @RequestWrapper(localName = "sendAsynkronAvstemmingsdata", targetNamespace = "http://nav.no/virksomhet/tjenester/avstemming/v1", className = "no.nav.virksomhet.tjenester.avstemming.v1.SendAsynkronAvstemmingsdata")
    @ResponseWrapper(localName = "sendAsynkronAvstemmingsdataResponse", targetNamespace = "http://nav.no/virksomhet/tjenester/avstemming/v1", className = "no.nav.virksomhet.tjenester.avstemming.v1.SendAsynkronAvstemmingsdataResponse")
    @WebResult(name = "plassholder", targetNamespace = "")
    public java.lang.Object sendAsynkronAvstemmingsdata(

        @WebParam(name = "request", targetNamespace = "")
        no.nav.virksomhet.tjenester.avstemming.meldinger.v1.SendAsynkronAvstemmingsdataRequest request
    );

    @WebMethod
    @RequestWrapper(localName = "sendAsynkronKonsistensavstemmingsdata", targetNamespace = "http://nav.no/virksomhet/tjenester/avstemming/v1", className = "no.nav.virksomhet.tjenester.avstemming.v1.SendAsynkronKonsistensavstemmingsdata")
    @ResponseWrapper(localName = "sendAsynkronKonsistensavstemmingsdataResponse", targetNamespace = "http://nav.no/virksomhet/tjenester/avstemming/v1", className = "no.nav.virksomhet.tjenester.avstemming.v1.SendAsynkronKonsistensavstemmingsdataResponse")
    @WebResult(name = "plassholder", targetNamespace = "")
    public java.lang.Object sendAsynkronKonsistensavstemmingsdata(

        @WebParam(name = "request", targetNamespace = "")
        no.nav.virksomhet.tjenester.avstemming.informasjon.konsistensavstemmingsdata.v1.SendAsynkronKonsistensavstemmingsdataRequest request
    );
}
