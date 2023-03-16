
package no.nav.okonomi.tilbakekrevingservice;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.nav.okonomi.tilbakekrevingservice package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.nav.okonomi.tilbakekrevingservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TilbakekrevingsvedtakRequest }
     * 
     */
    public TilbakekrevingsvedtakRequest createTilbakekrevingsvedtakRequest() {
        return new TilbakekrevingsvedtakRequest();
    }

    /**
     * Create an instance of {@link TilbakekrevingsvedtakResponse }
     * 
     */
    public TilbakekrevingsvedtakResponse createTilbakekrevingsvedtakResponse() {
        return new TilbakekrevingsvedtakResponse();
    }

    /**
     * Create an instance of {@link KravgrunnlagHentListeRequest }
     * 
     */
    public KravgrunnlagHentListeRequest createKravgrunnlagHentListeRequest() {
        return new KravgrunnlagHentListeRequest();
    }

    /**
     * Create an instance of {@link KravgrunnlagHentListeResponse }
     * 
     */
    public KravgrunnlagHentListeResponse createKravgrunnlagHentListeResponse() {
        return new KravgrunnlagHentListeResponse();
    }

    /**
     * Create an instance of {@link KravgrunnlagHentDetaljRequest }
     * 
     */
    public KravgrunnlagHentDetaljRequest createKravgrunnlagHentDetaljRequest() {
        return new KravgrunnlagHentDetaljRequest();
    }

    /**
     * Create an instance of {@link KravgrunnlagHentDetaljResponse }
     * 
     */
    public KravgrunnlagHentDetaljResponse createKravgrunnlagHentDetaljResponse() {
        return new KravgrunnlagHentDetaljResponse();
    }

    /**
     * Create an instance of {@link KravgrunnlagAnnulerRequest }
     * 
     */
    public KravgrunnlagAnnulerRequest createKravgrunnlagAnnulerRequest() {
        return new KravgrunnlagAnnulerRequest();
    }

    /**
     * Create an instance of {@link KravgrunnlagAnnulerResponse }
     * 
     */
    public KravgrunnlagAnnulerResponse createKravgrunnlagAnnulerResponse() {
        return new KravgrunnlagAnnulerResponse();
    }

}
