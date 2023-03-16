//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.22 at 11:16:59 AM CET 
//


package no.trygdeetaten.skjema.oppdrag;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Inneholder elementene som skal være med i en output 111-rekord, Oppdragstatus
 *             
 * 
 * <p>Java class for oppdrags-status-111 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oppdrags-status-111"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kodeStatus" type="{http://www.trygdeetaten.no/skjema/oppdrag}TkodeStatus"/&gt;
 *         &lt;element name="datoStatusFom" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tdato"/&gt;
 *         &lt;element name="tidspktReg" type="{http://www.trygdeetaten.no/skjema/oppdrag}TtidspktReg"/&gt;
 *         &lt;element name="saksbehId" type="{http://www.trygdeetaten.no/skjema/oppdrag}TsaksbehId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oppdrags-status-111", propOrder = {
    "kodeStatus",
    "datoStatusFom",
    "tidspktReg",
    "saksbehId"
})
public class OppdragsStatus111 {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TkodeStatus kodeStatus;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoStatusFom;
    @XmlElement(required = true)
    protected String tidspktReg;
    @XmlElement(required = true)
    protected String saksbehId;

    /**
     * Gets the value of the kodeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TkodeStatus }
     *     
     */
    public TkodeStatus getKodeStatus() {
        return kodeStatus;
    }

    /**
     * Sets the value of the kodeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TkodeStatus }
     *     
     */
    public void setKodeStatus(TkodeStatus value) {
        this.kodeStatus = value;
    }

    /**
     * Gets the value of the datoStatusFom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoStatusFom() {
        return datoStatusFom;
    }

    /**
     * Sets the value of the datoStatusFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoStatusFom(XMLGregorianCalendar value) {
        this.datoStatusFom = value;
    }

    /**
     * Gets the value of the tidspktReg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTidspktReg() {
        return tidspktReg;
    }

    /**
     * Sets the value of the tidspktReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTidspktReg(String value) {
        this.tidspktReg = value;
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

    public OppdragsStatus111 withKodeStatus(TkodeStatus value) {
        setKodeStatus(value);
        return this;
    }

    public OppdragsStatus111 withDatoStatusFom(XMLGregorianCalendar value) {
        setDatoStatusFom(value);
        return this;
    }

    public OppdragsStatus111 withTidspktReg(String value) {
        setTidspktReg(value);
        return this;
    }

    public OppdragsStatus111 withSaksbehId(String value) {
        setSaksbehId(value);
        return this;
    }

}