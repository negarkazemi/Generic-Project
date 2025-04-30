package products;

public class Notebook extends Product {
    private int pageCount;
    private boolean isHardCover;
    protected static int idCounter = 1;

    public Notebook(int pageCount, boolean isHardCover, String title, Double price) {
        super(title, price);
        this.pageCount = pageCount;
        this.isHardCover = isHardCover;

    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public boolean getIsHardCover() {
        return isHardCover;
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }

    @Override
    public String toString() {
        return super.toString() +
                "   Page Count: " + getPageCount() +
                "   Hard Cover: " + (getIsHardCover() ? "Yes" : "No");

    }

    @Override
    protected String generateId() {
        String formattedId;
        if (idCounter < 10) {
            formattedId = "200" + idCounter;
        } else if (idCounter < 100) {
            formattedId = "20" + idCounter;
        } else if (idCounter < 1000) {
            formattedId = "2" + idCounter;
        } else {
            System.out.println("ID limit reached");
            return null;
        }
        idCounter++;
        return formattedId;
    }


}
