
package no.nav.virksomhet.tjenester.avstemming.meldinger.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for AksjonType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="AksjonType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="START"/>
 *     <enumeration value="DATA"/>
 *     <enumeration value="AVSL"/>
 *     <enumeration value="HENT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
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
