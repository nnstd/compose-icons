package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShapePlusOutline: ImageVector
    get() {
        if (_ShapePlusOutline != null) {
            return _ShapePlusOutline!!
        }
        _ShapePlusOutline = ImageVector.Builder(
            name = "ShapePlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 11f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                moveTo(4f, 9f)
                verticalLineTo(4f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                moveTo(20f, 6.5f)
                curveTo(20f, 7.9f, 18.9f, 9f, 17.5f, 9f)
                reflectiveCurveTo(15f, 7.9f, 15f, 6.5f)
                reflectiveCurveTo(16.11f, 4f, 17.5f, 4f)
                reflectiveCurveTo(20f, 5.11f, 20f, 6.5f)
                moveTo(6.5f, 14f)
                lineTo(2f, 22f)
                horizontalLineTo(11f)
                moveTo(7.58f, 20f)
                horizontalLineTo(5.42f)
                lineTo(6.5f, 18.08f)
                moveTo(22f, 6.5f)
                curveTo(22f, 4f, 20f, 2f, 17.5f, 2f)
                reflectiveCurveTo(13f, 4f, 13f, 6.5f)
                reflectiveCurveTo(15f, 11f, 17.5f, 11f)
                reflectiveCurveTo(22f, 9f, 22f, 6.5f)
                moveTo(19f, 17f)
                verticalLineTo(14f)
                horizontalLineTo(17f)
                verticalLineTo(17f)
                horizontalLineTo(14f)
                verticalLineTo(19f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineTo(22f)
                verticalLineTo(17f)
                close()
            }
        }.build()

        return _ShapePlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ShapePlusOutline: ImageVector? = null
