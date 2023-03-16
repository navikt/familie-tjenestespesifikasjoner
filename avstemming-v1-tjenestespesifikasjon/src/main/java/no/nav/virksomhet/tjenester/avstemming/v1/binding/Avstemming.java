
package no.nav.virksomhet.tjenester.avstemming.v1.binding;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import no.nav.virksomhet.tjenester.avstemming.informasjon.konsistensavstemmingsdata.v1.SendAsynkronKonsistensavstemmingsdataRequest;
import no.nav.virksomhet.tjenester.avstemming.meldinger.v1.SendAsynkronAvstemmingsdataRequest;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Avstemming", targetNamespace = "http://nav.no/virksomhet/tjenester/avstemming/v1")
@XmlSeeAlso({
    no.nav.virksomhet.tjenester.avstemming.informasjon.konsistensavstemmingsdata.v1.ObjectFactory.class,
    no.nav.virksomhet.tjenester.avstemming.meldinger.v1.ObjectFactory.class,
    no.nav.virksomhet.tjenester.avstemming.v1.ObjectFactory.class
})
public interface Avstemming {


    /**
     * Operasjonen mottar en asynkron melding fra PEN og sender den videre til MQ som går mot Avstemmingskomponenten (Økonomi). Alle avstemminger starter med en 110-melding hvor aksjonskoden er ’START’. Selve avstemmingsdataene overføres sammen med en 110-melding hvor aksjonskoden er ’DATA’. Alle avstemminger avsluttes med en 110-melding hvor aksjonskoden er ’AVSL’. 
     * 
     * @param request
     * @return
     *     returns java.lang.Object
     */
    @WebMethod(action = "http://nav.no/virksomhet/tjenester/avstemming/v1/BindingsendAsynkronAvstemmingsdata/")
    @WebResult(name = "plassholder", targetNamespace = "")
    @RequestWrapper(localName = "sendAsynkronAvstemmingsdata", targetNamespace = "http://nav.no/virksomhet/tjenester/avstemming/v1", className = "no.nav.virksomhet.tjenester.avstemming.v1.SendAsynkronAvstemmingsdata")
    @ResponseWrapper(localName = "sendAsynkronAvstemmingsdataResponse", targetNamespace = "http://nav.no/virksomhet/tjenester/avstemming/v1", className = "no.nav.virksomhet.tjenester.avstemming.v1.SendAsynkronAvstemmingsdataResponse")
    public Object sendAsynkronAvstemmingsdata(
        @WebParam(name = "request", targetNamespace = "")
        SendAsynkronAvstemmingsdataRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns java.lang.Object
     */
    @WebMethod(action = "http://nav.no/virksomhet/tjenester/avstemming/v1/BindingsendAsynkronKonsistensavstemmingsdata/")
    @WebResult(name = "plassholder", targetNamespace = "")
    @RequestWrapper(localName = "sendAsynkronKonsistensavstemmingsdata", targetNamespace = "http://nav.no/virksomhet/tjenester/avstemming/v1", className = "no.nav.virksomhet.tjenester.avstemming.v1.SendAsynkronKonsistensavstemmingsdata")
    @ResponseWrapper(localName = "sendAsynkronKonsistensavstemmingsdataResponse", targetNamespace = "http://nav.no/virksomhet/tjenester/avstemming/v1", className = "no.nav.virksomhet.tjenester.avstemming.v1.SendAsynkronKonsistensavstemmingsdataResponse")
    public Object sendAsynkronKonsistensavstemmingsdata(
        @WebParam(name = "request", targetNamespace = "")
        SendAsynkronKonsistensavstemmingsdataRequest request);

}
