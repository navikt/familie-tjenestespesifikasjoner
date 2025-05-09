
package no.nav.system.os.entiteter.beregningskjema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="kodeFagomraade" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}kodeFagomraade"/>
 *         <element name="stoppNivaaId" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}linjeId"/>
 *         <element name="behandlendeEnhet" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}enhet"/>
 *         <element name="oppdragsId" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}oppdragsId"/>
 *         <element name="fagsystemId" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}fagsystemId"/>
 *         <element name="kid" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}kid"/>
 *         <element name="utbetalesTilId" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}fnrOrgnr"/>
 *         <element name="utbetalesTilNavn" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}navn"/>
 *         <element name="bilagsType" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}kodeBilagsType"/>
 *         <element name="forfall" type="{http://nav.no/system/os/entiteter/typer/simpleTypes}dato"/>
 *         <element name="feilkonto" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element ref="{http://nav.no/system/os/entiteter/beregningSkjema}beregningStoppnivaaDetaljer" maxOccurs="999"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "kodeFagomraade",
    "stoppNivaaId",
    "behandlendeEnhet",
    "oppdragsId",
    "fagsystemId",
    "kid",
    "utbetalesTilId",
    "utbetalesTilNavn",
    "bilagsType",
    "forfall",
    "feilkonto",
    "beregningStoppnivaaDetaljer"
})
@XmlRootElement(name = "beregningStoppnivaa")
public class BeregningStoppnivaa {

    @XmlElement(required = true)
    protected String kodeFagomraade;
    @XmlElement(required = true)
    protected BigInteger stoppNivaaId;
    @XmlElement(required = true)
    protected String behandlendeEnhet;
    protected long oppdragsId;
    @XmlElement(required = true)
    protected String fagsystemId;
    @XmlElement(required = true)
    protected String kid;
    @XmlElement(required = true)
    protected String utbetalesTilId;
    @XmlElement(required = true)
    protected String utbetalesTilNavn;
    @XmlElement(required = true)
    protected String bilagsType;
    @XmlElement(required = true)
    protected String forfall;
    protected boolean feilkonto;
    /**
     * Referanse ID 314
     * 
     */
    @XmlElement(namespace = "http://nav.no/system/os/entiteter/beregningSkjema", required = true)
    protected List<BeregningStoppnivaaDetaljer> beregningStoppnivaaDetaljer;

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
     * Gets the value of the stoppNivaaId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStoppNivaaId() {
        return stoppNivaaId;
    }

    /**
     * Sets the value of the stoppNivaaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStoppNivaaId(BigInteger value) {
        this.stoppNivaaId = value;
    }

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
     * Gets the value of the forfall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForfall() {
        return forfall;
    }

    /**
     * Sets the value of the forfall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForfall(String value) {
        this.forfall = value;
    }

    /**
     * Gets the value of the feilkonto property.
     * 
     */
    public boolean isFeilkonto() {
        return feilkonto;
    }

    /**
     * Sets the value of the feilkonto property.
     * 
     */
    public void setFeilkonto(boolean value) {
        this.feilkonto = value;
    }

    /**
     * Referanse ID 314
     * 
     * Gets the value of the beregningStoppnivaaDetaljer property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beregningStoppnivaaDetaljer property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getBeregningStoppnivaaDetaljer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeregningStoppnivaaDetaljer }
     * </p>
     * 
     * 
     * @return
     *     The value of the beregningStoppnivaaDetaljer property.
     */
    public List<BeregningStoppnivaaDetaljer> getBeregningStoppnivaaDetaljer() {
        if (beregningStoppnivaaDetaljer == null) {
            beregningStoppnivaaDetaljer = new ArrayList<>();
        }
        return this.beregningStoppnivaaDetaljer;
    }

}
