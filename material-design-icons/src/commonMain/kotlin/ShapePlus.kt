package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShapePlus: ImageVector
    get() {
        if (_ShapePlus != null) {
            return _ShapePlus!!
        }
        _ShapePlus = ImageVector.Builder(
            name = "ShapePlus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 2f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                moveTo(17.5f, 2f)
                curveTo(20f, 2f, 22f, 4f, 22f, 6.5f)
                curveTo(22f, 9f, 20f, 11f, 17.5f, 11f)
                curveTo(15f, 11f, 13f, 9f, 13f, 6.5f)
                curveTo(13f, 4f, 15f, 2f, 17.5f, 2f)
                moveTo(6.5f, 14f)
                lineTo(11f, 22f)
                horizontalLineTo(2f)
                lineTo(6.5f, 14f)
                moveTo(19f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(22f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                horizontalLineTo(19f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _ShapePlus!!
    }

@Suppress("ObjectPropertyName")
private var _ShapePlus: ImageVector? = null
