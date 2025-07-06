package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageReply: ImageVector
    get() {
        if (_MessageReply != null) {
            return _MessageReply!!
        }
        _MessageReply = ImageVector.Builder(
            name = "MessageReply",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 4f)
                curveTo(22f, 2.89f, 21.1f, 2f, 20f, 2f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 18f)
                horizontalLineTo(18f)
                lineTo(22f, 22f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _MessageReply!!
    }

@Suppress("ObjectPropertyName")
private var _MessageReply: ImageVector? = null
