package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Beekeeper: ImageVector
    get() {
        if (_Beekeeper != null) {
            return _Beekeeper!!
        }
        _Beekeeper = ImageVector.Builder(
            name = "Beekeeper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 5f)
                horizontalLineTo(16f)
                curveTo(16f, 3.34f, 14.21f, 2f, 12f, 2f)
                curveTo(9.79f, 2f, 8f, 3.34f, 8f, 5f)
                horizontalLineTo(5f)
                curveTo(4.45f, 5f, 4f, 5.45f, 4f, 6f)
                reflectiveCurveTo(4.45f, 7f, 5f, 7f)
                verticalLineTo(14f)
                curveTo(5f, 15.11f, 5.9f, 16f, 7f, 16f)
                horizontalLineTo(17f)
                curveTo(18.11f, 16f, 19f, 15.11f, 19f, 14f)
                verticalLineTo(7f)
                curveTo(19.55f, 7f, 20f, 6.55f, 20f, 6f)
                reflectiveCurveTo(19.55f, 5f, 19f, 5f)
                moveTo(17f, 14f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(14f)
                moveTo(15.86f, 8f)
                curveTo(15.94f, 8.32f, 16f, 8.65f, 16f, 9f)
                curveTo(16f, 11.21f, 14.21f, 13f, 12f, 13f)
                reflectiveCurveTo(8f, 11.21f, 8f, 9f)
                curveTo(8f, 8.65f, 8.06f, 8.32f, 8.14f, 8f)
                horizontalLineTo(10.28f)
                curveTo(10.11f, 8.3f, 10f, 8.63f, 10f, 9f)
                curveTo(10f, 10.1f, 10.9f, 11f, 12f, 11f)
                reflectiveCurveTo(14f, 10.1f, 14f, 9f)
                curveTo(14f, 8.63f, 13.89f, 8.3f, 13.72f, 8f)
                horizontalLineTo(15.86f)
                moveTo(20f, 19f)
                verticalLineTo(22f)
                horizontalLineTo(4f)
                verticalLineTo(19f)
                curveTo(4f, 18.22f, 4.47f, 17.55f, 5.18f, 17f)
                horizontalLineTo(12f)
                curveTo(9.28f, 17f, 6.19f, 18.29f, 6f, 19f)
                verticalLineTo(20f)
                horizontalLineTo(18f)
                verticalLineTo(19f)
                curveTo(17.81f, 18.29f, 14.72f, 17f, 12f, 17f)
                horizontalLineTo(18.82f)
                curveTo(19.53f, 17.55f, 20f, 18.22f, 20f, 19f)
                close()
            }
        }.build()

        return _Beekeeper!!
    }

@Suppress("ObjectPropertyName")
private var _Beekeeper: ImageVector? = null
