package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatColumns: ImageVector
    get() {
        if (_FormatColumns != null) {
            return _FormatColumns!!
        }
        _FormatColumns = ImageVector.Builder(
            name = "FormatColumns",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 3f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                moveTo(13f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                moveTo(3f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                moveTo(13f, 7f)
                horizontalLineTo(21f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                moveTo(3f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                moveTo(13f, 11f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                moveTo(3f, 15f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                moveTo(13f, 15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                moveTo(3f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                moveTo(13f, 19f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _FormatColumns!!
    }

@Suppress("ObjectPropertyName")
private var _FormatColumns: ImageVector? = null
