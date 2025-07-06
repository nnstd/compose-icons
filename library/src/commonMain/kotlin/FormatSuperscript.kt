package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatSuperscript: ImageVector
    get() {
        if (_FormatSuperscript != null) {
            return _FormatSuperscript!!
        }
        _FormatSuperscript = ImageVector.Builder(
            name = "FormatSuperscript",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 7.41f)
                lineTo(11.41f, 12f)
                lineTo(16f, 16.59f)
                lineTo(14.59f, 18f)
                lineTo(10f, 13.41f)
                lineTo(5.41f, 18f)
                lineTo(4f, 16.59f)
                lineTo(8.59f, 12f)
                lineTo(4f, 7.41f)
                lineTo(5.41f, 6f)
                lineTo(10f, 10.59f)
                lineTo(14.59f, 6f)
                lineTo(16f, 7.41f)
                moveTo(21.85f, 9f)
                horizontalLineTo(16.97f)
                verticalLineTo(8f)
                lineTo(17.86f, 7.18f)
                curveTo(18.62f, 6.54f, 19.18f, 6f, 19.56f, 5.55f)
                curveTo(19.93f, 5.11f, 20.12f, 4.7f, 20.13f, 4.32f)
                curveTo(20.14f, 4.04f, 20.05f, 3.8f, 19.86f, 3.62f)
                curveTo(19.68f, 3.43f, 19.39f, 3.34f, 19f, 3.33f)
                curveTo(18.69f, 3.34f, 18.42f, 3.4f, 18.16f, 3.5f)
                lineTo(17.5f, 3.89f)
                lineTo(17.05f, 2.72f)
                curveTo(17.32f, 2.5f, 17.64f, 2.33f, 18.03f, 2.19f)
                curveTo(18.42f, 2.05f, 18.85f, 2f, 19.32f, 2f)
                curveTo(20.1f, 2f, 20.7f, 2.2f, 21.1f, 2.61f)
                curveTo(21.5f, 3f, 21.72f, 3.54f, 21.72f, 4.18f)
                curveTo(21.71f, 4.74f, 21.53f, 5.26f, 21.18f, 5.73f)
                curveTo(20.84f, 6.21f, 20.42f, 6.66f, 19.91f, 7.09f)
                lineTo(19.27f, 7.61f)
                verticalLineTo(7.63f)
                horizontalLineTo(21.85f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _FormatSuperscript!!
    }

@Suppress("ObjectPropertyName")
private var _FormatSuperscript: ImageVector? = null
