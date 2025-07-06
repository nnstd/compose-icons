package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseMarkerOutline: ImageVector
    get() {
        if (_DatabaseMarkerOutline != null) {
            return _DatabaseMarkerOutline!!
        }
        _DatabaseMarkerOutline = ImageVector.Builder(
            name = "DatabaseMarkerOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 19f)
                curveTo(8.13f, 19f, 6f, 17.5f, 6f, 17f)
                verticalLineTo(14.77f)
                curveTo(7.61f, 15.55f, 9.72f, 16f, 12f, 16f)
                curveTo(12.35f, 16f, 12.69f, 15.97f, 13.03f, 15.95f)
                curveTo(13f, 15.8f, 13f, 15.65f, 13f, 15.5f)
                curveTo(13f, 14.96f, 13.09f, 14.44f, 13.24f, 13.94f)
                curveTo(12.83f, 14f, 12.42f, 14f, 12f, 14f)
                curveTo(9.58f, 14f, 7.3f, 13.4f, 6f, 12.45f)
                verticalLineTo(9.64f)
                curveTo(7.47f, 10.47f, 9.61f, 11f, 12f, 11f)
                reflectiveCurveTo(16.53f, 10.47f, 18f, 9.64f)
                verticalLineTo(10.03f)
                curveTo(18.17f, 10f, 18.33f, 10f, 18.5f, 10f)
                curveTo(19f, 10f, 19.5f, 10.08f, 20f, 10.22f)
                verticalLineTo(7f)
                curveTo(20f, 4.79f, 16.42f, 3f, 12f, 3f)
                reflectiveCurveTo(4f, 4.79f, 4f, 7f)
                verticalLineTo(17f)
                curveTo(4f, 19.21f, 7.59f, 21f, 12f, 21f)
                curveTo(13.06f, 21f, 14.07f, 20.89f, 15f, 20.71f)
                curveTo(14.62f, 20.14f, 14.25f, 19.5f, 13.93f, 18.85f)
                curveTo(13.34f, 18.94f, 12.71f, 19f, 12f, 19f)
                moveTo(12f, 5f)
                curveTo(15.87f, 5f, 18f, 6.5f, 18f, 7f)
                reflectiveCurveTo(15.87f, 9f, 12f, 9f)
                reflectiveCurveTo(6f, 7.5f, 6f, 7f)
                reflectiveCurveTo(8.13f, 5f, 12f, 5f)
                moveTo(18.5f, 12f)
                curveTo(16.6f, 12f, 15f, 13.6f, 15f, 15.5f)
                curveTo(15f, 18.1f, 18.5f, 22f, 18.5f, 22f)
                reflectiveCurveTo(22f, 18.1f, 22f, 15.5f)
                curveTo(22f, 13.6f, 20.4f, 12f, 18.5f, 12f)
                moveTo(18.5f, 16.8f)
                curveTo(17.8f, 16.8f, 17.3f, 16.2f, 17.3f, 15.6f)
                curveTo(17.3f, 14.9f, 17.9f, 14.4f, 18.5f, 14.4f)
                reflectiveCurveTo(19.7f, 15f, 19.7f, 15.6f)
                curveTo(19.8f, 16.2f, 19.2f, 16.8f, 18.5f, 16.8f)
                close()
            }
        }.build()

        return _DatabaseMarkerOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseMarkerOutline: ImageVector? = null
