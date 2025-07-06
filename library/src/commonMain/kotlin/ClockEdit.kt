package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ClockEdit: ImageVector
    get() {
        if (_ClockEdit != null) {
            return _ClockEdit!!
        }
        _ClockEdit = ImageVector.Builder(
            name = "ClockEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 13.1f)
                curveTo(20.9f, 13.1f, 20.7f, 13.2f, 20.6f, 13.3f)
                lineTo(19.6f, 14.3f)
                lineTo(21.7f, 16.4f)
                lineTo(22.7f, 15.4f)
                curveTo(22.9f, 15.2f, 22.9f, 14.8f, 22.7f, 14.6f)
                lineTo(21.4f, 13.3f)
                curveTo(21.3f, 13.2f, 21.2f, 13.1f, 21f, 13.1f)
                moveTo(19.1f, 14.9f)
                lineTo(13f, 20.9f)
                verticalLineTo(23f)
                horizontalLineTo(15.1f)
                lineTo(21.2f, 16.9f)
                lineTo(19.1f, 14.9f)
                moveTo(11f, 21.9f)
                curveTo(5.9f, 21.4f, 2f, 17.1f, 2f, 12f)
                curveTo(2f, 6.5f, 6.5f, 2f, 12f, 2f)
                curveTo(17.3f, 2f, 21.6f, 6.1f, 22f, 11.3f)
                curveTo(21.7f, 11.2f, 21.4f, 11.1f, 21f, 11.1f)
                curveTo(20.2f, 11.1f, 19.6f, 11.5f, 19.2f, 11.9f)
                lineTo(16.5f, 14.6f)
                lineTo(12.5f, 12.2f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                lineTo(15.4f, 15.7f)
                lineTo(11f, 20.1f)
                verticalLineTo(21.9f)
                close()
            }
        }.build()

        return _ClockEdit!!
    }

@Suppress("ObjectPropertyName")
private var _ClockEdit: ImageVector? = null
