package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookmarkOff: ImageVector
    get() {
        if (_BookmarkOff != null) {
            return _BookmarkOff!!
        }
        _BookmarkOff = ImageVector.Builder(
            name = "BookmarkOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 20.72f)
                lineTo(18.73f, 22f)
                lineTo(16.78f, 20.05f)
                lineTo(12f, 18f)
                lineTo(5f, 21f)
                verticalLineTo(8.27f)
                lineTo(2f, 5.27f)
                lineTo(3.28f, 4f)
                lineTo(20f, 20.72f)
                moveTo(19f, 17.16f)
                verticalLineTo(5f)
                curveTo(19f, 3.89f, 18.1f, 3f, 17f, 3f)
                horizontalLineTo(7f)
                curveTo(6.41f, 3f, 5.89f, 3.27f, 5.5f, 3.68f)
                lineTo(19f, 17.16f)
                close()
            }
        }.build()

        return _BookmarkOff!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkOff: ImageVector? = null
