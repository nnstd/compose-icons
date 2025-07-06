package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MinusCircleMultipleOutline: ImageVector
    get() {
        if (_MinusCircleMultipleOutline != null) {
            return _MinusCircleMultipleOutline!!
        }
        _MinusCircleMultipleOutline = ImageVector.Builder(
            name = "MinusCircleMultipleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                moveTo(2f, 12f)
                curveTo(2f, 9.21f, 3.64f, 6.8f, 6f, 5.68f)
                verticalLineTo(3.5f)
                curveTo(2.5f, 4.76f, 0f, 8.09f, 0f, 12f)
                reflectiveCurveTo(2.5f, 19.24f, 6f, 20.5f)
                verticalLineTo(18.32f)
                curveTo(3.64f, 17.2f, 2f, 14.79f, 2f, 12f)
                moveTo(15f, 3f)
                curveTo(10.04f, 3f, 6f, 7.04f, 6f, 12f)
                reflectiveCurveTo(10.04f, 21f, 15f, 21f)
                reflectiveCurveTo(24f, 16.96f, 24f, 12f)
                reflectiveCurveTo(19.96f, 3f, 15f, 3f)
                moveTo(15f, 19f)
                curveTo(11.14f, 19f, 8f, 15.86f, 8f, 12f)
                reflectiveCurveTo(11.14f, 5f, 15f, 5f)
                reflectiveCurveTo(22f, 8.14f, 22f, 12f)
                reflectiveCurveTo(18.86f, 19f, 15f, 19f)
                close()
            }
        }.build()

        return _MinusCircleMultipleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MinusCircleMultipleOutline: ImageVector? = null
