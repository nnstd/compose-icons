package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatHeaderEqual: ImageVector
    get() {
        if (_FormatHeaderEqual != null) {
            return _FormatHeaderEqual!!
        }
        _FormatHeaderEqual = ImageVector.Builder(
            name = "FormatHeaderEqual",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                verticalLineTo(4f)
                horizontalLineTo(12f)
                verticalLineTo(18f)
                horizontalLineTo(10f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                moveTo(14f, 10f)
                verticalLineTo(8f)
                horizontalLineTo(21f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                moveTo(14f, 12f)
                horizontalLineTo(21f)
                verticalLineTo(14f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _FormatHeaderEqual!!
    }

@Suppress("ObjectPropertyName")
private var _FormatHeaderEqual: ImageVector? = null
