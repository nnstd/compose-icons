package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandBackRight: ImageVector
    get() {
        if (_HandBackRight != null) {
            return _HandBackRight!!
        }
        _HandBackRight = ImageVector.Builder(
            name = "HandBackRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 24f)
                curveTo(9.74f, 24f, 6.81f, 22f, 5.6f, 19f)
                lineTo(2.57f, 11.37f)
                curveTo(2.26f, 10.58f, 3f, 9.79f, 3.81f, 10.05f)
                lineTo(4.6f, 10.31f)
                curveTo(5.16f, 10.5f, 5.62f, 10.92f, 5.84f, 11.47f)
                lineTo(7.25f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(3.25f)
                curveTo(8f, 2.56f, 8.56f, 2f, 9.25f, 2f)
                reflectiveCurveTo(10.5f, 2.56f, 10.5f, 3.25f)
                verticalLineTo(12f)
                horizontalLineTo(11.5f)
                verticalLineTo(1.25f)
                curveTo(11.5f, 0.56f, 12.06f, 0f, 12.75f, 0f)
                reflectiveCurveTo(14f, 0.56f, 14f, 1.25f)
                verticalLineTo(12f)
                horizontalLineTo(15f)
                verticalLineTo(2.75f)
                curveTo(15f, 2.06f, 15.56f, 1.5f, 16.25f, 1.5f)
                curveTo(16.94f, 1.5f, 17.5f, 2.06f, 17.5f, 2.75f)
                verticalLineTo(12f)
                horizontalLineTo(18.5f)
                verticalLineTo(5.75f)
                curveTo(18.5f, 5.06f, 19.06f, 4.5f, 19.75f, 4.5f)
                reflectiveCurveTo(21f, 5.06f, 21f, 5.75f)
                verticalLineTo(16f)
                curveTo(21f, 20.42f, 17.42f, 24f, 13f, 24f)
                close()
            }
        }.build()

        return _HandBackRight!!
    }

@Suppress("ObjectPropertyName")
private var _HandBackRight: ImageVector? = null
