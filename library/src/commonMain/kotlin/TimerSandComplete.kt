package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimerSandComplete: ImageVector
    get() {
        if (_TimerSandComplete != null) {
            return _TimerSandComplete!!
        }
        _TimerSandComplete = ImageVector.Builder(
            name = "TimerSandComplete",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 22f)
                horizontalLineTo(6f)
                verticalLineTo(16f)
                lineTo(10f, 12f)
                lineTo(6f, 8f)
                verticalLineTo(2f)
                horizontalLineTo(18f)
                verticalLineTo(8f)
                lineTo(14f, 12f)
                lineTo(18f, 16f)
                moveTo(8f, 7.5f)
                lineTo(12f, 11.5f)
                lineTo(16f, 7.5f)
                verticalLineTo(4f)
                horizontalLineTo(8f)
                moveTo(12f, 12.5f)
                lineTo(8f, 16.5f)
                verticalLineTo(20f)
                horizontalLineTo(16f)
                verticalLineTo(16.5f)
                moveTo(14f, 18f)
                horizontalLineTo(10f)
                verticalLineTo(17.2f)
                lineTo(12f, 15.2f)
                lineTo(14f, 17.2f)
                close()
            }
        }.build()

        return _TimerSandComplete!!
    }

@Suppress("ObjectPropertyName")
private var _TimerSandComplete: ImageVector? = null
