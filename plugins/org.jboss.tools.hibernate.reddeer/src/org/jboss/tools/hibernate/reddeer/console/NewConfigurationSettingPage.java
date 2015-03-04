package org.jboss.tools.hibernate.reddeer.console;

import org.jboss.reddeer.jface.wizard.WizardPage;
import org.jboss.reddeer.swt.impl.button.CheckBox;
import org.jboss.reddeer.swt.impl.combo.LabeledCombo;
import org.jboss.reddeer.swt.impl.text.LabeledText;

/**
 * New Hibernate Configuration Wizard page for Hibernate Configuration File
 * @author Jiri Peterka
 *
 */
public class NewConfigurationSettingPage extends WizardPage {
	
	private final String CONNECTION_URL = "Connection URL:";
	private final String DRIVER_CLASS = "Driver class:";
	private final String USERNAME = "Username:";
	private final String PASSWORD = "Password:";
	
	/**
	 * Sets datbase dialect
	 * @param dialect given dialect
	 */
	public void setDatabaseDialect(String dialect) {
		new LabeledCombo("Database dialect:").setText(dialect);
	}
	
	/**
	 * Sets driver classs
	 * @param driverClass given driver class
	 */
	public void setDriverClass(String driverClass) {
		new LabeledCombo(DRIVER_CLASS).setText(driverClass);
	}
	
	/**
	 * Sets connection URL
	 * @param url given connection url
	 */
	public void setConnectionURL(String url) {
		new LabeledCombo(CONNECTION_URL).setText(url);
	}
	
	/**
	 * Sets username
	 * @param username given database username
	 */
	public void setUsername(String username) {
		new LabeledText(USERNAME).setText(username);
	}
	
	/**
	 * Sets password 	
	 * @param username given connection password
	 */
	public void setPassword(String username) {
		new LabeledText(PASSWORD).setText(username);
	}	
	
	/**
	 * Checks if console configuration should be created
	 * @param create if true configuration will be created
	 */
	public void setCreateConsoleConfiguration(boolean create) {
		CheckBox cb = new CheckBox();
		boolean status = cb.isChecked();
		if (status != create) {
			cb.click();
		}
	}	
	
	/**
	 * Returns db driver class
	 * @return db driver class
	 */
	public String getDriveClass() {
		String driveClass = new LabeledCombo(DRIVER_CLASS).getSelection();
		return driveClass;		
	}
	
	/**
	 * Returns db connection jdbc string
	 * @return db connection jdbc string
	 */
	public String getConnectionURL() {
		String url  = new LabeledCombo(CONNECTION_URL).getText();
		return url;
	}
	
	/**
	 * Returns db username
	 * @return db username
	 */
	public String getUsername() {
		String username = new LabeledText(USERNAME).getText();
		return username;
	}
	
	/**
	 * Returns db password
	 * @return db password
	 */
	public String getPassword() {
		String password = new LabeledText(PASSWORD).getText();
		return password;
	}
}
