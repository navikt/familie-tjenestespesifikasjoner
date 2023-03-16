
package no.nav.system.os.tjenester.simulerfpservice.feil;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Feil under behandling i baksystemet
 * 
 * <p>Java class for feilUnderBehandling complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="feilUnderBehandling">
 *   &lt;complexContent>
 *     &lt;extension base="{http://nav.no/system/os/tjenester/simulerFpService/feil}StelvioFault">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "feilUnderBehandling")
public class FeilUnderBehandling
    extends StelvioFault
{


}
