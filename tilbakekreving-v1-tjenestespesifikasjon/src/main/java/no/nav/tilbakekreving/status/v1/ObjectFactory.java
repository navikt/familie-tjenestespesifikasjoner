
package no.nav.tilbakekreving.status.v1;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.nav.tilbakekreving.status.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.nav.tilbakekreving.status.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EndringKravOgVedtakstatus }
     * 
     */
    public EndringKravOgVedtakstatus createEndringKravOgVedtakstatus() {
        return new EndringKravOgVedtakstatus();
    }

    /**
     * Create an instance of {@link KravOgVedtakstatus }
     * 
     */
    public KravOgVedtakstatus createKravOgVedtakstatus() {
        return new KravOgVedtakstatus();
    }

}
