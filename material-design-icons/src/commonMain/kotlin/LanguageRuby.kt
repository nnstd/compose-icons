package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LanguageRuby: ImageVector
    get() {
        if (_LanguageRuby != null) {
            return _LanguageRuby!!
        }
        _LanguageRuby = ImageVector.Builder(
            name = "LanguageRuby",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.8f, 2.07f)
                curveTo(21.32f, 2.5f, 22.04f, 4.23f, 22f, 6.04f)
                verticalLineTo(6f)
                lineTo(20.86f, 20.93f)
                lineTo(6.08f, 21.94f)
                horizontalLineTo(6.09f)
                curveTo(4.86f, 21.89f, 2.13f, 21.77f, 2f, 17.95f)
                lineTo(3.37f, 15.45f)
                lineTo(6.14f, 21.91f)
                lineTo(8.5f, 14.29f)
                lineTo(8.45f, 14.3f)
                lineTo(8.47f, 14.28f)
                lineTo(16.18f, 16.74f)
                lineTo(14.19f, 8.96f)
                lineTo(21.54f, 8.5f)
                lineTo(15.75f, 3.76f)
                lineTo(18.8f, 2.06f)
                verticalLineTo(2.07f)
                moveTo(2f, 17.91f)
                verticalLineTo(17.93f)
                lineTo(2f, 17.91f)
                verticalLineTo(17.91f)
                moveTo(6.28f, 6.23f)
                curveTo(9.24f, 3.28f, 13.07f, 1.54f, 14.54f, 3.03f)
                curveTo(16f, 4.5f, 14.46f, 8.12f, 11.5f, 11.06f)
                curveTo(8.5f, 14f, 4.73f, 15.84f, 3.26f, 14.36f)
                curveTo(1.79f, 12.87f, 3.3f, 9.17f, 6.27f, 6.23f)
                horizontalLineTo(6.28f)
                close()
            }
        }.build()

        return _LanguageRuby!!
    }

@Suppress("ObjectPropertyName")
private var _LanguageRuby: ImageVector? = null
