package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BorderStyle: ImageVector
    get() {
        if (_BorderStyle != null) {
            return _BorderStyle!!
        }
        _BorderStyle = ImageVector.Builder(
            name = "BorderStyle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 21f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                moveTo(19f, 21f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                moveTo(7f, 21f)
                horizontalLineTo(9f)
                verticalLineTo(19f)
                horizontalLineTo(7f)
                moveTo(11f, 21f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                moveTo(19f, 17f)
                horizontalLineTo(21f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                moveTo(19f, 13f)
                horizontalLineTo(21f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                moveTo(3f, 3f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                moveTo(19f, 9f)
                horizontalLineTo(21f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
            }
        }.build()

        return _BorderStyle!!
    }

@Suppress("ObjectPropertyName")
private var _BorderStyle: ImageVector? = null
