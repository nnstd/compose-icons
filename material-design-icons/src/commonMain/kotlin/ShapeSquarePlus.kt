package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShapeSquarePlus: ImageVector
    get() {
        if (_ShapeSquarePlus != null) {
            return _ShapeSquarePlus!!
        }
        _ShapeSquarePlus = ImageVector.Builder(
            name = "ShapeSquarePlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 5f)
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
                horizontalLineTo(19f)
                verticalLineTo(5f)
                moveTo(17f, 19f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _ShapeSquarePlus!!
    }

@Suppress("ObjectPropertyName")
private var _ShapeSquarePlus: ImageVector? = null
