package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimerSandFull: ImageVector
    get() {
        if (_TimerSandFull != null) {
            return _TimerSandFull!!
        }
        _TimerSandFull = ImageVector.Builder(
            name = "TimerSandFull",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 2f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                verticalLineTo(8f)
                lineTo(10f, 12f)
                lineTo(6f, 16f)
                verticalLineTo(16f)
                horizontalLineTo(6f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                lineTo(14f, 12f)
                lineTo(18f, 8f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(2f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _TimerSandFull!!
    }

@Suppress("ObjectPropertyName")
private var _TimerSandFull: ImageVector? = null
