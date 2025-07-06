package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ReplyAllOutline: ImageVector
    get() {
        if (_ReplyAllOutline != null) {
            return _ReplyAllOutline!!
        }
        _ReplyAllOutline = ImageVector.Builder(
            name = "ReplyAllOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 9.8f)
                verticalLineTo(10.7f)
                lineTo(12.7f, 10.9f)
                curveTo(15.3f, 11.3f, 17.2f, 12.3f, 18.6f, 13.6f)
                curveTo(16.9f, 13.1f, 15.1f, 12.8f, 13f, 12.8f)
                horizontalLineTo(11f)
                verticalLineTo(14.1f)
                lineTo(8.8f, 12f)
                lineTo(11f, 9.8f)
                moveTo(13f, 5f)
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
            }
        }.build()

        return _ReplyAllOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ReplyAllOutline: ImageVector? = null
