package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Pulse: ImageVector
    get() {
        if (_Pulse != null) {
            return _Pulse!!
        }
        _Pulse = ImageVector.Builder(
            name = "Pulse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 13f)
                horizontalLineTo(5.79f)
                lineTo(10.1f, 4.79f)
                lineTo(11.28f, 13.75f)
                lineTo(14.5f, 9.66f)
                lineTo(17.83f, 13f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(17f)
                lineTo(14.67f, 12.67f)
                lineTo(9.92f, 18.73f)
                lineTo(8.94f, 11.31f)
                lineTo(7f, 15f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _Pulse!!
    }

@Suppress("ObjectPropertyName")
private var _Pulse: ImageVector? = null
