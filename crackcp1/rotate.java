public class rotate {

    public static void main(String[] args) {
        try {
            Image in = Toolkit.getDefaultToolkit().createImage("sexy.jpg");

            JOptionPane.showMessageDialog(null, new JLabel(new ImageIcon(in)), "Yeah", JOptionPane.INFORMATION_MESSAGE);

            BufferedImage out = new BufferedImage(in.getWidth(null), in.getHeight(null), BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = out.createGraphics();
            g2d.drawImage(in, 0, 0, null);
            g2d.dispose();

            ImageIO.write(out, "jpg", new File("nonono.jpg"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}