
package no.nav.virksomhet.tjenester.avstemming.meldinger.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AksjonType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AksjonType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="START"/&gt;
 *     &lt;enumeration value="DATA"/&gt;
 *     &lt;enumeration value="AVSL"/&gt;
 *     &lt;enumeration value="HENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AksjonType")
@XmlEnum
public enum AksjonType {


    /**
     * Aksjonskoden settes til ’START’ når avstemmingen starter
     * 
     */
    START,

    /**
     * Aksjonskode ’DATA’ benyttes når selve avstemmingsdatene skal overføres.
     * 
     */
    DATA,

    /**
     * ’AVSL’ når alle avstemmingsdata er overført.
     * 
     */
    AVSL,

    /**
     * Aksjonskode ’HENT’ benyttes dersom mottakende komponent har behov for å finne avstemminger som er påbegynt fra avleverende komponent, men mangler data fra mottakende komponent.
     * 
     */
    HENT;

    public String value() {
        return name();
    }

    public static AksjonType fromValue(String v) {
        return valueOf(v);
    }

}
