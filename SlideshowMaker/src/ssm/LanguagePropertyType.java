package ssm;

/**
 * This class provides the types that will be need to be loaded from
 * language-dependent XML files.
 * 
 * @author McKilla Gorilla & _____________
 */
public enum LanguagePropertyType {
    // TITLE FOR WINDOW TITLE BAR
    // TITLE FOR WINDOW TITLE BAR
    TITLE_WINDOW,
    
    // APPLICATION TOOLTIPS FOR BUTTONS
    TOOLTIP_NEW_SLIDE_SHOW,
    TOOLTIP_LOAD_SLIDE_SHOW,
    TOOLTIP_SAVE_SLIDE_SHOW,
    TOOLTIP_VIEW_SLIDE_SHOW,
    TOOLTIP_EXIT,
    TOOLTIP_ADD_SLIDE,
    TOOLTIP_REMOVE_SLIDE,
    TOOLTIP_MOVE_UP,
    TOOLTIP_MOVE_DOWN,
    TOOLTIP_PREVIOUS_SLIDE,
    TOOLTIP_NEXT_SLIDE,
    
    // DEFAULT VALUES
    DEFAULT_IMAGE_CAPTION,
    DEFAULT_SLIDE_SHOW_TITLE,
    
    // UI LABELS
    LABEL_CAPTION,
    LABEL_PROJECT_TITLE,
      
    /* THESE ARE FOR LANGUAGE-DEPENDENT ERROR HANDLING,
     LIKE FOR TEXT PUT INTO DIALOG BOXES TO NOTIFY
     THE USER WHEN AN ERROR HAS OCCURED */
    ERROR_DATA_FILE_LOADING,
    ERROR_PROPERTIES_FILE_LOADING,
    ERROR_NO_SLIDESHOW_IMAGES,
    ERROR_UNEXPECTED,
    ERROR_NOT_CREATED,
    
    /*Prompts */
    SAVEPROMPT,
    NEW_SLIDESHOW,
    
    /*Button Names*/
    Yes,
    No,
    SAVE,
    NO_SAVE,
    CANCEL,
    
    /* Language prompt */
}
