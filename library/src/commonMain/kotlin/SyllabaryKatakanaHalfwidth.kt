package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SyllabaryKatakanaHalfwidth: ImageVector
    get() {
        if (_SyllabaryKatakanaHalfwidth != null) {
            return _SyllabaryKatakanaHalfwidth!!
        }
        _SyllabaryKatakanaHalfwidth = ImageVector.Builder(
            name = "SyllabaryKatakanaHalfwidth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 4f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                lineTo(13f, 10.81f)
                lineTo(15f, 11.2f)
                lineTo(16f, 6.1f)
                verticalLineTo(4f)
                moveTo(10f, 9f)
                verticalLineTo(12f)
                curveTo(10f, 14.86f, 9.34f, 17.29f, 8.08f, 18.61f)
                lineTo(9.5f, 20f)
                curveTo(11.35f, 18.08f, 12f, 15.15f, 12f, 12f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _SyllabaryKatakanaHalfwidth!!
    }

@Suppress("ObjectPropertyName")
private var _SyllabaryKatakanaHalfwidth: ImageVector? = null
