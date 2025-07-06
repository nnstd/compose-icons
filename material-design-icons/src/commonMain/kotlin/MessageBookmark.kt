package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MessageBookmark: ImageVector
    get() {
        if (_MessageBookmark != null) {
            return _MessageBookmark!!
        }
        _MessageBookmark = ImageVector.Builder(
            name = "MessageBookmark",
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
                moveTo(19f, 13f)
                lineTo(16.5f, 11.5f)
                lineTo(14f, 13f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _MessageBookmark!!
    }

@Suppress("ObjectPropertyName")
private var _MessageBookmark: ImageVector? = null
