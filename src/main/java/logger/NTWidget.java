package Logger;

import edu.wpi.first.networktables.NetworkTableEntry;

import java.util.Map;

class NTWidget implements ShuffleboardWidgetWrapper {

    NetworkTableEntry entry;

    NTWidget(NetworkTableEntry entry, Object value){
        this.entry = entry;
        entry.setValue(value);
    }

    @Override
    public NetworkTableEntry getEntry() {
        return entry;
    }

    @Override
    public ShuffleboardWidgetWrapper withProperties(Map<String, Object> properties) {
        return this;
    }

    @Override
    public ShuffleboardWidgetWrapper withWidget(String widgetType) {
        return this;
    }
}
