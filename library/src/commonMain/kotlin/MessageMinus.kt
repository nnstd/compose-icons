package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageMinus: ImageVector
    get() {
        if (_MessageMinus != null) {
            return _MessageMinus!!
        }
        _MessageMinus = ImageVector.Builder(
            name = "MessageMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                curveTo(21.11f, 2f, 22f, 2.9f, 22f, 4f)
                verticalLineTo(16f)
                curveTo(22f, 17.11f, 21.11f, 18f, 20f, 18f)
                horizontalLineTo(6f)
                lineTo(2f, 22f)
                verticalLineTo(4f)
                curveTo(2f, 2.89f, 2.9f, 2f, 4f, 2f)
                horizontalLineTo(20f)
                moveTo(8f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _MessageMinus!!
    }

@Suppress("ObjectPropertyName")
private var _MessageMinus: ImageVector? = null
