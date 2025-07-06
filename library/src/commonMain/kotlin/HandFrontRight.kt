package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandFrontRight: ImageVector
    get() {
        if (_HandFrontRight != null) {
            return _HandFrontRight!!
        }
        _HandFrontRight = ImageVector.Builder(
            name = "HandFrontRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.75f, 8f)
                curveTo(19.06f, 8f, 18.5f, 8.56f, 18.5f, 9.25f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                curveTo(16.35f, 15f, 15f, 16.35f, 15f, 18f)
                horizontalLineTo(14f)
                curveTo(14f, 15.96f, 15.53f, 14.28f, 17.5f, 14.03f)
                verticalLineTo(3.25f)
                curveTo(17.5f, 2.56f, 16.94f, 2f, 16.25f, 2f)
                curveTo(15.56f, 2f, 15f, 2.56f, 15f, 3.25f)
                verticalLineTo(11f)
                horizontalLineTo(14f)
                verticalLineTo(1.25f)
                curveTo(14f, 0.56f, 13.44f, 0f, 12.75f, 0f)
                reflectiveCurveTo(11.5f, 0.56f, 11.5f, 1.25f)
                verticalLineTo(11f)
                horizontalLineTo(10.5f)
                verticalLineTo(2.75f)
                curveTo(10.5f, 2.06f, 9.94f, 1.5f, 9.25f, 1.5f)
                reflectiveCurveTo(8f, 2.06f, 8f, 2.75f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(5.75f)
                curveTo(7f, 5.06f, 6.44f, 4.5f, 5.75f, 4.5f)
                reflectiveCurveTo(4.5f, 5.06f, 4.5f, 5.75f)
                verticalLineTo(15.75f)
                curveTo(4.5f, 20.31f, 8.19f, 24f, 12.75f, 24f)
                reflectiveCurveTo(21f, 20.31f, 21f, 15.75f)
                verticalLineTo(9.25f)
                curveTo(21f, 8.56f, 20.44f, 8f, 19.75f, 8f)
                close()
            }
        }.build()

        return _HandFrontRight!!
    }

@Suppress("ObjectPropertyName")
private var _HandFrontRight: ImageVector? = null
