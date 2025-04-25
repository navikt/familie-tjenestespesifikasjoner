
package no.nav.virksomhet.tjenester.avstemming.informasjon.konsistensavstemmingsdata.v1;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Etter START-recorden skal avstemmingsdataene for konsistensavstemmingen overføres som sammensatte meldinger pr. offnr.
 * 
 * Hver slik melding skal starte med id-110 med aksjonskode ’DATA’. Deretter følger de id-kodene som ble brukt da dataene opprinnelig ble overført fra avleverende til mottakende system. For no.nav.virksomhet.tjenester.avstemming mot Oppdragssystemet vil dette være deres id-kode 110, 120, 150 osv.
 * 
 * <p>Java class for Konsistensavstemmingsdata complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="Konsistensavstemmingsdata">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="aksjonsdata" type="{http://nav.no/virksomhet/tjenester/avstemming/informasjon/konsistensavstemmingsdata/v1}Aksjonsdata"/>
 *         <element name="oppdragsdataListe" type="{http://nav.no/virksomhet/tjenester/avstemming/informasjon/konsistensavstemmingsdata/v1}Oppdragsdata" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="totaldata" type="{http://nav.no/virksomhet/tjenester/avstemming/informasjon/konsistensavstemmingsdata/v1}Totaldata" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Konsistensavstemmingsdata", propOrder = {
    "aksjonsdata",
    "oppdragsdataListe",
    "totaldata"
})
public class Konsistensavstemmingsdata {

    @XmlElement(required = true)
    protected Aksjonsdata aksjonsdata;
    protected List<Oppdragsdata> oppdragsdataListe;
    protected Totaldata totaldata;

    /**
     * Gets the value of the aksjonsdata property.
     * 
     * @return
     *     possible object is
     *     {@link Aksjonsdata }
     *     
     */
    public Aksjonsdata getAksjonsdata() {
        return aksjonsdata;
    }

    /**
     * Sets the value of the aksjonsdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Aksjonsdata }
     *     
     */
    public void setAksjonsdata(Aksjonsdata value) {
        this.aksjonsdata = value;
    }

    /**
     * Gets the value of the oppdragsdataListe property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oppdragsdataListe property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getOppdragsdataListe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Oppdragsdata }
     * </p>
     * 
     * 
     * @return
     *     The value of the oppdragsdataListe property.
     */
    public List<Oppdragsdata> getOppdragsdataListe() {
        if (oppdragsdataListe == null) {
            oppdragsdataListe = new ArrayList<>();
        }
        return this.oppdragsdataListe;
    }

    /**
     * Gets the value of the totaldata property.
     * 
     * @return
     *     possible object is
     *     {@link Totaldata }
     *     
     */
    public Totaldata getTotaldata() {
        return totaldata;
    }

    /**
     * Sets the value of the totaldata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Totaldata }
     *     
     */
    public void setTotaldata(Totaldata value) {
        this.totaldata = value;
    }

}
