package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DatabaseOutline: ImageVector
    get() {
        if (_DatabaseOutline != null) {
            return _DatabaseOutline!!
        }
        _DatabaseOutline = ImageVector.Builder(
            name = "DatabaseOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3f)
                curveTo(7.58f, 3f, 4f, 4.79f, 4f, 7f)
                verticalLineTo(17f)
                curveTo(4f, 19.21f, 7.59f, 21f, 12f, 21f)
                reflectiveCurveTo(20f, 19.21f, 20f, 17f)
                verticalLineTo(7f)
                curveTo(20f, 4.79f, 16.42f, 3f, 12f, 3f)
                moveTo(18f, 17f)
                curveTo(18f, 17.5f, 15.87f, 19f, 12f, 19f)
                reflectiveCurveTo(6f, 17.5f, 6f, 17f)
                verticalLineTo(14.77f)
                curveTo(7.61f, 15.55f, 9.72f, 16f, 12f, 16f)
                reflectiveCurveTo(16.39f, 15.55f, 18f, 14.77f)
                verticalLineTo(17f)
                moveTo(18f, 12.45f)
                curveTo(16.7f, 13.4f, 14.42f, 14f, 12f, 14f)
                curveTo(9.58f, 14f, 7.3f, 13.4f, 6f, 12.45f)
                verticalLineTo(9.64f)
                curveTo(7.47f, 10.47f, 9.61f, 11f, 12f, 11f)
                curveTo(14.39f, 11f, 16.53f, 10.47f, 18f, 9.64f)
                verticalLineTo(12.45f)
                moveTo(12f, 9f)
                curveTo(8.13f, 9f, 6f, 7.5f, 6f, 7f)
                reflectiveCurveTo(8.13f, 5f, 12f, 5f)
                curveTo(15.87f, 5f, 18f, 6.5f, 18f, 7f)
                reflectiveCurveTo(15.87f, 9f, 12f, 9f)
                close()
            }
        }.build()

        return _DatabaseOutline!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseOutline: ImageVector? = null
