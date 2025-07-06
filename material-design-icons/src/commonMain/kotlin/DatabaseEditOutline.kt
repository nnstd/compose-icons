package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseEditOutline: ImageVector
    get() {
        if (_DatabaseEditOutline != null) {
            return _DatabaseEditOutline!!
        }
        _DatabaseEditOutline = ImageVector.Builder(
            name = "DatabaseEditOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 16f)
                curveTo(12.8f, 16f, 13.57f, 15.93f, 14.31f, 15.82f)
                lineTo(17.22f, 12.91f)
                curveTo(15.89f, 13.59f, 14f, 14f, 12f, 14f)
                curveTo(9.58f, 14f, 7.3f, 13.4f, 6f, 12.45f)
                verticalLineTo(9.64f)
                curveTo(7.47f, 10.47f, 9.61f, 11f, 12f, 11f)
                reflectiveCurveTo(16.53f, 10.47f, 18f, 9.64f)
                verticalLineTo(12.13f)
                lineTo(19.39f, 10.74f)
                curveTo(19.57f, 10.56f, 19.78f, 10.42f, 20f, 10.3f)
                verticalLineTo(7f)
                curveTo(20f, 4.79f, 16.42f, 3f, 12f, 3f)
                reflectiveCurveTo(4f, 4.79f, 4f, 7f)
                verticalLineTo(17f)
                curveTo(4f, 19.04f, 7.06f, 20.72f, 11f, 20.97f)
                verticalLineTo(19.13f)
                lineTo(11.17f, 18.96f)
                curveTo(7.84f, 18.76f, 6f, 17.46f, 6f, 17f)
                verticalLineTo(14.77f)
                curveTo(7.61f, 15.55f, 9.72f, 16f, 12f, 16f)
                moveTo(12f, 5f)
                curveTo(15.87f, 5f, 18f, 6.5f, 18f, 7f)
                reflectiveCurveTo(15.87f, 9f, 12f, 9f)
                reflectiveCurveTo(6f, 7.5f, 6f, 7f)
                reflectiveCurveTo(8.13f, 5f, 12f, 5f)
                moveTo(19.13f, 13.83f)
                lineTo(21.17f, 15.87f)
                lineTo(15.04f, 22f)
                horizontalLineTo(13f)
                verticalLineTo(19.96f)
                lineTo(19.13f, 13.83f)
                moveTo(22.85f, 14.19f)
                lineTo(21.87f, 15.17f)
                lineTo(19.83f, 13.13f)
                lineTo(20.81f, 12.15f)
                curveTo(21f, 11.95f, 21.33f, 11.95f, 21.53f, 12.15f)
                lineTo(22.85f, 13.47f)
                curveTo(23.05f, 13.67f, 23.05f, 14f, 22.85f, 14.19f)
                close()
            }
        }.build()

        return _DatabaseEditOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseEditOutline: ImageVector? = null
