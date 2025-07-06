package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseRefreshOutline: ImageVector
    get() {
        if (_DatabaseRefreshOutline != null) {
            return _DatabaseRefreshOutline!!
        }
        _DatabaseRefreshOutline = ImageVector.Builder(
            name = "DatabaseRefreshOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 12.45f)
                verticalLineTo(9.64f)
                curveTo(7.47f, 10.47f, 9.61f, 11f, 12f, 11f)
                reflectiveCurveTo(16.53f, 10.47f, 18f, 9.64f)
                verticalLineTo(12.03f)
                curveTo(18.17f, 12f, 18.33f, 12f, 18.5f, 12f)
                curveTo(19f, 12f, 19.5f, 12.07f, 20f, 12.18f)
                verticalLineTo(7f)
                curveTo(20f, 4.79f, 16.42f, 3f, 12f, 3f)
                reflectiveCurveTo(4f, 4.79f, 4f, 7f)
                verticalLineTo(17f)
                curveTo(4f, 19.21f, 7.59f, 21f, 12f, 21f)
                curveTo(12.17f, 21f, 12.33f, 21f, 12.5f, 21f)
                curveTo(12.24f, 20.37f, 12.09f, 19.7f, 12.03f, 19f)
                lineTo(12f, 19f)
                curveTo(8.13f, 19f, 6f, 17.5f, 6f, 17f)
                verticalLineTo(14.77f)
                curveTo(7.61f, 15.55f, 9.72f, 16f, 12f, 16f)
                curveTo(12.17f, 16f, 12.34f, 16f, 12.5f, 16f)
                curveTo(12.85f, 15.18f, 13.34f, 14.46f, 13.95f, 13.86f)
                curveTo(13.32f, 13.95f, 12.67f, 14f, 12f, 14f)
                curveTo(9.58f, 14f, 7.3f, 13.4f, 6f, 12.45f)
                moveTo(12f, 5f)
                curveTo(15.87f, 5f, 18f, 6.5f, 18f, 7f)
                reflectiveCurveTo(15.87f, 9f, 12f, 9f)
                reflectiveCurveTo(6f, 7.5f, 6f, 7f)
                reflectiveCurveTo(8.13f, 5f, 12f, 5f)
                moveTo(18f, 18.5f)
                lineTo(19.77f, 16.73f)
                curveTo(19.32f, 16.28f, 18.69f, 16f, 18f, 16f)
                curveTo(16.62f, 16f, 15.5f, 17.12f, 15.5f, 18.5f)
                reflectiveCurveTo(16.62f, 21f, 18f, 21f)
                curveTo(18.82f, 21f, 19.54f, 20.61f, 20f, 20f)
                horizontalLineTo(21.71f)
                curveTo(21.12f, 21.47f, 19.68f, 22.5f, 18f, 22.5f)
                curveTo(15.79f, 22.5f, 14f, 20.71f, 14f, 18.5f)
                reflectiveCurveTo(15.79f, 14.5f, 18f, 14.5f)
                curveTo(19.11f, 14.5f, 20.11f, 14.95f, 20.83f, 15.67f)
                lineTo(22f, 14.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _DatabaseRefreshOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseRefreshOutline: ImageVector? = null
