package org.lohr.owl;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;

/**
 * Use the @PWA annotation make the application installable on phones, tablets
 * and some desktop browsers.
 */
@PWA(name = "Project Owl", shortName = "project--owl", enableInstallPrompt = false)
public class AppShell implements AppShellConfigurator {
}
