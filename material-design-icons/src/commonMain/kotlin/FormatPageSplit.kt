package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatPageSplit: ImageVector
    get() {
        if (_FormatPageSplit != null) {
            return _FormatPageSplit!!
        }
        _FormatPageSplit = ImageVector.Builder(
            name = "FormatPageSplit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 11f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                moveTo(13f, 1f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(1f)
                horizontalLineTo(13f)
                moveTo(11f, 17f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                moveTo(9f, 20f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(2f)
                horizontalLineTo(6f)
                curveTo(4.89f, 2f, 4f, 2.9f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.11f, 4.89f, 22f, 6f, 22f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                moveTo(15f, 3f)
                verticalLineTo(8f)
                horizontalLineTo(18f)
                verticalLineTo(20f)
                horizontalLineTo(15f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                curveTo(19.11f, 22f, 20f, 21.11f, 20f, 20f)
                verticalLineTo(8f)
                lineTo(15f, 3f)
                moveTo(13f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(23f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _FormatPageSplit!!
    }

@Suppress("ObjectPropertyName")
private var _FormatPageSplit: ImageVector? = null
