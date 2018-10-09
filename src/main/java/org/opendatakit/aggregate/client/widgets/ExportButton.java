/*
 * Copyright (C) 2011 University of Washington
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

package org.opendatakit.aggregate.client.widgets;

import org.opendatakit.aggregate.client.filter.FilterGroup;
import org.opendatakit.aggregate.client.popups.ExportPopup;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

public final class ExportButton extends AggregateButton implements ClickHandler {

  private static final String BUTTON_TXT = "<img src=\"images/export.png\" /> Export";
  private static final String TOOLTIP_TEXT = "Export the data";
  private static final String HELP_BALLOON_TXT = "Export the data to a CSV or KML file.";

  private final String formId;
  private final FilterGroup selectedFilterGroup;

  public ExportButton(String formId) {
    this(formId, null);
  }
  
  public ExportButton(String formId, FilterGroup selectedFilterGroup) {
    super(BUTTON_TXT, TOOLTIP_TEXT, HELP_BALLOON_TXT);
    this.formId = formId;
    this.selectedFilterGroup = selectedFilterGroup;
  }
  
  @Override
  public void onClick(ClickEvent event) {
    super.onClick(event);
    
    ExportPopup popup = new ExportPopup(formId, selectedFilterGroup);
    popup.setPopupPositionAndShow(popup.getPositionCallBack());
  }
}