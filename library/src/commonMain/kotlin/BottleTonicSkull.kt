package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.BottleTonicSkull: ImageVector
    get() {
        if (_BottleTonicSkull != null) {
            return _BottleTonicSkull!!
        }
        _BottleTonicSkull = ImageVector.Builder(
            name = "BottleTonicSkull",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 13f)
                verticalLineTo(22f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                curveTo(5f, 10.24f, 7.24f, 8f, 10f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(9f)
                verticalLineTo(5f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(14f)
                verticalLineTo(8f)
                curveTo(16.76f, 8f, 19f, 10.24f, 19f, 13f)
                moveTo(13f, 4f)
                lineTo(14f, 2f)
                horizontalLineTo(10f)
                lineTo(11f, 4f)
                horizontalLineTo(13f)
                moveTo(12f, 11f)
                curveTo(9.79f, 11f, 8f, 12.79f, 8f, 15f)
                curveTo(8f, 16f, 8.39f, 16.9f, 9f, 17.59f)
                verticalLineTo(19f)
                horizontalLineTo(10.25f)
                verticalLineTo(17.5f)
                horizontalLineTo(11.38f)
                verticalLineTo(19f)
                horizontalLineTo(12.63f)
                verticalLineTo(17.5f)
                horizontalLineTo(13.75f)
                verticalLineTo(19f)
                horizontalLineTo(15f)
                verticalLineTo(17.59f)
                curveTo(15.61f, 16.9f, 16f, 16f, 16f, 15f)
                curveTo(16f, 12.79f, 14.21f, 11f, 12f, 11f)
                moveTo(10.5f, 15f)
                curveTo(9.95f, 15f, 9.5f, 14.55f, 9.5f, 14f)
                reflectiveCurveTo(9.95f, 13f, 10.5f, 13f)
                reflectiveCurveTo(11.5f, 13.45f, 11.5f, 14f)
                reflectiveCurveTo(11.05f, 15f, 10.5f, 15f)
                moveTo(11.25f, 16.25f)
                lineTo(12f, 15f)
                lineTo(12.75f, 16.25f)
                horizontalLineTo(11.25f)
                moveTo(13.5f, 15f)
                curveTo(12.95f, 15f, 12.5f, 14.55f, 12.5f, 14f)
                reflectiveCurveTo(12.95f, 13f, 13.5f, 13f)
                reflectiveCurveTo(14.5f, 13.45f, 14.5f, 14f)
                reflectiveCurveTo(14.05f, 15f, 13.5f, 15f)
                close()
            }
        }.build()

        return _BottleTonicSkull!!
    }

@Suppress("ObjectPropertyName")
private var _BottleTonicSkull: ImageVector? = null
