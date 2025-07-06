package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageOff: ImageVector
    get() {
        if (_MessageOff != null) {
            return _MessageOff!!
        }
        _MessageOff = ImageVector.Builder(
            name = "MessageOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.95f, 17.75f)
                lineTo(5.2f, 2f)
                horizontalLineTo(20f)
                curveTo(21.1f, 2f, 22f, 2.89f, 22f, 4f)
                verticalLineTo(16f)
                curveTo(22f, 16.76f, 21.57f, 17.41f, 20.95f, 17.75f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(2f, 3.9f)
                curveTo(2f, 3.93f, 2f, 3.97f, 2f, 4f)
                verticalLineTo(22f)
                lineTo(6f, 18f)
                horizontalLineTo(16.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                close()
            }
        }.build()

        return _MessageOff!!
    }

@Suppress("ObjectPropertyName")
private var _MessageOff: ImageVector? = null
