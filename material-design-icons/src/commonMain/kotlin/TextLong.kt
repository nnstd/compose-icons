package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TextLong: ImageVector
    get() {
        if (_TextLong != null) {
            return _TextLong!!
        }
        _TextLong = ImageVector.Builder(
            name = "TextLong",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 5f)
                horizontalLineTo(20f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                moveTo(4f, 9f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                moveTo(4f, 13f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                verticalLineTo(13f)
                moveTo(4f, 17f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _TextLong!!
    }

@Suppress("ObjectPropertyName")
private var _TextLong: ImageVector? = null
