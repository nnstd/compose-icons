package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageOffOutline: ImageVector
    get() {
        if (_MessageOffOutline != null) {
            return _MessageOffOutline!!
        }
        _MessageOffOutline = ImageVector.Builder(
            name = "MessageOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.2f, 4f)
                lineTo(5.2f, 2f)
                horizontalLineTo(20f)
                curveTo(21.11f, 2f, 22f, 2.9f, 22f, 4f)
                verticalLineTo(16f)
                curveTo(22f, 16.76f, 21.57f, 17.41f, 20.95f, 17.75f)
                lineTo(19.2f, 16f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(7.2f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(16.11f, 18f)
                horizontalLineTo(6f)
                lineTo(2f, 22f)
                verticalLineTo(4f)
                curveTo(2f, 3.97f, 2f, 3.93f, 2f, 3.9f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(6.1f, 5.44f)
                lineTo(16.65f, 16f)
                horizontalLineTo(16.66f)
                lineTo(18.66f, 18f)
                horizontalLineTo(18.65f)
                lineTo(22.11f, 21.46f)
                moveTo(14.11f, 16f)
                lineTo(4f, 5.89f)
                verticalLineTo(18f)
                lineTo(6f, 16f)
                horizontalLineTo(14.11f)
                close()
            }
        }.build()

        return _MessageOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MessageOffOutline: ImageVector? = null
