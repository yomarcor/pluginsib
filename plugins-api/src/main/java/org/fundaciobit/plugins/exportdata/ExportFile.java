package org.fundaciobit.plugins.exportdata;

/**
 * 
 * @author anadal
 * 
 */
public class ExportFile {

  private String contentType;
  private String filename;

  private byte[] data;

  /**
   * @param contentType
   * @param filename
   * @param data
   */
  public ExportFile(String contentType, String filename, byte[] data) {
    super();
    this.contentType = contentType;
    this.filename = filename;
    this.data = data;
  }

  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public byte[] getData() {
    return data;
  }

  public void setData(byte[] data) {
    this.data = data;
  }

}
