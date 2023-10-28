package flight.intializer;

import flight.modal.Terminal;
import flight.repository.TerminalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TerminalInitializer implements CommandLineRunner {

    @Autowired
    private TerminalRepository terminalRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Terminal> list = terminalRepository.findAll();

        if (list.isEmpty()) {
            Terminal[] terminals = new Terminal[] {
                    new Terminal("Terminal 1A"),
                    new Terminal("Gate B5"),
                    new Terminal("Terminal 3 - Gate 12"),
                    new Terminal("Terminal C"),
                    new Terminal("Gate D7"),
                    new Terminal("Terminal 2, Concourse A"),
                    new Terminal("Gate 23B"),
                    new Terminal("Terminal 4, Gate 15"),
                    new Terminal("Gate A1"),
                    new Terminal("Terminal 5 - Gate 7C"),
                    new Terminal("Gate 12A"),
                    new Terminal("Terminal D, Gate 2"),
                    new Terminal("Terminal 6 - Gate 18"),
                    new Terminal("Gate C4"),
                    new Terminal("Terminal E"),
                    new Terminal("Gate 9B"),
                    new Terminal("Terminal 2A"),
                    new Terminal("Gate 6D"),
                    new Terminal("Terminal F - Gate 10"),
                    new Terminal("Gate 3E"),
                    new Terminal("Terminal G"),
                    new Terminal("Gate 14F"),
                    new Terminal("Terminal 7, Gate 22B"),
                    new Terminal("Gate H3"),
                    new Terminal("Terminal 8 - Gate 5A"),
                    new Terminal("Terminal I, Gate 13"),
                    new Terminal("Gate 4C"),
                    new Terminal("Terminal 9, Concourse J"),
                    new Terminal("Gate K7"),
                    new Terminal("Terminal 10A"),
                    new Terminal("Gate L2"),
                    new Terminal("Terminal M, Gate 8"),
                    new Terminal("Terminal 11 - Gate 20"),
                    new Terminal("Gate N4"),
                    new Terminal("Terminal 12, Concourse O"),
                    new Terminal("Gate P9"),
                    new Terminal("Terminal 13B"),
                    new Terminal("Gate Q6"),
                    new Terminal("Terminal R - Gate 17A"),
                    new Terminal("Gate S5"),
                    new Terminal("Terminal 14, Gate T3"),
                    new Terminal("Terminal U, Concourse 21"),
                    new Terminal("Gate V2"),
                    new Terminal("Terminal 15 - Gate W11"),
                    new Terminal("Gate X8"),
                    new Terminal("Terminal Y, Gate 16C"),
                    new Terminal("Terminal 16A"),
                    new Terminal("Gate Z4"),
                    new Terminal("Terminal 17 - Gate AA9"),
                    new Terminal("Gate BB6")
            };

            for (Terminal terminal : terminals) {
                terminalRepository.save(terminal);
            }

        }

    }
}
