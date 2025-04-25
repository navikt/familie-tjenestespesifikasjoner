
package no.nav.system.os.entiteter.beregningskjema;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Referanse ID 311
 * 
 * <p>Java class for beregning complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="beregning">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="gjelderId" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}fnrOrgnr"/>
 *         <element name="gjelderNavn" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}navn"/>
 *         <element name="datoBeregnet" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}dato"/>
 *         <element name="kodeFaggruppe" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}kodeFaggruppe"/>
 *         <element name="belop" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}belop"/>
 *         <element ref="{http://nav.no/system/os/entiteter/beregningSkjema}beregningsPeriode" maxOccurs="999"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beregning", propOrder = {
    "gjelderId",
    "gjelderNavn",
    "datoBeregnet",
    "kodeFaggruppe",
    "belop",
    "beregningsPeriode"
})
public class Beregning {

    @XmlElement(required = true)
    protected String gjelderId;
    @XmlElement(required = true)
    protected String gjelderNavn;
    /**
     * Ved simuleringsberegning gjelder dette datoen beregning vil kjøres på
     * 
     */
    @XmlElement(required = true)
    protected String datoBeregnet;
    @XmlElement(required = true)
    protected String kodeFaggruppe;
    @XmlElement(required = true)
    protected BigDecimal belop;
    /**
     * Referanse ID 312
     * 
     */
    @XmlElement(namespace = "http://nav.no/system/os/entiteter/beregningSkjema", required = true)
    protected List<BeregningsPeriode> beregningsPeriode;

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
     * Ved simuleringsberegning gjelder dette datoen beregning vil kjøres på
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoBeregnet() {
        return datoBeregnet;
    }

    /**
     * Sets the value of the datoBeregnet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     * @see #getDatoBeregnet()
     */
    public void setDatoBeregnet(String value) {
        this.datoBeregnet = value;
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
     * Referanse ID 312
     * 
     * Gets the value of the beregningsPeriode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beregningsPeriode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBeregningsPeriode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeregningsPeriode }
     * </p>
     * 
     * 
     * @return
     *     The value of the beregningsPeriode property.
     */
    public List<BeregningsPeriode> getBeregningsPeriode() {
        if (beregningsPeriode == null) {
            beregningsPeriode = new ArrayList<>();
        }
        return this.beregningsPeriode;
    }

}
