package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseMarker: ImageVector
    get() {
        if (_DatabaseMarker != null) {
            return _DatabaseMarker!!
        }
        _DatabaseMarker = ImageVector.Builder(
            name = "DatabaseMarker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
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
                moveTo(4f, 12f)
                verticalLineTo(9f)
                curveTo(4f, 11.21f, 7.58f, 13f, 12f, 13f)
                curveTo(12.57f, 13f, 13.13f, 12.97f, 13.67f, 12.91f)
                curveTo(13.25f, 13.69f, 13f, 14.57f, 13f, 15.5f)
                curveTo(13f, 15.65f, 13f, 15.81f, 13.03f, 15.96f)
                curveTo(12.69f, 16f, 12.35f, 16f, 12f, 16f)
                curveTo(7.58f, 16f, 4f, 14.21f, 4f, 12f)
                moveTo(4f, 7f)
                curveTo(4f, 4.79f, 7.58f, 3f, 12f, 3f)
                reflectiveCurveTo(20f, 4.79f, 20f, 7f)
                reflectiveCurveTo(16.42f, 11f, 12f, 11f)
                reflectiveCurveTo(4f, 9.21f, 4f, 7f)
                moveTo(15f, 20.71f)
                curveTo(14.07f, 20.9f, 13.06f, 21f, 12f, 21f)
                curveTo(7.58f, 21f, 4f, 19.21f, 4f, 17f)
                verticalLineTo(14f)
                curveTo(4f, 16.21f, 7.58f, 18f, 12f, 18f)
                curveTo(12.5f, 18f, 13.03f, 17.97f, 13.5f, 17.93f)
                curveTo(13.9f, 18.91f, 14.44f, 19.87f, 15f, 20.71f)
                close()
            }
        }.build()

        return _DatabaseMarker!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseMarker: ImageVector? = null
