package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Scooter: ImageVector
    get() {
        if (_Scooter != null) {
            return _Scooter!!
        }
        _Scooter = ImageVector.Builder(
            name = "Scooter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.82f, 19f)
                horizontalLineTo(15f)
                verticalLineTo(18f)
                curveTo(15f, 15.79f, 16.79f, 14f, 19f, 14f)
                horizontalLineTo(19.74f)
                lineTo(17.84f, 5.56f)
                curveTo(17.63f, 4.65f, 16.82f, 4f, 15.89f, 4f)
                horizontalLineTo(12f)
                verticalLineTo(6f)
                horizontalLineTo(15.89f)
                lineTo(17.29f, 12.25f)
                horizontalLineTo(17.28f)
                curveTo(15.12f, 12.9f, 13.47f, 14.73f, 13.09f, 17f)
                horizontalLineTo(7.82f)
                curveTo(7.34f, 15.66f, 5.96f, 14.76f, 4.4f, 15.06f)
                curveTo(3.22f, 15.29f, 2.27f, 16.26f, 2.05f, 17.44f)
                curveTo(1.7f, 19.34f, 3.16f, 21f, 5f, 21f)
                curveTo(6.3f, 21f, 7.4f, 20.16f, 7.82f, 19f)
                moveTo(5f, 19f)
                curveTo(4.45f, 19f, 4f, 18.55f, 4f, 18f)
                reflectiveCurveTo(4.45f, 17f, 5f, 17f)
                reflectiveCurveTo(6f, 17.45f, 6f, 18f)
                reflectiveCurveTo(5.55f, 19f, 5f, 19f)
                moveTo(19f, 15f)
                curveTo(17.34f, 15f, 16f, 16.34f, 16f, 18f)
                reflectiveCurveTo(17.34f, 21f, 19f, 21f)
                reflectiveCurveTo(22f, 19.66f, 22f, 18f)
                reflectiveCurveTo(20.66f, 15f, 19f, 15f)
                moveTo(19f, 19f)
                curveTo(18.45f, 19f, 18f, 18.55f, 18f, 18f)
                reflectiveCurveTo(18.45f, 17f, 19f, 17f)
                reflectiveCurveTo(20f, 17.45f, 20f, 18f)
                reflectiveCurveTo(19.55f, 19f, 19f, 19f)
                close()
            }
        }.build()

        return _Scooter!!
    }

@Suppress("ObjectPropertyName")
private var _Scooter: ImageVector? = null
