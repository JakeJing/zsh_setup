// _MainMenu_EOArchive_English.java
// Generated by EnterpriseObjects palette at Wednesday, May 19, 2004 12:30:34 AM US/Eastern

import com.webobjects.eoapplication.*;
import com.webobjects.eocontrol.*;
import com.webobjects.eointerface.*;
import com.webobjects.eointerface.swing.*;
import com.webobjects.foundation.*;
import javax.swing.*;

public class _MainMenu_EOArchive_English extends com.webobjects.eoapplication.EOArchive {
    DoNothingController _doNothingController0;

    public _MainMenu_EOArchive_English(Object owner, NSDisposableRegistry registry) {
        super(owner, registry);
    }

    protected void _construct() {
        Object owner = _owner();
        EOArchive._ObjectInstantiationDelegate delegate = (owner instanceof EOArchive._ObjectInstantiationDelegate) ? (EOArchive._ObjectInstantiationDelegate)owner : null;
        Object replacement;

        super._construct();


        if ((delegate != null) && ((replacement = delegate.objectForOutletPath(this, "delegate")) != null)) {
            _doNothingController0 = (replacement == EOArchive._ObjectInstantiationDelegate.NullObject) ? null : (DoNothingController)replacement;
            _replacedObjects.setObjectForKey(replacement, "_doNothingController0");
        } else {
            _doNothingController0 = (DoNothingController)_registered(new DoNothingController(), "DoNothingController");
        }
    }

    protected void _awaken() {
        super._awaken();

        if (_replacedObjects.objectForKey("_doNothingController0") == null) {
            _connect(_owner(), _doNothingController0, "delegate");
        }
    }

    protected void _init() {
        super._init();
    }
}
