package hometasks.lesson6.lvlB.task2;

import java.util.regex.Pattern;

public class Run {
    public static String testText = "Значимость этих проблем настолько очевидна, что рамки и место обучения кадров требует " +
            "от нас системного анализа соответствующих условий активизации. Разнообразный и богатый опыт социально" +
            "-экономическое развитие влечет за собой процесс внедрения и модернизации дальнейших направлений развитая " +
            "системы массового участия. Практический опыт показывает, что дальнейшее развитие различных форм деятельности " +
            "способствует повышению актуальности системы обучения кадров, соответствующей насущным потребностям." +
            "Соображения высшего порядка, а также социально-экономическое развитие создаёт предпосылки качественно новых" +
            " шагов для модели развития? С другой стороны сложившаяся структура организации обеспечивает актуальность модели " +
            "развития! Дорогие друзья, консультация с профессионалами из IT требует от нас системного анализа новых предложений? " +
            "С другой стороны социально-экономическое развитие представляет собой интересный эксперимент проверки позиций, " +
            "занимаемых участниками в отношении поставленных задач.Не следует, однако, забывать о том, что консультация с " +
            "профессионалами из IT создаёт предпосылки качественно новых шагов для позиций, занимаемых участниками в отношении " +
            "поставленных задач. Соображения высшего порядка, а также рамки и место обучения кадров напрямую зависит от форм " +
            "воздействия? Разнообразный и богатый опыт повышение уровня гражданского сознания требует от нас анализа системы" +
            " масштабного изменения ряда параметров. Разнообразный и богатый опыт реализация намеченного плана развития в " +
            "значительной степени обуславливает создание всесторонне сбалансированных нововведений. " +
            "Не следует, однако, забывать о том, что консультация с профессионалами из IT играет важную роль...";

    public static void main(String[] args) {
        Pattern wordPattern = Pattern.compile("\\n\\s\\n|,\\s|\\s|\\n");
        String[] words = testText.split(wordPattern.pattern());
        System.out.println("There are " + words.length + " words in this text");
    }
}
