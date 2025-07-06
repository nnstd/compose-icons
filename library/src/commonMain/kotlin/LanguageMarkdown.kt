package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.LanguageMarkdown: ImageVector
    get() {
        if (_LanguageMarkdown != null) {
            return _LanguageMarkdown!!
        }
        _LanguageMarkdown = ImageVector.Builder(
            name = "LanguageMarkdown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.56f, 18f)
                horizontalLineTo(3.44f)
                curveTo(2.65f, 18f, 2f, 17.37f, 2f, 16.59f)
                verticalLineTo(7.41f)
                curveTo(2f, 6.63f, 2.65f, 6f, 3.44f, 6f)
                horizontalLineTo(20.56f)
                curveTo(21.35f, 6f, 22f, 6.63f, 22f, 7.41f)
                verticalLineTo(16.59f)
                curveTo(22f, 17.37f, 21.35f, 18f, 20.56f, 18f)
                moveTo(6.81f, 15.19f)
                verticalLineTo(11.53f)
                lineTo(8.73f, 13.88f)
                lineTo(10.65f, 11.53f)
                verticalLineTo(15.19f)
                horizontalLineTo(12.58f)
                verticalLineTo(8.81f)
                horizontalLineTo(10.65f)
                lineTo(8.73f, 11.16f)
                lineTo(6.81f, 8.81f)
                horizontalLineTo(4.89f)
                verticalLineTo(15.19f)
                horizontalLineTo(6.81f)
                moveTo(19.69f, 12f)
                horizontalLineTo(17.77f)
                verticalLineTo(8.81f)
                horizontalLineTo(15.85f)
                verticalLineTo(12f)
                horizontalLineTo(13.92f)
                lineTo(16.81f, 15.28f)
                lineTo(19.69f, 12f)
                close()
            }
        }.build()

        return _LanguageMarkdown!!
    }

@Suppress("ObjectPropertyName")
private var _LanguageMarkdown: ImageVector? = null
