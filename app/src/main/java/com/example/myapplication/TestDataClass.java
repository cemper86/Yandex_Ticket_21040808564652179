package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class TestDataClass {

    public static List<MarkerModel> getMarkers(){
        List<MarkerModel> data = new ArrayList<>();
        data.add(getStreetArt1());
        data.add(getBuild1());

        data.addAll(getTambovMarker());
        return data;
    }


    private static MarkerModel getStreetArt1(){
        List<String> preview = new ArrayList<>();
        preview.add("https://instagram.flwo4-1.fna.fbcdn.net/v/t51.2885-15/sh0.08/e35/s640x640/69019687_371798773493877_4268907434612379124_n.jpg?_nc_ht=instagram.flwo4-1.fna.fbcdn.net&_nc_cat=109&_nc_ohc=IzLNH8ydVQEAX8yIQMc&tp=1&oh=a028d4fdbf1a4d06a5b9978ed9a11f21&oe=6008695A");
        preview.add("https://pp.userapi.com/c847019/v847019387/1024b2/L7-tUYhRdWQ.jpg");
        return new MarkerModel( 7,"Граффити тамбов", "На стене расположены разные граффити просто так",preview, new FromBaseCoordinate(52.714886, 41.467337));
    }

    private static MarkerModel getBuild1(){
        List<String> preview = new ArrayList<>();
        preview.add("https://i1.photo.2gis.com/images/branch/81/11399736598109328_5e1e.jpg");
        preview.add("https://i1.photo.2gis.com/images/branch/81/11399736598109188_ea28.jpg");
        preview.add("https://i1.photo.2gis.com/images/branch/81/11399736596241648_772e.jpg");
        return new MarkerModel( 6,"Усадьба Асеевых", "Усадьба Асеевых\n" + "историко-культурный музейный комплекс. На первом этаже особняка располагаются Парадный вестибюль, Гардеробная, Каминная, Аванзал, Приемная, Кабинет М. В. Асеева, Диванная, Малая гостиная, Бильярдная, Парадная столовая, Белый зал – самое большое и торжественное помещение первого этажа, предназначенное для приема гостей, музыкальных вечеров, праздничных мероприятий. Интерьеры помещений, сохранившие многие элементы первоначальной отделки, тщательно восстановлены и отреставрированы. Здесь расположена постоянная музейная экспозиция.",preview, new FromBaseCoordinate(52.7070877,41.4779837));
    }

    public static List<MarkerModel> getTambovMarker(){
        List<MarkerModel> markers = new ArrayList<>();
        List<String> marker1 = new ArrayList<>();
        List<String> marker2 = new ArrayList<>();
        List<String> marker3 = new ArrayList<>();
        List<String> marker4 = new ArrayList<>();
        List<String> marker5 = new ArrayList<>();

        marker1.add("https://tambovgrad.ru/modules/photo/images/2195-Na-Sobornoj-ploshchadi-v-Tambove.jpg");
        marker1.add("https://tambovgrad.ru/modules/photo/images/25.jpg");
        marker1.add("https://otechestvo-vera.ru/wp-content/uploads/2020/11/sobornaya-ploschad-v-tambove.jpg");

        marker2.add("https://fs.tonkosti.ru/cr/fe/crfeynephe044k88gw4os0o8s.jpg");
        marker2.add("https://tambovgrad.ru/modules/photo/images/27-Vechnyj-ogon-i-Spaso-Preobrazhenskij-sobor.jpg");

        marker3.add("https://www.tambov.ru/images/news/2018-06/13-06/c0417fda7428a406b42743d213beb85e.jpg");
        marker3.add("https://bloknottambov.ru/thumb/1000x0xcut/upload/iblock/dae/1Gostinyy_dvor.jpg");

        marker4.add("https://lh3.googleusercontent.com/proxy/qYhkXBWZWolrYqR8GveFoqKmUFh9OdA4EmL6tKhPxjZUzsobZ1P5Yx49SHYb_ps_BO1dcL8xpK6T3VkNTlTNbDre5svQ8QrBKEEPNyMmJmKr9nSilUf2Z264ilG_F2Xx7K7pPQV7by9B_yYCC8ZhRV3-YxQ");
        marker4.add("https://lh3.googleusercontent.com/proxy/Qva1Y1WekOO8d0MUBUyhTLUFT4C8A79YeZUU8k6ovQQ4TB7u27IUcgGbPAE2607HTco-HLyHBLyZa4bAJkwfSEHu2xJsAh_X9_O8UPLePCGR1PBQeAi4nQqLZ5U0PU1dBmg1MLC7sRwlkE8IarO66aKNLXM");
        marker4.add("https://autotravel.ru/phalbum/91057/165.jpg");

        marker5.add("https://www-vestitambov.cdnvideo.ru/wp-content/uploads/2019/01/tgu-512x288.jpg");
        marker5.add("https://s.vtambove.ru/localStorage/news/ae/65/cf/36/ae65cf36_resizedScaled_1020to765.jpg");


        markers.add(new MarkerModel(1, "Соборная площадь","<p>Соборная площадь появилась вместе с заложением крепости Тамбов 17 апреля 1636 года. При пожаре 1742 сооружения крепости сгорели и не восстанавливались.\n" +
                "На этой площади в 1861 году горожане поздравляли друг друга с великим событием – освобождением крестьян и отменой крепостного права, манифест о котором был впервые на тамбовской земле оглашен в стенах Кафедрального собора.\n" +
                "В первые годы советской власти площадь считалась главной в городе и до 1937 года на ней проходили митинги, военные парады и демонстрации.</p>", marker1, new FromBaseCoordinate(52.727230, 41.457637)));

        markers.add(new MarkerModel(2, "Спасо-Преображенский собор","<p>Самый старый из всех православных храмов тамбовской земли. Заложен епископом Питиримом в 1694 году.\n" +
                "\n" +
                "Весной 1970 года была проведена большая реконструкция, в ходе которой возвели монумент Вечной Славы (52.727258, 41.457669) в память о тех, кто отдал свои жизни за свободу и независимость родины.</p>", marker2, new FromBaseCoordinate(52.727388, 41.459020)));

        markers.add(new MarkerModel(3, "Гостиный двор", "<p>Богатые тамбовские купцы долгое время добивались разрешения на строительство в городе большого и удобного для ведения торговых дел гостиного двора. Такое разрешение было дано самим императором Николаем, когда он посетил Тамбов в 1836 году.\n" +
                "Уже в 1838 году здание гостиного двора было открыто.\n" +
                "Во время Великой Отечественной войны и первые годы после неё в этом здании размещался склад военного интендантства.</p>", marker3, new FromBaseCoordinate(52.726979, 41.455517)));

        markers.add(new MarkerModel(4, "Областная картинная галерея","<p>В юго-западном углу его фундамента при начале строительства была заложена плита с надписью: «Здание заложено 1891 г. май 14 дня. При государе императоре Александре III, губернаторе бароне Ракосовском, учредителе обер-камергере Двора Его Императорского Величества Э.Д. Нарышкине, строителе А.С. Четверикове». С его вводом город приобрел прекрасное книгохранилище и огромный зал для собрания общественности.</p>", marker4, new FromBaseCoordinate(52.724639, 41.455975)));

        markers.add(new MarkerModel(5, "Тамбовский государственный университет имени Г.Р. Державина", "<p>Во второй половине XVIII века находился дом тамбовского наместника. С 1786 по 1788 г. здесь проживал Г.Р. Державин, являвшийся в те годы тамбовским наместником.\n" +
                "В 30 годы XIX века была организована промышленная выставка, приуроченная к приезду наследника престола Александра Николаевича.\n" +
                "С 1836 по 1918 годы с одобрения императора Николая I усадьба наместника была отдана под постройку здания института для обучения и воспитания дочерей бедных дворян.\n" +
                "В первой половине 20 века здесь располагался госпиталь, дом социального обеспечения детей-сирот, институт сельского хозяйства, военное ведомство. В годы Великой Отечественной войны располагался военный госпиталь. В 1944 здание было передано Тамбовскому государственному пединституту. В канун 1995 года Тамбовский государственный педагогический институт был реорганизован в Тамбовский Государственный Университет имени Г.Р. Державина.</p>", marker5, new FromBaseCoordinate(52.723297, 41.456981)));

        return markers;
    }

}
