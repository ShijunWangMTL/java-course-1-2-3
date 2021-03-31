package coursegradesinterfacedemo;

public class Essay extends GradedActivity
{
    // declare fields
    private double grammar;
    private double spelling;
    private double correctLength;
    private double content;

    // create methods
    public void setScore(double gr, double sp, double len, double cnt) // overloadding method from superclass
    {
        setGrammar(gr);
        setSpelling(sp);
        setCorrectLength(len);
        setContent(cnt);

        super.setScore(this.grammar + this.spelling + this.correctLength + this.content);
    }

    // create methods
    private void setGrammar(double g)
    {
        if(g <= 30.0)
            grammar = g;
        else
            grammar = 0.0;
    }
    private void setSpelling(double s)
    {
        if(s <= 20.0)
            spelling = s;
        else
            spelling = 0.0;
    }
    private void setCorrectLength(double c)
    {
        if(c <= 20.0)
            correctLength = c;
        else
            correctLength = 0.0;
    }
    private void setContent(double c)
    {
        if(c <= 30.0)
            content = c;
        else
            content = 0.0;
    }

    public double getGrammar()
    {
        return grammar;
    }
    public double getSpelling()
    {
        return spelling;
    }
    public double getCorrectLength()
    {
        return correctLength;
    }
    public double getContent()
    {
        return content;
    }
    // end methods

} // end class
