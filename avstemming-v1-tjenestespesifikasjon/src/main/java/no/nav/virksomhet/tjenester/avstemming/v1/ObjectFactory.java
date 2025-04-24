
package no.nav.virksomhet.tjenester.avstemming.v1;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.nav.virksomhet.tjenester.avstemming.v1 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.nav.virksomhet.tjenester.avstemming.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SendAsynkronAvstemmingsdata }
     * 
     * @return
     *     the new instance of {@link SendAsynkronAvstemmingsdata }
     */
    public SendAsynkronAvstemmingsdata createSendAsynkronAvstemmingsdata() {
        return new SendAsynkronAvstemmingsdata();
    }

    /**
     * Create an instance of {@link SendAsynkronAvstemmingsdataResponse }
     * 
     * @return
     *     the new instance of {@link SendAsynkronAvstemmingsdataResponse }
     */
    public SendAsynkronAvstemmingsdataResponse createSendAsynkronAvstemmingsdataResponse() {
        return new SendAsynkronAvstemmingsdataResponse();
    }

    /**
     * Create an instance of {@link SendAsynkronKonsistensavstemmingsdata }
     * 
     * @return
     *     the new instance of {@link SendAsynkronKonsistensavstemmingsdata }
     */
    public SendAsynkronKonsistensavstemmingsdata createSendAsynkronKonsistensavstemmingsdata() {
        return new SendAsynkronKonsistensavstemmingsdata();
    }

    /**
     * Create an instance of {@link SendAsynkronKonsistensavstemmingsdataResponse }
     * 
     * @return
     *     the new instance of {@link SendAsynkronKonsistensavstemmingsdataResponse }
     */
    public SendAsynkronKonsistensavstemmingsdataResponse createSendAsynkronKonsistensavstemmingsdataResponse() {
        return new SendAsynkronKonsistensavstemmingsdataResponse();
    }

}
