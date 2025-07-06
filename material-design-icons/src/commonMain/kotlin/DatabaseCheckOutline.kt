package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseCheckOutline: ImageVector
    get() {
        if (_DatabaseCheckOutline != null) {
            return _DatabaseCheckOutline!!
        }
        _DatabaseCheckOutline = ImageVector.Builder(
            name = "DatabaseCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 13.09f)
                verticalLineTo(7f)
                curveTo(20f, 4.79f, 16.42f, 3f, 12f, 3f)
                reflectiveCurveTo(4f, 4.79f, 4f, 7f)
                verticalLineTo(17f)
                curveTo(4f, 19.21f, 7.59f, 21f, 12f, 21f)
                curveTo(12.46f, 21f, 12.9f, 21f, 13.33f, 20.94f)
                curveTo(13.12f, 20.33f, 13f, 19.68f, 13f, 19f)
                lineTo(13f, 18.95f)
                curveTo(12.68f, 19f, 12.35f, 19f, 12f, 19f)
                curveTo(8.13f, 19f, 6f, 17.5f, 6f, 17f)
                verticalLineTo(14.77f)
                curveTo(7.61f, 15.55f, 9.72f, 16f, 12f, 16f)
                curveTo(12.65f, 16f, 13.27f, 15.96f, 13.88f, 15.89f)
                curveTo(14.93f, 14.16f, 16.83f, 13f, 19f, 13f)
                curveTo(19.34f, 13f, 19.67f, 13.04f, 20f, 13.09f)
                moveTo(18f, 12.45f)
                curveTo(16.7f, 13.4f, 14.42f, 14f, 12f, 14f)
                reflectiveCurveTo(7.3f, 13.4f, 6f, 12.45f)
                verticalLineTo(9.64f)
                curveTo(7.47f, 10.47f, 9.61f, 11f, 12f, 11f)
                reflectiveCurveTo(16.53f, 10.47f, 18f, 9.64f)
                verticalLineTo(12.45f)
                moveTo(12f, 9f)
                curveTo(8.13f, 9f, 6f, 7.5f, 6f, 7f)
                reflectiveCurveTo(8.13f, 5f, 12f, 5f)
                reflectiveCurveTo(18f, 6.5f, 18f, 7f)
                reflectiveCurveTo(15.87f, 9f, 12f, 9f)
                moveTo(22.5f, 17.25f)
                lineTo(17.75f, 22f)
                lineTo(15f, 19f)
                lineTo(16.16f, 17.84f)
                lineTo(17.75f, 19.43f)
                lineTo(21.34f, 15.84f)
                lineTo(22.5f, 17.25f)
                close()
            }
        }.build()

        return _DatabaseCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseCheckOutline: ImageVector? = null
