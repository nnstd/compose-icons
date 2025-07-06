package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NetworkStrengthOff: ImageVector
    get() {
        if (_NetworkStrengthOff != null) {
            return _NetworkStrengthOff!!
        }
        _NetworkStrengthOff = ImageVector.Builder(
            name = "NetworkStrengthOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 1f)
                lineTo(12.4f, 9.6f)
                lineTo(21f, 18.19f)
                moveTo(4.77f, 4.5f)
                lineTo(3.5f, 5.77f)
                lineTo(9.86f, 12.13f)
                lineTo(1f, 21f)
                horizontalLineTo(18.73f)
                lineTo(20.73f, 23f)
                lineTo(22f, 21.73f)
            }
        }.build()

        return _NetworkStrengthOff!!
    }

@Suppress("ObjectPropertyName")
private var _NetworkStrengthOff: ImageVector? = null
