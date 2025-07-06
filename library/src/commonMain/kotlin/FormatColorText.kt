package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatColorText: ImageVector
    get() {
        if (_FormatColorText != null) {
            return _FormatColorText!!
        }
        _FormatColorText = ImageVector.Builder(
            name = "FormatColorText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.62f, 12f)
                lineTo(12f, 5.67f)
                lineTo(14.37f, 12f)
                moveTo(11f, 3f)
                lineTo(5.5f, 17f)
                horizontalLineTo(7.75f)
                lineTo(8.87f, 14f)
                horizontalLineTo(15.12f)
                lineTo(16.25f, 17f)
                horizontalLineTo(18.5f)
                lineTo(13f, 3f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _FormatColorText!!
    }

@Suppress("ObjectPropertyName")
private var _FormatColorText: ImageVector? = null
