package ml.ledv.fb2parser.model.filevalidate;

import java.io.File;

public interface FileValidator {
	public boolean fileIsValid(File filePath);
	public void encodingValidate(File filePath);
}
