/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.nest.internal;

/**
 * @author John Cocula
 * @since 1.7.0
 */
public class NestException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public NestException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public NestException(final Throwable cause) {
        super(cause);
    }
}
