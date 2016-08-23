import java.util.*;

class Nucleus {

  private String type;
  private ArrayList<Nucleon> core;

  public Nucleus(String type) {
    this.type = type;
    this.core = new ArrayList<Nucleon>();
  }

  public String getType() {
    return this.type;
  }

  public void setType( String newType ) {
    this.type = newType;
  }

  public int nucleonCount() {
    return core.size();
  }

  public void bind( Nucleon nucleon ) {
    core.add(nucleon);
  }

  public void passTime() {
    core.clear();
  }

}