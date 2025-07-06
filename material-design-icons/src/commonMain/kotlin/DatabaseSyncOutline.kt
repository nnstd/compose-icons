package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseSyncOutline: ImageVector
    get() {
        if (_DatabaseSyncOutline != null) {
            return _DatabaseSyncOutline!!
        }
        _DatabaseSyncOutline = ImageVector.Builder(
            name = "DatabaseSyncOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 16f)
                curveTo(12.41f, 16f, 12.81f, 15.97f, 13.21f, 15.94f)
                curveTo(13.4f, 15.18f, 13.72f, 14.46f, 14.16f, 13.83f)
                curveTo(13.47f, 13.94f, 12.74f, 14f, 12f, 14f)
                curveTo(9.58f, 14f, 7.3f, 13.4f, 6f, 12.45f)
                verticalLineTo(9.64f)
                curveTo(7.47f, 10.47f, 9.61f, 11f, 12f, 11f)
                reflectiveCurveTo(16.53f, 10.47f, 18f, 9.64f)
                verticalLineTo(11.19f)
                curveTo(18.5f, 11.07f, 19f, 11f, 19.55f, 11f)
                curveTo(19.7f, 11f, 19.85f, 11f, 20f, 11.03f)
                verticalLineTo(7f)
                curveTo(20f, 4.79f, 16.42f, 3f, 12f, 3f)
                reflectiveCurveTo(4f, 4.79f, 4f, 7f)
                verticalLineTo(17f)
                curveTo(4f, 19.21f, 7.59f, 21f, 12f, 21f)
                curveTo(12.66f, 21f, 13.31f, 20.96f, 13.92f, 20.88f)
                curveTo(13.57f, 20.29f, 13.31f, 19.64f, 13.16f, 18.94f)
                curveTo(12.79f, 19f, 12.41f, 19f, 12f, 19f)
                curveTo(8.13f, 19f, 6f, 17.5f, 6f, 17f)
                verticalLineTo(14.77f)
                curveTo(7.61f, 15.55f, 9.72f, 16f, 12f, 16f)
                moveTo(12f, 5f)
                curveTo(15.87f, 5f, 18f, 6.5f, 18f, 7f)
                reflectiveCurveTo(15.87f, 9f, 12f, 9f)
                reflectiveCurveTo(6f, 7.5f, 6f, 7f)
                reflectiveCurveTo(8.13f, 5f, 12f, 5f)
                moveTo(23f, 17.5f)
                curveTo(23f, 18.32f, 22.75f, 19.08f, 22.33f, 19.71f)
                lineTo(21.24f, 18.62f)
                curveTo(21.41f, 18.28f, 21.5f, 17.9f, 21.5f, 17.5f)
                curveTo(21.5f, 16.12f, 20.38f, 15f, 19f, 15f)
                verticalLineTo(16.5f)
                lineTo(16.75f, 14.25f)
                lineTo(19f, 12f)
                verticalLineTo(13.5f)
                curveTo(21.21f, 13.5f, 23f, 15.29f, 23f, 17.5f)
                moveTo(19f, 18.5f)
                lineTo(21.25f, 20.75f)
                lineTo(19f, 23f)
                verticalLineTo(21.5f)
                curveTo(16.79f, 21.5f, 15f, 19.71f, 15f, 17.5f)
                curveTo(15f, 16.68f, 15.25f, 15.92f, 15.67f, 15.29f)
                lineTo(16.76f, 16.38f)
                curveTo(16.59f, 16.72f, 16.5f, 17.1f, 16.5f, 17.5f)
                curveTo(16.5f, 18.88f, 17.62f, 20f, 19f, 20f)
                verticalLineTo(18.5f)
                close()
            }
        }.build()

        return _DatabaseSyncOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseSyncOutline: ImageVector? = null
