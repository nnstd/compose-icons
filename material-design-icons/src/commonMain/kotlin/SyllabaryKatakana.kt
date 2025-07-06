package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SyllabaryKatakana: ImageVector
    get() {
        if (_SyllabaryKatakana != null) {
            return _SyllabaryKatakana!!
        }
        _SyllabaryKatakana = ImageVector.Builder(
            name = "SyllabaryKatakana",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                verticalLineTo(6.09f)
                lineTo(14.29f, 9.79f)
                lineTo(15.71f, 11.21f)
                lineTo(20f, 6.91f)
                verticalLineTo(4f)
                moveTo(11f, 9f)
                verticalLineTo(13f)
                curveTo(11f, 15.78f, 10.25f, 16.89f, 8.36f, 18.46f)
                lineTo(9.64f, 20f)
                curveTo(11.75f, 18.24f, 13f, 16.22f, 13f, 13f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _SyllabaryKatakana!!
    }

@Suppress("ObjectPropertyName")
private var _SyllabaryKatakana: ImageVector? = null
