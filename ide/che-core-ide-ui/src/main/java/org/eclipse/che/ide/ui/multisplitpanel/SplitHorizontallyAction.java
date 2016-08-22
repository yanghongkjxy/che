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
package org.eclipse.che.ide.ui.multisplitpanel;

import org.eclipse.che.ide.api.action.Action;
import org.eclipse.che.ide.api.action.ActionEvent;
import org.eclipse.che.ide.api.multisplitpanel.SubPanel;

/**
 * //
 *
 * @author Artem Zatsarynnyi
 */
public class SplitHorizontallyAction extends Action {

    private final SubPanel subPanel;

    public SplitHorizontallyAction(SubPanel subPanel) {
        super("Split Pane In Two Rows", "Split Pane In Two Rows", null, null);
        this.subPanel = subPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        subPanel.splitHorizontally();
    }
}