
package no.nav.system.os.tjenester.simulerfpservice.simulerfpservicegrensesnitt;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import no.nav.system.os.tjenester.simulerfpservice.feil.FeilUnderBehandling;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.nav.system.os.tjenester.simulerfpservice.simulerfpservicegrensesnitt package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _SendInnOppdragFeilUnderBehandling_QNAME = new QName("http://nav.no/system/os/tjenester/simulerFpService/simulerFpServiceGrensesnitt", "sendInnOppdragFeilUnderBehandling");
    private static final QName _SimulerBeregningFeilUnderBehandling_QNAME = new QName("http://nav.no/system/os/tjenester/simulerFpService/simulerFpServiceGrensesnitt", "simulerBeregningFeilUnderBehandling");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.nav.system.os.tjenester.simulerfpservice.simulerfpservicegrensesnitt
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendInnOppdragRequest }
     * 
     * @return
     *     the new instance of {@link SendInnOppdragRequest }
     */
    public SendInnOppdragRequest createSendInnOppdragRequest() {
        return new SendInnOppdragRequest();
    }

    /**
     * Create an instance of {@link SendInnOppdragResponse }
     * 
     * @return
     *     the new instance of {@link SendInnOppdragResponse }
     */
    public SendInnOppdragResponse createSendInnOppdragResponse() {
        return new SendInnOppdragResponse();
    }

    /**
     * Create an instance of {@link SimulerBeregningRequest }
     * 
     * @return
     *     the new instance of {@link SimulerBeregningRequest }
     */
    public SimulerBeregningRequest createSimulerBeregningRequest() {
        return new SimulerBeregningRequest();
    }

    /**
     * Create an instance of {@link SimulerBeregningResponse }
     * 
     * @return
     *     the new instance of {@link SimulerBeregningResponse }
     */
    public SimulerBeregningResponse createSimulerBeregningResponse() {
        return new SimulerBeregningResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeilUnderBehandling }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FeilUnderBehandling }{@code >}
     */
    @XmlElementDecl(namespace = "http://nav.no/system/os/tjenester/simulerFpService/simulerFpServiceGrensesnitt", name = "sendInnOppdragFeilUnderBehandling")
    public JAXBElement<FeilUnderBehandling> createSendInnOppdragFeilUnderBehandling(FeilUnderBehandling value) {
        return new JAXBElement<>(_SendInnOppdragFeilUnderBehandling_QNAME, FeilUnderBehandling.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FeilUnderBehandling }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FeilUnderBehandling }{@code >}
     */
    @XmlElementDecl(namespace = "http://nav.no/system/os/tjenester/simulerFpService/simulerFpServiceGrensesnitt", name = "simulerBeregningFeilUnderBehandling")
    public JAXBElement<FeilUnderBehandling> createSimulerBeregningFeilUnderBehandling(FeilUnderBehandling value) {
        return new JAXBElement<>(_SimulerBeregningFeilUnderBehandling_QNAME, FeilUnderBehandling.class, null, value);
    }

}
