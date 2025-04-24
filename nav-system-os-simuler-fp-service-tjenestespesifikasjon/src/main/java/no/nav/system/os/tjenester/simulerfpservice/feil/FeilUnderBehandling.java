
package no.nav.system.os.tjenester.simulerfpservice.feil;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Feil under behandling i baksystemet
 * 
 * <p>Java class for feilUnderBehandling complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="feilUnderBehandling">
 *   <complexContent>
 *     <extension base="{http://nav.no/system/os/tjenester/simulerFpService/feil}StelvioFault">
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "feilUnderBehandling")
public class FeilUnderBehandling
    extends StelvioFault
{


}
