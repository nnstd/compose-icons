package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ReplyAll: ImageVector
    get() {
        if (_ReplyAll != null) {
            return _ReplyAll!!
        }
        _ReplyAll = ImageVector.Builder(
            name = "ReplyAll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 9f)
                verticalLineTo(5f)
                lineTo(6f, 12f)
                lineTo(13f, 19f)
                verticalLineTo(14.9f)
                curveTo(18f, 14.9f, 21.5f, 16.5f, 24f, 20f)
                curveTo(23f, 15f, 20f, 10f, 13f, 9f)
                moveTo(7f, 8f)
                verticalLineTo(5f)
                lineTo(0f, 12f)
                lineTo(7f, 19f)
                verticalLineTo(16f)
                lineTo(3f, 12f)
                lineTo(7f, 8f)
                close()
            }
        }.build()

        return _ReplyAll!!
    }

@Suppress("ObjectPropertyName")
private var _ReplyAll: ImageVector? = null
