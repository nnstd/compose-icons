package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ListBoxOutline: ImageVector
    get() {
        if (_ListBoxOutline != null) {
            return _ListBoxOutline!!
        }
        _ListBoxOutline = ImageVector.Builder(
            name = "ListBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 15f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                moveTo(9f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                moveTo(11f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                moveTo(11f, 9f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                moveTo(9f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(9f)
                verticalLineTo(11f)
                moveTo(21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 20.1f, 20.1f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.9f, 3.9f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.1f, 3f, 21f, 3.9f, 21f, 5f)
                moveTo(19f, 5f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                moveTo(9f, 15f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _ListBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ListBoxOutline: ImageVector? = null
