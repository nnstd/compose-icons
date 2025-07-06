package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandBackRightOff: ImageVector
    get() {
        if (_HandBackRightOff != null) {
            return _HandBackRightOff!!
        }
        _HandBackRightOff = ImageVector.Builder(
            name = "HandBackRightOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(19.17f, 21.06f)
                curveTo(17.7f, 22.85f, 15.5f, 24f, 13f, 24f)
                curveTo(9.74f, 24f, 6.81f, 22f, 5.6f, 19f)
                lineTo(2.57f, 11.37f)
                curveTo(2.26f, 10.58f, 3f, 9.79f, 3.81f, 10.05f)
                lineTo(4.6f, 10.31f)
                curveTo(5.16f, 10.5f, 5.62f, 10.92f, 5.84f, 11.47f)
                lineTo(7.25f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(9.89f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(14f, 1.25f)
                curveTo(14f, 0.56f, 13.44f, 0f, 12.75f, 0f)
                reflectiveCurveTo(11.5f, 0.56f, 11.5f, 1.25f)
                verticalLineTo(8.3f)
                lineTo(14f, 10.8f)
                verticalLineTo(1.25f)
                moveTo(21f, 16f)
                verticalLineTo(5.75f)
                curveTo(21f, 5.06f, 20.44f, 4.5f, 19.75f, 4.5f)
                reflectiveCurveTo(18.5f, 5.06f, 18.5f, 5.75f)
                verticalLineTo(12f)
                horizontalLineTo(17.5f)
                verticalLineTo(2.75f)
                curveTo(17.5f, 2.06f, 16.94f, 1.5f, 16.25f, 1.5f)
                reflectiveCurveTo(15f, 2.06f, 15f, 2.75f)
                verticalLineTo(11.8f)
                lineTo(20.83f, 17.63f)
                curveTo(20.94f, 17.11f, 21f, 16.56f, 21f, 16f)
                moveTo(10.5f, 3.25f)
                curveTo(10.5f, 2.56f, 9.94f, 2f, 9.25f, 2f)
                reflectiveCurveTo(8f, 2.56f, 8f, 3.25f)
                verticalLineTo(4.8f)
                lineTo(10.5f, 7.3f)
                verticalLineTo(3.25f)
                close()
            }
        }.build()

        return _HandBackRightOff!!
    }

@Suppress("ObjectPropertyName")
private var _HandBackRightOff: ImageVector? = null
