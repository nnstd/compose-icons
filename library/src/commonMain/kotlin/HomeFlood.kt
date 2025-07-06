package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HomeFlood: ImageVector
    get() {
        if (_HomeFlood != null) {
            return _HomeFlood!!
        }
        _HomeFlood = ImageVector.Builder(
            name = "HomeFlood",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.67f, 19f)
                curveTo(16.72f, 19f, 16.58f, 20f, 15.34f, 20f)
                curveTo(14.15f, 20f, 13.92f, 19f, 12f, 19f)
                curveTo(10.06f, 19f, 9.91f, 20f, 8.67f, 20f)
                reflectiveCurveTo(7.29f, 19f, 5.34f, 19f)
                reflectiveCurveTo(3.24f, 20f, 2f, 20f)
                verticalLineTo(22f)
                curveTo(3.95f, 22f, 4.11f, 21f, 5.34f, 21f)
                curveTo(6.58f, 21f, 6.72f, 22f, 8.67f, 22f)
                reflectiveCurveTo(10.77f, 21f, 12f, 21f)
                curveTo(13.23f, 21f, 13.41f, 22f, 15.34f, 22f)
                reflectiveCurveTo(17.44f, 21f, 18.67f, 21f)
                curveTo(19.89f, 21f, 20.07f, 22f, 22f, 22f)
                verticalLineTo(20f)
                curveTo(20.76f, 20f, 20.62f, 19f, 18.67f, 19f)
                moveTo(8.68f, 17.5f)
                curveTo(10.63f, 17.5f, 10.77f, 16.5f, 12f, 16.5f)
                curveTo(13.2f, 16.5f, 13.43f, 17.5f, 15.34f, 17.5f)
                curveTo(17.29f, 17.5f, 17.43f, 16.5f, 18.67f, 16.5f)
                curveTo(19.86f, 16.5f, 20.07f, 17.5f, 22f, 17.5f)
                verticalLineTo(15.5f)
                curveTo(21.35f, 15.5f, 21f, 15.22f, 20.5f, 14.95f)
                lineTo(18.5f, 7.42f)
                lineTo(20.57f, 8.27f)
                lineTo(21.31f, 6.41f)
                lineTo(9.78f, 2f)
                lineTo(2f, 11.61f)
                lineTo(3.57f, 12.84f)
                lineTo(4.96f, 11.06f)
                lineTo(5.89f, 14.54f)
                curveTo(5.71f, 14.5f, 5.54f, 14.5f, 5.33f, 14.5f)
                curveTo(3.38f, 14.5f, 3.24f, 15.5f, 2f, 15.5f)
                verticalLineTo(17.5f)
                curveTo(3.9f, 17.5f, 4.17f, 16.5f, 5.35f, 16.5f)
                curveTo(6.54f, 16.5f, 6.77f, 17.5f, 8.68f, 17.5f)
                moveTo(14.04f, 10.18f)
                lineTo(15.46f, 15.5f)
                curveTo(14.12f, 15.58f, 14f, 14.5f, 12f, 14.5f)
                curveTo(11.63f, 14.5f, 11.34f, 14.54f, 11.08f, 14.6f)
                lineTo(10.17f, 11.21f)
                lineTo(14.04f, 10.18f)
                close()
            }
        }.build()

        return _HomeFlood!!
    }

@Suppress("ObjectPropertyName")
private var _HomeFlood: ImageVector? = null
