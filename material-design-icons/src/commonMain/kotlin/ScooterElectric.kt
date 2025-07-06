package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ScooterElectric: ImageVector
    get() {
        if (_ScooterElectric != null) {
            return _ScooterElectric!!
        }
        _ScooterElectric = ImageVector.Builder(
            name = "ScooterElectric",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.82f, 16f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                curveTo(15f, 12.79f, 16.79f, 11f, 19f, 11f)
                horizontalLineTo(19.74f)
                lineTo(17.84f, 2.56f)
                curveTo(17.63f, 1.65f, 16.82f, 1f, 15.89f, 1f)
                horizontalLineTo(12f)
                verticalLineTo(3f)
                horizontalLineTo(15.89f)
                lineTo(17.29f, 9.25f)
                horizontalLineTo(17.28f)
                curveTo(15.12f, 9.9f, 13.47f, 11.73f, 13.09f, 14f)
                horizontalLineTo(7.82f)
                curveTo(7.34f, 12.66f, 5.96f, 11.76f, 4.4f, 12.06f)
                curveTo(3.22f, 12.29f, 2.27f, 13.26f, 2.05f, 14.44f)
                curveTo(1.7f, 16.34f, 3.16f, 18f, 5f, 18f)
                curveTo(6.3f, 18f, 7.4f, 17.16f, 7.82f, 16f)
                moveTo(5f, 16f)
                curveTo(4.45f, 16f, 4f, 15.55f, 4f, 15f)
                reflectiveCurveTo(4.45f, 14f, 5f, 14f)
                reflectiveCurveTo(6f, 14.45f, 6f, 15f)
                reflectiveCurveTo(5.55f, 16f, 5f, 16f)
                moveTo(19f, 12f)
                curveTo(17.34f, 12f, 16f, 13.34f, 16f, 15f)
                reflectiveCurveTo(17.34f, 18f, 19f, 18f)
                reflectiveCurveTo(22f, 16.66f, 22f, 15f)
                reflectiveCurveTo(20.66f, 12f, 19f, 12f)
                moveTo(19f, 16f)
                curveTo(18.45f, 16f, 18f, 15.55f, 18f, 15f)
                reflectiveCurveTo(18.45f, 14f, 19f, 14f)
                reflectiveCurveTo(20f, 14.45f, 20f, 15f)
                reflectiveCurveTo(19.55f, 16f, 19f, 16f)
                moveTo(11f, 20f)
                horizontalLineTo(7f)
                lineTo(13f, 23f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                lineTo(11f, 18f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _ScooterElectric!!
    }

@Suppress("ObjectPropertyName")
private var _ScooterElectric: ImageVector? = null
