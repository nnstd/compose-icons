package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimerSandPaused: ImageVector
    get() {
        if (_TimerSandPaused != null) {
            return _TimerSandPaused!!
        }
        _TimerSandPaused = ImageVector.Builder(
            name = "TimerSandPaused",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 6f)
                verticalLineTo(18f)
                horizontalLineTo(16f)
                lineTo(12f, 14f)
                lineTo(8f, 18f)
                horizontalLineTo(2f)
                verticalLineTo(6f)
                horizontalLineTo(8f)
                lineTo(12f, 10f)
                lineTo(16f, 6f)
                moveTo(7.5f, 16f)
                lineTo(11.5f, 12f)
                lineTo(7.5f, 8f)
                horizontalLineTo(4f)
                verticalLineTo(16f)
                moveTo(12.5f, 12f)
                lineTo(16.5f, 16f)
                horizontalLineTo(20f)
                verticalLineTo(8f)
                horizontalLineTo(16.5f)
                moveTo(18f, 12f)
                verticalLineTo(14f)
                horizontalLineTo(17.2f)
                lineTo(15.2f, 12f)
                moveTo(8.8f, 12f)
                lineTo(6.8f, 14f)
                horizontalLineTo(6f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _TimerSandPaused!!
    }

@Suppress("ObjectPropertyName")
private var _TimerSandPaused: ImageVector? = null
