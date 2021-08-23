package net.moonlar.playertags.objects;

public class Tag {
  private String prefix;
  private String suffix;

  private int priority;

  public Tag(String prefix, String suffix, int priority) {
    this.prefix = prefix;
    this.suffix = suffix;
    this.priority = priority;
  }

  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public String getSuffix() {
    return suffix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public int getPriority() {
    return priority;
  }

  public void setPriority(int priority) {
    this.priority = priority;
  }
}