package com.opencode.launcher;

/**
 * Novedades que se muestran una sola vez, en el primer arranque despues de
 * actualizar. La clave es el versionName sin sufijos ("5.0.3").
 *
 * Para una version nueva: anade su caso y sus textos. Si no hay entrada, se
 * muestra un aviso generico de correcciones y mejoras.
 */
final class Changelog {

    private Changelog() {
    }

    static String[] forVersion(String version, boolean en) {
        return forVersion(version, en, false);
    }

    static String[] forVersion(String version, boolean en, boolean zh) {
        if (zh) return "5.0.3".equals(version) ? ZH_503 : ZH_GENERIC;
        if ("5.0.3".equals(version)) return en ? EN_503 : ES_503;
        return en ? EN_GENERIC : ES_GENERIC;
    }

    private static final String[] ES_503 = new String[]{
            "El terminal integrado de opencode ya funciona: abre More... > "
                    + "Terminal y pulsa +.",
            "Ejecuta comandos en el móvil; la pestaña se cierra sola al salir "
                    + "del shell.",
            "El terminal usa el entorno de la caja de herramientas: pkg, apt, "
                    + "git y python funcionan como en Termux.",
            "Abre apps, enlaces y archivos desde el chat, también por su nombre "
                    + "(por ejemplo, «abre WhatsApp»).",
            "Instala APKs desde el agente: con el instalador del sistema o en "
                    + "silencio si el móvil tiene root.",
            "Instala y abre una app en un solo paso, e indica cómo se hará la "
                    + "instalación.",
            "Herramientas de shell nativas, más rápidas y sin depender del "
                    + "sandbox proot; pip también responde antes.",
            "La barra de estado queda siempre visible y la página se ajusta "
                    + "justo debajo.",
            "El agente conoce la versión de opencode y ya no pierde turnos con "
                    + "pm, am o comandos sin salida.",
            "La contraseña del servidor ya no queda expuesta en el shell del "
                    + "agente.",
            "WARP integrado: el trafico de opencode.ai puede salir por "
                    + "Cloudflare, activable desde el menu de controles."
    };

    private static final String[] EN_503 = new String[]{
            "The built-in opencode terminal now works: open More... > "
                    + "Terminal and press +.",
            "Run commands on the phone; the tab closes by itself when you "
                    + "exit the shell.",
            "The terminal runs inside the toolbox environment: pkg, apt, git "
                    + "and python work as they do in Termux.",
            "Open apps, links and files from the chat, including by name "
                    + "(for example, \"open WhatsApp\").",
            "Install APKs from the agent: with the system installer or "
                    + "silently if the phone has root.",
            "Install and open an app in one step, and report how the install "
                    + "will be done.",
            "Native shell tools: faster and no longer tied to the proot "
                    + "sandbox; pip responds faster too.",
            "The status bar stays visible and the page fits right below it.",
            "The agent knows the opencode version and no longer wastes turns "
                    + "on pm, am or dead ends.",
            "The server password is no longer exposed in the agent's shell.",
            "Built-in WARP: opencode.ai traffic can go out over "
                    + "Cloudflare, toggle it from the controls menu."
    };

    private static final String[] ZH_503 = new String[]{
            "内置 opencode 终端已可用：打开「更多…」> 终端并点 +。",
            "可直接在手机上执行命令；退出 shell 时标签页会自动关闭。",
            "终端运行在工具箱环境中：pkg、apt、git、python 与 Termux 一致。",
            "可在对话中打开应用、链接和文件，也支持按名称（例如「打开微信」）。",
            "可从智能体安装 APK：使用系统安装器，或在有 root 时静默安装。",
            "一步完成安装并打开应用，并说明安装方式。",
            "原生 shell 工具更快，不再依赖 proot 沙箱；pip 响应也更快。",
            "状态栏始终可见，页面紧贴其下方显示。",
            "智能体已知 opencode 版本，不再因 pm、am 或无输出命令浪费回合。",
            "服务器密码不再暴露在智能体的 shell 中。",
            "内置 WARP：opencode.ai 流量可经 Cloudflare 发出，可在控制菜单开关。"
    };

    private static final String[] ZH_GENERIC = new String[]{
            "问题修复与性能改进。"
    };

    private static final String[] ES_GENERIC = new String[]{
            "Correcciones de errores y mejoras de rendimiento."
    };

    private static final String[] EN_GENERIC = new String[]{
            "Bug fixes and performance improvements."
    };
}
