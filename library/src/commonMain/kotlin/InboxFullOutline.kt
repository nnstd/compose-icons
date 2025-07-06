package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.InboxFullOutline: ImageVector
    get() {
        if (_InboxFullOutline != null) {
            return _InboxFullOutline!!
        }
        _InboxFullOutline = ImageVector.Builder(
            name = "InboxFullOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                curveTo(20.1f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 20.1f, 20.1f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.9f, 3.9f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                moveTo(5f, 19f)
                horizontalLineTo(9.4f)
                curveTo(8.79f, 18.47f, 8.35f, 17.78f, 8.13f, 17f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                moveTo(19f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(15.87f)
                curveTo(15.65f, 17.78f, 15.21f, 18.47f, 14.6f, 19f)
                horizontalLineTo(19f)
                moveTo(19f, 15f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                curveTo(10f, 18.67f, 14f, 18.67f, 14f, 16f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                moveTo(7f, 7f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                moveTo(17f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _InboxFullOutline!!
    }

@Suppress("ObjectPropertyName")
private var _InboxFullOutline: ImageVector? = null
