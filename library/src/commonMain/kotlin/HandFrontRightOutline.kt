package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandFrontRightOutline: ImageVector
    get() {
        if (_HandFrontRightOutline != null) {
            return _HandFrontRightOutline!!
        }
        _HandFrontRightOutline = ImageVector.Builder(
            name = "HandFrontRightOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 8f)
                curveTo(18.33f, 8f, 18.16f, 8f, 18f, 8.05f)
                verticalLineTo(4.5f)
                curveTo(18f, 3.12f, 16.88f, 2f, 15.5f, 2f)
                curveTo(15.31f, 2f, 15.13f, 2f, 14.96f, 2.06f)
                curveTo(14.75f, 0.89f, 13.73f, 0f, 12.5f, 0f)
                curveTo(11.44f, 0f, 10.54f, 0.66f, 10.17f, 1.59f)
                curveTo(9.96f, 1.53f, 9.73f, 1.5f, 9.5f, 1.5f)
                curveTo(8.12f, 1.5f, 7f, 2.62f, 7f, 4f)
                verticalLineTo(4.55f)
                curveTo(6.84f, 4.5f, 6.67f, 4.5f, 6.5f, 4.5f)
                curveTo(5.12f, 4.5f, 4f, 5.62f, 4f, 7f)
                verticalLineTo(15.5f)
                curveTo(4f, 20.19f, 7.81f, 24f, 12.5f, 24f)
                reflectiveCurveTo(21f, 20.19f, 21f, 15.5f)
                verticalLineTo(10.5f)
                curveTo(21f, 9.12f, 19.88f, 8f, 18.5f, 8f)
                moveTo(19f, 15.5f)
                curveTo(19f, 19.09f, 16.09f, 22f, 12.5f, 22f)
                reflectiveCurveTo(6f, 19.09f, 6f, 15.5f)
                verticalLineTo(7f)
                curveTo(6f, 6.72f, 6.22f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveTo(7f, 6.72f, 7f, 7f)
                verticalLineTo(12f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                curveTo(9f, 3.72f, 9.22f, 3.5f, 9.5f, 3.5f)
                reflectiveCurveTo(10f, 3.72f, 10f, 4f)
                verticalLineTo(11f)
                horizontalLineTo(12f)
                verticalLineTo(2.5f)
                curveTo(12f, 2.22f, 12.22f, 2f, 12.5f, 2f)
                reflectiveCurveTo(13f, 2.22f, 13f, 2.5f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(4.5f)
                curveTo(15f, 4.22f, 15.22f, 4f, 15.5f, 4f)
                reflectiveCurveTo(16f, 4.22f, 16f, 4.5f)
                verticalLineTo(13.42f)
                curveTo(14.23f, 14.19f, 13f, 15.95f, 13f, 18f)
                horizontalLineTo(15f)
                curveTo(15f, 16.34f, 16.34f, 15f, 18f, 15f)
                verticalLineTo(10.5f)
                curveTo(18f, 10.22f, 18.22f, 10f, 18.5f, 10f)
                reflectiveCurveTo(19f, 10.22f, 19f, 10.5f)
                verticalLineTo(15.5f)
                close()
            }
        }.build()

        return _HandFrontRightOutline!!
    }

@Suppress("ObjectPropertyName")
private var _HandFrontRightOutline: ImageVector? = null
