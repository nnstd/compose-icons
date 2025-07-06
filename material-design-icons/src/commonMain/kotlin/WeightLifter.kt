package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WeightLifter: ImageVector
    get() {
        if (_WeightLifter != null) {
            return _WeightLifter!!
        }
        _WeightLifter = ImageVector.Builder(
            name = "WeightLifter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 5f)
                curveTo(10.89f, 5f, 10f, 5.89f, 10f, 7f)
                reflectiveCurveTo(10.89f, 9f, 12f, 9f)
                reflectiveCurveTo(14f, 8.11f, 14f, 7f)
                reflectiveCurveTo(13.11f, 5f, 12f, 5f)
                moveTo(22f, 1f)
                verticalLineTo(6f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                verticalLineTo(1f)
                horizontalLineTo(4f)
                verticalLineTo(3f)
                horizontalLineTo(20f)
                verticalLineTo(1f)
                horizontalLineTo(22f)
                moveTo(15f, 11.26f)
                verticalLineTo(23f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(23f)
                horizontalLineTo(9f)
                verticalLineTo(11.26f)
                curveTo(6.93f, 10.17f, 5.5f, 8f, 5.5f, 5.5f)
                lineTo(5.5f, 5f)
                horizontalLineTo(7.5f)
                lineTo(7.5f, 5.5f)
                curveTo(7.5f, 8f, 9.5f, 10f, 12f, 10f)
                reflectiveCurveTo(16.5f, 8f, 16.5f, 5.5f)
                lineTo(16.5f, 5f)
                horizontalLineTo(18.5f)
                lineTo(18.5f, 5.5f)
                curveTo(18.5f, 8f, 17.07f, 10.17f, 15f, 11.26f)
                close()
            }
        }.build()

        return _WeightLifter!!
    }

@Suppress("ObjectPropertyName")
private var _WeightLifter: ImageVector? = null
