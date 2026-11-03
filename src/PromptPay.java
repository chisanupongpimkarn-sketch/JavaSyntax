public class PromptPay implements  Payment {
    @Override
    public void pay(double money) {
        IO.println(String.format("get Mobile Application"));
        IO.println(String.format("Paid "+ money + "Bath using PromptPay."));

    }
}
