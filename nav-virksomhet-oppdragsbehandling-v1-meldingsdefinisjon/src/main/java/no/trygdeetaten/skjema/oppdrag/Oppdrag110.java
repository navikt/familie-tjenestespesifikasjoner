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
 * Inneholder elementene som skal være med i en 110-rekord, Oppdrag
 * 
 * <p>Java class for oppdrag-110 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="oppdrag-110"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kodeAksjon" type="{http://www.trygdeetaten.no/skjema/oppdrag}oppdrag-110-kodeAksjon"/&gt;
 *         &lt;element name="kodeEndring"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="NY"/&gt;
 *               &lt;enumeration value="ENDR"/&gt;
 *               &lt;enumeration value="UEND"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="kodeStatus" type="{http://www.trygdeetaten.no/skjema/oppdrag}TkodeStatus" minOccurs="0"/&gt;
 *         &lt;element name="datoStatusFom" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tdato" minOccurs="0"/&gt;
 *         &lt;element name="kodeFagomraade" type="{http://www.trygdeetaten.no/skjema/oppdrag}TkodeFagomraade"/&gt;
 *         &lt;element name="fagsystemId" type="{http://www.trygdeetaten.no/skjema/oppdrag}TfagsystemId" minOccurs="0"/&gt;
 *         &lt;element name="oppdragsId" type="{http://www.trygdeetaten.no/skjema/oppdrag}ToppdragsId" minOccurs="0"/&gt;
 *         &lt;element name="utbetFrekvens" type="{http://www.trygdeetaten.no/skjema/oppdrag}TutbetFrekvens" minOccurs="0"/&gt;
 *         &lt;element name="datoForfall" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tdato" minOccurs="0"/&gt;
 *         &lt;element name="stonadId" type="{http://www.trygdeetaten.no/skjema/oppdrag}TstonadId" minOccurs="0"/&gt;
 *         &lt;element name="oppdragGjelderId" type="{http://www.trygdeetaten.no/skjema/oppdrag}TfnrOrgnr"/&gt;
 *         &lt;element name="datoOppdragGjelderFom" type="{http://www.trygdeetaten.no/skjema/oppdrag}Tdato"/&gt;
 *         &lt;element name="saksbehId" type="{http://www.trygdeetaten.no/skjema/oppdrag}TsaksbehId"/&gt;
 *         &lt;element name="oppdrags-status-111" type="{http://www.trygdeetaten.no/skjema/oppdrag}oppdrags-status-111" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="oppdrag-gjelder-112" type="{http://www.trygdeetaten.no/skjema/oppdrag}oppdrag-gjelder-112" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="bilagstype-113" type="{http://www.trygdeetaten.no/skjema/oppdrag}bilagstype-113" minOccurs="0"/&gt;
 *         &lt;element name="avstemming-115" type="{http://www.trygdeetaten.no/skjema/oppdrag}avstemming-115" minOccurs="0"/&gt;
 *         &lt;element name="ompostering-116" type="{http://www.trygdeetaten.no/skjema/oppdrag}ompostering-116" minOccurs="0"/&gt;
 *         &lt;element name="oppdrags-enhet-120" type="{http://www.trygdeetaten.no/skjema/oppdrag}oppdrags-enhet-120" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="belops-grense-130" type="{http://www.trygdeetaten.no/skjema/oppdrag}belops-grense-130" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tekst-140" type="{http://www.trygdeetaten.no/skjema/oppdrag}tekst-140" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="oppdrags-linje-150" type="{http://www.trygdeetaten.no/skjema/oppdrag}oppdrags-linje-150" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "oppdrag-110", propOrder = {
    "kodeAksjon",
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
    "oppdragsStatus111",
    "oppdragGjelder112",
    "bilagstype113",
    "avstemming115",
    "ompostering116",
    "oppdragsEnhet120",
    "belopsGrense130",
    "tekst140",
    "oppdragsLinje150"
})
public class Oppdrag110 {

    @XmlElement(required = true)
    protected String kodeAksjon;
    @XmlElement(required = true)
    protected String kodeEndring;
    @XmlSchemaType(name = "string")
    protected TkodeStatus kodeStatus;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoStatusFom;
    @XmlElement(required = true)
    protected String kodeFagomraade;
    protected String fagsystemId;
    protected Long oppdragsId;
    protected String utbetFrekvens;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoForfall;
    protected String stonadId;
    @XmlElement(required = true)
    protected String oppdragGjelderId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datoOppdragGjelderFom;
    @XmlElement(required = true)
    protected String saksbehId;
    @XmlElement(name = "oppdrags-status-111")
    protected List<OppdragsStatus111> oppdragsStatus111;
    @XmlElement(name = "oppdrag-gjelder-112")
    protected List<OppdragGjelder112> oppdragGjelder112;
    @XmlElement(name = "bilagstype-113")
    protected Bilagstype113 bilagstype113;
    @XmlElement(name = "avstemming-115")
    protected Avstemming115 avstemming115;
    @XmlElement(name = "ompostering-116")
    protected Ompostering116 ompostering116;
    @XmlElement(name = "oppdrags-enhet-120")
    protected List<OppdragsEnhet120> oppdragsEnhet120;
    @XmlElement(name = "belops-grense-130")
    protected List<BelopsGrense130> belopsGrense130;
    @XmlElement(name = "tekst-140")
    protected List<Tekst140> tekst140;
    @XmlElement(name = "oppdrags-linje-150")
    protected List<OppdragsLinje150> oppdragsLinje150;

    /**
     * Gets the value of the kodeAksjon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodeAksjon() {
        return kodeAksjon;
    }

    /**
     * Sets the value of the kodeAksjon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodeAksjon(String value) {
        this.kodeAksjon = value;
    }

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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoForfall() {
        return datoForfall;
    }

    /**
     * Sets the value of the datoForfall property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoForfall(XMLGregorianCalendar value) {
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatoOppdragGjelderFom() {
        return datoOppdragGjelderFom;
    }

    /**
     * Sets the value of the datoOppdragGjelderFom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatoOppdragGjelderFom(XMLGregorianCalendar value) {
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
     * Gets the value of the oppdragsStatus111 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oppdragsStatus111 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOppdragsStatus111().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OppdragsStatus111 }
     * 
     * 
     */
    public List<OppdragsStatus111> getOppdragsStatus111() {
        if (oppdragsStatus111 == null) {
            oppdragsStatus111 = new ArrayList<OppdragsStatus111>();
        }
        return this.oppdragsStatus111;
    }

    /**
     * Gets the value of the oppdragGjelder112 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oppdragGjelder112 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOppdragGjelder112().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OppdragGjelder112 }
     * 
     * 
     */
    public List<OppdragGjelder112> getOppdragGjelder112() {
        if (oppdragGjelder112 == null) {
            oppdragGjelder112 = new ArrayList<OppdragGjelder112>();
        }
        return this.oppdragGjelder112;
    }

    /**
     * Gets the value of the bilagstype113 property.
     * 
     * @return
     *     possible object is
     *     {@link Bilagstype113 }
     *     
     */
    public Bilagstype113 getBilagstype113() {
        return bilagstype113;
    }

    /**
     * Sets the value of the bilagstype113 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bilagstype113 }
     *     
     */
    public void setBilagstype113(Bilagstype113 value) {
        this.bilagstype113 = value;
    }

    /**
     * Gets the value of the avstemming115 property.
     * 
     * @return
     *     possible object is
     *     {@link Avstemming115 }
     *     
     */
    public Avstemming115 getAvstemming115() {
        return avstemming115;
    }

    /**
     * Sets the value of the avstemming115 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Avstemming115 }
     *     
     */
    public void setAvstemming115(Avstemming115 value) {
        this.avstemming115 = value;
    }

    /**
     * Gets the value of the ompostering116 property.
     * 
     * @return
     *     possible object is
     *     {@link Ompostering116 }
     *     
     */
    public Ompostering116 getOmpostering116() {
        return ompostering116;
    }

    /**
     * Sets the value of the ompostering116 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ompostering116 }
     *     
     */
    public void setOmpostering116(Ompostering116 value) {
        this.ompostering116 = value;
    }

    /**
     * Gets the value of the oppdragsEnhet120 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oppdragsEnhet120 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOppdragsEnhet120().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OppdragsEnhet120 }
     * 
     * 
     */
    public List<OppdragsEnhet120> getOppdragsEnhet120() {
        if (oppdragsEnhet120 == null) {
            oppdragsEnhet120 = new ArrayList<OppdragsEnhet120>();
        }
        return this.oppdragsEnhet120;
    }

    /**
     * Gets the value of the belopsGrense130 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the belopsGrense130 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBelopsGrense130().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BelopsGrense130 }
     * 
     * 
     */
    public List<BelopsGrense130> getBelopsGrense130() {
        if (belopsGrense130 == null) {
            belopsGrense130 = new ArrayList<BelopsGrense130>();
        }
        return this.belopsGrense130;
    }

    /**
     * Gets the value of the tekst140 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tekst140 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTekst140().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tekst140 }
     * 
     * 
     */
    public List<Tekst140> getTekst140() {
        if (tekst140 == null) {
            tekst140 = new ArrayList<Tekst140>();
        }
        return this.tekst140;
    }

    /**
     * Gets the value of the oppdragsLinje150 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oppdragsLinje150 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOppdragsLinje150().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OppdragsLinje150 }
     * 
     * 
     */
    public List<OppdragsLinje150> getOppdragsLinje150() {
        if (oppdragsLinje150 == null) {
            oppdragsLinje150 = new ArrayList<OppdragsLinje150>();
        }
        return this.oppdragsLinje150;
    }

    public Oppdrag110 withKodeAksjon(String value) {
        setKodeAksjon(value);
        return this;
    }

    public Oppdrag110 withKodeEndring(String value) {
        setKodeEndring(value);
        return this;
    }

    public Oppdrag110 withKodeStatus(TkodeStatus value) {
        setKodeStatus(value);
        return this;
    }

    public Oppdrag110 withDatoStatusFom(XMLGregorianCalendar value) {
        setDatoStatusFom(value);
        return this;
    }

    public Oppdrag110 withKodeFagomraade(String value) {
        setKodeFagomraade(value);
        return this;
    }

    public Oppdrag110 withFagsystemId(String value) {
        setFagsystemId(value);
        return this;
    }

    public Oppdrag110 withOppdragsId(Long value) {
        setOppdragsId(value);
        return this;
    }

    public Oppdrag110 withUtbetFrekvens(String value) {
        setUtbetFrekvens(value);
        return this;
    }

    public Oppdrag110 withDatoForfall(XMLGregorianCalendar value) {
        setDatoForfall(value);
        return this;
    }

    public Oppdrag110 withStonadId(String value) {
        setStonadId(value);
        return this;
    }

    public Oppdrag110 withOppdragGjelderId(String value) {
        setOppdragGjelderId(value);
        return this;
    }

    public Oppdrag110 withDatoOppdragGjelderFom(XMLGregorianCalendar value) {
        setDatoOppdragGjelderFom(value);
        return this;
    }

    public Oppdrag110 withSaksbehId(String value) {
        setSaksbehId(value);
        return this;
    }

    public Oppdrag110 withOppdragsStatus111(OppdragsStatus111 ... values) {
        if (values!= null) {
            for (OppdragsStatus111 value: values) {
                getOppdragsStatus111().add(value);
            }
        }
        return this;
    }

    public Oppdrag110 withOppdragsStatus111(Collection<OppdragsStatus111> values) {
        if (values!= null) {
            getOppdragsStatus111().addAll(values);
        }
        return this;
    }

    public Oppdrag110 withOppdragGjelder112(OppdragGjelder112 ... values) {
        if (values!= null) {
            for (OppdragGjelder112 value: values) {
                getOppdragGjelder112().add(value);
            }
        }
        return this;
    }

    public Oppdrag110 withOppdragGjelder112(Collection<OppdragGjelder112> values) {
        if (values!= null) {
            getOppdragGjelder112().addAll(values);
        }
        return this;
    }

    public Oppdrag110 withBilagstype113(Bilagstype113 value) {
        setBilagstype113(value);
        return this;
    }

    public Oppdrag110 withAvstemming115(Avstemming115 value) {
        setAvstemming115(value);
        return this;
    }

    public Oppdrag110 withOmpostering116(Ompostering116 value) {
        setOmpostering116(value);
        return this;
    }

    public Oppdrag110 withOppdragsEnhet120(OppdragsEnhet120 ... values) {
        if (values!= null) {
            for (OppdragsEnhet120 value: values) {
                getOppdragsEnhet120().add(value);
            }
        }
        return this;
    }

    public Oppdrag110 withOppdragsEnhet120(Collection<OppdragsEnhet120> values) {
        if (values!= null) {
            getOppdragsEnhet120().addAll(values);
        }
        return this;
    }

    public Oppdrag110 withBelopsGrense130(BelopsGrense130 ... values) {
        if (values!= null) {
            for (BelopsGrense130 value: values) {
                getBelopsGrense130().add(value);
            }
        }
        return this;
    }

    public Oppdrag110 withBelopsGrense130(Collection<BelopsGrense130> values) {
        if (values!= null) {
            getBelopsGrense130().addAll(values);
        }
        return this;
    }

    public Oppdrag110 withTekst140(Tekst140 ... values) {
        if (values!= null) {
            for (Tekst140 value: values) {
                getTekst140().add(value);
            }
        }
        return this;
    }

    public Oppdrag110 withTekst140(Collection<Tekst140> values) {
        if (values!= null) {
            getTekst140().addAll(values);
        }
        return this;
    }

    public Oppdrag110 withOppdragsLinje150(OppdragsLinje150 ... values) {
        if (values!= null) {
            for (OppdragsLinje150 value: values) {
                getOppdragsLinje150().add(value);
            }
        }
        return this;
    }

    public Oppdrag110 withOppdragsLinje150(Collection<OppdragsLinje150> values) {
        if (values!= null) {
            getOppdragsLinje150().addAll(values);
        }
        return this;
    }

}
