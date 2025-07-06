package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VacuumOutline: ImageVector
    get() {
        if (_VacuumOutline != null) {
            return _VacuumOutline!!
        }
        _VacuumOutline = ImageVector.Builder(
            name = "VacuumOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.66f, 20f)
                lineTo(13.87f, 3.81f)
                curveTo(13.5f, 2.97f, 12.93f, 2.29f, 12.16f, 1.77f)
                curveTo(11.4f, 1.26f, 10.55f, 1f, 9.61f, 1f)
                curveTo(8.77f, 1f, 8f, 1.21f, 7.3f, 1.63f)
                reflectiveCurveTo(6.04f, 2.62f, 5.63f, 3.32f)
                reflectiveCurveTo(5f, 4.8f, 5f, 5.64f)
                lineTo(5.03f, 9f)
                horizontalLineTo(2.03f)
                verticalLineTo(14.45f)
                curveTo(2.65f, 14.17f, 3.31f, 14.03f, 4f, 14.03f)
                verticalLineTo(11.03f)
                horizontalLineTo(9f)
                curveTo(9.57f, 11.03f, 10.04f, 11.23f, 10.43f, 11.62f)
                curveTo(10.82f, 12f, 11f, 12.47f, 11f, 13f)
                verticalLineTo(20.03f)
                horizontalLineTo(8.91f)
                curveTo(8.76f, 20.75f, 8.44f, 21.41f, 7.97f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                curveTo(13f, 12.28f, 12.8f, 11.62f, 12.45f, 11f)
                reflectiveCurveTo(11.61f, 9.91f, 11f, 9.56f)
                curveTo(10.42f, 9.2f, 9.75f, 9f, 9f, 9f)
                horizontalLineTo(7f)
                verticalLineTo(5.64f)
                curveTo(7f, 4.92f, 7.25f, 4.31f, 7.76f, 3.79f)
                reflectiveCurveTo(8.89f, 3f, 9.61f, 3f)
                curveTo(10.14f, 3f, 10.63f, 3.16f, 11.06f, 3.46f)
                reflectiveCurveTo(11.81f, 4.14f, 12f, 4.61f)
                lineTo(18.46f, 20f)
                lineTo(16f, 20.03f)
                verticalLineTo(22f)
                horizontalLineTo(23f)
                verticalLineTo(20.03f)
                lineTo(20.66f, 20f)
                moveTo(4f, 18f)
                curveTo(4.55f, 18f, 5f, 18.45f, 5f, 19f)
                reflectiveCurveTo(4.55f, 20f, 4f, 20f)
                reflectiveCurveTo(3f, 19.55f, 3f, 19f)
                reflectiveCurveTo(3.45f, 18f, 4f, 18f)
                moveTo(4f, 16f)
                curveTo(2.34f, 16f, 1f, 17.34f, 1f, 19f)
                reflectiveCurveTo(2.34f, 22f, 4f, 22f)
                reflectiveCurveTo(7f, 20.66f, 7f, 19f)
                reflectiveCurveTo(5.66f, 16f, 4f, 16f)
                close()
            }
        }.build()

        return _VacuumOutline!!
    }

@Suppress("ObjectPropertyName")
private var _VacuumOutline: ImageVector? = null
