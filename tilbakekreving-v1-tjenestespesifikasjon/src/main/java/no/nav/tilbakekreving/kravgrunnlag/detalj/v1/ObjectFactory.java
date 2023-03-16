
package no.nav.tilbakekreving.kravgrunnlag.detalj.v1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the no.nav.tilbakekreving.kravgrunnlag.detalj.v1 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: no.nav.tilbakekreving.kravgrunnlag.detalj.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DetaljertKravgrunnlagDto }
     * 
     */
    public DetaljertKravgrunnlagDto createDetaljertKravgrunnlagDto() {
        return new DetaljertKravgrunnlagDto();
    }

    /**
     * Create an instance of {@link HentKravgrunnlagDetaljDto }
     * 
     */
    public HentKravgrunnlagDetaljDto createHentKravgrunnlagDetaljDto() {
        return new HentKravgrunnlagDetaljDto();
    }

    /**
     * Create an instance of {@link DetaljertKravgrunnlagPeriodeDto }
     * 
     */
    public DetaljertKravgrunnlagPeriodeDto createDetaljertKravgrunnlagPeriodeDto() {
        return new DetaljertKravgrunnlagPeriodeDto();
    }

    /**
     * Create an instance of {@link DetaljertKravgrunnlagBelopDto }
     * 
     */
    public DetaljertKravgrunnlagBelopDto createDetaljertKravgrunnlagBelopDto() {
        return new DetaljertKravgrunnlagBelopDto();
    }

}