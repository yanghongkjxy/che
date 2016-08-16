/*******************************************************************************
 * Copyright (c) 2012-2016 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 ******************************************************************************/
package org.eclipse.che.ide.api.multisplitpanel;

import com.google.gwt.user.client.ui.IsWidget;

/**
 * Listener to be notified when some widget on some {@link SubPanel} is focused.
 *
 * @author Artem Zatsarynnyi
 */
public interface FocusListener {

    /** Invoked when a {@code widget} on a {@code panel} gains the focus. */
    void focusGained(SubPanel panel, IsWidget widget);
}