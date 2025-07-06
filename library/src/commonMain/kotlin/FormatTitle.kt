package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatTitle: ImageVector
    get() {
        if (_FormatTitle != null) {
            return _FormatTitle!!
        }
        _FormatTitle = ImageVector.Builder(
            name = "FormatTitle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 4f)
                verticalLineTo(7f)
                horizontalLineTo(10.5f)
                verticalLineTo(19f)
                horizontalLineTo(13.5f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _FormatTitle!!
    }

@Suppress("ObjectPropertyName")
private var _FormatTitle: ImageVector? = null
