package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Backburger: ImageVector
    get() {
        if (_Backburger != null) {
            return _Backburger!!
        }
        _Backburger = ImageVector.Builder(
            name = "Backburger",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 13f)
                lineTo(9f, 17f)
                lineTo(7.6f, 18.42f)
                lineTo(1.18f, 12f)
                lineTo(7.6f, 5.58f)
                lineTo(9f, 7f)
                lineTo(5f, 11f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                moveTo(21f, 6f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                moveTo(21f, 16f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                close()
            }
        }.build()

        return _Backburger!!
    }

@Suppress("ObjectPropertyName")
private var _Backburger: ImageVector? = null
