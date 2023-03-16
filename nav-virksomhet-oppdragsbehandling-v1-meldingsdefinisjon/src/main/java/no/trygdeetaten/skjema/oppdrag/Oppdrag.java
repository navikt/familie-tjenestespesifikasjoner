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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Dette er root-elementet mot Oppdrag
 * 
 * <p>Java class for oppdrag complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oppdrag"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mmel" type="{http://www.trygdeetaten.no/skjema/oppdrag}mmel" minOccurs="0"/&gt;
 *         &lt;element name="oppdrag-110" type="{http://www.trygdeetaten.no/skjema/oppdrag}oppdrag-110" minOccurs="0"/&gt;
 *         &lt;element name="hent-oppdrag-195" type="{http://www.trygdeetaten.no/skjema/oppdrag}hent-oppdrag-195" minOccurs="0"/&gt;
 *         &lt;element name="simulerings-periode-300" type="{http://www.trygdeetaten.no/skjema/oppdrag}simulerings-periode-300" minOccurs="0"/&gt;
 *         &lt;element name="simulerings-resultat-301" type="{http://www.trygdeetaten.no/skjema/oppdrag}simulerings-resultat-301" minOccurs="0"/&gt;
 *         &lt;element name="avstemming-610" type="{http://www.trygdeetaten.no/skjema/oppdrag}avstemming-610" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oppdrag", propOrder = {
    "mmel",
    "oppdrag110",
    "hentOppdrag195",
    "simuleringsPeriode300",
    "simuleringsResultat301",
    "avstemming610"
})
@XmlRootElement(name = "oppdrag")
public class Oppdrag {

    protected Mmel mmel;
    @XmlElement(name = "oppdrag-110")
    protected Oppdrag110 oppdrag110;
    @XmlElement(name = "hent-oppdrag-195")
    protected HentOppdrag195 hentOppdrag195;
    @XmlElement(name = "simulerings-periode-300")
    protected SimuleringsPeriode300 simuleringsPeriode300;
    @XmlElement(name = "simulerings-resultat-301")
    protected SimuleringsResultat301 simuleringsResultat301;
    @XmlElement(name = "avstemming-610")
    protected Avstemming610 avstemming610;

    /**
     * Gets the value of the mmel property.
     * 
     * @return
     *     possible object is
     *     {@link Mmel }
     *     
     */
    public Mmel getMmel() {
        return mmel;
    }

    /**
     * Sets the value of the mmel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mmel }
     *     
     */
    public void setMmel(Mmel value) {
        this.mmel = value;
    }

    /**
     * Gets the value of the oppdrag110 property.
     * 
     * @return
     *     possible object is
     *     {@link Oppdrag110 }
     *     
     */
    public Oppdrag110 getOppdrag110() {
        return oppdrag110;
    }

    /**
     * Sets the value of the oppdrag110 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Oppdrag110 }
     *     
     */
    public void setOppdrag110(Oppdrag110 value) {
        this.oppdrag110 = value;
    }

    /**
     * Gets the value of the hentOppdrag195 property.
     * 
     * @return
     *     possible object is
     *     {@link HentOppdrag195 }
     *     
     */
    public HentOppdrag195 getHentOppdrag195() {
        return hentOppdrag195;
    }

    /**
     * Sets the value of the hentOppdrag195 property.
     * 
     * @param value
     *     allowed object is
     *     {@link HentOppdrag195 }
     *     
     */
    public void setHentOppdrag195(HentOppdrag195 value) {
        this.hentOppdrag195 = value;
    }

    /**
     * Gets the value of the simuleringsPeriode300 property.
     * 
     * @return
     *     possible object is
     *     {@link SimuleringsPeriode300 }
     *     
     */
    public SimuleringsPeriode300 getSimuleringsPeriode300() {
        return simuleringsPeriode300;
    }

    /**
     * Sets the value of the simuleringsPeriode300 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimuleringsPeriode300 }
     *     
     */
    public void setSimuleringsPeriode300(SimuleringsPeriode300 value) {
        this.simuleringsPeriode300 = value;
    }

    /**
     * Gets the value of the simuleringsResultat301 property.
     * 
     * @return
     *     possible object is
     *     {@link SimuleringsResultat301 }
     *     
     */
    public SimuleringsResultat301 getSimuleringsResultat301() {
        return simuleringsResultat301;
    }

    /**
     * Sets the value of the simuleringsResultat301 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimuleringsResultat301 }
     *     
     */
    public void setSimuleringsResultat301(SimuleringsResultat301 value) {
        this.simuleringsResultat301 = value;
    }

    /**
     * Gets the value of the avstemming610 property.
     * 
     * @return
     *     possible object is
     *     {@link Avstemming610 }
     *     
     */
    public Avstemming610 getAvstemming610() {
        return avstemming610;
    }

    /**
     * Sets the value of the avstemming610 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Avstemming610 }
     *     
     */
    public void setAvstemming610(Avstemming610 value) {
        this.avstemming610 = value;
    }

    public Oppdrag withMmel(Mmel value) {
        setMmel(value);
        return this;
    }

    public Oppdrag withOppdrag110(Oppdrag110 value) {
        setOppdrag110(value);
        return this;
    }

    public Oppdrag withHentOppdrag195(HentOppdrag195 value) {
        setHentOppdrag195(value);
        return this;
    }

    public Oppdrag withSimuleringsPeriode300(SimuleringsPeriode300 value) {
        setSimuleringsPeriode300(value);
        return this;
    }

    public Oppdrag withSimuleringsResultat301(SimuleringsResultat301 value) {
        setSimuleringsResultat301(value);
        return this;
    }

    public Oppdrag withAvstemming610(Avstemming610 value) {
        setAvstemming610(value);
        return this;
    }

}
