//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.22 at 11:16:59 AM CET 
//


package no.trygdeetaten.skjema.oppdrag;

import java.math.BigDecimal;
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
 * Simulering, Output 311-rekord
 * 
 * <p>Java class for simuleringsResultat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="simuleringsResultat"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="belop" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tbelop"/&gt;
 *         &lt;element name="datoKjores" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tdato"/&gt;
 *         &lt;element name="gjelderId" type="{http://www.trygdeetaten.no/skjema/oppdrag}TfnrOrgnr"/&gt;
 *         &lt;element name="gjelderNavn" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tnavn"/&gt;
 *         &lt;element name="kodeFaggruppe" type="{http://www.trygdeetaten.no/skjema/oppdrag}TkodeFaggruppe"/&gt;
 *         &lt;element name="simuleringsPerioder" type="{http://www.trygdeetaten.no/skjema/oppdrag}simuleringsPerioder" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simuleringsResultat", propOrder = {
    "belop",
    "datoKjores",
    "gjelderId",
    "gjelderNavn",
    "kodeFaggruppe",
    "simuleringsPerioder"
})
public class SimuleringsResultat {

    @XmlElement(required = true)
    protected BigDecimal belop;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoKjores;
    @XmlElement(required = true)
    protected String gjelderId;
    @XmlElement(required = true)
    protected String gjelderNavn;
    @XmlElement(required = true)
    protected String kodeFaggruppe;
    @XmlElement(required = true)
    protected List<SimuleringsPerioder> simuleringsPerioder;

    /**
     * Gets the value of the belop property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBelop() {
        return belop;
    }

    /**
     * Sets the value of the belop property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBelop(BigDecimal value) {
        this.belop = value;
    }

    /**
     * Gets the value of the datoKjores property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoKjores() {
        return datoKjores;
    }

    /**
     * Sets the value of the datoKjores property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoKjores(XMLGregorianCalendar value) {
        this.datoKjores = value;
    }

    /**
     * Gets the value of the gjelderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGjelderId() {
        return gjelderId;
    }

    /**
     * Sets the value of the gjelderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGjelderId(String value) {
        this.gjelderId = value;
    }

    /**
     * Gets the value of the gjelderNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGjelderNavn() {
        return gjelderNavn;
    }

    /**
     * Sets the value of the gjelderNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGjelderNavn(String value) {
        this.gjelderNavn = value;
    }

    /**
     * Gets the value of the kodeFaggruppe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeFaggruppe() {
        return kodeFaggruppe;
    }

    /**
     * Sets the value of the kodeFaggruppe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeFaggruppe(String value) {
        this.kodeFaggruppe = value;
    }

    /**
     * Gets the value of the simuleringsPerioder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the simuleringsPerioder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSimuleringsPerioder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimuleringsPerioder }
     * 
     * 
     */
    public List<SimuleringsPerioder> getSimuleringsPerioder() {
        if (simuleringsPerioder == null) {
            simuleringsPerioder = new ArrayList<SimuleringsPerioder>();
        }
        return this.simuleringsPerioder;
    }

    public SimuleringsResultat withBelop(BigDecimal value) {
        setBelop(value);
        return this;
    }

    public SimuleringsResultat withDatoKjores(XMLGregorianCalendar value) {
        setDatoKjores(value);
        return this;
    }

    public SimuleringsResultat withGjelderId(String value) {
        setGjelderId(value);
        return this;
    }

    public SimuleringsResultat withGjelderNavn(String value) {
        setGjelderNavn(value);
        return this;
    }

    public SimuleringsResultat withKodeFaggruppe(String value) {
        setKodeFaggruppe(value);
        return this;
    }

    public SimuleringsResultat withSimuleringsPerioder(SimuleringsPerioder... values) {
        if (values!= null) {
            for (SimuleringsPerioder value: values) {
                getSimuleringsPerioder().add(value);
            }
        }
        return this;
    }

    public SimuleringsResultat withSimuleringsPerioder(Collection<SimuleringsPerioder> values) {
        if (values!= null) {
            getSimuleringsPerioder().addAll(values);
        }
        return this;
    }

}
