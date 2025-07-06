package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SquareOpacity: ImageVector
    get() {
        if (_SquareOpacity != null) {
            return _SquareOpacity!!
        }
        _SquareOpacity = ImageVector.Builder(
            name = "SquareOpacity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                moveTo(21f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                moveTo(21f, 3f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                moveTo(17f, 15f)
                horizontalLineTo(19f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                moveTo(21f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                moveTo(13f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineTo(21f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                moveTo(15f, 21f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                moveTo(17f, 3f)
                horizontalLineTo(15f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(3f)
                moveTo(17f, 11f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                moveTo(15f, 17f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                moveTo(17f, 19f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                moveTo(21f, 21f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(21f)
                horizontalLineTo(21f)
                moveTo(15f, 9f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                moveTo(15f, 13f)
                horizontalLineTo(17f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(13f)
                moveTo(17f, 5f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _SquareOpacity!!
    }

@Suppress("ObjectPropertyName")
private var _SquareOpacity: ImageVector? = null
