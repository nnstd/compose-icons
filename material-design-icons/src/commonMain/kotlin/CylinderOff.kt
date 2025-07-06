package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CylinderOff: ImageVector
    get() {
        if (_CylinderOff != null) {
            return _CylinderOff!!
        }
        _CylinderOff = ImageVector.Builder(
            name = "CylinderOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.64f, 4.44f)
                lineTo(6.03f, 2.83f)
                curveTo(8.15f, 2.1f, 10.82f, 2f, 12f, 2f)
                curveTo(14.11f, 2f, 21f, 2.29f, 21f, 6f)
                verticalLineTo(17.8f)
                lineTo(18.06f, 14.86f)
                curveTo(18.39f, 14.97f, 18.7f, 15.1f, 19f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(17.28f, 9.63f, 14.82f, 9.89f, 13.17f, 9.97f)
                lineTo(11.18f, 8f)
                curveTo(11.45f, 8f, 11.72f, 8f, 12f, 8f)
                curveTo(15.87f, 8f, 19f, 7.11f, 19f, 6f)
                reflectiveCurveTo(15.87f, 4f, 12f, 4f)
                curveTo(10.35f, 4f, 8.84f, 4.17f, 7.64f, 4.44f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(18.91f, 20.8f)
                curveTo(16.7f, 21.87f, 13.36f, 22f, 12f, 22f)
                curveTo(9.89f, 22f, 3f, 21.71f, 3f, 18f)
                verticalLineTo(6f)
                curveTo(3f, 5.66f, 3.08f, 5.36f, 3.18f, 5.07f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(5f, 15.25f)
                curveTo(7.2f, 14.13f, 10.62f, 14f, 12f, 14f)
                lineTo(12.11f, 14f)
                lineTo(7.73f, 9.62f)
                curveTo(6.76f, 9.43f, 5.8f, 9.15f, 5f, 8.75f)
                verticalLineTo(15.25f)
                moveTo(17.39f, 19.28f)
                lineTo(14.21f, 16.1f)
                curveTo(13.5f, 16.04f, 12.78f, 16f, 12f, 16f)
                curveTo(8.13f, 16f, 5f, 16.9f, 5f, 18f)
                reflectiveCurveTo(8.13f, 20f, 12f, 20f)
                curveTo(14.17f, 20f, 16.1f, 19.72f, 17.39f, 19.28f)
                close()
            }
        }.build()

        return _CylinderOff!!
    }

@Suppress("ObjectPropertyName")
private var _CylinderOff: ImageVector? = null
