package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Shark: ImageVector
    get() {
        if (_Shark != null) {
            return _Shark!!
        }
        _Shark = ImageVector.Builder(
            name = "Shark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.56f, 9.09f)
                curveTo(14.66f, 7.18f, 12.54f, 6f, 11f, 6f)
                curveTo(11.47f, 7.4f, 11.28f, 8.57f, 10.95f, 9.43f)
                curveTo(8.45f, 10f, 6f, 11f, 6f, 11f)
                reflectiveCurveTo(3f, 7f, 1f, 7f)
                lineTo(3f, 13f)
                lineTo(2f, 17f)
                curveTo(4f, 17f, 6f, 14f, 6f, 14f)
                reflectiveCurveTo(11f, 16f, 14f, 16f)
                verticalLineTo(18f)
                curveTo(14.65f, 18f, 15.91f, 17.17f, 16.73f, 15.77f)
                curveTo(17.97f, 15.56f, 19f, 15.21f, 19.87f, 14.81f)
                curveTo(19.72f, 14.63f, 19.53f, 14.44f, 19.28f, 14.3f)
                curveTo(18.63f, 13.91f, 17.82f, 13.67f, 17f, 13.5f)
                curveTo(17.82f, 13.34f, 18.67f, 13.22f, 19.59f, 13.35f)
                curveTo(20.05f, 13.41f, 20.54f, 13.54f, 21f, 13.86f)
                curveTo(21.1f, 13.92f, 21.17f, 14f, 21.24f, 14.05f)
                curveTo(22.4f, 13.26f, 23f, 12.44f, 23f, 12f)
                curveTo(23f, 11.13f, 19.19f, 9.5f, 15.56f, 9.09f)
                moveTo(18f, 12f)
                curveTo(17.45f, 12f, 17f, 11.55f, 17f, 11f)
                curveTo(17f, 10.76f, 17.1f, 10.55f, 17.23f, 10.38f)
                curveTo(17.84f, 10.5f, 18.43f, 10.67f, 18.97f, 10.84f)
                curveTo(19f, 10.89f, 19f, 10.94f, 19f, 11f)
                curveTo(19f, 11.55f, 18.55f, 12f, 18f, 12f)
                close()
            }
        }.build()

        return _Shark!!
    }

@Suppress("ObjectPropertyName")
private var _Shark: ImageVector? = null
