package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShapeOvalPlus: ImageVector
    get() {
        if (_ShapeOvalPlus != null) {
            return _ShapeOvalPlus!!
        }
        _ShapeOvalPlus = ImageVector.Builder(
            name = "ShapeOvalPlus",
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
                moveTo(11f, 4f)
                lineTo(12f, 4.09f)
                verticalLineTo(6.14f)
                curveTo(11.68f, 6.05f, 11.34f, 6f, 11f, 6f)
                curveTo(8.24f, 6f, 6f, 9.13f, 6f, 13f)
                curveTo(6f, 16.87f, 8.24f, 20f, 11f, 20f)
                curveTo(13.76f, 20f, 16f, 16.87f, 16f, 13f)
                lineTo(15.95f, 12f)
                horizontalLineTo(17.96f)
                lineTo(18f, 13f)
                curveTo(18f, 17.97f, 14.87f, 22f, 11f, 22f)
                curveTo(7.13f, 22f, 4f, 17.97f, 4f, 13f)
                curveTo(4f, 8.03f, 7.13f, 4f, 11f, 4f)
                close()
            }
        }.build()

        return _ShapeOvalPlus!!
    }

@Suppress("ObjectPropertyName")
private var _ShapeOvalPlus: ImageVector? = null
