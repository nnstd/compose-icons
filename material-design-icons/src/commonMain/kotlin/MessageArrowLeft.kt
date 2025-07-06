package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageArrowLeft: ImageVector
    get() {
        if (_MessageArrowLeft != null) {
            return _MessageArrowLeft!!
        }
        _MessageArrowLeft = ImageVector.Builder(
            name = "MessageArrowLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(22f)
                lineTo(6f, 18f)
                horizontalLineTo(20f)
                curveTo(21.1f, 18f, 22f, 17.1f, 22f, 16f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                moveTo(16f, 11f)
                horizontalLineTo(11.5f)
                lineTo(13.3f, 12.8f)
                lineTo(12f, 14f)
                lineTo(8f, 10f)
                lineTo(12f, 6f)
                lineTo(13.2f, 7.2f)
                lineTo(11.5f, 9f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _MessageArrowLeft!!
    }

@Suppress("ObjectPropertyName")
private var _MessageArrowLeft: ImageVector? = null
