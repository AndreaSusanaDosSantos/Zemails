package com.example.zmail;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.example.zmail.models.CorreoElectronico;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvCorreos;
    private CorreoElectronicoAdapter adaptador;
    private  List<CorreoElectronico>ListaDeCorreos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCorreos = (ListView) findViewById(R.id.ListViewCorreoElectronico);

        ListaDeCorreos = new ArrayList<>( );
        this.carDatos(ListaDeCorreos);

        adaptador = new CorreoElectronicoAdapter(ListaDeCorreos);
        lvCorreos.setAdapter(adaptador);

        /* lvCorreos.setAdapter(new CorreoElectronicoAdapter(ListaDeCorreos));  */

        lvCorreos.setOnItemClickListener(new AdapterView.OnItemClickListener( ) {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Clic en el elemento: " + position, Toast.LENGTH_LONG).show( );
                CargarDetalleCorreo(position);
            }
        });

    }

        private void CargarDetalleCorreo(int position) {
        CorreoElectronico email= (CorreoElectronico) adaptador.getItem(position);

        Intent intent= new Intent(MainActivity.this, DetalleCorreo.class);
        intent.putExtra("Detalles", ListaDeCorreos.get(position));
        startActivity(intent);
    }
    private void carDatos(List<CorreoElectronico> listaDeCorreos) {


    listaDeCorreos.add(new CorreoElectronico("Daniela Briaguez", "Importante", 0,"Es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen.", 1));
    listaDeCorreos.add(new CorreoElectronico("Compras On Line", "Librería", 0, "Tenemos la mayor colección de libros en Argentina. Ven a comprobarlo! Únete a los Miles de Argentinos que han comprado e Importado Con Buscalibre. Envió con Seguimiento. Compra Fácil y Seguro. Comprar Libros Baratos. Millones de Libros. Promociones en Libros.",2 ));
    listaDeCorreos.add(new CorreoElectronico("Roberto Tarrío", "Material de estudio", 0, "Una base de datos es un conjunto de datos pertenecientes a un mismo contexto y almacenados sistemáticamente para su posterior uso. En este sentido; una biblioteca puede considerarse una base de datos compuesta en su mayoría por documentos y textos impresos en papel e indexados para su consulta. Actualmente, y debido al desarrollo tecnológico de campos como la informática y la electrónica.", 3));
    listaDeCorreos.add(new CorreoElectronico("Maraton de lectura", "Jornada", 0, "En muchas zonas del país en las que trabajamos, diversas barreras impiden a los jóvenes acceder a las competencias de lectura que necesitan para tener éxito en la escuela. Esto incluye falta de acceso al libro y ricos ambientes alfabetizadores en las escuelas y en los hogares, maestros que implementen estrategias basadas en la investigación educativa, y modelos lectores en los hogares en los que los chicos crecen. Fundación Leer busca brindar a los niños aquello que necesitan para crecer como sólidos lectores.", 4));
    listaDeCorreos.add(new CorreoElectronico("Escuela 204", "Informar", 0, "Nos es grato reiniciar el contacto con la Comunidad Educativa en este comienzo de ciclo\n" +
            "lectivo como parte del equipo de una gestión política encabezada por el Gobernador Axel\n" +
            "Kicillof y la Directora General de Cultura y Educación Agustina Vila.\n" +
            "Las Jornadas Institucionales son un derecho de los/as docentes a contar con un espacio\n" +
            "de encuentro, participación, debate y construcción de propuestas de trabajo institucional\n" +
            "que, basadas en las prioridades de la política educativa provincial, abonen al Proyecto\n" +
            "Educativo de cada escuela. ", 5 ));

    listaDeCorreos.add(new CorreoElectronico("Familia Figuerelo", "Actividades semanales", 0, "Juntos aprendiendo lo esencial: juega, inspírate y crece. ¡Entra acá y aprende jugando! Actividades para niños de todas las edades, disfruta de nuestras experiencias online. Eventos en Vivo. Juega, Inspírate y Crea. Aprende Haciendo. Reflexiona y Aprende.",6 ));
    listaDeCorreos.add(new CorreoElectronico("Evita Perez", "El principito", 0, "El Principito es un cuento poético que viene acompañado de ilustraciones hechas con acuarelas por el mismo Saint-Exupéry. En él, un piloto se encuentra perdido en el desierto del Sahara luego de que su avión sufriera una avería. Para su sorpresa, es allí donde conoce a un pequeño príncipe proveniente de otro planeta.", 7));
    listaDeCorreos.add(new CorreoElectronico("Banco de La Pampa", "Promociones", 0, "Promo Banco de La Pampa -25% de descuento. Anuncio www.bancodelapampa.com.ar. Vigencia: hasta el 31/07/2020 Todos los días comprando con Caldén MasterCard y Caldén Visa. Tope de Reintegro: $ 1.500 x mes, x marca y x cuenta de tarjeta de crédito. Hasta el 31 de julio. Todos los días. Y Caldén Visa. Con Caldén Master Card.", 8));
    listaDeCorreos.add(new CorreoElectronico("Camuzzi", "Factura", 0, "Este correo electrónico y sus adjuntos está dirigido solamente a los destinatarios consignados en el mismo y debe ser considerado confidencial. Si Ud. no es el destinatario consignado o la persona responsable de entregar/enviar el presente, no podrá copiarlo o entregarlo/enviarlo a ninguna otra persona ni utilizar el mismo en forma no autorizada. Dichas acciones están prohibidas y pueden ser consideradas ilegales. Ley 25326 - art.27. - inc. 3. El titular podrá en cualquier momento solicitar el retiro o bloqueo de su nombre de los bancos de datos a los que se refiere el presente artículo. Decreto 1558/01 - art. 27. - 3er. párrafo. En toda comunicación con fines de publicidad que se realice por correo, teléfono, correo electrónico, Internet u otro medio a distancia a conocer, se deberá indicar, en forma expresa y destacada, la posibilidad del titular del dato de solicitar el retiro o bloqueo, total o parcial, de su nombre de la base de datos. A pedido del interesado, se deberá informar el nombre del responsable o usuario del banco de datos que proveyó la información (Disposición 04/2009). El titular de los datos personales tiene la facultad de ejercer el derecho de acceso a los mismos en forma gratuita a intervalos no inferiores a 6 meses, salvo que se acredite un interés legítimo al efecto conforme lo establecido por el artículo 14, inciso 3 de la ley 25326.- \"LA DIRECCION NACIONAL DE PROTECCION DE DATOS PERSONALES, órgano de Control de la ley nro 25.326, tiene la atribución de atender las denuncias y reclamos que se interpongan con relación al incumplimiento de las normas sobre protección de datos personales (Disposición 10/2008).", 9 ));

    listaDeCorreos.add(new CorreoElectronico("Rapipago", "Novedades", 0, "Enterate de todas las novedades que tiene Rapipago para vos: su presencia en los mejores eventos y acciones pensadas para darte lo mejor. Además, pagá tus Impuestos y Servicios en Rapipago y aprovechá las promociones y beneficios.",10 ));
    listaDeCorreos.add(new CorreoElectronico("Lara Luján", "Cosmetologia", 0, "Cualquier persona que desee realizar un cambio en su estilo y calidad de vida. A todas aquellas personas que estén interesados al mundo de la belleza ( manicuras, reflexologas, podologas, extensionistas de pestañas, maquillaje, maso-terapeutas) Además quienes completen el curso podrán desarrollarse como Profesionales ya sea en forma particular o en cualquier empresa que requiera de este servicio.", 11));
    listaDeCorreos.add(new CorreoElectronico("Nehuén Cabrera", "Planos", 0, "Los diseños de casas que presentamos te van a inspirar en la construcción de tal forma que puedas elegir entre estilos de estructuras modernas, prefabricadas, de madera, hormigón, con estructuras metálicas o combinación de varios materiales, visualiza los planos de casas y acabados exteriores como colores y texturas para que tengas las mejores ideas para la construcción.", 12));
    listaDeCorreos.add(new CorreoElectronico("Zapatería Morena", "Venta ", 0, "Descubra Zapatos Online Comprar. Busque Resultados Rápidos de Más Fuentes. Resultados Relacionados. Resultados Cualitativos. Resultados de Calidad. La Mejor Información Aquí. Poderoso y Fácil de Usar. Más Información. Tipos: Noticias, Vídeo.", 13 ));

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.menu_pri_pantalla, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
    switch (item.getItemId()){

        case R.id.mnuRefrescarPriPantalla:
            Toast.makeText(this, "Usted desea refrescar pantalla", Toast.LENGTH_LONG).show();
            return true;

        case R.id.mnuSalirPriPantalla:
            finish();
        default:
            Toast.makeText(this, "Selleccionó salir", Toast.LENGTH_LONG).show();
            return true;
        }
    }



}
