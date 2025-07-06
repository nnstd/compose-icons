package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BookmarkBoxOutline: ImageVector
    get() {
        if (_BookmarkBoxOutline != null) {
            return _BookmarkBoxOutline!!
        }
        _BookmarkBoxOutline = ImageVector.Builder(
            name = "BookmarkBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.1f, 3f, 21f, 3.89f, 21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 19.53f, 20.79f, 20.04f, 20.41f, 20.41f)
                curveTo(20.04f, 20.79f, 19.53f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(4.47f, 21f, 3.96f, 20.79f, 3.59f, 20.41f)
                curveTo(3.21f, 20.04f, 3f, 19.53f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.89f, 3.89f, 3f, 5f, 3f)
                moveTo(19f, 19f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                moveTo(17f, 7f)
                horizontalLineTo(12f)
                verticalLineTo(15f)
                lineTo(14.5f, 13.5f)
                lineTo(17f, 15f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _BookmarkBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _BookmarkBoxOutline: ImageVector? = null
