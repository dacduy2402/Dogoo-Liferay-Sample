package com.dogoo.intern.rest.internal.exception;

import com.liferay.portal.kernel.exception.PortalException;

public class DG_NoSuchEntryException extends PortalException {
    public DG_NoSuchEntryException() {
    }

    public DG_NoSuchEntryException(String msg) {
        super(msg);
    }

    public DG_NoSuchEntryException(String msg, Throwable throwable) {
        super(msg, throwable);
    }

    public DG_NoSuchEntryException(Throwable throwable) {
        super(throwable);
    }

}
