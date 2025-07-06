package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlagOff: ImageVector
    get() {
        if (_FlagOff != null) {
            return _FlagOff!!
        }
        _FlagOff = ImageVector.Builder(
            name = "FlagOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(14.11f, 16f)
                horizontalLineTo(13f)
                lineTo(12.72f, 14.61f)
                lineTo(12.11f, 14f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                verticalLineTo(6.89f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(20f, 16f)
                verticalLineTo(6f)
                horizontalLineTo(14.4f)
                lineTo(14f, 4f)
                horizontalLineTo(7.2f)
                lineTo(19.2f, 16f)
                horizontalLineTo(20f)
            }
        }.build()

        return _FlagOff!!
    }

@Suppress("ObjectPropertyName")
private var _FlagOff: ImageVector? = null
