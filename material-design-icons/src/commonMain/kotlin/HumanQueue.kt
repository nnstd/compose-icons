package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumanQueue: ImageVector
    get() {
        if (_HumanQueue != null) {
            return _HumanQueue!!
        }
        _HumanQueue = ImageVector.Builder(
            name = "HumanQueue",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 6f)
                curveTo(3.9f, 6f, 3f, 6.9f, 3f, 8f)
                reflectiveCurveTo(3.9f, 10f, 5f, 10f)
                reflectiveCurveTo(7f, 9.11f, 7f, 8f)
                reflectiveCurveTo(6.11f, 6f, 5f, 6f)
                moveTo(12f, 4f)
                curveTo(10.9f, 4f, 10f, 4.89f, 10f, 6f)
                reflectiveCurveTo(10.9f, 8f, 12f, 8f)
                reflectiveCurveTo(14f, 7.11f, 14f, 6f)
                reflectiveCurveTo(13.11f, 4f, 12f, 4f)
                moveTo(19f, 2f)
                curveTo(17.9f, 2f, 17f, 2.9f, 17f, 4f)
                reflectiveCurveTo(17.9f, 6f, 19f, 6f)
                reflectiveCurveTo(21f, 5.11f, 21f, 4f)
                reflectiveCurveTo(20.11f, 2f, 19f, 2f)
                moveTo(3.5f, 11f)
                curveTo(2.67f, 11f, 2f, 11.67f, 2f, 12.5f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                verticalLineTo(12.5f)
                curveTo(8f, 11.67f, 7.33f, 11f, 6.5f, 11f)
                horizontalLineTo(3.5f)
                moveTo(10.5f, 9f)
                curveTo(9.67f, 9f, 9f, 9.67f, 9f, 10.5f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                horizontalLineTo(14f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(10.5f)
                curveTo(15f, 9.67f, 14.33f, 9f, 13.5f, 9f)
                horizontalLineTo(10.5f)
                moveTo(17.5f, 7f)
                curveTo(16.67f, 7f, 16f, 7.67f, 16f, 8.5f)
                verticalLineTo(13f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                verticalLineTo(8.5f)
                curveTo(22f, 7.67f, 21.33f, 7f, 20.5f, 7f)
                horizontalLineTo(17.5f)
                close()
            }
        }.build()

        return _HumanQueue!!
    }

@Suppress("ObjectPropertyName")
private var _HumanQueue: ImageVector? = null
