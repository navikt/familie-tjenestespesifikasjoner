//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.22 at 11:16:59 AM CET 
//


package no.trygdeetaten.skjema.oppdrag;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Simulering, Output 313-rekord
 * 
 * <p>Java class for simuleringsStoppNivaa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="simuleringsStoppNivaa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="behandlendeEnhet" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tenhet"/&gt;
 *         &lt;element name="bilagsType" type="{http://www.trygdeetaten.no/skjema/oppdrag}TbilagsType"/&gt;
 *         &lt;element name="fagsystemId" type="{http://www.trygdeetaten.no/skjema/oppdrag}TfagsystemId"/&gt;
 *         &lt;element name="feilkonto" type="{http://www.trygdeetaten.no/skjema/oppdrag}TJaNei"/&gt;
 *         &lt;element name="forfall" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tdato"/&gt;
 *         &lt;element name="kid" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tkid"/&gt;
 *         &lt;element name="kodeFagomraade" type="{http://www.trygdeetaten.no/skjema/oppdrag}TkodeFagomraade"/&gt;
 *         &lt;element name="simuleringsLinjer" type="{http://www.trygdeetaten.no/skjema/oppdrag}simuleringsLinjer" maxOccurs="unbounded"/&gt;
 *         &lt;element name="oppdragsId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="stoppnivaId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="utbetalesTilId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="utbetalesTilNavn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simuleringsStoppNivaa", propOrder = {
    "behandlendeEnhet",
    "bilagsType",
    "fagsystemId",
    "feilkonto",
    "forfall",
    "kid",
    "kodeFagomraade",
    "simuleringsLinjer",
    "oppdragsId",
    "stoppnivaId",
    "utbetalesTilId",
    "utbetalesTilNavn"
})
public class SimuleringsStoppNivaa {

    @XmlElement(required = true)
    protected String behandlendeEnhet;
    @XmlElement(required = true)
    protected String bilagsType;
    @XmlElement(required = true)
    protected String fagsystemId;
    @XmlElement(required = true)
    protected String feilkonto;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar forfall;
    @XmlElement(required = true)
    protected String kid;
    @XmlElement(required = true)
    protected String kodeFagomraade;
    @XmlElement(required = true)
    protected List<SimuleringsLinjer> simuleringsLinjer;
    protected long oppdragsId;
    protected int stoppnivaId;
    @XmlElement(required = true)
    protected String utbetalesTilId;
    @XmlElement(required = true)
    protected String utbetalesTilNavn;

    /**
     * Gets the value of the behandlendeEnhet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBehandlendeEnhet() {
        return behandlendeEnhet;
    }

    /**
     * Sets the value of the behandlendeEnhet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBehandlendeEnhet(String value) {
        this.behandlendeEnhet = value;
    }

    /**
     * Gets the value of the bilagsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilagsType() {
        return bilagsType;
    }

    /**
     * Sets the value of the bilagsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilagsType(String value) {
        this.bilagsType = value;
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
     * Gets the value of the feilkonto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeilkonto() {
        return feilkonto;
    }

    /**
     * Sets the value of the feilkonto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeilkonto(String value) {
        this.feilkonto = value;
    }

    /**
     * Gets the value of the forfall property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getForfall() {
        return forfall;
    }

    /**
     * Sets the value of the forfall property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setForfall(XMLGregorianCalendar value) {
        this.forfall = value;
    }

    /**
     * Gets the value of the kid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKid() {
        return kid;
    }

    /**
     * Sets the value of the kid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKid(String value) {
        this.kid = value;
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
     * Gets the value of the simuleringsLinjer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simuleringsLinjer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimuleringsLinjer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimuleringsLinjer }
     * 
     * 
     */
    public List<SimuleringsLinjer> getSimuleringsLinjer() {
        if (simuleringsLinjer == null) {
            simuleringsLinjer = new ArrayList<SimuleringsLinjer>();
        }
        return this.simuleringsLinjer;
    }

    /**
     * Gets the value of the oppdragsId property.
     * 
     */
    public long getOppdragsId() {
        return oppdragsId;
    }

    /**
     * Sets the value of the oppdragsId property.
     * 
     */
    public void setOppdragsId(long value) {
        this.oppdragsId = value;
    }

    /**
     * Gets the value of the stoppnivaId property.
     * 
     */
    public int getStoppnivaId() {
        return stoppnivaId;
    }

    /**
     * Sets the value of the stoppnivaId property.
     * 
     */
    public void setStoppnivaId(int value) {
        this.stoppnivaId = value;
    }

    /**
     * Gets the value of the utbetalesTilId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtbetalesTilId() {
        return utbetalesTilId;
    }

    /**
     * Sets the value of the utbetalesTilId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtbetalesTilId(String value) {
        this.utbetalesTilId = value;
    }

    /**
     * Gets the value of the utbetalesTilNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtbetalesTilNavn() {
        return utbetalesTilNavn;
    }

    /**
     * Sets the value of the utbetalesTilNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtbetalesTilNavn(String value) {
        this.utbetalesTilNavn = value;
    }

    public SimuleringsStoppNivaa withBehandlendeEnhet(String value) {
        setBehandlendeEnhet(value);
        return this;
    }

    public SimuleringsStoppNivaa withBilagsType(String value) {
        setBilagsType(value);
        return this;
    }

    public SimuleringsStoppNivaa withFagsystemId(String value) {
        setFagsystemId(value);
        return this;
    }

    public SimuleringsStoppNivaa withFeilkonto(String value) {
        setFeilkonto(value);
        return this;
    }

    public SimuleringsStoppNivaa withForfall(XMLGregorianCalendar value) {
        setForfall(value);
        return this;
    }

    public SimuleringsStoppNivaa withKid(String value) {
        setKid(value);
        return this;
    }

    public SimuleringsStoppNivaa withKodeFagomraade(String value) {
        setKodeFagomraade(value);
        return this;
    }

    public SimuleringsStoppNivaa withSimuleringsLinjer(SimuleringsLinjer... values) {
        if (values!= null) {
            for (SimuleringsLinjer value: values) {
                getSimuleringsLinjer().add(value);
            }
        }
        return this;
    }

    public SimuleringsStoppNivaa withSimuleringsLinjer(Collection<SimuleringsLinjer> values) {
        if (values!= null) {
            getSimuleringsLinjer().addAll(values);
        }
        return this;
    }

    public SimuleringsStoppNivaa withOppdragsId(long value) {
        setOppdragsId(value);
        return this;
    }

    public SimuleringsStoppNivaa withStoppnivaId(int value) {
        setStoppnivaId(value);
        return this;
    }

    public SimuleringsStoppNivaa withUtbetalesTilId(String value) {
        setUtbetalesTilId(value);
        return this;
    }

    public SimuleringsStoppNivaa withUtbetalesTilNavn(String value) {
        setUtbetalesTilNavn(value);
        return this;
    }

}
