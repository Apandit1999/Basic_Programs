File file = new File("/home/abhinendra/Downloads/phase-2.txt");
        Scanner scan = new Scanner(file);
        ArrayList<String> str = new ArrayList<>();
        while(scan.hasNextLine())
        {
            str.add(scan.nextLine());
        }
        System.out.println(str);
}