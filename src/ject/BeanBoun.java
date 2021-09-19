package ject;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Tanabat
 */
public class BeanBoun implements Serializable {
    
    public static final String SCORE_PROPERTY = "Score";
    
    private String Score;
    
    private PropertyChangeSupport propertySupport;
    
    public BeanBoun() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getScore() {
        return Score;
    }
    
    public void setScore(String Value) {
        String oldValue = Score;
        this.Score = Value;
        propertySupport.firePropertyChange(SCORE_PROPERTY, oldValue, this.Score);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
