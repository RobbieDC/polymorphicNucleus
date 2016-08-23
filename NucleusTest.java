import static org.junit.Assert.assertEquals;
import org.junit.*;

public class NucleusTest{
  Nucleus nucleus;
  Proton proton;
  Neutron neutron;

  @Before
  public void before() {
    nucleus = new Nucleus("hydrogen");
    proton = new Proton();
    neutron = new Neutron();
  }

  @Test
  public void hasType() {
    assertEquals( "hydrogen", nucleus.getType() );
  }

  @Test
  public void canSetType() {
    nucleus.setType("helium");
    assertEquals( "helium", nucleus.getType() );
  }

  @Test
  public void nucleusStartsEmpty() {
    assertEquals( 0, nucleus.nucleonCount() );
  }

  @Test
  public void canBindProton() {
    nucleus.bind(proton);
    assertEquals( 1, nucleus.nucleonCount() );
  }

  @Test
  public void canBindNeutron() {
    nucleus.bind(neutron);
    assertEquals( 1, nucleus.nucleonCount() );
  }

  @Test
  public void coreShouldDecayOverTime() {
    nucleus.bind(proton);
    nucleus.passTime();
    assertEquals( 0, nucleus.nucleonCount() );
  }

}