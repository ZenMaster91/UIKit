package Foundation;

import java.io.File;

/**
 * Instances of NSFile extends from java.io.File and stores the path and the
 * filename.
 * 
 * @author Guillermo Facundo Colunga
 * @version 0.1
 * @since 0.1
 * @formatter Oviedo Computing Community
 */
public class NSFile extends File {

	private static final long serialVersionUID = 2908707080448348423L;

	private String path;
	private String fileName;

	/**
	 * Creates an instance of NSFile from a path and a filename;
	 * @param path The path to the file directory.
	 * @param fileName The filename with the extension.
	 */
	public NSFile(String path, String fileName) {
		super(path + "/" + fileName);
		this.path = path;
		this.fileName = fileName;
	}

	/**
	 * @return The path to the file directory.
	 */
	public String path() {
		return this.path;
	}

	/**
	 * @return The filename and the extension.
	 */
	public String name() {
		return this.fileName;
	}

	/**
	 * @return The complete path and the filename.
	 */
	public String completePath() {
		return path + "/" + fileName;
	}

}
