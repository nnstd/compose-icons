package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CeilingFanLight: ImageVector
    get() {
        if (_CeilingFanLight != null) {
            return _CeilingFanLight!!
        }
        _CeilingFanLight = ImageVector.Builder(
            name = "CeilingFanLight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 3f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(10.27f)
                curveTo(10.38f, 10.63f, 10f, 11.29f, 10f, 12f)
                verticalLineTo(13f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                curveTo(14f, 11.29f, 13.62f, 10.63f, 13f, 10.27f)
                verticalLineTo(5f)
                horizontalLineTo(16f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                moveTo(6f, 12f)
                curveTo(3.79f, 12f, 2f, 12.67f, 2f, 13.5f)
                curveTo(2f, 14.33f, 3.79f, 15f, 6f, 15f)
                reflectiveCurveTo(10f, 14.33f, 10f, 13.5f)
                curveTo(10f, 12.67f, 8.21f, 12f, 6f, 12f)
                moveTo(18f, 12f)
                curveTo(15.79f, 12f, 14f, 12.67f, 14f, 13.5f)
                curveTo(14f, 14.33f, 15.79f, 15f, 18f, 15f)
                reflectiveCurveTo(22f, 14.33f, 22f, 13.5f)
                curveTo(22f, 12.67f, 20.21f, 12f, 18f, 12f)
                moveTo(10f, 14f)
                verticalLineTo(15f)
                curveTo(10f, 15.72f, 10.38f, 16.38f, 11f, 16.73f)
                curveTo(11.62f, 17.09f, 12.38f, 17.09f, 13f, 16.73f)
                curveTo(13.62f, 16.38f, 14f, 15.71f, 14f, 15f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                moveTo(13f, 19f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                moveTo(15.88f, 16.46f)
                lineTo(18f, 18.59f)
                lineTo(16.59f, 20f)
                lineTo(14.47f, 17.88f)
                lineTo(15.88f, 16.46f)
                moveTo(9.54f, 17.88f)
                lineTo(7.41f, 20f)
                lineTo(6f, 18.59f)
                lineTo(8.12f, 16.47f)
                lineTo(9.54f, 17.88f)
            }
        }.build()

        return _CeilingFanLight!!
    }

@Suppress("ObjectPropertyName")
private var _CeilingFanLight: ImageVector? = null
