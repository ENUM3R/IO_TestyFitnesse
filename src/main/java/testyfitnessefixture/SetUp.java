package testyfitnessefixture;
import fit.Fixture;
import org.example.model.Role;
import org.example.prezenter.LogowanieDoSystemu;

public class SetUp extends Fixture{
    static LogowanieDoSystemu logowanieDoSystemu;
    public SetUp() {
        logowanieDoSystemu = new LogowanieDoSystemu(Role.kierownik);
    }
}