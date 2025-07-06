package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TimerSandEmpty: ImageVector
    get() {
        if (_TimerSandEmpty != null) {
            return _TimerSandEmpty!!
        }
        _TimerSandEmpty = ImageVector.Builder(
            name = "TimerSandEmpty",
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
                moveTo(16f, 16.5f)
                verticalLineTo(20f)
                horizontalLineTo(8f)
                verticalLineTo(16.5f)
                lineTo(12f, 12.5f)
                lineTo(16f, 16.5f)
                moveTo(12f, 11.5f)
                lineTo(8f, 7.5f)
                verticalLineTo(4f)
                horizontalLineTo(16f)
                verticalLineTo(7.5f)
                lineTo(12f, 11.5f)
                close()
            }
        }.build()

        return _TimerSandEmpty!!
    }

@Suppress("ObjectPropertyName")
private var _TimerSandEmpty: ImageVector? = null
