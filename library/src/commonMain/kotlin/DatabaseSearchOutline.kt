package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseSearchOutline: ImageVector
    get() {
        if (_DatabaseSearchOutline != null) {
            return _DatabaseSearchOutline!!
        }
        _DatabaseSearchOutline = ImageVector.Builder(
            name = "DatabaseSearchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 18.95f)
                curveTo(7.77f, 18.72f, 6f, 17.45f, 6f, 17f)
                verticalLineTo(14.77f)
                curveTo(7.13f, 15.32f, 8.5f, 15.69f, 10f, 15.87f)
                curveTo(10f, 15.21f, 10.04f, 14.54f, 10.21f, 13.89f)
                curveTo(8.5f, 13.67f, 6.97f, 13.16f, 6f, 12.45f)
                verticalLineTo(9.64f)
                curveTo(7.43f, 10.45f, 9.5f, 10.97f, 11.82f, 11f)
                curveTo(11.85f, 10.97f, 11.87f, 10.93f, 11.9f, 10.9f)
                curveTo(14.1f, 8.71f, 17.5f, 8.41f, 20f, 10.03f)
                verticalLineTo(7f)
                curveTo(20f, 4.79f, 16.42f, 3f, 12f, 3f)
                reflectiveCurveTo(4f, 4.79f, 4f, 7f)
                verticalLineTo(17f)
                curveTo(4f, 19.21f, 7.59f, 21f, 12f, 21f)
                curveTo(12.34f, 21f, 12.68f, 21f, 13f, 20.97f)
                curveTo(12.62f, 20.72f, 12.24f, 20.44f, 11.9f, 20.1f)
                curveTo(11.55f, 19.74f, 11.25f, 19.36f, 11f, 18.95f)
                moveTo(12f, 5f)
                curveTo(15.87f, 5f, 18f, 6.5f, 18f, 7f)
                reflectiveCurveTo(15.87f, 9f, 12f, 9f)
                reflectiveCurveTo(6f, 7.5f, 6f, 7f)
                reflectiveCurveTo(8.13f, 5f, 12f, 5f)
                moveTo(20.31f, 17.9f)
                curveTo(20.75f, 17.21f, 21f, 16.38f, 21f, 15.5f)
                curveTo(21f, 13f, 19f, 11f, 16.5f, 11f)
                reflectiveCurveTo(12f, 13f, 12f, 15.5f)
                reflectiveCurveTo(14f, 20f, 16.5f, 20f)
                curveTo(17.37f, 20f, 18.19f, 19.75f, 18.88f, 19.32f)
                lineTo(22f, 22.39f)
                lineTo(23.39f, 21f)
                lineTo(20.31f, 17.9f)
                moveTo(16.5f, 18f)
                curveTo(15.12f, 18f, 14f, 16.88f, 14f, 15.5f)
                reflectiveCurveTo(15.12f, 13f, 16.5f, 13f)
                reflectiveCurveTo(19f, 14.12f, 19f, 15.5f)
                reflectiveCurveTo(17.88f, 18f, 16.5f, 18f)
                close()
            }
        }.build()

        return _DatabaseSearchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseSearchOutline: ImageVector? = null
