package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatListGroup: ImageVector
    get() {
        if (_FormatListGroup != null) {
            return _FormatListGroup!!
        }
        _FormatListGroup = ImageVector.Builder(
            name = "FormatListGroup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                moveTo(20f, 7f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineTo(20f)
                verticalLineTo(7f)
                moveTo(20f, 11f)
                horizontalLineTo(7f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                moveTo(20f, 15f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _FormatListGroup!!
    }

@Suppress("ObjectPropertyName")
private var _FormatListGroup: ImageVector? = null
