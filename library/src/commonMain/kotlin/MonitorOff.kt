package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MonitorOff: ImageVector
    get() {
        if (_MonitorOff != null) {
            return _MonitorOff!!
        }
        _MonitorOff = ImageVector.Builder(
            name = "MonitorOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(22f)
                horizontalLineTo(8f)
                verticalLineTo(20f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 16f)
                verticalLineTo(4f)
                lineTo(0f, 3f)
                lineTo(1.41f, 1.58f)
                lineTo(22.16f, 22.34f)
                lineTo(20.75f, 23.75f)
                lineTo(15f, 18f)
                horizontalLineTo(14f)
                moveTo(3f, 16f)
                horizontalLineTo(13f)
                lineTo(3f, 6f)
                verticalLineTo(16f)
                moveTo(21f, 2f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 4f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 18f)
                horizontalLineTo(20.66f)
                lineTo(18.66f, 16f)
                horizontalLineTo(21f)
                verticalLineTo(4f)
                horizontalLineTo(6.66f)
                lineTo(4.66f, 2f)
                horizontalLineTo(21f)
                close()
            }
        }.build()

        return _MonitorOff!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorOff: ImageVector? = null
