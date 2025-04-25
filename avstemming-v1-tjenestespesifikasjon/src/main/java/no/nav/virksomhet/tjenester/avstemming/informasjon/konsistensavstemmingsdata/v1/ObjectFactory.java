
package no.nav.virksomhet.tjenester.avstemming.informasjon.konsistensavstemmingsdata.v1;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.nav.virksomhet.tjenester.avstemming.informasjon.konsistensavstemmingsdata.v1 package. 
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

    private static final QName _Konsistensavstemmingsdata_QNAME = new QName("http://nav.no/virksomhet/tjenester/avstemming/informasjon/konsistensavstemmingsdata/v1", "konsistensavstemmingsdata");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.nav.virksomhet.tjenester.avstemming.informasjon.konsistensavstemmingsdata.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Konsistensavstemmingsdata }
     * 
     * @return
     *     the new instance of {@link Konsistensavstemmingsdata }
     */
    public Konsistensavstemmingsdata createKonsistensavstemmingsdata() {
        return new Konsistensavstemmingsdata();
    }

    /**
     * Create an instance of {@link Valuta }
     * 
     * @return
     *     the new instance of {@link Valuta }
     */
    public Valuta createValuta() {
        return new Valuta();
    }

    /**
     * Create an instance of {@link Oppdragslinje }
     * 
     * @return
     *     the new instance of {@link Oppdragslinje }
     */
    public Oppdragslinje createOppdragslinje() {
        return new Oppdragslinje();
    }

    /**
     * Create an instance of {@link Belopsgrense }
     * 
     * @return
     *     the new instance of {@link Belopsgrense }
     */
    public Belopsgrense createBelopsgrense() {
        return new Belopsgrense();
    }

    /**
     * Create an instance of {@link Periode }
     * 
     * @return
     *     the new instance of {@link Periode }
     */
    public Periode createPeriode() {
        return new Periode();
    }

    /**
     * Create an instance of {@link Aksjonsdata }
     * 
     * @return
     *     the new instance of {@link Aksjonsdata }
     */
    public Aksjonsdata createAksjonsdata() {
        return new Aksjonsdata();
    }

    /**
     * Create an instance of {@link Totaldata }
     * 
     * @return
     *     the new instance of {@link Totaldata }
     */
    public Totaldata createTotaldata() {
        return new Totaldata();
    }

    /**
     * Create an instance of {@link Enhet }
     * 
     * @return
     *     the new instance of {@link Enhet }
     */
    public Enhet createEnhet() {
        return new Enhet();
    }

    /**
     * Create an instance of {@link Grad }
     * 
     * @return
     *     the new instance of {@link Grad }
     */
    public Grad createGrad() {
        return new Grad();
    }

    /**
     * Create an instance of {@link Oppdragsdata }
     * 
     * @return
     *     the new instance of {@link Oppdragsdata }
     */
    public Oppdragsdata createOppdragsdata() {
        return new Oppdragsdata();
    }

    /**
     * Create an instance of {@link Attestant }
     * 
     * @return
     *     the new instance of {@link Attestant }
     */
    public Attestant createAttestant() {
        return new Attestant();
    }

    /**
     * Create an instance of {@link Tekst }
     * 
     * @return
     *     the new instance of {@link Tekst }
     */
    public Tekst createTekst() {
        return new Tekst();
    }

    /**
     * Create an instance of {@link SendAsynkronKonsistensavstemmingsdataRequest }
     * 
     * @return
     *     the new instance of {@link SendAsynkronKonsistensavstemmingsdataRequest }
     */
    public SendAsynkronKonsistensavstemmingsdataRequest createSendAsynkronKonsistensavstemmingsdataRequest() {
        return new SendAsynkronKonsistensavstemmingsdataRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Konsistensavstemmingsdata }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Konsistensavstemmingsdata }{@code >}
     */
    @XmlElementDecl(namespace = "http://nav.no/virksomhet/tjenester/avstemming/informasjon/konsistensavstemmingsdata/v1", name = "konsistensavstemmingsdata")
    public JAXBElement<Konsistensavstemmingsdata> createKonsistensavstemmingsdata(Konsistensavstemmingsdata value) {
        return new JAXBElement<>(_Konsistensavstemmingsdata_QNAME, Konsistensavstemmingsdata.class, null, value);
    }

}
