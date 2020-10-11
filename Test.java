class Test{
    public static void main(String [] args){
        String status = "Accepted";

        boolean result = switch(status){
            case "Accepted" -> true;
            case "Denied" -> false;
            default -> false;
        };
        System.out.println(result);
    }

}