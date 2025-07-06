package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandFrontLeftOutline: ImageVector
    get() {
        if (_HandFrontLeftOutline != null) {
            return _HandFrontLeftOutline!!
        }
        _HandFrontLeftOutline = ImageVector.Builder(
            name = "HandFrontLeftOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 10.5f)
                verticalLineTo(15.5f)
                curveTo(3f, 20.19f, 6.81f, 24f, 11.5f, 24f)
                reflectiveCurveTo(20f, 20.19f, 20f, 15.5f)
                verticalLineTo(7f)
                curveTo(20f, 5.62f, 18.88f, 4.5f, 17.5f, 4.5f)
                curveTo(17.33f, 4.5f, 17.16f, 4.5f, 17f, 4.55f)
                verticalLineTo(4f)
                curveTo(17f, 2.62f, 15.88f, 1.5f, 14.5f, 1.5f)
                curveTo(14.27f, 1.5f, 14.04f, 1.53f, 13.83f, 1.59f)
                curveTo(13.46f, 0.66f, 12.56f, 0f, 11.5f, 0f)
                curveTo(10.27f, 0f, 9.25f, 0.89f, 9.04f, 2.06f)
                curveTo(8.87f, 2f, 8.69f, 2f, 8.5f, 2f)
                curveTo(7.12f, 2f, 6f, 3.12f, 6f, 4.5f)
                verticalLineTo(8.05f)
                curveTo(5.84f, 8f, 5.67f, 8f, 5.5f, 8f)
                curveTo(4.12f, 8f, 3f, 9.12f, 3f, 10.5f)
                moveTo(5f, 10.5f)
                curveTo(5f, 10.22f, 5.22f, 10f, 5.5f, 10f)
                reflectiveCurveTo(6f, 10.22f, 6f, 10.5f)
                verticalLineTo(15f)
                curveTo(7.66f, 15f, 9f, 16.34f, 9f, 18f)
                horizontalLineTo(11f)
                curveTo(11f, 15.95f, 9.77f, 14.19f, 8f, 13.42f)
                verticalLineTo(4.5f)
                curveTo(8f, 4.22f, 8.22f, 4f, 8.5f, 4f)
                reflectiveCurveTo(9f, 4.22f, 9f, 4.5f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(2.5f)
                curveTo(11f, 2.22f, 11.22f, 2f, 11.5f, 2f)
                reflectiveCurveTo(12f, 2.22f, 12f, 2.5f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                verticalLineTo(4f)
                curveTo(14f, 3.72f, 14.22f, 3.5f, 14.5f, 3.5f)
                reflectiveCurveTo(15f, 3.72f, 15f, 4f)
                verticalLineTo(12f)
                horizontalLineTo(17f)
                verticalLineTo(7f)
                curveTo(17f, 6.72f, 17.22f, 6.5f, 17.5f, 6.5f)
                reflectiveCurveTo(18f, 6.72f, 18f, 7f)
                verticalLineTo(15.5f)
                curveTo(18f, 19.09f, 15.09f, 22f, 11.5f, 22f)
                reflectiveCurveTo(5f, 19.09f, 5f, 15.5f)
                verticalLineTo(10.5f)
                close()
            }
        }.build()

        return _HandFrontLeftOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HandFrontLeftOutline: ImageVector? = null
