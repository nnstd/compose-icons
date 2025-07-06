package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShapePolygonPlus: ImageVector
    get() {
        if (_ShapePolygonPlus != null) {
            return _ShapePolygonPlus!!
        }
        _ShapePolygonPlus = ImageVector.Builder(
            name = "ShapePolygonPlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 15.7f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                lineTo(10f, 21f)
                lineTo(3f, 14f)
                lineTo(7f, 5f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(8.3f)
                lineTo(5.4f, 13.6f)
                lineTo(10.4f, 18.6f)
                lineTo(17f, 15.7f)
                moveTo(22f, 5f)
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
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _ShapePolygonPlus!!
    }

@Suppress("ObjectPropertyName")
private var _ShapePolygonPlus: ImageVector? = null
