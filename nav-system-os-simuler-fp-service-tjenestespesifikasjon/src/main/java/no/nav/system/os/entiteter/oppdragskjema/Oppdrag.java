
package no.nav.system.os.entiteter.oppdragskjema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import no.nav.system.os.entiteter.typer.simpletypes.KodeStatus;


/**
 * Referanse ID 110
 * 
 * <p>Java class for oppdrag complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="oppdrag">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="kodeEndring">
 *           <simpleType>
 *             <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               <enumeration value="NY"/>
 *               <enumeration value="ENDR"/>
 *               <enumeration value="UEND"/>
 *             </restriction>
 *           </simpleType>
 *         </element>
 *         <element name="kodeStatus" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}kodeStatus" minOccurs="0"/>
 *         <element name="datoStatusFom" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}dato" minOccurs="0"/>
 *         <element name="kodeFagomraade" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}kodeFagomraade"/>
 *         <element name="fagsystemId" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}fagsystemId" minOccurs="0"/>
 *         <element name="oppdragsId" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}oppdragsId" minOccurs="0"/>
 *         <element name="utbetFrekvens" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}utbetFrekvens" minOccurs="0"/>
 *         <element name="datoForfall" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}dato" minOccurs="0"/>
 *         <element name="stonadId" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}stonadId" minOccurs="0"/>
 *         <element name="oppdragGjelderId" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}fnrOrgnr"/>
 *         <element name="datoOppdragGjelderFom" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}dato"/>
 *         <element name="saksbehId" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}saksbehId"/>
 *         <element ref="{http://nav.no/system/os/entiteter/oppdragSkjema}enhet" maxOccurs="2" minOccurs="0"/>
 *         <element ref="{http://nav.no/system/os/entiteter/oppdragSkjema}belopsgrense" maxOccurs="50" minOccurs="0"/>
 *         <element ref="{http://nav.no/system/os/entiteter/oppdragSkjema}tekst" maxOccurs="50" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oppdrag", propOrder = {
    "kodeEndring",
    "kodeStatus",
    "datoStatusFom",
    "kodeFagomraade",
    "fagsystemId",
    "oppdragsId",
    "utbetFrekvens",
    "datoForfall",
    "stonadId",
    "oppdragGjelderId",
    "datoOppdragGjelderFom",
    "saksbehId",
    "enhet",
    "belopsgrense",
    "tekst"
})
@XmlSeeAlso({
    no.nav.system.os.tjenester.simulerfpservice.simulerfpserviceservicetypes.Oppdrag.class
})
public class Oppdrag {

    @XmlElement(required = true)
    protected String kodeEndring;
    @XmlSchemaType(name = "string")
    protected KodeStatus kodeStatus;
    protected String datoStatusFom;
    @XmlElement(required = true)
    protected String kodeFagomraade;
    protected String fagsystemId;
    protected Long oppdragsId;
    protected String utbetFrekvens;
    protected String datoForfall;
    protected String stonadId;
    @XmlElement(required = true)
    protected String oppdragGjelderId;
    @XmlElement(required = true)
    protected String datoOppdragGjelderFom;
    @XmlElement(required = true)
    protected String saksbehId;
    /**
     * Referanse ID 160 dersom enhet på nivå oppdragslinje
     * 
     */
    @XmlElement(namespace = "http://nav.no/system/os/entiteter/oppdragSkjema")
    protected List<Enhet> enhet;
    /**
     * Referanse ID 130
     * 
     */
    @XmlElement(namespace = "http://nav.no/system/os/entiteter/oppdragSkjema")
    protected List<Belopsgrense> belopsgrense;
    /**
     * Referanse ID 158 dersom tekst tihørende oppdragslinje
     * 
     */
    @XmlElement(namespace = "http://nav.no/system/os/entiteter/oppdragSkjema")
    protected List<Tekst> tekst;

    /**
     * Gets the value of the kodeEndring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeEndring() {
        return kodeEndring;
    }

    /**
     * Sets the value of the kodeEndring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeEndring(String value) {
        this.kodeEndring = value;
    }

    /**
     * Gets the value of the kodeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link KodeStatus }
     *     
     */
    public KodeStatus getKodeStatus() {
        return kodeStatus;
    }

    /**
     * Sets the value of the kodeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link KodeStatus }
     *     
     */
    public void setKodeStatus(KodeStatus value) {
        this.kodeStatus = value;
    }

    /**
     * Gets the value of the datoStatusFom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoStatusFom() {
        return datoStatusFom;
    }

    /**
     * Sets the value of the datoStatusFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoStatusFom(String value) {
        this.datoStatusFom = value;
    }

    /**
     * Gets the value of the kodeFagomraade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeFagomraade() {
        return kodeFagomraade;
    }

    /**
     * Sets the value of the kodeFagomraade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeFagomraade(String value) {
        this.kodeFagomraade = value;
    }

    /**
     * Gets the value of the fagsystemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFagsystemId() {
        return fagsystemId;
    }

    /**
     * Sets the value of the fagsystemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFagsystemId(String value) {
        this.fagsystemId = value;
    }

    /**
     * Gets the value of the oppdragsId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOppdragsId() {
        return oppdragsId;
    }

    /**
     * Sets the value of the oppdragsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOppdragsId(Long value) {
        this.oppdragsId = value;
    }

    /**
     * Gets the value of the utbetFrekvens property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtbetFrekvens() {
        return utbetFrekvens;
    }

    /**
     * Sets the value of the utbetFrekvens property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtbetFrekvens(String value) {
        this.utbetFrekvens = value;
    }

    /**
     * Gets the value of the datoForfall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoForfall() {
        return datoForfall;
    }

    /**
     * Sets the value of the datoForfall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoForfall(String value) {
        this.datoForfall = value;
    }

    /**
     * Gets the value of the stonadId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStonadId() {
        return stonadId;
    }

    /**
     * Sets the value of the stonadId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStonadId(String value) {
        this.stonadId = value;
    }

    /**
     * Gets the value of the oppdragGjelderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOppdragGjelderId() {
        return oppdragGjelderId;
    }

    /**
     * Sets the value of the oppdragGjelderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOppdragGjelderId(String value) {
        this.oppdragGjelderId = value;
    }

    /**
     * Gets the value of the datoOppdragGjelderFom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoOppdragGjelderFom() {
        return datoOppdragGjelderFom;
    }

    /**
     * Sets the value of the datoOppdragGjelderFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoOppdragGjelderFom(String value) {
        this.datoOppdragGjelderFom = value;
    }

    /**
     * Gets the value of the saksbehId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaksbehId() {
        return saksbehId;
    }

    /**
     * Sets the value of the saksbehId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaksbehId(String value) {
        this.saksbehId = value;
    }

    /**
     * Referanse ID 160 dersom enhet på nivå oppdragslinje
     * 
     * Gets the value of the enhet property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enhet property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getEnhet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Enhet }
     * </p>
     * 
     * 
     * @return
     *     The value of the enhet property.
     */
    public List<Enhet> getEnhet() {
        if (enhet == null) {
            enhet = new ArrayList<>();
        }
        return this.enhet;
    }

    /**
     * Referanse ID 130
     * 
     * Gets the value of the belopsgrense property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the belopsgrense property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBelopsgrense().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Belopsgrense }
     * </p>
     * 
     * 
     * @return
     *     The value of the belopsgrense property.
     */
    public List<Belopsgrense> getBelopsgrense() {
        if (belopsgrense == null) {
            belopsgrense = new ArrayList<>();
        }
        return this.belopsgrense;
    }

    /**
     * Referanse ID 158 dersom tekst tihørende oppdragslinje
     * 
     * Gets the value of the tekst property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tekst property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getTekst().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tekst }
     * </p>
     * 
     * 
     * @return
     *     The value of the tekst property.
     */
    public List<Tekst> getTekst() {
        if (tekst == null) {
            tekst = new ArrayList<>();
        }
        return this.tekst;
    }

}
