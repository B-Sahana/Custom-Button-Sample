# Custom-Button-Sample
An easy to customize button color for different button states(pressed,disabled..etc) without selector creation and also you can add left/right image easily to it.

# Features
- Customizable button text color, size and font style.
- Customizable button size, background color and border color.
- Automatically sets button color when pressed, enable and disable.
- Easy to add icons either left or right to the button text and can set icon size also.
- minSdkVersion 19
 
## Screenshots
![](screenshots/socb.gif)
![](screenshots/socb.png)
![](screenshots/socb2.png)


## Installation

Latest version of the library can be found on Maven Central.

# For Gradle users
Open your ```build.gradle``` Then, include the library as dependency:

```
implementation 'com.barelogics:sahana.customButton:1.4'
```

# For Maven users
Add this dependency to your ```pom.xml```:
```
<dependency>
  <groupId>com.barelogics</groupId>
  <artifactId>sahana.customButton</artifactId>
  <version>1.4</version>
  <type>aar</type>
</dependency>
```
## Usage

Please see the ```CustomButtonSample/app```  for a more detailed code example of how to use the library.

1.Add the ```CustomButton``` view to the layout you want to show.
```
<com.barelogics.sahana.CustomButton
        android:id="@+id/customButton"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_margin="10dp"
        app:buttonType="normal_white_background"
        app:setColor="@color/colorPrimary"
        app:setImage="@drawable/ic_baseline_add_24"
        app:setText="Add"
        app:setTextSize="19sp"
        app:showImage="right" />
 ```    
2. Add Fonts:
   Add your custom fonts to ```assets/```. All font definitions are relative to this path.
  
   Assuming that you are using Gradle you should create the assets directory under ```src/main/``` in your project directory if it does not already exist. As it's   popular to use multi-project build with Gradle the path is usually ```app/src/main/assets/```, where app is the project name.

   You might consider creating a ```fonts/``` subdirectory in the assets directory (as in examples).

3. Configure attributes:
- ```setColor``` - is used to set color for text and border of the button.

- ```setImage``` - is used to set icon drawables. Only use the ```setImage``` attribute when you have to set icon.

- ```showImage``` - is used to show/set an icon either left or right, has two values ```left``` and ```right```. By default set to ```left```.

- ```buttonType``` - is used to set different types of button. By default set to ```normal_white_background```. It has 7 types.

     **1. normal_white_background:** It is a general button. Sets the ```setColor``` attribute color value to the border and text of the button with white background.
     
     **2. normal_transparent_background:** Sets the ```setColor``` attribute color value to the border and text of the button with transparent background.

     **3. normal_transparent_background_no_border:** Sets the ```setColor``` attribute color value to the text of the button with transparent background and without border.

     **4. normal_white_background_no_border:** Sets the given color in the ```setColor``` attribute to the text of the button with white background and with no border.
     
     **5. normal_white_background_with_color_border:** For this button type, you have to set ```setBorderColor``` attribute value along with the ```setcolor```. The ```setBorderColor``` value will be set to the border of the button and the ```setColor``` attribute color value set to the text with white background. So this button type is used to set different colors for text and border with white background.

     **6. color_background:** Sets the ```setColor``` attribute color value to the background of the button with white text.

     **7. color_background_with_color_border:** For this button type you have to set the ```setBorderColor``` attribute along with the ```setcolor```. The ```setBorderColor``` color value sets to the border of the button and the ```setColor``` attribute color value sets to the background of the button with white text. So this button type is used to set different colors for background and border with white text..
                                            
- ```setBorderColor``` - is used to set border color for the button.

- ```setText``` - is used to set text for button.

- ```setStrokeWidth``` - is used to set border/stroke size in dp (default: 1dp ).

- ```setTextFont``` - is used to set text font(typeface).```Usage <com.barelogics.sahana.CustomButton app:setTextFont="fonts/Light.otf"/>```.
     
- ```setDisableColor``` - is used to set color for when disabled the button. By default button disabled color is gray(#cccccc). So If you would like to set your desired color for disable then you can use this.

- ```setTextSize``` - to set text size in SP.

- ```setAllCaps``` - is used to set on/off capital letters for text. `True` means capital letters on for text.

- ```android:enabled``` - is used to set enable or disable the button. `False` for disable the button.

- ```setCornerRadius``` - is used to set corner radius of the button to make rounds. By default no(zero)corner radius for button.

- ```setImageWidth``` - is used to set icon width in dp. By default width value 25dp.

- ```setImageHeight``` - is used to set icon height in dp. By default height value 25dp.

4. If you would like to enable/disable the button dynamically then call the below method:
````
setViewEnable(boolean isViewEnable)
Ex: mCustomButtom.setViewEnable(false);
````
5. If you would like to set text dynamically for the button then call the below method:
````
setText(String text)
Ex: mCustomButtom.setText("Your button text");
````
 
6. If you would like to set icon dynamically for the button then call the below method:
````
setImage(int imageViewResourceId)
Ex: mCustomButtom.setImage(R.drawable.ic_edit);
````
 
7. If you would like to set color dynamically for the button then call the below method:
````
setColor(int colorResourceID)
Ex: mCustomButtom.setColor(R.color.green);
````
 
8. If you would like to set border color dynamically for the button then call the below method: 
````
setBorderColor(int colorResourceID)
Ex: mCustomButtom.setBorderColor(R.color.red);
````
 
9. If you would like to set button type dynamically then call the below method: 
````
setButtonType(@ButtonType int buttonType)
Ex: mCustomButtom.setButtonType(CustomButton.ButtonType.COLOR_BACKGROUND);
````

10. If you would like to set stroke width dynamically then call the below one of methods: 
````
   setStrokeWidthInDp(int width)
            or
   setStrokeWidthInPixels(int width)
            or
   setStrokeWidth(@DimenRes int resID):-resID must be dimension resource id. it can accept any size units like DIP, PX, SP

Ex: mCustomButtom.setStrokeWidthInDp(3);  or  mCustomButtom.setStrokeWidthInPixels(3);  or  mCustomButtom.setStrokeWidth(R.dimen.stroke_width);
````
10. Call the below method to get the button text and it returns string: 
```String text = mCustomButtom.getText();```
