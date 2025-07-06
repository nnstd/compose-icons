package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShapeSquareRoundedPlus: ImageVector
    get() {
        if (_ShapeSquareRoundedPlus != null) {
            return _ShapeSquareRoundedPlus!!
        }
        _ShapeSquareRoundedPlus = ImageVector.Builder(
            name = "ShapeSquareRoundedPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 2f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(19f)
                verticalLineTo(10f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
                verticalLineTo(5f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                moveTo(7f, 5f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                curveTo(5.9f, 7f, 5f, 7.9f, 5f, 9f)
                verticalLineTo(17f)
                curveTo(5f, 18.11f, 5.9f, 19f, 7f, 19f)
                horizontalLineTo(15f)
                curveTo(16.11f, 19f, 17f, 18.11f, 17f, 17f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                curveTo(19f, 19.21f, 17.21f, 21f, 15f, 21f)
                horizontalLineTo(7f)
                curveTo(4.79f, 21f, 3f, 19.21f, 3f, 17f)
                verticalLineTo(9f)
                curveTo(3f, 6.79f, 4.79f, 5f, 7f, 5f)
                close()
            }
        }.build()

        return _ShapeSquareRoundedPlus!!
    }

@Suppress("ObjectPropertyName")
private var _ShapeSquareRoundedPlus: ImageVector? = null
