package flight.intializer;

import java.util.List;

import flight.modal.Flight;
import flight.modal.FlightCountryCode;
import flight.modal.User;
import flight.repository.FlightCountryCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


@Component
public class FlightCountryInitializer implements CommandLineRunner {


    private final FlightCountryCodeRepository flightCountryCodeRepository;

    public FlightCountryInitializer(FlightCountryCodeRepository flightCountryCodeRepository) {
        this.flightCountryCodeRepository = flightCountryCodeRepository;
    }

    @Override
    public void run(String... args) {

        List<FlightCountryCode> list = flightCountryCodeRepository.findAll();


        if (list.isEmpty()) {
            /*
            FlightCountryCode[] flightCountryCodes = new FlightCountryCode[]{
                    new FlightCountryCode("DBR", "DARBHANGA"),
                    new FlightCountryCode("HYD", "HYDERABAD"),
                    new FlightCountryCode("LAX", "LOS ANGELES"),
                    new FlightCountryCode("JFK", "JOHN F. KENNEDY"),
                    new FlightCountryCode("ORD", "O'HARE"),
                    new FlightCountryCode("LHR", "HEATHROW"),
                    new FlightCountryCode("CDG", "CHARLES DE GAULLE"),
                    new FlightCountryCode("HND", "HANEDA"),
                    new FlightCountryCode("PEK", "BEIJING CAPITAL"),
                    new FlightCountryCode("ATL", "HARTSFIELD-JACKSON"),
                    new FlightCountryCode("AMS", "SCHIPHOL"),
                    new FlightCountryCode("SFO", "SAN FRANCISCO"),
                    new FlightCountryCode("DFW", "DALLAS/FORT WORTH"),
                    new FlightCountryCode("FRA", "FRANKFURT"),
                    new FlightCountryCode("MAD", "ADOLFO SUÁREZ MADRID-BARAJAS"),
                    new FlightCountryCode("BCN", "BARCELONA–EL PRAT"),
                    new FlightCountryCode("ICN", "INCHEON"),
                    new FlightCountryCode("DXB", "DUBAI INTERNATIONAL"),
                    new FlightCountryCode("IST", "ISTANBUL AIRPORT"),
                    new FlightCountryCode("MUC", "MUNICH AIRPORT"),
                    new FlightCountryCode("CGK", "SOEKARNO-HATTA"),
                    new FlightCountryCode("DEL", "INDIRA GANDHI"),
                    new FlightCountryCode("DEN", "DENVER"),
                    new FlightCountryCode("YYZ", "PEARSON"),
                    new FlightCountryCode("BKK", "SUVARNA BHUMI"),
                    new FlightCountryCode("SYD", "KINGSFORD SMITH"),
                    new FlightCountryCode("GRU", "GUARULHOS–GOVERNADOR"),
                    new FlightCountryCode("JNB", "ORTAMBO"),
                    new FlightCountryCode("CAN", "BAIYUN"),
                    new FlightCountryCode("KUL", "KUALA LUMPUR"),
                    new FlightCountryCode("LAS", "MCCARRAN"),
                    new FlightCountryCode("HEL", "HELSINKI-VANTAA"),
                    new FlightCountryCode("BOG", "EL DORADO"),
                    new FlightCountryCode("OSL", "OSLO GARDERMOEN"),
                    new FlightCountryCode("SEA", "SEATTLE-TACOMA"),
                    new FlightCountryCode("VIE", "VIENNA"),
                    new FlightCountryCode("MNL", "NINOY AQUINO"),
                    new FlightCountryCode("MEL", "TULLAMARINE"),
                    new FlightCountryCode("LIS", "HUMBERTO DELGADO"),
                    new FlightCountryCode("WAW", "CHOPIN"),
                    new FlightCountryCode("ATH", "ELEFTHERIOS VENIZELOS"),
                    new FlightCountryCode("BRU", "BRUSSELS NATIONAL"),
                    new FlightCountryCode("SIN", "CHANGI"),
                    new FlightCountryCode("OSA", "KANSAI"),
                    new FlightCountryCode("MXP", "MALPENSA"),
                    new FlightCountryCode("PRG", "VACLAV HAVEL"),
                    new FlightCountryCode("LED", "PULKOVO"),
                    new FlightCountryCode("DEL", "INDIRA GANDHI"),
                    new FlightCountryCode("CPT", "CAPE TOWN"),
                    new FlightCountryCode("SVO", "SHEREMETYEVO"),
                    new FlightCountryCode("DTW", "DETROIT METRO"),
                    new FlightCountryCode("DUB", "DUBLIN"),
                    new FlightCountryCode("AGP", "MALAGA"),
                    new FlightCountryCode("IST", "ISTANBUL AIRPORT"),
                    new FlightCountryCode("ADD", "BOLE"),
                    new FlightCountryCode("CGK", "SOEKARNO-HATTA"),
                    new FlightCountryCode("BLR", "KEMPEGOWDA"),
                    new FlightCountryCode("LKO", "CHAUDHARY CHARAN SINGH"),
                    new FlightCountryCode("BOM", "CHATRAPATI SHIVAJI"),
                    new FlightCountryCode("MAA", "CHENNAI"),
                    new FlightCountryCode("COK", "COCHIN"),
                    new FlightCountryCode("HYD", "RAJIV GANDHI"),
                    new FlightCountryCode("PVG", "PUDONG"),
                    new FlightCountryCode("PEK", "BEIJING CAPITAL"),
                    new FlightCountryCode("CDG", "CHARLES DE GAULLE"),
                    new FlightCountryCode("SIN", "CHANGI"),
                    new FlightCountryCode("NRT", "NARITA"),
                    new FlightCountryCode("LHR", "HEATHROW"),
                    new FlightCountryCode("FCO", "LEONARDO DA VINCI"),
                    new FlightCountryCode("ZRH", "ZURICH"),
                    new FlightCountryCode("VIE", "VIENNA"),
                    new FlightCountryCode("HAM", "HAMBURG"),
                    new FlightCountryCode("BRU", "BRUSSELS NATIONAL"),
                    new FlightCountryCode("OTP", "HENRI COANDA"),
                    new FlightCountryCode("CPH", "COPENHAGEN"),
                    new FlightCountryCode("OSL", "OSLO GARDERMOEN"),
                    new FlightCountryCode("HEL", "HELSINKI-VANTAA"),
                    new FlightCountryCode("ARN", "ARLANDA"),
                    new FlightCountryCode("GVA", "GENEVA"),
                    new FlightCountryCode("LIN", "LINATE"),
                    new FlightCountryCode("MUC", "MUNICH AIRPORT"),
                    new FlightCountryCode("SVO", "SHEREMETYEVO"),
                    new FlightCountryCode("ICN", "INCHEON"),
                    new FlightCountryCode("SYD", "KINGSFORD SMITH"),
                    new FlightCountryCode("MNL", "NINOY AQUINO"),
                    new FlightCountryCode("YYZ", "PEARSON"),
                    new FlightCountryCode("YUL", "MONTREAL-TRUDEAU"),
                    new FlightCountryCode("YVR", "VANCOUVER"),
                    new FlightCountryCode("YYC", "CALGARY")
            };
             */

            FlightCountryCode[] flightCountryCodes = new FlightCountryCode[]{
                    new FlightCountryCode("DEL", "Indira Gandhi International Airport","India"),
                    new FlightCountryCode("BOM", "Chhatrapati Shivaji Maharaj International Airport","India"),
                    new FlightCountryCode("MAA", "Chennai International Airport","India"),
                    new FlightCountryCode("COK", "Cochin International Airport","India"),
                    new FlightCountryCode("HYD", "Rajiv Gandhi International Airport","India"),
                    new FlightCountryCode("BLR", "Kempegowda International Airport","India"),
                    new FlightCountryCode("CCU", "Netaji Subhas Chandra Bose International Airport","India"),
                    new FlightCountryCode("AMD", "Sardar Vallabhbhai Patel International Airport","India"),
                    new FlightCountryCode("GOI", "Goa International Airport","India"),
                    new FlightCountryCode("IXC", "Chandigarh International Airport","India"),
                    new FlightCountryCode("JAI", "Jaipur International Airport","India"),
                    new FlightCountryCode("NAG", "Dr. Babasaheb Ambedkar International Airport","India"),
                    new FlightCountryCode("TRV", "Trivandrum International Airport","India"),
                    new FlightCountryCode("IXM", "Madurai Airport","India"),
                    new FlightCountryCode("CCJ", "Calicut International Airport","India"),
                    new FlightCountryCode("IXA", "Agartala Airport","India"),
                    new FlightCountryCode("IXZ", "Vir Savarkar International Airport","India"),
                    new FlightCountryCode("IXB", "Bagdogra Airport","India"),
                    new FlightCountryCode("RPR", "Swami Vivekananda Airport","India"),
                    new FlightCountryCode("TRZ", "Tiruchirappalli International Airport","India"),
                    new FlightCountryCode("IXE", "Mangalore International Airport","India"),
                    new FlightCountryCode("HBX", "Hindustan Airport","India"),
                    new FlightCountryCode("IXJ", "Jammu Airport","India"),
                    new FlightCountryCode("LKO", "Lucknow Airport","India"),
                    new FlightCountryCode("MYQ", "Mysore Airport","India"),
                    new FlightCountryCode("VNS", "Lal Bahadur Shastri Airport","India"),
                    new FlightCountryCode("IMF", "Imphal Airport","India"),
                    new FlightCountryCode("VGA", "Vijayawada Airport","India"),
                    new FlightCountryCode("IXG", "Belgaum Airport","India"),
                    new FlightCountryCode("IXL", "Leh Kushok Bakula Rimpochee Airport","India"),
                    new FlightCountryCode("SXR", "Sheikh ul-Alam Airport","India"),
                    new FlightCountryCode("CCU", "Netaji Subhas Chandra Bose International Airport","India"),
                    new FlightCountryCode("GAY", "Gaya Airport","India"),
                    new FlightCountryCode("IXL", "Leh Kushok Bakula Rimpochee Airport","India"),
                    new FlightCountryCode("ATQ", "Sri Guru Ram Dass Jee International Airport","India"),
                    new FlightCountryCode("IXR", "Birsa Munda Airport","India"),
                    new FlightCountryCode("IXA", "Agartala Airport","India"),
                    new FlightCountryCode("VNS", "Lal Bahadur Shastri Airport","India"),
                    new FlightCountryCode("RPR", "Swami Vivekananda Airport","India"),
                    new FlightCountryCode("IXC", "Chandigarh International Airport","India"),
                    new FlightCountryCode("PNQ", "Pune Airport","India"),
                    new FlightCountryCode("IXD", "Allahabad Airport","India"),
                    new FlightCountryCode("NDC", "Nanded Airport","India"),
                    new FlightCountryCode("IXE", "Mangalore International Airport","India"),
                    new FlightCountryCode("PAT", "Lok Nayak Jayaprakash Airport","India"),
                    new FlightCountryCode("GWL", "Gwalior Airport","India"),
                    new FlightCountryCode("HBX", "Hindustan Airport","India"),
                    new FlightCountryCode("LKO", "Lucknow Airport","India"),
                    new FlightCountryCode("MAA", "Chennai International Airport","India"),
                    new FlightCountryCode("HYD", "Rajiv Gandhi International Airport","India"),
                    new FlightCountryCode("BOM", "Chhatrapati Shivaji Maharaj International Airport","India"),
                    new FlightCountryCode("DEL", "Indira Gandhi International Airport","India"),
                    new FlightCountryCode("CCU", "Netaji Subhas Chandra Bose International Airport","India"),
                    new FlightCountryCode("GAY", "Gaya Airport","India"),
                    new FlightCountryCode("IXL", "Leh Kushok Bakula Rimpochee Airport","India"),
                    new FlightCountryCode("ATQ", "Sri Guru Ram Dass Jee International Airport","India"),
                    new FlightCountryCode("IXR", "Birsa Munda Airport","India"),
                    new FlightCountryCode("IXA", "Agartala Airport","India"),
                    new FlightCountryCode("VNS", "Lal Bahadur Shastri Airport","India"),
                    new FlightCountryCode("RPR", "Swami Vivekananda Airport","India"),
                    new FlightCountryCode("IXC", "Chandigarh International Airport","India"),
                    new FlightCountryCode("PNQ", "Pune Airport","India"),
                    new FlightCountryCode("IXD", "Allahabad Airport","India"),
                    new FlightCountryCode("NDC", "Nanded Airport","India"),
                    new FlightCountryCode("IXE", "Mangalore International Airport","India"),
                    new FlightCountryCode("PAT", "Lok Nayak Jayaprakash Airport","India"),
                    new FlightCountryCode("GWL", "Gwalior Airport","India"),
                    new FlightCountryCode("HBX", "Hindustan Airport","India"),
                    new FlightCountryCode("LKO", "Lucknow Airport","India"),
                    new FlightCountryCode("MAA", "Chennai International Airport","India"),
                    new FlightCountryCode("HYD", "Rajiv Gandhi International Airport","India"),
                    new FlightCountryCode("BOM", "Chhatrapati Shivaji Maharaj International Airport","India"),
                    new FlightCountryCode("DEL", "Indira Gandhi International Airport","India"),
                    new FlightCountryCode("VGA", "Vijayawada Airport","India"),
                    new FlightCountryCode("CCJ", "Calicut International Airport","India"),
                    new FlightCountryCode("IXZ", "Vir Savarkar International Airport","India"),
                    new FlightCountryCode("IXB", "Bagdogra Airport","India"),
                    new FlightCountryCode("IXU", "Aurangabad Airport","India"),
                    new FlightCountryCode("STV", "Surat Airport","India"),
                    new FlightCountryCode("IXW", "Jamshedpur Airport","India"),
                    new FlightCountryCode("TEZ", "Tezpur Airport","India"),
                    new FlightCountryCode("ZER", "Zero Airport","India"),
                    new FlightCountryCode("UDR", "Udaipur Airport","India"),
                    new FlightCountryCode("IXL", "Leh Airport","India"),
                    new FlightCountryCode("IXS", "Silchar Airport","India"),
                    new FlightCountryCode("RJA", "Rajahmundry Airport","India"),
                    new FlightCountryCode("VTZ", "Vishakhapatnam Airport","India"),
                    new FlightCountryCode("BBI", "Bhubaneswar Airport","India"),
                    new FlightCountryCode("IXR", "Birsa Munda Airport","India"),
                    new FlightCountryCode("HBX", "Hubli Airport","India"),
                    new FlightCountryCode("IXL", "Kullu Manali Airport","India"),
                    new FlightCountryCode("MYQ", "Mysore Airport","India"),
                    new FlightCountryCode("IXB", "Lilabari Airport","India"),
                    new FlightCountryCode("SHL", "Shillong Airport","India"),
                    new FlightCountryCode("SLV", "Shimla Airport","India"),
                    new FlightCountryCode("SSE", "Sholapur Airport","India"),
                    new FlightCountryCode("IXG", "Belgaum Airport","India"),
                    new FlightCountryCode("IXE", "Mangalore International Airport","India"),
                    new FlightCountryCode("PNY", "Pondicherry Airport","India"),
                    new FlightCountryCode("IXD", "Allahabad Airport","India"),
                    new FlightCountryCode("BUP", "Bhatinda Airport","India"),
                    new FlightCountryCode("RUP", "Rupsi Airport","India"),
                    new FlightCountryCode("IXL", "Leh Airport","India"),
                    new FlightCountryCode("DEL", "Dibrugarh Airport","India"),
                    new FlightCountryCode("IXS", "Silchar Airport","India"),
                    new FlightCountryCode("RJA", "Rajahmundry Airport","India"),
                    new FlightCountryCode("STV", "Surat Airport","India"),
                    new FlightCountryCode("IXW", "Jamshedpur Airport","India"),
                    new FlightCountryCode("TEZ", "Tezpur Airport","India"),
                    new FlightCountryCode("ZER", "Zero Airport","India"),
                    new FlightCountryCode("UDR", "Udaipur Airport","India"),
                    new FlightCountryCode("IXL", "Leh Airport","India")
            };



            for (int i = 0; i < flightCountryCodes.length; i++) {
                flightCountryCodeRepository.save(flightCountryCodes[i]);
            }

        }

    }
}