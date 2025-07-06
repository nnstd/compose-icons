package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandFrontLeft: ImageVector
    get() {
        if (_HandFrontLeft != null) {
            return _HandFrontLeft!!
        }
        _HandFrontLeft = ImageVector.Builder(
            name = "HandFrontLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 9.25f)
                verticalLineTo(15.75f)
                curveTo(3f, 20.31f, 6.69f, 24f, 11.25f, 24f)
                reflectiveCurveTo(19.5f, 20.31f, 19.5f, 15.75f)
                verticalLineTo(5.75f)
                curveTo(19.5f, 5.06f, 18.94f, 4.5f, 18.25f, 4.5f)
                reflectiveCurveTo(17f, 5.06f, 17f, 5.75f)
                verticalLineTo(12f)
                horizontalLineTo(16f)
                verticalLineTo(2.75f)
                curveTo(16f, 2.06f, 15.44f, 1.5f, 14.75f, 1.5f)
                reflectiveCurveTo(13.5f, 2.06f, 13.5f, 2.75f)
                verticalLineTo(11f)
                horizontalLineTo(12.5f)
                verticalLineTo(1.25f)
                curveTo(12.5f, 0.56f, 11.94f, 0f, 11.25f, 0f)
                reflectiveCurveTo(10f, 0.56f, 10f, 1.25f)
                verticalLineTo(11f)
                horizontalLineTo(9f)
                verticalLineTo(3.25f)
                curveTo(9f, 2.56f, 8.44f, 2f, 7.75f, 2f)
                curveTo(7.06f, 2f, 6.5f, 2.56f, 6.5f, 3.25f)
                verticalLineTo(14.03f)
                curveTo(8.47f, 14.28f, 10f, 15.96f, 10f, 18f)
                horizontalLineTo(9f)
                curveTo(9f, 16.35f, 7.65f, 15f, 6f, 15f)
                horizontalLineTo(5.5f)
                verticalLineTo(9.25f)
                curveTo(5.5f, 8.56f, 4.94f, 8f, 4.25f, 8f)
                reflectiveCurveTo(3f, 8.56f, 3f, 9.25f)
                close()
            }
        }.build()

        return _HandFrontLeft!!
    }

@Suppress("ObjectPropertyName")
private var _HandFrontLeft: ImageVector? = null
