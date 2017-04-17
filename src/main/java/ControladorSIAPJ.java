
public class ControladorSIAPJ{
	private ValidadorProcesso validator = new ValidadorProcesso();
	private ServiceMail mail;
	
	public boolean initProcesso(Processo proc){
		return initProcesso(proc, SenderFactory.EMAIL);
	}
	
	public boolean initProcesso(Processo proc, int service){	
		mail = SenderFactory.getServiceMail(service);
		if(!checkProcesso(proc)){
			sendInfo(proc, false);
			return false;
		}
		
		persistProcesso(proc);
		sendInfo(proc, true);
		return true;
	}
	
	private boolean checkProcesso(Processo proc){
		return validator.validateProcess(proc);
	}
	
	private Processo persistProcesso(Processo proc){
		return proc;
	}
	
	private void sendInfo(Processo proc, boolean statusProcesso){
		if (statusProcesso)
		{
			mail.defineContent(proc.getContent());
			mail.defineSender("default_sender");
			mail.send("Juiz");
		}
		else
		{
			mail.defineContent("Erro");
			mail.defineSender("default_sender");
			mail.send(proc.getNomeReclamante());
		}
	}
}
