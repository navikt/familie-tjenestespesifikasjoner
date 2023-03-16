
package no.nav.okonomi.tilbakekrevingservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TilbakekrevingPortType", targetNamespace = "http://okonomi.nav.no/tilbakekrevingService/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    no.nav.okonomi.tilbakekrevingservice.ObjectFactory.class,
    no.nav.tilbakekreving.kravgrunnlag.annuller.v1.ObjectFactory.class,
    no.nav.tilbakekreving.kravgrunnlag.detalj.v1.ObjectFactory.class,
    no.nav.tilbakekreving.kravgrunnlag.hentliste.v1.ObjectFactory.class,
    no.nav.tilbakekreving.tilbakekrevingsvedtak.vedtak.v1.ObjectFactory.class,
    no.nav.tilbakekreving.typer.v1.ObjectFactory.class
})
public interface TilbakekrevingPortType {


    /**
     * 
     * @param request
     * @return
     *     returns no.nav.okonomi.tilbakekrevingservice.TilbakekrevingsvedtakResponse
     */
    @WebMethod(action = "http://okonomi.nav.no/tilbakekrevingService/TilbakekrevingPortType/tilbakekrevingsvedtakRequest")
    @WebResult(name = "tilbakekrevingsvedtakResponse", targetNamespace = "http://okonomi.nav.no/tilbakekrevingService/", partName = "response")
    public TilbakekrevingsvedtakResponse tilbakekrevingsvedtak(
        @WebParam(name = "tilbakekrevingsvedtakRequest", targetNamespace = "http://okonomi.nav.no/tilbakekrevingService/", partName = "request")
        TilbakekrevingsvedtakRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns no.nav.okonomi.tilbakekrevingservice.KravgrunnlagHentListeResponse
     */
    @WebMethod(action = "http://okonomi.nav.no/tilbakekrevingService/TilbakekrevingPortType/kravgrunnlagHentListeRequest")
    @WebResult(name = "kravgrunnlagHentListeResponse", targetNamespace = "http://okonomi.nav.no/tilbakekrevingService/", partName = "response")
    public KravgrunnlagHentListeResponse kravgrunnlagHentListe(
        @WebParam(name = "kravgrunnlagHentListeRequest", targetNamespace = "http://okonomi.nav.no/tilbakekrevingService/", partName = "request")
        KravgrunnlagHentListeRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns no.nav.okonomi.tilbakekrevingservice.KravgrunnlagHentDetaljResponse
     */
    @WebMethod(action = "http://okonomi.nav.no/tilbakekrevingService/TilbakekrevingPortType/kravgrunnlagHentDetaljRequest")
    @WebResult(name = "kravgrunnlagHentDetaljResponse", targetNamespace = "http://okonomi.nav.no/tilbakekrevingService/", partName = "response")
    public KravgrunnlagHentDetaljResponse kravgrunnlagHentDetalj(
        @WebParam(name = "kravgrunnlagHentDetaljRequest", targetNamespace = "http://okonomi.nav.no/tilbakekrevingService/", partName = "request")
        KravgrunnlagHentDetaljRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns no.nav.okonomi.tilbakekrevingservice.KravgrunnlagAnnulerResponse
     */
    @WebMethod(action = "http://okonomi.nav.no/tilbakekrevingService/TilbakekrevingPortType/kravgrunnlagAnnulerRequest")
    @WebResult(name = "kravgrunnlagAnnulerResponse", targetNamespace = "http://okonomi.nav.no/tilbakekrevingService/", partName = "response")
    public KravgrunnlagAnnulerResponse kravgrunnlagAnnuler(
        @WebParam(name = "kravgrunnlagAnnulerRequest", targetNamespace = "http://okonomi.nav.no/tilbakekrevingService/", partName = "request")
        KravgrunnlagAnnulerRequest request);

}