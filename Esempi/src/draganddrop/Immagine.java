package draganddrop;

import java.io.InputStream;

import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.HBox;

public class Immagine extends ImageView{

	private HBox box;
	private DragAndDrop dragAndDrop;
	private Tooltip tooltip;
	
	public Immagine(Image im) {
		super(im);
		
		setOnDragDetected(event -> {
        	System.out.println("setOnDragDetected");
            if (getImage() == null) {
                return;
            }	

        Dragboard drag = startDragAndDrop(TransferMode.MOVE);
        ClipboardContent content = new ClipboardContent();
        content.putImage(getImage());
        drag.setDragView(getImage());
        drag.setContent(content);
        event.consume();
		});
		
		setOnDragOver(event ->{
			System.out.println("setOnDragOver");       
        	if (!event.isDropCompleted() &&
                   event.getDragboard().hasString()) {
                event.acceptTransferModes(TransferMode.MOVE);
            }

            event.consume();
		});
		
        setOnDragEntered(event -> {
        	System.out.println("setOnDragEntered");
            if (!event.isDropCompleted() &&
                    event.getDragboard().hasString()) {
                setOpacity(0.3);
            }
        });
		
        setOnDragExited(event -> {
        	System.out.println("setOnDragExited");
            if (!event.isDropCompleted() &&
                    event.getDragboard().hasString()) {
                setOpacity(1);
            }
        });
        
        setOnDragDropped(event->{
        	System.out.println("setOnDragDropped");
            if (getImage() == null) {
                return;
            }
            
            Dragboard drag = event.getDragboard();
            boolean success = false;
            
            if(drag.hasImage()){
            	box.getChildren().add(this);
            	dragAndDrop.setNew(new Scene(box));
            	success = true;
            }
            
            event.setDropCompleted(success);
            event.consume();
            
        });
        
        
        
        setOnDragDone(event ->{
        	box.getChildren().add(new Immagine(im));
        });
	}

	public void getBox(HBox box) {
		this.box=box;
		
	}

	public Tooltip getTooltip() {
		return tooltip;
	}

	public void setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
	}
	
	 	
}	
