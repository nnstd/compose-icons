package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ReplyOutline: ImageVector
    get() {
        if (_ReplyOutline != null) {
            return _ReplyOutline!!
        }
        _ReplyOutline = ImageVector.Builder(
            name = "ReplyOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 9.8f)
                verticalLineTo(10.7f)
                lineTo(9.7f, 11f)
                curveTo(12.3f, 11.4f, 14.2f, 12.4f, 15.6f, 13.7f)
                curveTo(13.9f, 13.2f, 12.1f, 12.9f, 10f, 12.9f)
                horizontalLineTo(8f)
                verticalLineTo(14.2f)
                lineTo(5.8f, 12f)
                lineTo(8f, 9.8f)
                moveTo(10f, 5f)
                lineTo(3f, 12f)
                lineTo(10f, 19f)
                verticalLineTo(14.9f)
                curveTo(15f, 14.9f, 18.5f, 16.5f, 21f, 20f)
                curveTo(20f, 15f, 17f, 10f, 10f, 9f)
            }
        }.build()

        return _ReplyOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ReplyOutline: ImageVector? = null
