package edu.austral.ingsis.jibberjabber.dto;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PostCreateDTO {

  private String title;

  private String description;

  public PostCreateDTO() {
  }

  public PostCreateDTO(String title, String description) {
    this.title = title;
    this.description = description;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
