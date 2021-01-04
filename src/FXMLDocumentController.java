/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import com.kirankunigiri.Sprint.Sprint;
import java.io.File;
import java.io.FileWriter;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

/**
 *
 * @author am012
 */
public class FXMLDocumentController implements Initializable {
    
       String imagePath = null;
       String filePath = null;
       String MsgEnc = " Your massage has been encoded successfully !\nCheck the folder that contains the original image.";
       String MsgDec = "        Your massage has been decoded successfully !\nCheck the 'hidden_text' file to see the decoded message.";
   
       //ANIMATIONS FOR MAIN PANE
       Sprint sprintMAINPANE;
       Sprint sprintDONEPANE;
    
       Sprint sprintENCBT ;
       Sprint sprintENCLB ;
       Sprint sprintENCICON ;
       
       Sprint sprintDECBT ;
       Sprint sprintDECLB ;
       Sprint sprintDECICON ;
       
       //ANIMATIONS FOR ENCODING PANE
       Sprint sprintENCPANE;
       Sprint sprintTEXT;
       Sprint sprintSAVE;
       Sprint sprintCANCEL;
       
       Sprint sprintENCOPSBT ;
       Sprint sprintENCOPSLB ;
       Sprint sprintENCOPSICON ;
       
       Sprint sprintTYPEBT;
       Sprint sprintTYPELB;
       Sprint sprintTYPEICON ;
       
       Sprint sprintCHOOSEENCLB;
       Sprint sprintCHOOSEENCBT;
       Sprint sprintCHOOSEENCICON;
       
        //ANIMATIONS FOR DECODING PANE
       
       Sprint sprintDECPANE;
       
       Sprint sprintDECOPSBT;
       Sprint sprintDECOPSICON;
       Sprint sprintDECOPSLB;
       
       Sprint sprintCHOOSELB;
       Sprint sprintCHOOSEBT;
       Sprint sprintCHOOSEICON;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       //ANIMATIONS FOR MAIN PANE
       sprintMAINPANE = new Sprint(MAIN_PANE);
       sprintDONEPANE = new Sprint(DONE_PANE);
       
       sprintENCBT = new Sprint(ENC_BT);
       sprintENCLB = new Sprint(ENC_LB);
       sprintENCICON = new Sprint(ENC_ICON);
       
       
       sprintDECBT = new Sprint(DEC_BT);
       sprintDECLB = new Sprint(DEC_LB);
       sprintDECICON = new Sprint(DEC_ICON);
       
       //ANIMATIONS FOR ENCODING PANE
       sprintENCPANE = new Sprint(ENCODING_PANE);
       sprintTEXT = new Sprint(TEXT_AREA);
       sprintSAVE = new Sprint(SAVE_BT);
       sprintCANCEL = new Sprint(CANCEL);
       
       sprintENCOPSBT = new Sprint(ENC_OPS_BT);
       sprintENCOPSLB = new Sprint(ENC_OPS_LB);
       sprintENCOPSICON = new Sprint(ENC_OPS_ICON);
       
       sprintTYPEBT = new Sprint(TYPE_BT);
       sprintTYPEICON = new Sprint(TYPE_ICON);
       sprintTYPELB = new Sprint(TYPE_LB);
       
       
       sprintCHOOSEENCBT = new Sprint(CHOOSE_ENC_BT);
       sprintCHOOSEENCICON = new Sprint(CHOOSE_ENC_ICON);
       sprintCHOOSEENCLB = new Sprint(CHOOSE_ENC_LB);
       
       //ANIMATIONS FOR DECODING PANE
       sprintDECPANE = new Sprint(DECODING_PANE);
       
       sprintDECOPSBT = new Sprint(DEC_OPS_BT);
       sprintDECOPSLB = new Sprint(DEC_OPS_LB);
       sprintDECOPSICON = new Sprint(DEC_OPS_ICON);
       
       sprintCHOOSEBT = new Sprint(CHOOSE_BT);
       sprintCHOOSEICON = new Sprint(CHOOSE_ICON);
       sprintCHOOSELB = new Sprint(CHOOSE_LB);
       
       
        
    }    
    
// MAIN PANE
    @FXML
    private AnchorPane DONE_PANE;

    @FXML
    private Label DONE_LB;
    
    @FXML
    private AnchorPane MAIN_PANE;
    
    @FXML
    private Button ENC_BT;

    @FXML
    private Button DEC_BT;

    @FXML
    private ImageView ENC_ICON;

    @FXML
    private ImageView DEC_ICON;

    @FXML
    private Label ENC_LB;

    @FXML
    private Label DEC_LB;
    
    //END OF MAIN PANE
    
    //ENCODING PANE
    
    @FXML
    private ImageView CANCEL;
    
    @FXML
    private TextField TEXT_AREA;
    
    @FXML
    private AnchorPane ENCODING_PANE;

    @FXML
    private Button ENC_OPS_BT;

    @FXML
    private Button CHOOSE_BT;

    @FXML
    private ImageView ENC_OPS_ICON;

    @FXML
    private ImageView CHOOSE_ICON;

    @FXML
    private Label ENC_OPS_LB;

    @FXML
    private Label CHOOSE_LB;

    @FXML
    private Button TYPE_BT;

    @FXML
    private ImageView TYPE_ICON;

    @FXML
    private Label TYPE_LB;
    
    @FXML
    private Button SAVE_BT;

    //END OF ENC PANE
    
    //DECODING PANE
    @FXML
    private AnchorPane DECODING_PANE;
    
    @FXML
    private Button DEC_OPS_BT;

    @FXML
    private ImageView DEC_OPS_ICON;

    @FXML
    private Label DEC_OPS_LB;
    
    @FXML
    private Button CHOOSE_ENC_BT;

    @FXML
    private ImageView CHOOSE_ENC_ICON;

    @FXML
    private Label CHOOSE_ENC_LB;
    
    //END OF DEC PANE
    
    //MAIN PANE FUNCTIONS
    @FXML
    void OK_BT(ActionEvent event) {

        HideDoneMsg(sprintDONEPANE, DONE_LB);
        
    }

    @FXML
    void DEC_BT(ActionEvent event) {
        
        AnimatePane(sprintMAINPANE, MAIN_PANE , DECODING_PANE, sprintDECPANE);

    }
    
    @FXML
    void DEC_MOUSE_IN(MouseEvent event) {
        
        AnimateButtonIN(sprintDECBT, sprintDECLB, sprintDECICON);

    }

    @FXML
    void DEC_MOUSE_OUT(MouseEvent event) {

        AnimateButtonOUT(sprintDECBT, sprintDECLB, sprintDECICON);
        
    }


    @FXML
    void ENC_BT(ActionEvent event) {
        
        AnimatePane(sprintMAINPANE, MAIN_PANE , ENCODING_PANE, sprintENCPANE);

    }
    
    @FXML
    void ENC_MOUSE_IN(MouseEvent event) {

        AnimateButtonIN(sprintENCBT, sprintENCLB, sprintENCICON);
        
    }

    @FXML
    void ENC_MOUSE_OUT(MouseEvent event) {

        AnimateButtonOUT(sprintENCBT, sprintENCLB, sprintENCICON);
        
    }
    
    //END OF MAIN PANE FUNCTIONS
    
    
    //ENC PANE FUNCTIONS
    
     @FXML
    void BACK_FROM_ENC_BT(ActionEvent event) {
        
        AnimatePane(sprintENCPANE, ENCODING_PANE , MAIN_PANE, sprintMAINPANE);

    }
    
    @FXML
    void CHOOSE_ENC_BT(ActionEvent event) {
        
        Stage stg = (Stage) ((Node)event.getSource() ).getScene().getWindow();
        
        imagePath = ChooseImage(stg);

    }

    @FXML
    void CHOOSE_ENC_MOUSE_IN(MouseEvent event) {
        
        AnimateButtonIN(sprintCHOOSEENCBT, sprintCHOOSEENCLB, sprintCHOOSEENCICON);

    }

    @FXML
    void CHOOSE_ENC_MOUSE_OUT(MouseEvent event) {
        
        AnimateButtonOUT(sprintCHOOSEENCBT, sprintCHOOSEENCLB, sprintCHOOSEENCICON);

    }

    @FXML
    void ENC_OPS_BT(ActionEvent event) {
        
        if(isImageChoosed(imagePath) && isTypedMsg(filePath))
            if(Steganographer.encode(imagePath, filePath))
            {
                imagePath = null;
                ShowDoneMsg(sprintDONEPANE, DONE_LB, MsgEnc);
            }
            else
                AlertError("Couldn't perform encoding on this image ! \nTry select images with extention '.PNG' ");
        else
            AlertError("Check that you have been selected an image and typed a message !");

    }

    @FXML
    void ENC_OPS_MOUSE_IN(MouseEvent event) {

        AnimateButtonIN(sprintENCOPSBT, sprintENCOPSLB, sprintENCOPSICON);
    }

    @FXML
    void ENC_OPS_MOUSE_OUT(MouseEvent event) {

        AnimateButtonOUT(sprintENCOPSBT, sprintENCOPSLB, sprintENCOPSICON);
        
    }

    @FXML
    void TYPE_BT(ActionEvent event) {

        AnimateButtonTO(sprintTYPEBT,sprintTEXT,sprintSAVE,sprintCANCEL,ENC_BT);
        
    }

    @FXML
    void TYPE_MOUSE_IN(MouseEvent event) {

        AnimateButtonIN(sprintTYPEBT, sprintTYPELB, sprintTYPEICON);
        
    }

    @FXML
    void TYPE_MOUSE_OUT(MouseEvent event) {

        AnimateButtonOUT(sprintTYPEBT, sprintTYPELB, sprintTYPEICON);
        
    }
    
    @FXML
    void SAVE_BT(ActionEvent event) {

        String Text = TEXT_AREA.getText();
        if(!Text.isEmpty())
        {
            SaveMesssage(Text);
            AnimateButtonFROM(sprintTYPEBT,sprintTEXT,sprintSAVE,sprintCANCEL,ENC_BT);
            ResetField();
        }
        else
        {
            EmptyField();
        }
        
        
    }
    
    @FXML
    void CANCEL_BT(MouseEvent event) {

        AnimateButtonFROM(sprintTYPEBT,sprintTEXT,sprintSAVE,sprintCANCEL,ENC_BT);
        ResetField();
        
    }


    
    //END OF ENC PANE FUNCTIONS
    
    //DECODING PANE
    
    @FXML
    void BACK_FROM_DEC_BT(ActionEvent event) {
        
        AnimatePane(sprintDECPANE, DECODING_PANE , MAIN_PANE, sprintMAINPANE);

    }
    
    @FXML
    void DEC_OPS_BT(ActionEvent event) {
        
        if(isImageChoosed(imagePath))
            if(!Steganographer.decode(imagePath).equals("false"))
            {
                imagePath = null;
                ShowDoneMsg(sprintDONEPANE, DONE_LB, MsgDec);
            }
            else
                AlertError("Couldn't perform decoding from this image !\nTry select encoded images with extention '.PNG' ");
        else
            AlertError("Check that you have been selected an image");

    }
    
    @FXML
    void DEC_OPS_MOUSE_IN(MouseEvent event) {

        AnimateButtonIN(sprintDECOPSBT, sprintDECOPSLB, sprintDECOPSICON);
    }

    @FXML
    void DEC_OPS_MOUSE_OUT(MouseEvent event) {

        AnimateButtonOUT(sprintDECOPSBT, sprintDECOPSLB, sprintDECOPSICON);
        
    }
    
    @FXML
    void CHOOSE_BT(ActionEvent event) {//DEC
        
        Stage stg = (Stage) ((Node)event.getSource() ).getScene().getWindow();
        
        imagePath = ChooseImage(stg);

    }

    @FXML
    void CHOOSE_MOUSE_IN(MouseEvent event) {//DEC
        
        AnimateButtonIN(sprintCHOOSEBT, sprintCHOOSELB, sprintCHOOSEICON);

    }

    @FXML
    void CHOOSE_MOUSE_OUT(MouseEvent event) {//DEC
        
        AnimateButtonOUT(sprintCHOOSEBT, sprintCHOOSELB, sprintCHOOSEICON);

    }
    
    //END OF DEC PANE FUNCTIONS
    void AnimateButtonIN(Sprint sprintBT , Sprint sprintLB , Sprint sprintICON)
    {
        double dur = 0.5;
        int y  = -50;
        
        sprintBT.moveTo(dur, 0, y).sprint();
        sprintICON.moveTo(dur+0.3, 0, y).sprint();
        sprintICON.rotateTo(dur+0.5, 40).sprint();
        sprintLB.moveTo(dur+0.1, 0, y).sprint();
    }

    void AnimateButtonOUT(Sprint sprintBT , Sprint sprintLB , Sprint sprintICON)
    {
        double dur = 0.5;
        int y  = 0;
        
        sprintBT.moveTo(dur, 0, y).sprint();
        sprintICON.moveTo(dur+0.3, 0, y).sprint();
        sprintICON.rotateTo(dur+0.5, 0).sprint();
        sprintLB.moveTo(dur+0.1, 0, y).sprint();
    }
    
    void AnimatePane(Sprint sprintPANE , AnchorPane curPANE , AnchorPane nextPANE , Sprint sprintNEXTPANE)
    {
        nextPANE.setVisible(true);
        sprintNEXTPANE.fadeTo(0.5, 1).sprint();
        sprintPANE.fadeTo(0.5, 0).sprint();
        curPANE.setVisible(false);
    }
    
    void AnimateButtonTO(Sprint sprintBT ,Sprint sprintTEXT,Sprint sprintSAVE , Sprint sprintCANCEL , Button BT)
    {
        BT.setDisable(true);
        BT.setOpacity(1);
        sprintBT.scaleTo(0.8, 50, 50).sprint();
        sprintTEXT.fadeTo(0.2, 1).sprint();
        sprintTEXT.scaleTo(1, 1.7, 1.7).sprint();
        sprintTEXT.wait(0.5);
        sprintTEXT.scaleTo(0.5, 1.5, 1.5).sprint();
        sprintSAVE.scaleTo(1, 1, 1).sprint();
        sprintCANCEL.scaleTo(1, 1.1, 1.1).sprint();
       
    }
    
    void AnimateButtonFROM(Sprint sprintBT ,Sprint sprintTEXT,Sprint sprintSAVE , Sprint sprintCANCEL , Button BT)
    {
        BT.setDisable(false);
        sprintBT.scaleTo(1, 1, 1).sprint();
        sprintTEXT.fadeTo(0.2, 0).sprint();
        sprintTEXT.scaleTo(1, 0, 0).sprint();
        sprintSAVE.scaleTo(1, 0, 0).sprint();
        sprintCANCEL.scaleTo(1, 0, 0).sprint();
        
    }
    
    String ChooseImage(Stage stage)
    {
        FileChooser file = new FileChooser();
        file.setTitle("Choose image");
        file.getExtensionFilters().add(new ExtensionFilter("Image file", "*.png"));
        File selectedFile = file.showOpenDialog(stage);
        
        if(selectedFile != null)
            return selectedFile.getPath();
        else
            return null;
    }
    
    void EmptyField()
    {
        sprintTEXT.moveTo(0.1, 15, 0).loop(5);
        sprintTEXT.moveTo(0.1, -15, 0).loop(5);
        sprintTEXT.wait(0.2);
        sprintTEXT.moveTo(0.1, 0, 0).sprint();
        
        sprintCANCEL.moveTo(0.1, 15, 0).loop(5);
        sprintCANCEL.moveTo(0.1, -15, 0).loop(5);
        sprintCANCEL.wait(0.2);
        sprintCANCEL.moveTo(0.1, 0, 0).sprint();
        
        sprintSAVE.moveTo(0.1, 15, 0).loop(5);
        sprintSAVE.moveTo(0.1, -15, 0).loop(5);
        sprintSAVE.wait(0.2);
        sprintSAVE.moveTo(0.1, 0, 0).sprint();
        
        TEXT_AREA.setPromptText("Type a message to save...");
        TEXT_AREA.setStyle("-fx-prompt-text-fill :  #f47272 ; -fx-background-radius :  20 20 0 20 ; -fx-background-color : white");
    }
    
    void ResetField()
    {
        TEXT_AREA.setPromptText("Type a message to encode...");
        TEXT_AREA.setStyle("-fx-prompt-text-fill :  gray ; -fx-background-radius :  20 20 0 20 ; -fx-background-color : white");
        TEXT_AREA.setText("");
        
    }
   
    void SaveMesssage(String message)
    {
        filePath = "messages\\Message.bin";
        
        try
        {
            FileWriter FW = new FileWriter(filePath);
            FW.write(message);
            FW.close();
            
        }
        catch(Exception e)
        {
            
        }
    }
    
    boolean isImageChoosed(String ImagePath)
    {
           return ImagePath != null;
            
    }
    
    boolean isTypedMsg(String FilePath)
    {
            return FilePath != null;
    }
    
    void AlertError(String ErrorMsg)
    {
        Alert a = new Alert(Alert.AlertType.ERROR);
        a.setContentText(ErrorMsg);
        a.showAndWait();
    }
    
    void ShowDoneMsg(Sprint sprintPANE , Label MsgLB , String Msg)
    {
        sprintPANE.scaleTo(0.5, 1, 1).sprint();
        MsgLB.setText(Msg);
    }
    
    void HideDoneMsg(Sprint sprintPANE , Label MsgLB)
    {
        sprintPANE.scaleTo(0.5, 0, 0).sprint();
        MsgLB.setText("");
    }
    
}
