# ToolbarMenu

App Android Didático: Toolbar e Menu de opções.

<table>
<tr align=center>
<td><img src="https://github.com/machadowma/ToolbarMenu/blob/master/screen_capture_1.png" align="left" height="360" width="180" ></td>
<td><img src="https://github.com/machadowma/ToolbarMenu/blob/master/screen_capture_2.png" align="left" height="360" width="180" ></td>
<td><img src="https://github.com/machadowma/ToolbarMenu/blob/master/screen_capture_3.png" align="left" height="180" width="360" ></td>
</tr>
<tr align=center>
<td>Captura de Tela 1</td>
<td>Captura de Tela 2</td>
<td>Captura de Tela 3</td>
</tr>
</table>

Crie o Projeto com *API 21: Android 5.0 (Lollipop)* ou superior.

Crie uma *Empty Activity*.

No *AndroidManifest.xml*, altere o tema do app:


```
...
android:theme="@style/Theme.AppCompat.Light.NoActionBar"
...
```

Crie um arquivo de menu (*File->New->Android Resource File*), preenchendo os campos conforme abaixo:
* *File_name = menu_principal*
* *Resource type = menu*

No arquivo *menu_principal.xml*, adicione um *XML Name Space*:
```
...
xmlns:app="http://schemas.android.com/apk/res-auto"
...
```

Edite o arquivo *menu_principal.xml*, incluindo os itens do menu:
```
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android"
      xmlns:app="http://schemas.android.com/apk/res-auto">
    <item android:id="@+id/setup"
    android:title="Configurações" />
    <item
        android:id="@+id/star"
        android:title="Estrela"
        android:icon="@android:drawable/btn_star_big_on"
        app:showAsAction="ifRoom" />
    <item
        android:id="@+id/email"
        android:icon="@android:drawable/ic_dialog_email"
        android:title="E-mail"
        app:showAsAction="ifRoom" />
    <item
        android:id="@+id/lock"
        android:icon="@android:drawable/ic_lock_lock"
        android:title="Bloquear"
        app:showAsAction="ifRoom" />
    <item
        android:id="@+id/share"
        android:icon="@android:drawable/ic_menu_share"
        android:title="Compartilhar"
        app:showAsAction="ifRoom" />
    <item
        android:id="@+id/power_off"
        android:icon="@android:drawable/ic_lock_power_off"
        android:title="Sair"
        app:showAsAction="ifRoom" />
</menu>
```
Observe que o iten *setup* deve sempre aparecer no formato texto. Já os demais itens foram configurados com a opção *app:showAsAction="ifRoom"* e, por isso, devem aparecer no formato de imagens sempre que possível.

No arquivo *activity_main.xml*, adicione uma *Toolbar*:
```
<android.support.v7.widget.Toolbar
    android:id="@+id/minha_toolbar"
    android:layout_width="match_parent"
    android:layout_height="?attr/actionBarSize"
    android:background="?attr/colorPrimary"
    android:elevation="4dp"
    android:theme="@style/ThemeOverlay.AppCompat.ActionBar"
    app:popupTheme="@style/ThemeOverlay.AppCompat.Light"/>
```

Em *MainActivity.java*, importe a classe:
```
import android.support.v7.widget.Toolbar;
```

No método *onCreate*, defina a *toolbar*:
```
...
Toolbar minhaToolbar = (Toolbar) findViewById(R.id.minha_toolbar);
setSupportActionBar(minhaToolbar);
...
```

Ainda em *MainActivity.java*, porém fora do método *onCreate*, substitua o método *onCreateOptionsMenu*:
```
...
@Override
public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_principal, menu);
    return true;
}
...
```

Substitua o método *onOptionsItemSelected*:
```
...
@Override
public boolean onOptionsItemSelected(MenuItem item) {
    switch (item.getItemId()) {
        case R.id.setup:
            Toast.makeText(this, "Configurações", Toast.LENGTH_SHORT).show();
            return true;
        case R.id.star:
            Toast.makeText(this, "Estrela", Toast.LENGTH_SHORT).show();
            return true;
        case R.id.email:
            Toast.makeText(this, "E-mail", Toast.LENGTH_SHORT).show();
            return true;
        case R.id.lock:
            Toast.makeText(this, "Bloquear", Toast.LENGTH_SHORT).show();
            return true;
        case R.id.share:
            Toast.makeText(this, "Compartilhar", Toast.LENGTH_SHORT).show();
            return true;
        case R.id.power_off:
            Toast.makeText(this, "Sair", Toast.LENGTH_SHORT).show();
            return true;
        default:
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            return super.onOptionsItemSelected(item);
    }
}
...
```

Pronto, observe que o número de itens exibidos em forma de imagens na barra de ferramenta varia conforme aparelho e até mesmo orientação do dispositivo.

# Referências
* https://developer.android.com/guide/topics/ui/menus
* https://developer.android.com/training/appbar/index.html
* https://helpdev.com.br/2014/09/15/android-utilizando-o-item-do-menu-showasaction-com-appcompat-library-v7/

# License

MIT License

Copyright (c) 2019 machadowma

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
