package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatTextbox: ImageVector
    get() {
        if (_FormatTextbox != null) {
            return _FormatTextbox!!
        }
        _FormatTextbox = ImageVector.Builder(
            name = "FormatTextbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 7f)
                verticalLineTo(3f)
                horizontalLineTo(17f)
                verticalLineTo(4f)
                horizontalLineTo(7f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(20f)
                verticalLineTo(7f)
                horizontalLineTo(21f)
                moveTo(18f, 4f)
                horizontalLineTo(20f)
                verticalLineTo(6f)
                horizontalLineTo(18f)
                verticalLineTo(4f)
                moveTo(4f, 4f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                moveTo(6f, 20f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(6f)
                verticalLineTo(20f)
                moveTo(20f, 20f)
                horizontalLineTo(18f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                moveTo(18f, 17f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(6f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(18f)
                verticalLineTo(17f)
                moveTo(16f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _FormatTextbox!!
    }

@Suppress("ObjectPropertyName")
private var _FormatTextbox: ImageVector? = null
