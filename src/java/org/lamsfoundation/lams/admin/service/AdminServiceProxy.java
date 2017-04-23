/****************************************************************
 * Copyright (C) 2005 LAMS Foundation (http://lamsfoundation.org)
 * =============================================================
 * License Information: http://lamsfoundation.org/licensing/lams/2.0/
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2.0
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 * USA
 *
 * http://www.gnu.org/licenses/gpl.txt
 * ****************************************************************
 */

/* $Id: AdminServiceProxy.java,v 1.13 2010-10-01 20:30:49 andreyb Exp $ */
package org.lamsfoundation.lams.admin.service;

import javax.servlet.ServletContext;

import org.lamsfoundation.lams.events.IEventNotificationService;
import org.lamsfoundation.lams.integration.service.IIntegrationService;
import org.lamsfoundation.lams.lesson.service.ILessonService;
import org.lamsfoundation.lams.monitoring.service.IMonitoringService;
import org.lamsfoundation.lams.statistics.service.IStatisticsService;
import org.lamsfoundation.lams.themes.service.IThemeService;
import org.lamsfoundation.lams.timezone.service.ITimezoneService;
import org.lamsfoundation.lams.usermanagement.service.IUserManagementService;
import org.lamsfoundation.lams.usermanagement.service.LdapService;
import org.lamsfoundation.lams.util.Configuration;
import org.lamsfoundation.lams.util.MessageService;
import org.lamsfoundation.lams.util.audit.IAuditService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * @author jliew
 *
 * Common class to make it easier to get the Spring beans.
 */
public class AdminServiceProxy {
	
	private static IUserManagementService manageService;
	private static MessageService messageService;
	private static IIntegrationService integrationService;
	private static IAuditService auditService;
	private static IImportService importService;
	private static LdapService ldapService;
	private static IStatisticsService statisticsService;
	private static IThemeService themeService;
	private static Configuration configurationService;
	private static ILessonService lessonService;
	private static IMonitoringService monitoringService;
	private static IEventNotificationService eventNotificationService;
	private static ITimezoneService timezoneService;
	
	public static final IUserManagementService getService(ServletContext servletContext) {
		if (manageService == null) {
			manageService = (IUserManagementService)getDomainService(servletContext, "userManagementService");
		}
		return manageService;
	}
	
	public static final MessageService getMessageService(ServletContext servletContext) {
		if (messageService == null) {
			messageService = (MessageService)getDomainService(servletContext, "adminMessageService");
		}
		return messageService;

	}
	
	public static final IIntegrationService getIntegrationService(ServletContext servletContext) {
		if (integrationService == null){
			integrationService = (IIntegrationService)getDomainService(servletContext, "integrationService");
		}
		return integrationService;
	}
	
	public static final IAuditService getAuditService(ServletContext servletContext) {
		if (auditService == null){
			auditService = (IAuditService)getDomainService(servletContext, "auditService");
		}
		return auditService;
	}
	
	public static final IImportService getImportService(ServletContext servletContext) {
		if (importService == null){
			importService = (IImportService)getDomainService(servletContext, "importService");
		}
		return importService;
	}
	
	public static final LdapService getLdapService(ServletContext servletContext) {
		if (ldapService == null) {
			ldapService = (LdapService)getDomainService(servletContext, "ldapService");
		}
		return ldapService;
	}
	
	public static final IStatisticsService getStatisticsService(ServletContext servletContext) {
		if (statisticsService == null) {
		    statisticsService = (IStatisticsService)getDomainService(servletContext, "statisticsService");
		}
		return statisticsService;
	}
	
	public static final IThemeService getThemeService(ServletContext servletContext) {
		if (themeService == null) {
		    themeService = (IThemeService)getDomainService(servletContext, "themeService");
		}
		return themeService;
	}
	
	public static final Configuration getConfiguration(ServletContext servletContext) {
		if (configurationService == null) {
		    configurationService = (Configuration)getDomainService(servletContext, "configurationService");
		}
		return configurationService;
	}
	
	public static final ILessonService getLessonService(ServletContext servletContext) {
		if (lessonService == null) {
		    lessonService = (ILessonService)getDomainService(servletContext, "lessonService");
		}
		return lessonService;
	}
	
	public static final IMonitoringService getMonitoringService(ServletContext servletContext) {
		if (monitoringService == null) {
		    monitoringService = (IMonitoringService)getDomainService(servletContext, "monitoringService");
		}
		return monitoringService;
	}
	
	public static final IEventNotificationService getEventNotificationService(ServletContext servletContext) {
		if (eventNotificationService == null) {
		    eventNotificationService = (IEventNotificationService)getDomainService(servletContext, "eventNotificationService");
		}
		return eventNotificationService;
	}
	
	private static Object getDomainService(ServletContext servletContext,String serviceName) {
        WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
        return wac.getBean(serviceName);
    }
    
    	public static final ITimezoneService getTimezoneService(ServletContext servletContext) {
	        if (timezoneService == null) {
	            timezoneService = (ITimezoneService)getDomainService(servletContext, "timezoneService");
	        }
	        return timezoneService;
	}
}
