/*
 * Copyright (C) 2010 University of Washington
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.opendatakit.common.security;


/**
 * Minimal service for accessing information about the current
 * user and the calling context.
 * 
 * @author wbrunette@gmail.com
 * @author mitchellsundt@gmail.com
 * 
 */
public interface UserService {
  
  public String createLoginURL();
  
  public String createLogoutURL();
  
  public Realm getCurrentRealm();
  
  public User getCurrentUser();
  
  public User getDaemonAccountUser();

  /**
   * Determine if the access management system has been configured.
   * 
   * @return true if access management has been configured or if database unavailable
   */
  public boolean isAccessManagementConfigured();
  
  public void reloadPermissions();

  public boolean isUserLoggedIn();

  /**
   * Get a fixed, unique string identifying the deployment of this server.
   * This may change after each install.  The format of the string is 
   * arbitrary.
   * 
   * @return unique string.
   */
  public String getUserServiceKey();

  /**
   * @return the configured super user email address.
   */
  public String getSuperUserEmail();

}