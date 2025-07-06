package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.NetworkStrengthOffOutline: ImageVector
    get() {
        if (_NetworkStrengthOffOutline != null) {
            return _NetworkStrengthOffOutline!!
        }
        _NetworkStrengthOffOutline = ImageVector.Builder(
            name = "NetworkStrengthOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 1f)
                lineTo(12.4f, 9.6f)
                lineTo(13.85f, 11.05f)
                lineTo(19f, 5.83f)
                verticalLineTo(16.19f)
                lineTo(21f, 18.19f)
                moveTo(4.77f, 4.5f)
                lineTo(3.5f, 5.77f)
                lineTo(9.86f, 12.13f)
                lineTo(1f, 21f)
                horizontalLineTo(18.73f)
                lineTo(20.73f, 23f)
                lineTo(22f, 21.73f)
                moveTo(11.33f, 13.6f)
                lineTo(16.73f, 19f)
                horizontalLineTo(6f)
            }
        }.build()

        return _NetworkStrengthOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _NetworkStrengthOffOutline: ImageVector? = null
