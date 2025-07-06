package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SharkOff: ImageVector
    get() {
        if (_SharkOff != null) {
            return _SharkOff!!
        }
        _SharkOff = ImageVector.Builder(
            name = "SharkOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.26f, 8.06f)
                lineTo(18.53f, 15.33f)
                curveTo(19f, 15.17f, 19.46f, 15f, 19.87f, 14.81f)
                curveTo(19.72f, 14.63f, 19.53f, 14.44f, 19.28f, 14.3f)
                curveTo(18.63f, 13.91f, 17.82f, 13.67f, 17f, 13.5f)
                curveTo(17.82f, 13.34f, 18.67f, 13.22f, 19.59f, 13.35f)
                curveTo(20.05f, 13.41f, 20.54f, 13.54f, 21f, 13.86f)
                curveTo(21.1f, 13.92f, 21.17f, 14f, 21.24f, 14.05f)
                curveTo(22.4f, 13.26f, 23f, 12.44f, 23f, 12f)
                curveTo(23f, 11.13f, 19.19f, 9.5f, 15.56f, 9.09f)
                curveTo(14.66f, 7.18f, 12.54f, 6f, 11f, 6f)
                curveTo(11.25f, 6.76f, 11.31f, 7.45f, 11.26f, 8.06f)
                moveTo(17.23f, 10.38f)
                curveTo(17.84f, 10.5f, 18.43f, 10.67f, 18.97f, 10.84f)
                curveTo(19f, 10.89f, 19f, 10.94f, 19f, 11f)
                curveTo(19f, 11.55f, 18.55f, 12f, 18f, 12f)
                reflectiveCurveTo(17f, 11.55f, 17f, 11f)
                curveTo(17f, 10.76f, 17.1f, 10.55f, 17.23f, 10.38f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(15.42f, 17.31f)
                curveTo(14.88f, 17.75f, 14.35f, 18f, 14f, 18f)
                verticalLineTo(16f)
                curveTo(11f, 16f, 6f, 14f, 6f, 14f)
                reflectiveCurveTo(4f, 17f, 2f, 17f)
                lineTo(3f, 13f)
                lineTo(1f, 7f)
                curveTo(3f, 7f, 6f, 11f, 6f, 11f)
                reflectiveCurveTo(6.96f, 10.62f, 8.3f, 10.19f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                close()
            }
        }.build()

        return _SharkOff!!
    }

@Suppress("ObjectPropertyName")
private var _SharkOff: ImageVector? = null
