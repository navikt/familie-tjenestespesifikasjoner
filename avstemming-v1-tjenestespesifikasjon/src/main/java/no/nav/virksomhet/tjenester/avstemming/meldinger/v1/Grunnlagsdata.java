
package no.nav.virksomhet.tjenester.avstemming.meldinger.v1;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Grunnlagsrecord (id-130) for å skille mellom antall godkjente og avviste meldinger, antall godkjente med varsel og antall meldinger hvor avleverende system ikke har mottatt kvitteringsmelding.
 * 
 * <p>Java class for Grunnlagsdata complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Grunnlagsdata">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="godkjentAntall" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="godkjentBelop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="godkjentFortegn" type="{http://nav.no/virksomhet/tjenester/avstemming/meldinger/v1}Fortegn" minOccurs="0"/>
 *         <element name="varselAntall" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="varselBelop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="varselFortegn" type="{http://nav.no/virksomhet/tjenester/avstemming/meldinger/v1}Fortegn" minOccurs="0"/>
 *         <element name="avvistAntall" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="avvistBelop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="avvistFortegn" type="{http://nav.no/virksomhet/tjenester/avstemming/meldinger/v1}Fortegn" minOccurs="0"/>
 *         <element name="manglerAntall" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="manglerBelop" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="manglerFortegn" type="{http://nav.no/virksomhet/tjenester/avstemming/meldinger/v1}Fortegn" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Grunnlagsdata", propOrder = {
    "godkjentAntall",
    "godkjentBelop",
    "godkjentFortegn",
    "varselAntall",
    "varselBelop",
    "varselFortegn",
    "avvistAntall",
    "avvistBelop",
    "avvistFortegn",
    "manglerAntall",
    "manglerBelop",
    "manglerFortegn"
})
public class Grunnlagsdata {

    /**
     * Antall godkjente meldinger
     * 
     */
    protected int godkjentAntall;
    /**
     * Sum beløp på godkjente meldinger
     * 
     */
    protected BigDecimal godkjentBelop;
    /**
     * Angir om beløp er tillegg (T) eller fradrag (F)
     * 
     */
    @XmlSchemaType(name = "string")
    protected Fortegn godkjentFortegn;
    /**
     * Antall meldinger med varsel
     * 
     */
    protected int varselAntall;
    /**
     * Sum beløp på meldinger med varsel
     * 
     */
    protected BigDecimal varselBelop;
    /**
     * Angir om beløp er tillegg (T) eller fradrag (F)
     * 
     */
    @XmlSchemaType(name = "string")
    protected Fortegn varselFortegn;
    /**
     * Antall avviste meldinger
     * 
     */
    protected int avvistAntall;
    /**
     * Sum beløp på avviste meldinger
     * 
     */
    protected BigDecimal avvistBelop;
    /**
     * Angir om beløp er tillegg (T) eller fradrag (F)
     * 
     */
    @XmlSchemaType(name = "string")
    protected Fortegn avvistFortegn;
    /**
     * Antall meldinger hvor det ikke er mottatt kvittering
     * 
     */
    protected int manglerAntall;
    /**
     * Sum beløp på meldinger hvor det ikke er mottatt kvittering
     * 
     */
    protected BigDecimal manglerBelop;
    /**
     * Angir om beløp er tillegg (T) eller fradrag (F)
     * 
     */
    @XmlSchemaType(name = "string")
    protected Fortegn manglerFortegn;

    /**
     * Antall godkjente meldinger
     * 
     */
    public int getGodkjentAntall() {
        return godkjentAntall;
    }

    /**
     * Sets the value of the godkjentAntall property.
     * 
     */
    public void setGodkjentAntall(int value) {
        this.godkjentAntall = value;
    }

    /**
     * Sum beløp på godkjente meldinger
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGodkjentBelop() {
        return godkjentBelop;
    }

    /**
     * Sets the value of the godkjentBelop property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getGodkjentBelop()
     */
    public void setGodkjentBelop(BigDecimal value) {
        this.godkjentBelop = value;
    }

    /**
     * Angir om beløp er tillegg (T) eller fradrag (F)
     * 
     * @return
     *     possible object is
     *     {@link Fortegn }
     *     
     */
    public Fortegn getGodkjentFortegn() {
        return godkjentFortegn;
    }

    /**
     * Sets the value of the godkjentFortegn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fortegn }
     *     
     * @see #getGodkjentFortegn()
     */
    public void setGodkjentFortegn(Fortegn value) {
        this.godkjentFortegn = value;
    }

    /**
     * Antall meldinger med varsel
     * 
     */
    public int getVarselAntall() {
        return varselAntall;
    }

    /**
     * Sets the value of the varselAntall property.
     * 
     */
    public void setVarselAntall(int value) {
        this.varselAntall = value;
    }

    /**
     * Sum beløp på meldinger med varsel
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVarselBelop() {
        return varselBelop;
    }

    /**
     * Sets the value of the varselBelop property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getVarselBelop()
     */
    public void setVarselBelop(BigDecimal value) {
        this.varselBelop = value;
    }

    /**
     * Angir om beløp er tillegg (T) eller fradrag (F)
     * 
     * @return
     *     possible object is
     *     {@link Fortegn }
     *     
     */
    public Fortegn getVarselFortegn() {
        return varselFortegn;
    }

    /**
     * Sets the value of the varselFortegn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fortegn }
     *     
     * @see #getVarselFortegn()
     */
    public void setVarselFortegn(Fortegn value) {
        this.varselFortegn = value;
    }

    /**
     * Antall avviste meldinger
     * 
     */
    public int getAvvistAntall() {
        return avvistAntall;
    }

    /**
     * Sets the value of the avvistAntall property.
     * 
     */
    public void setAvvistAntall(int value) {
        this.avvistAntall = value;
    }

    /**
     * Sum beløp på avviste meldinger
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvvistBelop() {
        return avvistBelop;
    }

    /**
     * Sets the value of the avvistBelop property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getAvvistBelop()
     */
    public void setAvvistBelop(BigDecimal value) {
        this.avvistBelop = value;
    }

    /**
     * Angir om beløp er tillegg (T) eller fradrag (F)
     * 
     * @return
     *     possible object is
     *     {@link Fortegn }
     *     
     */
    public Fortegn getAvvistFortegn() {
        return avvistFortegn;
    }

    /**
     * Sets the value of the avvistFortegn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fortegn }
     *     
     * @see #getAvvistFortegn()
     */
    public void setAvvistFortegn(Fortegn value) {
        this.avvistFortegn = value;
    }

    /**
     * Antall meldinger hvor det ikke er mottatt kvittering
     * 
     */
    public int getManglerAntall() {
        return manglerAntall;
    }

    /**
     * Sets the value of the manglerAntall property.
     * 
     */
    public void setManglerAntall(int value) {
        this.manglerAntall = value;
    }

    /**
     * Sum beløp på meldinger hvor det ikke er mottatt kvittering
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getManglerBelop() {
        return manglerBelop;
    }

    /**
     * Sets the value of the manglerBelop property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     * @see #getManglerBelop()
     */
    public void setManglerBelop(BigDecimal value) {
        this.manglerBelop = value;
    }

    /**
     * Angir om beløp er tillegg (T) eller fradrag (F)
     * 
     * @return
     *     possible object is
     *     {@link Fortegn }
     *     
     */
    public Fortegn getManglerFortegn() {
        return manglerFortegn;
    }

    /**
     * Sets the value of the manglerFortegn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fortegn }
     *     
     * @see #getManglerFortegn()
     */
    public void setManglerFortegn(Fortegn value) {
        this.manglerFortegn = value;
    }

}
