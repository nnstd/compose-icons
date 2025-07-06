package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatFloatNone: ImageVector
    get() {
        if (_FormatFloatNone != null) {
            return _FormatFloatNone!!
        }
        _FormatFloatNone = ImageVector.Builder(
            name = "FormatFloatNone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 7f)
                horizontalLineTo(9f)
                verticalLineTo(13f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                moveTo(3f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(5f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                moveTo(21f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                moveTo(3f, 15f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(15f)
                moveTo(3f, 19f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _FormatFloatNone!!
    }

@Suppress("ObjectPropertyName")
private var _FormatFloatNone: ImageVector? = null
