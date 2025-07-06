package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShapeRectanglePlus: ImageVector
    get() {
        if (_ShapeRectanglePlus != null) {
            return _ShapeRectanglePlus!!
        }
        _ShapeRectanglePlus = ImageVector.Builder(
            name = "ShapeRectanglePlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 6f)
                horizontalLineTo(22f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(14f)
                verticalLineTo(6f)
                horizontalLineTo(17f)
                verticalLineTo(3f)
                horizontalLineTo(19f)
                verticalLineTo(6f)
                moveTo(17f, 17f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _ShapeRectanglePlus!!
    }

@Suppress("ObjectPropertyName")
private var _ShapeRectanglePlus: ImageVector? = null
